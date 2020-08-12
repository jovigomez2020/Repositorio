
public class Datospersonales extends javax.swing.JFrame {
 private int totale;
 private String pedidom[][];
 
    public Datospersonales(int totale1, String[][] array) {
        initComponents();
        totale = totale1;
        pedidom = array;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        Tnombre = new javax.swing.JTextField();
        Tedad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Ttarjeta = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Datos del cliente");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        Tnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TnombreKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TnombreKeyTyped(evt);
            }
        });

        Tedad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TedadKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Edad:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Tarjeta:");

        Ttarjeta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TtarjetaKeyTyped(evt);
            }
        });

        jButton1.setText("Completar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Ttarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tedad, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Tnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Tnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Tedad, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Ttarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        if(Tnombre.getText().equals("") || Tedad.getText().equals("") || Ttarjeta.getText().equals("")){

        }
        else{
        String nombr="";
        String edd="";
        String tarjet="";
        
        nombr = Tnombre.getText();
        edd = Tedad.getText();
        tarjet = Ttarjeta.getText();
       
        new pagar(nombr,edd,tarjet,getTotale(),getPedidom()).setVisible(true);
        super.dispose(); 
        }

        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TnombreKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TnombreKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_TnombreKeyPressed

    private void TnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TnombreKeyTyped
        //evento para permitir solamente numeros
        //codigo buscado en google
        //enlace: https://stackoverflow.com/questions/26944185/input-in-text-field-only-number-in-java-application
        char enter = evt.getKeyChar();
        if((Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_TnombreKeyTyped

    private void TtarjetaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TtarjetaKeyTyped
        //evento para permitir solamente numeros
        //codigo buscado en google
        //enlace: https://stackoverflow.com/questions/26944185/input-in-text-field-only-number-in-java-application
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_TtarjetaKeyTyped

    private void TedadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TedadKeyTyped
        //evento para permitir solamente numeros
        //codigo buscado en google
        //enlace: https://stackoverflow.com/questions/26944185/input-in-text-field-only-number-in-java-application
        char enter = evt.getKeyChar();
        if(!(Character.isDigit(enter))){
            evt.consume();
        }
    }//GEN-LAST:event_TedadKeyTyped

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
            java.util.logging.Logger.getLogger(Datospersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Datospersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Datospersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Datospersonales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Tedad;
    private javax.swing.JTextField Tnombre;
    private javax.swing.JTextField Ttarjeta;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the totale
     */
    public int getTotale() {
        return totale;
    }

    /**
     * @param totale the totale to set
     */
    public void setTotale(int totale) {
        this.totale = totale;
    }

    /**
     * @return the pedidom
     */
    public String[][] getPedidom() {
        return pedidom;
    }

    /**
     * @param pedidom the pedidom to set
     */
    public void setPedidom(String[][] pedidom) {
        this.pedidom = pedidom;
    }
}
