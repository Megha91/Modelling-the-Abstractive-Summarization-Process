
import java.sql.*;
import javax.swing.*;

public class Proceed extends javax.swing.JFrame {
    
    
    public Proceed() {
        initComponents();
    }
    
    private void initComponents() {
        jpNewUser = new javax.swing.JPanel();
        
        butPrimary = new javax.swing.JButton();
        
        jPanel3 =new javax.swing.JPanel();
        

        op= new JOptionPane();

        getContentPane().setLayout(null);

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jpNewUser.setLayout(null);

        jpNewUser.setBackground(new java.awt.Color(50, 145, 145));
        jpNewUser.setPreferredSize(new java.awt.Dimension(800, 500));
               

        butPrimary.setBackground(new java.awt.Color(153, 100, 0));
        butPrimary.setFont(new java.awt.Font("Arial", 1, 13));
        butPrimary.setForeground(new java.awt.Color(255, 255, 254));
        butPrimary.setText("View Results");
        butPrimary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPrimaryActionPerformed(evt);
            }
        });

        jPanel3.add(butPrimary);
        butPrimary.setBounds(170, 600, 180, 70);

        
        jpNewUser.add(jPanel3);
        jPanel3.setBackground(new java.awt.Color(50, 145, 145));
        jPanel3.setBounds(100, 100, 150, 67);

        getContentPane().add(jpNewUser);
        jpNewUser.setBounds(0, 0, 810, 590);
        setResizable(false);

        pack();
        setSize(600,600);
		setTitle("Automated Text Summarization Tool");
    }

    private void butPrimaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPrimaryActionPerformed
        

		
 

		

 
op.showConfirmDialog(this,"Summarized","Confirmation",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
  

 


		 

    }

     


    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        dispose();
//System.exit(0);
    }
    
    
public static void main(String a[]) {

	new Proceed().show();
}    

    
    private javax.swing.JButton butPrimary;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jpNewUser;
  
    JOptionPane op;
   
    
}
