import java.rmi.*;
import java.rmi.server.*;
import java.net.*;
import java.io.*;
import javax.swing.*;
import java.awt.event.*;
import java.lang.*;
import java.awt.*;

import javax.swing.filechooser.FileSystemView;
import java.util.StringTokenizer;
import java.net.InetAddress;
import java.rmi.Naming;
import java.util.Date;
import java.util.Vector;
import java.util.Random;
public class Login extends javax.swing.JFrame
{



JOptionPane op;
 
 
static String username;

/** Creates new form Login */
public Login()
{
initComponents();

}


private void initComponents()
{

jPan = new javax.swing.JPanel();
jLabel1 = new javax.swing.JLabel();
user = new javax.swing.JTextField();
jLabel2 = new javax.swing.JLabel();
submit = new javax.swing.JButton();
reset = new javax.swing.JButton();


pass = new javax.swing.JPasswordField();
jLabel3 = new javax.swing.JLabel();
op=new JOptionPane();
getContentPane().setLayout(null);

jPanel1 = new javax.swing.JPanel();

jLab = new javax.swing.JLabel();
 
save = new javax.swing.JButton();

getContentPane().setLayout(null);
getContentPane().setBackground(new Color(50,40,50));

addWindowListener(new java.awt.event.WindowAdapter()
{
public void windowClosing(java.awt.event.WindowEvent evt)
{

exitForm(evt);

}
});

jPan.setLayout(null);

jPan.setBackground(new java.awt.Color(200, 113, 181));
 
 


Toolkit t=Toolkit.getDefaultToolkit();
int x=(int) t.getScreenSize().getWidth();
int y=(int) t.getScreenSize().getHeight();

jPan.setBounds(x-700, y-600, x-660, y-500);


jLab.setFont(new java.awt.Font("Arial", 0, 14));
jLab.setText("User ID:");
jPan.add(jLab);
jLab.setBounds(40, 40, 90, 30);

jPan.add(user);
user.setBounds(140, 40, 100, 30);

jLabel2.setFont(new java.awt.Font("Arial", 0, 14));
jLabel2.setText("Password:");
jPan.add(jLabel2);
jLabel2.setBounds(40, 90, 90, 30);

submit.setBackground(new java.awt.Color(204, 204, 255));
submit.setFont(new java.awt.Font("Arial", 0, 14));
submit.setForeground(new java.awt.Color(0, 0, 153));
submit.setText("Submit");

submit.addActionListener(new java.awt.event.ActionListener()
{
public void actionPerformed(java.awt.event.ActionEvent evt)
{
submitActionPerformed(evt);
}
});

jPan.add(submit);
submit.setBounds(80, 150, 80, 27);

reset.setBackground(new java.awt.Color(204, 204, 255));
reset.setFont(new java.awt.Font("Arial", 0, 14));
reset.setForeground(new java.awt.Color(0, 0, 153));
reset.setLabel("Reset");

reset.addActionListener(new java.awt.event.ActionListener()
{
public void actionPerformed(java.awt.event.ActionEvent evt)
{
resetActionPerformed(evt);
}
});

jPan.add(reset);
reset.setBounds(180, 150, 80, 27);




jPan.add(pass);
pass.setBounds(140, 91, 100, 30);

getContentPane().add(jPan);


jLabel3.setFont(new java.awt.Font("Arial", 0, 24));
jLabel3.setForeground(new java.awt.Color(255, 255, 255));
jLabel3.setText("Text Summarizer");
jLabel3.setFont(new java.awt.Font("Arial", 0, 18));
getContentPane().add(jLabel3);
jLabel3.setBounds(100, 30, 570, 30);


pack();

jPanel1.setLayout(null);

jPanel1.setBorder(new javax.swing.border.EtchedBorder());

 

 
jLabel1.setBounds(10, 10, 180, 40);



getContentPane().add(jPanel1);
jPanel1.setBounds(150, 170, 340, 300);




 

jPanel1.setVisible(false);
jPanel1.setBackground(new java.awt.Color(0, 204, 204));

}
//GEN-END:initComponents



 


private void resetActionPerformed(java.awt.event.ActionEvent evt)
{
//GEN-FIRST:event_resetActionPerformed

user.setText("");
pass.setText("");
}

private void submitActionPerformed(java.awt.event.ActionEvent evt)
{
 if(user.getText().trim().equals(""))
{
op.showConfirmDialog(this,"Enter The User Name","Alert",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
user.grabFocus();
}
 if(pass.getText().trim().equals(""))
 {
 op.showConfirmDialog(this,"Enter The PassWord","Alert",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
 pass.grabFocus();
 } 
 
 if(user.getText().trim().equals("admin") && pass.getText().trim().equals("admin"))
 {
	 op.showConfirmDialog(this,"Authorised User","Alert",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
	 
	 new welcome().show();
 }

else
{

op.showConfirmDialog(this,"UnAuthorised User","Alert",JOptionPane.DEFAULT_OPTION,JOptionPane.ERROR_MESSAGE);
user.grabFocus();
 
}
}
/** Exit the Application */

private void exitForm(java.awt.event.WindowEvent evt)
{
//GEN-FIRST:event_exitForm
System.exit(0);
}

/**
* @param args the command line arguments
*/
public static void main(String args[]) {
JFrame jf1=new Login();
jf1.setResizable(false);
//jf1.setSize(680,500);


Toolkit t=Toolkit.getDefaultToolkit();
int x=(int) t.getScreenSize().getWidth();
int y=(int) t.getScreenSize().getHeight();
jf1.setSize(x,y);
jf1.setTitle("Text Summarizer: User Login");
jf1.show();


}

// Variables declaration - do not modify//GEN-BEGIN:variables
private javax.swing.JButton exit;
 
private javax.swing.JLabel jLabel1;
private javax.swing.JLabel jLabel2;
private javax.swing.JLabel jLabel3;
private javax.swing.JPanel jPan;
private javax.swing.JPasswordField pass;
private javax.swing.JButton reset;
private javax.swing.JButton submit;
private javax.swing.JTextField user;
 
private javax.swing.JLabel jLab;
private javax.swing.JPanel jPanel1;
 
private javax.swing.JButton save;

// End of variables declaration//GEN-END:variables

}

