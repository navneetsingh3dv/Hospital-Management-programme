
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Login.java
 *
 * Created on Nov 9, 2013, 11:43:33 AM
 */

/**
 *
 * @author sonal
 */
public class Login extends javax.swing.JFrame {

    /** Creates new form Login */
    public Login() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TF1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        TF2 = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TF1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF1ActionPerformed(evt);
            }
        });
        getContentPane().add(TF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 90, -1));

        jButton1.setFont(new java.awt.Font("Traditional Arabic", 3, 12)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 80, 40));

        jButton2.setFont(new java.awt.Font("Traditional Arabic", 3, 12)); // NOI18N
        jButton2.setText("Close");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 320, 70, 40));
        getContentPane().add(TF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 90, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 62, 390, 10));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login 1.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String username=TF1.getText();
        String password=new String(TF2.getPassword());
        if(username.equals("netbeans")&& password.equals("mysql")) {
            JOptionPane.showMessageDialog(null,"Congratulations!! "
                    + "You are successfully logged in." +
            "\n" + "\n" +  "Welcome to Hospital Management System."+"\n"+
                    "Please click OK to proceed.");
            new Main().setVisible(true);
            this.setVisible(false);
        } else{
            JOptionPane.showMessageDialog(null," Either username or "
                    + "password is incorrect! "
                    + "Sorry, please try again. ");
            TF1.setText(null);
            TF2.setText(null);}
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       System.exit(0);
}//GEN-LAST:event_jButton2ActionPerformed

    private void TF1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TF1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TF1;
    private javax.swing.JPasswordField TF2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
