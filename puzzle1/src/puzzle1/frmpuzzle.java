/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package puzzle1;

/**
 *
 * @author Erick
 */
public class frmpuzzle extends javax.swing.JFrame {

    /**
     * Creates new form frmpuzzle
     */
    public frmpuzzle() {
        initComponents(); 
        setSize(400,400); //tamaño de la ventana
        setLocationRelativeTo(null);//localizacion del formulario
        btn9.setVisible(false);
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tbn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(3, 3));

        tbn1.setText("1");
        tbn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbn1ActionPerformed(evt);
            }
        });
        getContentPane().add(tbn1);

        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        getContentPane().add(btn2);

        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        getContentPane().add(btn3);

        btn4.setText("4");
        getContentPane().add(btn4);

        btn5.setText("5");
        getContentPane().add(btn5);

        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        getContentPane().add(btn6);

        btn7.setText("7");
        getContentPane().add(btn7);

        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        getContentPane().add(btn8);

        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        if(btn6.isVisible()==false){
            btn6.setText(btn3.getText());
            btn3.setVisible(false);
            btn6.setVisible(true);
        }
        if(btn2.isVisible()==false){
         btn2.setText(btn3.getText());
        btn3.setVisible(false);
        btn2.setVisible(true);
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed

        // TODO add your handling code here:
        if(btn9.isVisible()==false){
       btn9.setText(btn6.getText());
      btn6.setVisible(false);
      btn9.setVisible(true);
    }
       if(btn3.isVisible()==false){
            btn3.setText(btn6.getText());
            btn6.setVisible(false);
            btn3.setVisible(true);
    }
    }//GEN-LAST:event_btn6ActionPerformed
      
    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed

        
        
             // TODO add your handling code here:
       btn9.setText(btn8.getText());
       btn8.setVisible(false);
       btn9.setVisible(true);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
          if(btn6.isVisible()==false){
        btn6.setText(btn9.getText());
        btn9.setVisible(false);
        btn6.setVisible(true);
        }
        if(btn8.isVisible()==false){
        btn8.setText(btn9.getText());
        btn9.setVisible(false);
        btn8.setVisible(true);
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void tbn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbn1ActionPerformed
        // TODO add your handling code here:
        if(btn2.isVisible()==false){
        btn2.setText(tbn1.getText());
        tbn1.setVisible(false);
        btn2.setVisible(true);
        }
        if(btn4.isVisible()==false){
        btn4.setText(tbn1.getText());
        tbn1.setVisible(false);
        btn4.setVisible(true);
        }
    }//GEN-LAST:event_tbn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:if(btn8.isVisible()==false){
        if(btn);
        btn3.setText(btn2.getText());
        btn2.setVisible(false);
        btn3.setVisible(true);
        if(btn3.isVisible()==false){
            btn3.setText(btn6.getText());
            btn6.setVisible(false);
            btn3.setVisible(true);
    }
    }//GEN-LAST:event_btn2ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton tbn1;
    // End of variables declaration//GEN-END:variables
}
