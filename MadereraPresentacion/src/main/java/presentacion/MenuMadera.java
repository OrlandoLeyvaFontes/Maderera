/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import Negocio.MaderaNegocio;
import dto.MadereraDTO;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.IMadereraDAO;
import persistencia.MaderaDAO;
/**
 *
 * @author Oley
 */
public class MenuMadera extends javax.swing.JFrame implements Observer {
    private List<MadereraDTO> listaMaderas;
    private MaderaNegocio maderaNegocio;
    private DefaultTableModel modelo;

    public MenuMadera() {
        initComponents();
        inicializarComponentes();
        cargarMaderas();
    }
    public MenuMadera(List<MadereraDTO> listaMaderas) {
        initComponents();
        inicializarComponentes();
        this.listaMaderas = listaMaderas;
        cargarMaderasDesdeLista();
    }
    private void inicializarComponentes() {
        setLocationRelativeTo(null);
        // Inicializar el modelo de la tabla
        modelo = (DefaultTableModel) tablaMaderas.getModel();
        // Configurar las columnas si es necesario
        modelo.setColumnIdentifiers(new Object[]{"ID", "Nombre", "Descripción", "Cantidad"});
        
        // Inicializar MaderaNegocio si aún no está inicializado
        if (maderaNegocio == null) {
            IMadereraDAO madereraDAO = new MaderaDAO();
            maderaNegocio = new MaderaNegocio(madereraDAO);
        }
    }
    private void cargarMaderas() {
        try {
            listaMaderas = maderaNegocio.obtenerMaderas();
            actualizarTablaMaderas();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, 
                "Error al cargar las maderas: " + e.getMessage(),
                "Error", 
                JOptionPane.ERROR_MESSAGE);
        }
    }
    private void cargarMaderasDesdeLista() {
        if (listaMaderas != null) {
            actualizarTablaMaderas();
        }
    }
    private void actualizarTablaMaderas() {
        // Limpiar la tabla
        modelo.setRowCount(0);
        
        // Agregar las maderas a la tabla
        for (MadereraDTO madera : listaMaderas) {
            modelo.addRow(new Object[]{
                madera.getId(),
                madera.getNombre(),
                madera.getDescripcion(),
                madera.getCantidad()
            });
        }
    }
    /**
     * Creates new form MenuMadera
     * @param listaActualizada
     */
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMaderas = new javax.swing.JTable();
        btnMaderaDisponible = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnAgregarMadera = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Madera en linea");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, -1, -1));

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        tablaMaderas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "id ", "Tipo de madera", "Descripcion"
            }
        ));
        jScrollPane1.setViewportView(tablaMaderas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 380, 200));

        btnMaderaDisponible.setText("disponible");
        btnMaderaDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaderaDisponibleActionPerformed(evt);
            }
        });
        getContentPane().add(btnMaderaDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, -1, -1));

        jLabel2.setText("Pica la madera que quieras y pica el boton de disponible!!!");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 360, -1));

        btnAgregarMadera.setText("Agregar Madera");
        btnAgregarMadera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarMaderaActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregarMadera, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.setVisible(false);
        InicioSesion inicioSesion = new InicioSesion(maderaNegocio);
        inicioSesion.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed
    
    private void btnAgregarMaderaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarMaderaActionPerformed
        setVisible(false);
        AgregarMadera am = new AgregarMadera();
        am.setVisible(true);
    }//GEN-LAST:event_btnAgregarMaderaActionPerformed

    private void btnMaderaDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaderaDisponibleActionPerformed
        int filaSeleccionada = tablaMaderas.getSelectedRow();
    
    if (filaSeleccionada >= 0) {
        // Obtener la madera seleccionada de la lista
        MadereraDTO maderaSeleccionada = listaMaderas.get(filaSeleccionada);
        
        // Cerrar ventana actual
        setVisible(false);
        
        // Abrir nueva ventana con los detalles
        DetallesProducto maderaDisponible = new DetallesProducto (maderaSeleccionada, maderaNegocio);
        maderaDisponible.setVisible(true);
    } else {
        JOptionPane.showMessageDialog(this,
            "Por favor, selecciona una madera de la tabla",
            "Selección requerida",
            JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_btnMaderaDisponibleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarMadera;
    private javax.swing.JButton btnMaderaDisponible;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaMaderas;
    // End of variables declaration//GEN-END:variables

    @Override
    public void update(Observable o, Object arg) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}