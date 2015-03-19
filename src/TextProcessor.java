import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.net.InetAddress;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ProgressMonitor;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

import javax.swing.border.Border;

public class TextProcessor implements ActionListener

{

	String text;
	String fileName = "";
	DataOutputStream output;

	BufferedInputStream bis;

	BufferedOutputStream bos;

	byte[] receivedData;
	int in;

	String strLine;
	public Font f = new Font("Times new roman", Font.BOLD, 18);
	public Font f1 = new Font("Times new roman", Font.BOLD, 26);
	public Font f2 = new Font("Times new roman", Font.BOLD, 18);
	public Font f3 = new Font("Times new roman", Font.ITALIC, 15);
	public JLabel T1 = new JLabel("Automated Text Summarization Tool");

	public JLabel T2 = new JLabel("Text Processing");
	public JLabel l = new JLabel("Enter the input text");
	
	

	public JLabel pathdisplay = new JLabel();

	// public JGlassButton g=new JGlassButton();

	
	public JButton btn = new JButton("Summarize");
	public JButton btn1 = new JButton("Exit");
	public JTextArea tf = new JTextArea();
	public JScrollPane pane = new JScrollPane();

	public JTextArea tf1 = new JTextArea();
	public JScrollPane pane1 = new JScrollPane();

	// public JLabel txfds = new JLabel("Node A,Node B");
	public JTextField txfdd = new JTextField();

	public JLabel jLabel11;
	public JLabel jLabel12;
	public JFrame jf;
	public Container c;
	//JPanel jp = new JPanel();
	//JPanel jp1 = new JPanel();
	JOptionPane op;

	public Font f0 = new Font("Times new roman", Font.BOLD, 25);

	// public Font f1 = new Font("Times new roman" , Font.BOLD , 18);
	TextProcessor() {
		op = new JOptionPane();

		jf = new JFrame("Text Processor");
		c = jf.getContentPane();
		c.setLayout(null);
		jf.setSize(800, 670);

		c.setForeground(Color.DARK_GRAY);

		c.setBackground(new Color(50,40,50));

		JTabbedPane jTabbedPane1 = new JTabbedPane();
		JPanel jPanel1 = new JPanel();

		jPanel1.setBackground(Color.DARK_GRAY);

		JPanel jPanel2 = new JPanel();

		jPanel2.setBackground(new Color(157, 159, 141));

		jLabel11 = new JLabel();

		jLabel11.setBounds(380, 60, 350, 45);
		
		

		jLabel11.setForeground(Color.RED);

		jLabel11.setFont(f0);

		jLabel12 = new JLabel("NODE A ");

		jLabel12.setForeground(Color.RED);

		jLabel12.setFont(f1);

		pathdisplay.setBounds(450, 200, 572, 18);
		pathdisplay.setForeground(Color.RED);
		pathdisplay.setFont(f);

	 

 

		T1.setBounds(150, 3, 950, 50);
		T2.setBounds(260, 40, 950, 50);
		T1.setForeground(Color.RED);
		T2.setForeground(Color.RED);

		l.setBounds(180, 6, 9800, 55);

		l.setForeground(new Color(6, 45, 14));

		l.setFont(f2);

		

		tf.setColumns(20);
		tf.setRows(10);
		tf.setFont(f);
		tf.setBackground(new Color(246, 233, 191));
		tf.setForeground(Color.BLUE);
		tf.setName("tf");
		pane.setBounds(250, 250, 500, 230);

		pane.setName("pane");
		pane.setViewportView(tf);

		 

		btn.setBounds(300, 660, 150, 35);
		btn.setFont(f);

		btn1.setBounds(500, 660, 150, 35);
		btn1.setFont(f);

		tf1.setColumns(20);
		tf1.setRows(10);
		tf1.setFont(f);
		tf1.setBackground(new Color(246, 233, 191));
		tf1.setForeground(new Color(120, 0, 0));
		tf1.setName("tf");
		pane1.setBounds(700, 300, 200, 250);

		pane1.setName("pane");
		pane1.setViewportView(tf1);

		T1.setFont(f1);
		T2.setFont(f1);

		// txfds.setBounds(440,500,200,30);

		// txfds.setForeground(Color.CYAN);
		// txfds.setFont(f);
		txfdd.setFont(f);
		txfdd.setForeground(Color.BLUE);


		Toolkit t=Toolkit.getDefaultToolkit();
		int x=(int) t.getScreenSize().getWidth();
		int y=(int) t.getScreenSize().getHeight();
		jf.setSize(x,y);
	
		tf.setSize(x-60,y-60);
		tf1.setSize(x-60,y-60);

		pane.setSize(x-400,y-400);
		
		btn.addActionListener(this);
		btn1.addActionListener(this);
		btn.setMnemonic(KeyEvent.VK_S);
		jf.show();
		c.add(pane, BorderLayout.CENTER);
		// c.add(pane1, BorderLayout.CENTER);
		 

		/*
		 * c.add(n1); c.add(n2); c.add(n3); c.add(n4); c.add(n5); c.add(n6);
		 * c.add(n7); c.add(n8); c.add(n9); c.add(n10);
		 */

		// c.add(txfds);

		// c.add(txfdd);

		// c.add(note);
		// c.add(notedes);
		c.add(btn);
		c.add(btn1);
		c.add(T1);
		c.add(l);
		c.add(T2);
	
		jf.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent win) {
				System.exit(0);
			}
		});

	}

	public static void main(String args[]) {
		new TextProcessor();
		// /PortListener but;

	}

	 

	public void actionPerformed(ActionEvent e) {
		 

		 

		if (e.getSource() == btn) {
			
			
			String content=tf.getText();
			
			System.out.println("content in text processor is "+content);
			
			File file = new File("content.txt");
			try {
				file.createNewFile();
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
			
			FileWriter fw = null;
			try {
				fw = new FileWriter(file.getAbsoluteFile());
			} catch (IOException e1) {
				// TODO Auto-generated catch block	`
				e1.printStackTrace();
			}
			BufferedWriter bw = new BufferedWriter(fw);
			try {
				bw.write(content);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			try {
				bw.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
	 fileName=file.getAbsoluteFile().getName().toString();
	 fileName=fileName;
			
			System.out.println("filename in text processor is "+fileName);
			
			
			WordCount wc = new WordCount();
			int charCount = wc.charCount(fileName);
			JOptionPane.showConfirmDialog(null, charCount,
					"Number Of Characters", JOptionPane.DEFAULT_OPTION,
					JOptionPane.ERROR_MESSAGE);

			int wordCount = wc.wordcount(fileName);
			JOptionPane.showConfirmDialog(null, wordCount, "Number Of words",
					JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);

			int lineCount = WordCount.linecount(fileName);
			JOptionPane.showConfirmDialog(null, lineCount, "Number Of lines",
					JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
			// new Proceed().show();
			
			
			SentenceRanker sr=new SentenceRanker();
			ArrayList<String> sentences=SentenceRanker.sentenceSepartor(fileName);
			HashMap<Integer, Integer>  rank = sr.rankSenteneBased(sentences);
			
			JOptionPane.showConfirmDialog(null, "Processing", "Summarized",
					JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
			
			JOptionPane.showConfirmDialog(null, "opening output browser", "Output File Created",
					JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE);
			try {
				sr.displaySummary(sentences, rank);
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
			 

			new output();
			}
		if (e.getSource() == btn1) {
			System.exit(0);
		}
	}

}
