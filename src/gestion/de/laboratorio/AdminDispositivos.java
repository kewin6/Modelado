
package gestion.de.laboratorio;

import java.util.Locale;


public class AdminDispositivos extends javax.swing.JFrame {

    
    public AdminDispositivos() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        jPanel3.setVisible(false);
        
        
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        MenuOpc1 = new javax.swing.JButton();
        MenuOpc2 = new javax.swing.JButton();
        MenuOpc3 = new javax.swing.JButton();
        MenuOpc4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableDispositivos1 = new javax.swing.JTable();
        inputSearch1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        radioPrestados2 = new javax.swing.JRadioButton();
        radioPrestados3 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jRadioButton10 = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(794, 454));
        setMinimumSize(new java.awt.Dimension(794, 454));
        setPreferredSize(new java.awt.Dimension(467, 467));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(176, 311));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuOpc1.setBackground(new java.awt.Color(0, 102, 255));
        MenuOpc1.setForeground(new java.awt.Color(255, 255, 255));
        MenuOpc1.setText("Inicio");
        MenuOpc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuOpc1ActionPerformed(evt);
            }
        });
        jPanel1.add(MenuOpc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 201, 160, -1));

        MenuOpc2.setBackground(new java.awt.Color(0, 102, 255));
        MenuOpc2.setForeground(new java.awt.Color(255, 255, 255));
        MenuOpc2.setText("Dispositivos");
        MenuOpc2.setEnabled(false);
        jPanel1.add(MenuOpc2, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 230, 160, -1));

        MenuOpc3.setBackground(new java.awt.Color(0, 102, 255));
        MenuOpc3.setForeground(new java.awt.Color(255, 255, 255));
        MenuOpc3.setText("Prestamo");
        MenuOpc3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuOpc3ActionPerformed(evt);
            }
        });
        jPanel1.add(MenuOpc3, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 259, 160, -1));

        MenuOpc4.setBackground(new java.awt.Color(0, 102, 255));
        MenuOpc4.setForeground(new java.awt.Color(255, 255, 255));
        MenuOpc4.setText("Usuarios");
        MenuOpc4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuOpc4ActionPerformed(evt);
            }
        });
        jPanel1.add(MenuOpc4, new org.netbeans.lib.awtextra.AbsoluteConstraints(19, 288, 160, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestion/de/laboratorio/assets/user_.png"))); // NOI18N
        jLabel10.setText("jLabel10");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 120, 116));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 450));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setAutoscrolls(true);
        jPanel3.setPreferredSize(new java.awt.Dimension(559, 451));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 102, 255));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Guardar");
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Teclados");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Monitores");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, -1, -1));

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Mouses");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, -1, -1));

        jRadioButton4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Portatiles");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        jRadioButton5.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton5);
        jRadioButton5.setText("Videobeans");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        jPanel3.add(jRadioButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, -1, -1));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel9.setText("INGRESO DE DISITIVO");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 0, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("*Marca:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("*Tipo:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("*Nombre:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("*Codigo:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, -1, -1));
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 250, -1));
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 250, -1));
        jPanel3.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 250, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("Modelo:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, -1, -1));
        jPanel3.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 250, -1));

        jButton3.setBackground(new java.awt.Color(0, 102, 255));
        jButton3.setText("jButton3");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 0, 579, -1));
        jPanel3.getAccessibleContext().setAccessibleName("");
        jPanel3.getAccessibleContext().setAccessibleDescription("");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel4.setPreferredSize(new java.awt.Dimension(559, 451));
        jPanel4.setRequestFocusEnabled(false);
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableDispositivos1.setBackground(new java.awt.Color(102, 153, 255));
        tableDispositivos1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Descripción", "Código", "Marca", "Modelo", "Estado", "Acciones"
            }
        ));
        tableDispositivos1.setGridColor(new java.awt.Color(255, 255, 255));
        tableDispositivos1.setShowGrid(true);
        jScrollPane2.setViewportView(tableDispositivos1);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 148, 539, 90));

        inputSearch1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputSearch1ActionPerformed(evt);
            }
        });
        jPanel4.add(inputSearch1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 115, 108, -1));

        jLabel2.setText("Buscar:");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 118, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 102, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("+ Nuevo Dispositivo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 114, -1, -1));

        radioPrestados2.setBackground(new java.awt.Color(255, 255, 255));
        radioPrestados2.setText("Prestados");
        radioPrestados2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPrestados2ActionPerformed(evt);
            }
        });
        jPanel4.add(radioPrestados2, new org.netbeans.lib.awtextra.AbsoluteConstraints(175, 114, -1, -1));

        radioPrestados3.setBackground(new java.awt.Color(255, 255, 255));
        radioPrestados3.setText("Disponibles");
        radioPrestados3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPrestados3ActionPerformed(evt);
            }
        });
        jPanel4.add(radioPrestados3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 114, -1, -1));

        jRadioButton6.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setText("Teclados");
        jRadioButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jRadioButton7.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setText("Monitores");
        jRadioButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, -1, -1));

        jRadioButton8.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton8.setText("Mouses");
        jRadioButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton8ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, -1, -1));

        jRadioButton9.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton9.setText("Portatiles");
        jRadioButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton9ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 70, -1, -1));

        jRadioButton10.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton10.setText("Videobeans");
        jRadioButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton10ActionPerformed(evt);
            }
        });
        jPanel4.add(jRadioButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, -1, -1));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 24)); // NOI18N
        jLabel11.setText("Sistema de inventario");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 0, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(201, 0, 580, 450));
        jPanel4.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed

    private void MenuOpc1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuOpc1ActionPerformed
        vista a = new vista();
        a.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_MenuOpc1ActionPerformed

    private void MenuOpc3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuOpc3ActionPerformed
        AdminPrestamos a = new AdminPrestamos();
        a.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_MenuOpc3ActionPerformed

    private void MenuOpc4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuOpc4ActionPerformed
        AdminUsuarios a = new AdminUsuarios();
        a.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_MenuOpc4ActionPerformed

    private void inputSearch1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputSearch1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputSearch1ActionPerformed

    private void radioPrestados2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPrestados2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioPrestados2ActionPerformed

    private void radioPrestados3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPrestados3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioPrestados3ActionPerformed

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton6ActionPerformed

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton7ActionPerformed

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton8ActionPerformed

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton9ActionPerformed

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton10ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       jPanel3.setVisible(true);
       jPanel4.setVisible(false);
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jPanel3.setVisible(false);
        jPanel4.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminDispositivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDispositivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDispositivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDispositivos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDispositivos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MenuOpc1;
    private javax.swing.JButton MenuOpc2;
    private javax.swing.JButton MenuOpc3;
    private javax.swing.JButton MenuOpc4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField inputSearch1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JRadioButton radioPrestados2;
    private javax.swing.JRadioButton radioPrestados3;
    private javax.swing.JTable tableDispositivos1;
    // End of variables declaration//GEN-END:variables
}
