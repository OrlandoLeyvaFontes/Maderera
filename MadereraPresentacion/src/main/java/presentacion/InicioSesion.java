
package presentacion;

import Negocio.IMadereraNegocio;
import Negocio.MaderaNegocio;

public class InicioSesion extends javax.swing.JFrame {
    private MaderaNegocio maderaNegocio;


    public InicioSesion(IMadereraNegocio maderaNegocio) {
        initComponents();
        setSize(400, 300);  
        setResizable(false);  
        setLocationRelativeTo(null);
        this.maderaNegocio = (MaderaNegocio) maderaNegocio;

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtContrasenia = new javax.swing.JTextField();
        btnContinuar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblMadereraEnLinea = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblIniciodeSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, 30));
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 140, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setText("Contraseña:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 30));

        txtContrasenia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseniaActionPerformed(evt);
            }
        });
        getContentPane().add(txtContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 140, 30));

        btnContinuar.setBackground(new java.awt.Color(51, 255, 255));
        btnContinuar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(0, 0, 0));
        btnContinuar.setText("CONTINUAR");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblMadereraEnLinea.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblMadereraEnLinea.setForeground(new java.awt.Color(255, 255, 255));
        lblMadereraEnLinea.setText("Maderera En Línea");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(lblMadereraEnLinea)
                .addContainerGap(352, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMadereraEnLinea, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 40));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));

        lblIniciodeSesion.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        lblIniciodeSesion.setForeground(new java.awt.Color(255, 255, 255));
        lblIniciodeSesion.setText("Inicio de Sesión");
        jPanel2.add(lblIniciodeSesion);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 120, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        String nombre = txtNombre.getText();
        String contraseña = txtContrasenia.getText();
        if (nombre.equals("martinez02") && contraseña.equals("martinez02")) {
            this.setVisible(false);
            MenuMadera menuMadera = new MenuMadera(maderaNegocio);
            menuMadera.setVisible(true);

        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Nombre o contraseña incorrectos.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void txtContraseniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseniaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblIniciodeSesion;
    private javax.swing.JLabel lblMadereraEnLinea;
    private javax.swing.JTextField txtContrasenia;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
