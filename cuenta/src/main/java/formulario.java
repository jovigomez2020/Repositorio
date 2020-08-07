
import javax.swing.table.DefaultTableModel;


public class formulario extends javax.swing.JFrame {

    /**
     * Creates new form formulario
     */
    public formulario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Ncuenta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Nnombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Napellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Nlist = new javax.swing.JComboBox<>();
        Nagregar = new javax.swing.JButton();
        Neliminar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Ntable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Numero de cuenta: ");

        Ncuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NcuentaActionPerformed(evt);
            }
        });
        Ncuenta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NcuentaKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre: ");

        Nnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NnombreKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Apellido:");

        Napellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                NapellidoKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Carrera:");

        Nlist.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        Nlist.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingenieria en computacon", "Ingenieria electronica", "Ingenieria civil", "Psicologia", "Derecho", "Mercadotecnia" }));

        Nagregar.setText("Agregar");
        Nagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NagregarActionPerformed(evt);
            }
        });

        Neliminar.setText("Eliminar");
        Neliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NeliminarMouseClicked(evt);
            }
        });
        Neliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NeliminarActionPerformed(evt);
            }
        });

        Ntable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cuenta", "Nombre completo", "Carrera"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Ntable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Ncuenta))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Napellido, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Nlist, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nagregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Neliminar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ncuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Nnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(Napellido, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Nagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Neliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Nlist)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NagregarActionPerformed
        String varCuenta = "";
        String varNombre = "";
        int varcarrera0 = 0;
        String varcarrera = "";
        
        if(Ncuenta.getText().equals("") && Nnombre.getText().equals("") && Napellido.getText().equals("")){
        varCuenta = Ncuenta.getText();
        varNombre = Nnombre.getText() + " " + Napellido.getText();
        varcarrera0 = Nlist.getSelectedIndex();
       
        
        if (varcarrera0 == 0){ varcarrera = "Ingenieria en computacion";}
        if (varcarrera0 == 1){ varcarrera = "Ingenieria electronica";}
        if (varcarrera0 == 2){ varcarrera = "Ingenieria civil";}
        if (varcarrera0 == 3){ varcarrera = "Psicologia";}
        if (varcarrera0 == 4){ varcarrera = "Derecho";}
        if (varcarrera0 == 5){ varcarrera = "Mercadotecnia";}
        
         String rowArray[] = {varCuenta,varNombre,varcarrera};
         
         DefaultTableModel tabla = (DefaultTableModel)Ntable.getModel();
         tabla.addRow(rowArray);//agregando datos a la tabla
         
         //limpiando datos
         Ncuenta.setText("");
         Nnombre.setText("");
         Napellido.setText("");
         Nlist.setSelectedIndex(0);
        }//fin if
        else {

         
        
        }//fin else
        
        
        
        
        
    }//GEN-LAST:event_NagregarActionPerformed

    private void NcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NcuentaActionPerformed

    }//GEN-LAST:event_NcuentaActionPerformed

    private void NcuentaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NcuentaKeyTyped
        //evento para permitir solamente numeros
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_NcuentaKeyTyped

    private void NnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NnombreKeyTyped
        //evento para permitir solamente letras
        char enter = evt.getKeyChar();
        if((Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_NnombreKeyTyped

    private void NapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_NapellidoKeyTyped
        //evento para permitir solamente letras
        char enter = evt.getKeyChar();
        if((Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_NapellidoKeyTyped

    private void NeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NeliminarActionPerformed
       int vwind = Ntable.getSelectedRow();
       if(vwind != -1){
        int modelIndex = Ntable.convertRowIndexToModel(vwind); 
        DefaultTableModel model = (DefaultTableModel)Ntable.getModel();
        model.removeRow(modelIndex); 
       }
    }//GEN-LAST:event_NeliminarActionPerformed

    private void NeliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NeliminarMouseClicked

    }//GEN-LAST:event_NeliminarMouseClicked

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
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formulario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formulario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Nagregar;
    private javax.swing.JTextField Napellido;
    private javax.swing.JTextField Ncuenta;
    private javax.swing.JButton Neliminar;
    private javax.swing.JComboBox<String> Nlist;
    private javax.swing.JTextField Nnombre;
    private javax.swing.JTable Ntable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
