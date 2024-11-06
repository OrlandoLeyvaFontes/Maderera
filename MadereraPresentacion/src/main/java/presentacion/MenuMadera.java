package presentacion;

import Negocio.MaderaNegocio;
import dto.MadereraDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import persistencia.IMadereraDAO;
import persistencia.MaderaDAO;

public class MenuMadera extends javax.swing.JFrame implements Observer {
    private List<MadereraDTO> listaMaderas;
    private MaderaNegocio maderaNegocio;
    private DefaultTableModel modelo;

    public MenuMadera(MaderaNegocio maderaNegocio) {
        initComponents();
        this.maderaNegocio = maderaNegocio;
        inicializarComponentes();
        this.listaMaderas = maderaNegocio.obtenerMaderas();
        cargarMaderasDesdeLista();
    }

    public MenuMadera() {
        initComponents();
        IMadereraDAO madereraDAO = new MaderaDAO();
        this.maderaNegocio = new MaderaNegocio(madereraDAO);
        inicializarComponentes();
        this.listaMaderas = maderaNegocio.obtenerMaderas();
        cargarMaderasDesdeLista();
    }
    
    private void inicializarComponentes() {
        setLocationRelativeTo(null);
        // Inicializar el modelo de la tabla
        modelo = (DefaultTableModel) tablaMaderas.getModel();
        // Configurar las columnas
        modelo.setColumnIdentifiers(new Object[]{"ID", "Nombre", "Descripción", "Cantidad", "Precio Unitario"});
    }
    
    private void cargarMaderasDesdeLista() {
        if (listaMaderas != null) {
            actualizarTablaMaderas();
        }
    }
    private void actualizarTablaMaderas() {
        modelo.setRowCount(0);
        
        for (MadereraDTO madera : listaMaderas) {
            modelo.addRow(new Object[]{
                madera.getId(),
                madera.getNombre(),
                madera.getDescripcion(),
                madera.getCantidad(),
                String.format("$%.2f", madera.getPrecioUnitario())
            });
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaMaderas = new javax.swing.JTable();
        btnMaderaDisponible = new javax.swing.JButton();
        JpBarraSuperior = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JpBarraBuscar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        bntPerfil = new javax.swing.JButton();
        btnCarrito = new javax.swing.JButton();
        JpProductosalaVenta = new javax.swing.JPanel();
        lblInstrucciones = new javax.swing.JLabel();
        JpInstrucciones = new javax.swing.JPanel();
        lblProductosDisponibles = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tablaMaderas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Descripcion", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(tablaMaderas);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 380, 180));

        btnMaderaDisponible.setBackground(new java.awt.Color(153, 255, 255));
        btnMaderaDisponible.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnMaderaDisponible.setForeground(new java.awt.Color(0, 0, 0));
        btnMaderaDisponible.setText("VER MÁS");
        btnMaderaDisponible.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaderaDisponibleActionPerformed(evt);
            }
        });
        getContentPane().add(btnMaderaDisponible, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 100, 30));

        JpBarraSuperior.setBackground(new java.awt.Color(153, 153, 153));
        JpBarraSuperior.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnRegresar.setBackground(new java.awt.Color(204, 204, 204));
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Maderera en linea");

        jLabel4.setText("Buscar Productos...");

        javax.swing.GroupLayout JpBarraBuscarLayout = new javax.swing.GroupLayout(JpBarraBuscar);
        JpBarraBuscar.setLayout(JpBarraBuscarLayout);
        JpBarraBuscarLayout.setHorizontalGroup(
            JpBarraBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpBarraBuscarLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jLabel4)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        JpBarraBuscarLayout.setVerticalGroup(
            JpBarraBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        btnBuscar.setBorderPainted(false);
        btnBuscar.setMaximumSize(new java.awt.Dimension(42, 37));
        btnBuscar.setMinimumSize(new java.awt.Dimension(42, 37));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        bntPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntPerfilActionPerformed(evt);
            }
        });

        btnCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarritoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JpBarraSuperiorLayout = new javax.swing.GroupLayout(JpBarraSuperior);
        JpBarraSuperior.setLayout(JpBarraSuperiorLayout);
        JpBarraSuperiorLayout.setHorizontalGroup(
            JpBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpBarraSuperiorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpBarraBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bntPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        JpBarraSuperiorLayout.setVerticalGroup(
            JpBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpBarraSuperiorLayout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(JpBarraSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCarrito, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(bntPerfil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JpBarraSuperiorLayout.createSequentialGroup()
                        .addComponent(JpBarraBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );

        getContentPane().add(JpBarraSuperior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 50));

        JpProductosalaVenta.setBackground(new java.awt.Color(153, 153, 153));
        JpProductosalaVenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblInstrucciones.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblInstrucciones.setForeground(new java.awt.Color(255, 255, 255));
        lblInstrucciones.setText("INSTRUCCIONES");
        JpProductosalaVenta.add(lblInstrucciones);

        getContentPane().add(JpProductosalaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 160, -1));

        JpInstrucciones.setBackground(new java.awt.Color(153, 153, 153));
        JpInstrucciones.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblProductosDisponibles.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblProductosDisponibles.setForeground(new java.awt.Color(255, 255, 255));
        lblProductosDisponibles.setText("PRODUCTOS DISPONIBLES");
        JpInstrucciones.add(lblProductosDisponibles);

        getContentPane().add(JpInstrucciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 200, 40));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Seleccione el producto");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setFocusable(false);
        jPanel1.add(jLabel2);

        jLabel3.setText(" De click en Ver Más");
        jPanel1.add(jLabel3);

        jLabel5.setText("para ir a los detalles");
        jPanel1.add(jLabel5);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 160, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.setVisible(false);
        InicioSesion inicioSesion = new InicioSesion(maderaNegocio);
        inicioSesion.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed
    
    @Override
    public void update(Observable o, Object arg) {
    }
    
    private void btnMaderaDisponibleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaderaDisponibleActionPerformed
        int filaSeleccionada = tablaMaderas.getSelectedRow();
    
    if (filaSeleccionada >= 0) {
        MadereraDTO maderaSeleccionada = listaMaderas.get(filaSeleccionada);
        String cantidadStr = JOptionPane.showInputDialog(this, 
            "Ingrese la cantidad de madera a comprar:", 
            "Compra de Madera", 
            JOptionPane.QUESTION_MESSAGE);
        
        try {
            int cantidadCompra = Integer.parseInt(cantidadStr);
            
            if (cantidadCompra <= 0) {
                JOptionPane.showMessageDialog(this, 
                    "Por favor ingrese una cantidad válida",
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            if (cantidadCompra > maderaSeleccionada.getCantidad()) {
                JOptionPane.showMessageDialog(this,
                    "No hay suficiente stock disponible",
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
                return;
            }
            
            double total = maderaNegocio.calcularTotal(maderaSeleccionada.getId(), cantidadCompra);
            
            int confirmar = JOptionPane.showConfirmDialog(this,
                String.format("Total a pagar: $%.2f%n¿Confirmar compra?", total),
                "Confirmar Compra",
                JOptionPane.YES_NO_OPTION);
            
            if (confirmar == JOptionPane.YES_OPTION) {
                if (maderaNegocio.actualizarInventario(maderaSeleccionada.getId(), cantidadCompra)) {
                    // Actualizar la cantidad en la lista local
                    maderaSeleccionada.setCantidad(maderaSeleccionada.getCantidad() - cantidadCompra);
                    
                    // Actualizar la tabla
                    actualizarTablaMaderas();
                    
                    JOptionPane.showMessageDialog(this,
                        "Compra realizada con éxito",
                        "Éxito",
                        JOptionPane.INFORMATION_MESSAGE);
                }
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                "Por favor ingrese un número válido",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this,
            "Por favor, seleccione una madera de la tabla",
            "Selección requerida",
            JOptionPane.WARNING_MESSAGE);
    }                             
    }//GEN-LAST:event_btnMaderaDisponibleActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarritoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCarritoActionPerformed

    private void bntPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntPerfilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bntPerfilActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JpBarraBuscar;
    private javax.swing.JPanel JpBarraSuperior;
    private javax.swing.JPanel JpInstrucciones;
    private javax.swing.JPanel JpProductosalaVenta;
    private javax.swing.JButton bntPerfil;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCarrito;
    private javax.swing.JButton btnMaderaDisponible;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblInstrucciones;
    private javax.swing.JLabel lblProductosDisponibles;
    private javax.swing.JTable tablaMaderas;
    // End of variables declaration//GEN-END:variables


    
}
