
public class convertidor extends javax.swing.JFrame{
private class conv extends monedas{
    private int cantidado;
    private int cantidadd;
    private double cantidad;
    private double total;
    private String dato;
//get
        @Override
        public int getcantidado() {
           return cantidado;
        }

        @Override
        public int getcantidadd() {
            return cantidadd;
        }

        @Override
        public double getcantidad() {
            return cantidad;
        }
        @Override
        public double gettotal() {
             return total;
        }
        @Override
        public String getdato() {
            return dato;
        }

//set
    public void setcantidado(int a) {
        this.cantidado = a;
    }
    public void setcantidadd(int a) {
        this.cantidadd = a;
    }
    public void setcantidad(double a) {
        this.cantidad = a;
    }
    public void settotal(double a) {
        this.total = a;
    }  
//funcion
    public double funccion() {
    
    if (cantidado ==0 && cantidadd==0){total = cantidad * 0.040;}//lempira a dolares
    if (cantidado ==0 && cantidadd==1){total = cantidad * 1;}//lempira a lempira
    if (cantidado ==0 && cantidadd==2){total = cantidad * 0.034;}//lempira a euro
    if (cantidado ==0 && cantidadd==3){total = cantidad * 4.23;}//lempira a yen
    if (cantidado ==0 && cantidadd==4){total = cantidad * 0.88;}//lempira a peso mx
    if (cantidado ==0 && cantidadd==5){total = cantidad * 0.31;}//lempira a quetzal
    if (cantidado ==0 && cantidadd==6){total = cantidad * 23.36;}//lempira a colon
    
    if (cantidado ==1 && cantidadd==0){total = cantidad * 1;}
    if (cantidado ==1 && cantidadd==1){total = cantidad * 24.91;}
    if (cantidado ==1 && cantidadd==2){total = cantidad * 0.85;}
    if (cantidado ==1 && cantidadd==3){total = cantidad * 105.28;}
    if (cantidado ==1 && cantidadd==4){total = cantidad * 21.94;}
    if (cantidado ==1 && cantidadd==5){total = cantidad * 7.70;}
    if (cantidado ==1 && cantidadd==6){total = cantidad * 581.70;}
    
    if (cantidado ==2 && cantidadd==0){total = cantidad * 1.18;}
    if (cantidado ==2 && cantidadd==1){total = cantidad * 29.32;}
    if (cantidado ==2 && cantidadd==2){total = cantidad * 1;}
    if (cantidado ==2 && cantidadd==3){total = cantidad * 123.87;}
    if (cantidado ==2 && cantidadd==4){total = cantidad * 25.82;}
    if (cantidado ==2 && cantidadd==5){total = cantidad * 9.06;}
    if (cantidado ==2 && cantidadd==6){total = cantidad * 684.54;}
    
    if (cantidado ==3 && cantidadd==0){total = cantidad * 0.24;}
    if (cantidado ==3 && cantidadd==1){total = cantidad * 0.0095;}
    if (cantidado ==3 && cantidadd==2){total = cantidad * 0.0081;}
    if (cantidado ==3 && cantidadd==3){total = cantidad * 1;}
    if (cantidado ==3 && cantidadd==4){total = cantidad * 0.21;}
    if (cantidado ==3 && cantidadd==5){total = cantidad * 0.073;}
    if (cantidado ==3 && cantidadd==6){total = cantidad * 5.53;}   
        
    if (cantidado ==4 && cantidadd==0){total = cantidad * 1.14;}
    if (cantidado ==4 && cantidadd==1){total = cantidad * 0.046;}
    if (cantidado ==4 && cantidadd==2){total = cantidad * 0.039;}
    if (cantidado ==4 && cantidadd==3){total = cantidad * 4.80;}
    if (cantidado ==4 && cantidadd==4){total = cantidad * 1;}
    if (cantidado ==4 && cantidadd==5){total = cantidad * 0.35;}
    if (cantidado ==4 && cantidadd==6){total = cantidad * 26.51;}   
        
    if (cantidado ==5 && cantidadd==0){total = cantidad * 3.24;}
    if (cantidado ==5 && cantidadd==1){total = cantidad * 0.13;}
    if (cantidado ==5 && cantidadd==2){total = cantidad * 0.11;}
    if (cantidado ==5 && cantidadd==3){total = cantidad * 13.68;}
    if (cantidado ==5 && cantidadd==4){total = cantidad * 2.85;}
    if (cantidado ==5 && cantidadd==5){total = cantidad * 1;}
    if (cantidado ==5 && cantidadd==6){total = cantidad * 75.62;}   
    
    if (cantidado ==6 && cantidadd==0){total = cantidad * 0.043;}
    if (cantidado ==6 && cantidadd==1){total = cantidad * 0.0017;}
    if (cantidado ==6 && cantidadd==2){total = cantidad * 0.0015;}
    if (cantidado ==6 && cantidadd==3){total = cantidad * 0.18;}
    if (cantidado ==6 && cantidadd==4){total = cantidad * 0.038;}
    if (cantidado ==6 && cantidadd==5){total = cantidad * 0.013;}
    if (cantidado ==6 && cantidadd==6){total = cantidad * 1;}   
    
    //saber con que moneda estamos trabajando (para mostrarla en resultado)
    if(cantidadd ==1 ){dato = "lempiras";}   
    if(cantidadd ==0 ){dato = "dolares";}   
    if(cantidadd ==2 ){dato = "euros";}   
    if(cantidadd ==3 ){dato = "yen";}   
    if(cantidadd ==4 ){dato = "pesos mexicanos";}   
    if(cantidadd ==5 ){dato = "quetzales";}   
    if(cantidadd ==6 ){dato = "colonos";}    
    return total;
    
}



        
    
}

    /**
     * Creates new form convertidor
     */
    public convertidor() {
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

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        monedaO = new javax.swing.JComboBox<>();
        monedaD = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cantidad = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        resultad = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Convertidor de monedas - progamacion orientada a objetos");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Moneda de origen");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Moneda destino");

        monedaO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lempira", "Dolar", "Euro", "Yen", "Peso mexicano", "Quetzal", "Colon" }));

        monedaD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dolar", "Lempira", "Euro", "Yen", "Peso mexicano", "Quetzal", "Colon" }));
        monedaD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monedaDActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Cantidad:");

        cantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadActionPerformed(evt);
            }
        });
        cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantidadKeyTyped(evt);
            }
        });

        jButton1.setText("Convertir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Resultado:");

        resultad.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(monedaO, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(monedaD, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(89, 89, 89))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(resultad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(254, 254, 254)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(156, 156, 156)
                                .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monedaO, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monedaD, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resultad, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void monedaDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monedaDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monedaDActionPerformed

    private void cantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    conv ccv = new conv();//llamando clase
    
    //limpiando resultado
    resultad.setText("");
    
    //guardando dato del textfield a variable
    ccv.setcantidad(Double.parseDouble(cantidad.getText()));
    
    //capturando numero de la opcion seleccionada
    ccv.setcantidado(monedaO.getSelectedIndex());
    ccv.setcantidadd(monedaD.getSelectedIndex());

    //conversion double a string (buscada en google)
    //enlace: https://es.stackoverflow.com/questions/1487/guia-definitiva-de-conversi%C3%B3n-de-tipos-en-java
    String texconv = String.valueOf(ccv.funccion());
    
    resultad.setText(texconv+" "+ccv.getdato());





    }//GEN-LAST:event_jButton1ActionPerformed

    private void cantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantidadKeyTyped
        //evento para permitir solamente numeros
        //codigo buscado en google
        //enlace: https://stackoverflow.com/questions/26944185/input-in-text-field-only-number-in-java-application
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_cantidadKeyTyped

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
            java.util.logging.Logger.getLogger(convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(convertidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new convertidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidad;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JComboBox<String> monedaD;
    private javax.swing.JComboBox<String> monedaO;
    private javax.swing.JLabel resultad;
    // End of variables declaration//GEN-END:variables
}
