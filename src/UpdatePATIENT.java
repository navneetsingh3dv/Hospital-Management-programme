
import javax.swing.JOptionPane;
import java.sql.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UpdatePATIENT.java
 *
 * Created on Nov 9, 2013, 3:22:19 PM
 */

/**
 *
 * @author sonal
 */
public class UpdatePATIENT extends javax.swing.JFrame {

    /** Creates new form UpdatePATIENT */
    public UpdatePATIENT() {
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        TF4 = new javax.swing.JTextField();
        TF5 = new javax.swing.JTextField();
        TF2 = new javax.swing.JTextField();
        TF3 = new javax.swing.JTextField();
        TF8 = new javax.swing.JTextField();
        TF6 = new javax.swing.JTextField();
        TF1 = new javax.swing.JTextField();
        TF7 = new javax.swing.JTextField();
        TF9 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Sakkal Majalla", 1, 36)); // NOI18N
        jLabel1.setText("Update Patient");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(52, 0, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 57, 151, 10));

        jLabel3.setText("ID Number:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 101, 66, 40));

        jLabel6.setFont(new java.awt.Font("HGHangle", 3, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 153));
        jLabel6.setText("Enter:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 78, -1, -1));

        jLabel13.setFont(new java.awt.Font("HGHangle", 3, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 153));
        jLabel13.setText("Update:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 147, -1, -1));

        jButton2.setFont(new java.awt.Font("Traditional Arabic", 3, 18)); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(237, 540, 97, -1));

        jButton1.setFont(new java.awt.Font("Traditional Arabic", 3, 18)); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 540, 100, -1));

        jButton3.setFont(new java.awt.Font("Traditional Arabic", 3, 18)); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 540, 94, -1));

        jButton4.setFont(new java.awt.Font("Traditional Arabic", 3, 18)); // NOI18N
        jButton4.setText("Home");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(277, 595, 170, 55));

        jCheckBox1.setText("Name:");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 174, 192, -1));

        jCheckBox2.setText("Address:");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 227, 192, -1));

        jCheckBox3.setText("Phone Number:");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 268, 192, -1));

        jCheckBox4.setText("Date of Admission (YYYY-MM-DD):");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 309, 192, -1));

        jCheckBox5.setText("Date of Discharge (YYYY-MM-DD):");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 350, 192, -1));

        jCheckBox6.setText("Payable Amount:");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 391, 192, -1));

        jCheckBox7.setText("Disease / Trouble:");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 432, 192, -1));

        jCheckBox8.setText("Room Number:");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });
        getContentPane().add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(43, 473, 192, -1));

        TF4.setEditable(false);
        TF4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF4ActionPerformed(evt);
            }
        });
        getContentPane().add(TF4, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 269, 141, -1));

        TF5.setEditable(false);
        getContentPane().add(TF5, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 310, 141, -1));

        TF2.setEditable(false);
        TF2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TF2ActionPerformed(evt);
            }
        });
        getContentPane().add(TF2, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 175, 141, -1));

        TF3.setEditable(false);
        getContentPane().add(TF3, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 228, 141, -1));

        TF8.setEditable(false);
        getContentPane().add(TF8, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 433, 141, -1));

        TF6.setEditable(false);
        getContentPane().add(TF6, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 351, 141, -1));
        getContentPane().add(TF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 111, 141, -1));

        TF7.setEditable(false);
        getContentPane().add(TF7, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 392, 141, -1));

        TF9.setEditable(false);
        getContentPane().add(TF9, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 473, 141, -1));

        jButton5.setFont(new java.awt.Font("Traditional Arabic", 3, 18)); // NOI18N
        jButton5.setText("Back");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 540, 83, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        TF1.setText(null);
        TF2.setText(null);
        TF3.setText(null);
        TF4.setText(null);
        TF5.setText(null);
        TF6.setText(null);
        TF7.setText(null);
        TF8.setText(null);
        TF9.setText(null);
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
        jCheckBox4.setSelected(false);
        jCheckBox5.setSelected(false);
        jCheckBox6.setSelected(false);
        jCheckBox7.setSelected(false);
        jCheckBox8.setSelected(false);        
        TF2.setEditable(false);
        TF3.setEditable(false);
        TF4.setEditable(false);
        TF5.setEditable(false);
        TF6.setEditable(false);
        TF7.setEditable(false);
        TF8.setEditable(false);
        TF9.setEditable(false);
}//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
try{Class.forName("java.sql.DriverManager");
Connection c=DriverManager.getConnection("jdbc:mysql://"
        + "localhost:3306/op","root","1");
Statement st=c.createStatement();
String id,name,address,phno,doa,dod,amt,disease,room;
id=TF1.getText();
name=TF2.getText();
address=TF3.getText();
phno=TF4.getText();
doa=TF5.getText();
dod=TF6.getText();
amt=TF7.getText();
disease=TF8.getText();
room=TF9.getText();
if(jCheckBox1.isSelected())
{  String q="update patient set name='"+name+"' where id="+id;
   st.executeUpdate(q);
}
if(jCheckBox2.isSelected())
{  String q="update patient set address='"+address+"' where id="+id;
   st.executeUpdate(q);
}
if(jCheckBox3.isSelected())
{  String q="update patient set phno="+phno+" where id="+id;
st.executeUpdate(q);
}
if(jCheckBox4.isSelected())
{  String q="update patient set doa="+doa+" where id="+id;
st.executeUpdate(q);
}
if(jCheckBox5.isSelected())
{  String q="update patient set dod="+dod+" where id="+id;
   st.executeUpdate(q);
}
if(jCheckBox6.isSelected())
{  String q="update patient set amt="+amt+" where id="+id;
   st.executeUpdate(q);
}
if(jCheckBox7.isSelected())
{  String q="update patient set disease='"+disease+"' where id="+id;
   st.executeUpdate(q);
}
if(jCheckBox8.isSelected())
{  String q="update patient set room="+room+" where id="+id;
   st.executeUpdate(q);
}

JOptionPane.showMessageDialog(null,"DONE");
} catch(Exception e)
{JOptionPane.showMessageDialog(null,"ERROR:  "+e.getMessage());
}
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
this.setVisible(false);
new Main().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
if(jCheckBox4.isSelected()){TF5.setEditable(true);}
else TF5.setEditable(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
if(jCheckBox5.isSelected()){TF6.setEditable(true);}
else TF6.setEditable(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void TF4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF4ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_TF4ActionPerformed

    private void TF2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TF2ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_TF2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
if(jCheckBox1.isSelected()){TF2.setEditable(true);}
else TF2.setEditable(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
if(jCheckBox2.isSelected()){TF3.setEditable(true);}
else TF3.setEditable(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
if(jCheckBox3.isSelected()){TF4.setEditable(true);}
else TF4.setEditable(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
if(jCheckBox6.isSelected()){TF7.setEditable(true);}
else TF7.setEditable(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
if(jCheckBox7.isSelected()){TF8.setEditable(true);}
else TF8.setEditable(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
if(jCheckBox8.isSelected()){TF9.setEditable(true);}
else TF9.setEditable(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        this.setVisible(false);
        new UPDATE().setVisible(true);  // TODO add your handling code here:
}//GEN-LAST:event_jButton5ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdatePATIENT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TF1;
    private javax.swing.JTextField TF2;
    private javax.swing.JTextField TF3;
    private javax.swing.JTextField TF4;
    private javax.swing.JTextField TF5;
    private javax.swing.JTextField TF6;
    private javax.swing.JTextField TF7;
    private javax.swing.JTextField TF8;
    private javax.swing.JTextField TF9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
