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
        getContentPane().add(tbn1);

        btn2.setText("2");
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
        getContentPane().add(btn6);

        btn7.setText("7");
        getContentPane().add(btn7);

        btn8.setText("8");
        getContentPane().add(btn8);

        btn9.setText("9");
        getContentPane().add(btn9);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn3ActionPerformed

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
