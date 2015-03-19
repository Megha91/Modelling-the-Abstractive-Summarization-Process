
import java.awt.Color;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.*;

public class welcome extends javax.swing.JFrame {
    
    
    public welcome() {
        initComponents();
    }
    
    private void initComponents() {
        jpNewUser = new javax.swing.JPanel();
        
        jpNewUser.setForeground(Color.DARK_GRAY);

        jpNewUser.setBackground(new Color(50,40,50));
        
        butPrimary = new javax.swing.JButton();
        butSecondary = new javax.swing.JButton();
       jPanel3 =new javax.swing.JPanel();
       
       jPanel3.setForeground(Color.DARK_GRAY);

       jPanel3.setBackground(new Color(50,40,50));
        

        op= new JOptionPane();

        getContentPane().setLayout(null);

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jpNewUser.setLayout(null);

       // jpNewUser.setBackground(new java.awt.Color(150, 145, 145));
      //  jpNewUser.setPreferredSize(new java.awt.Dimension(800, 500));
               

      // butPrimary.setBackground(Color.pink);
        butPrimary.setFont(new java.awt.Font("Arial", 1, 13));
       // butPrimary.setForeground(Color.pink);
        butPrimary.setText("File Summarizer");
        butPrimary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butPrimaryActionPerformed(evt);
            }
        });

        jPanel3.add(butPrimary);
        butPrimary.setBounds(170, 600, 180, 70);

      //  butSecondary.setBackground(Color.BLUE);
        butSecondary.setFont(new java.awt.Font("Arial", 1, 13));
       // butSecondary.setForeground(Color.BLUE);
        butSecondary.setText("Text Summarizer");
        butSecondary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSecondaryActionPerformed(evt);
            }
        });
        Toolkit t=Toolkit.getDefaultToolkit();
        int x=(int) t.getScreenSize().getWidth();
        int y=(int) t.getScreenSize().getHeight();
         
        jPanel3.add(butSecondary);
        
        jpNewUser.setSize(x,y);
         
        
        butSecondary.setBounds(170, 600, 180, 70);

        jpNewUser.add(jPanel3);
        
        jPanel3.setBounds(100, 100, 150, 67);

        getContentPane().add(jpNewUser);
        
        

        pack();
         
        

        setSize(x,y);
       
        
		setTitle("User Type Selection");
    }

    private void butPrimaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butPrimaryActionPerformed
        

		
 

		

 
op.showConfirmDialog(this,"File Processing..","Confirmation",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
 

FileProcessor l1=new FileProcessor();
		 
	

	
		
		
		




 


    }

    private void butSecondaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSecondaryActionPerformed
        
    	op.showConfirmDialog(this,"Input text processing","Confirmation",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
    	TextProcessor l1=new TextProcessor();
    }
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        dispose();
//System.exit(0);
    }
    
    
public static void main(String a[]) {

	new welcome().show();
}    

    private javax.swing.JButton butSecondary;
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
