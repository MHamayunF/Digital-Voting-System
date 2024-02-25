
	import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
	import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
	import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.jdbc.result.ResultSetMetaData;
import com.mysql.cj.xdevapi.Table;

	public class Election_system implements ActionListener {
		JFrame f1,f2,f3,f4,f5,f6,f7,f8,f9;
		JLabel l, l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26,l27,l28,l29,l30,l31,l32,l33,l34;
		JPasswordField ps1,ps2,ps5;
		JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9;
		JComboBox<String> cb;
		ImageIcon logo;
		JRadioButton rB1,rB2,rB3,rB4,rB5,rB6,rB7;
		JProgressBar pb,pb2;
		Boolean bolvar=false;
		private int PTIvotes=0,PPPvotes=0,PMLNvotes=0,ANPvotes=0,JUIvotes=0,MMAvotes=0;
		Timer timer1;
		JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17;
		int birthyear;
		JPanel p1;
		DefaultTableModel model;
		String password,s1,vc,vcc,vn;
		
		Election_system()
		{
			
			//Main Frame 
			{
	        f1 = new JFrame("Election System");
	        f1.setBounds(100, 100, 700, 500);
	        f1.setResizable(false);
	        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f1.getContentPane().setBackground(Color.white);
	        f1.setLayout(null);
	        f1.getRootPane().setBorder(BorderFactory.createEmptyBorder()); // Remove the container's
	        
	       
	        l = new JLabel();
	        ImageIcon i1 = new ImageIcon("E:/java/semester project/New folder/ECOP logo.jpeg");
	        Image originalImage = i1.getImage();
	        Image scaledImage = originalImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	        i1 = new ImageIcon(scaledImage);
	        l.setIcon(i1);
	        l.setOpaque(true);
	        l.setVisible(true);
	        l.setBounds(70, 10, 100, 100);
	        f1.add(l);
	        
	        l1 = new JLabel("ELECTION COMMISSION OF PAKISTAN");
	        l1.setBounds(200, 30, 500, 30);
	        l1.setForeground(Color.BLACK);
	        l1.setFont(new Font("Georgian", Font.BOLD, 22));
	        f1.add(l1);
	      
	        l2 = new JLabel("Digital Voting System");
	        l2.setForeground(Color.BLACK);
	        l2.setBounds(220, 80, 300, 30);
	        l2.setHorizontalAlignment(SwingConstants.CENTER);
	        l2.setFont(new Font("Georgian", Font.BOLD, 22));
	        Border border = BorderFactory.createLineBorder(new Color(0, 40, 0));
	        l2.setBorder(border);
	        f1.add(l2);
	        

	        l3 = new JLabel();
	        ImageIcon i2 = new ImageIcon("E:\\java\\semester project\\New folder\\voter logo.jpeg");
	        Image originalImage1 = i2.getImage();
	        Image scaledImage1 = originalImage1.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	        i2 = new ImageIcon(scaledImage1);
	        l3.setIcon(i2);
	        l3.setOpaque(true);
	        l3.setVisible(true);
	        l3.setBounds(70, 200, 100, 100);
	        f1.add(l3);
	        
	        b1=new JButton("VOTER");
	        b1.setBounds(50,320,150,30);
	        b1.setFont(new Font("Georgian", Font.BOLD, 22));
	        b1.setBackground(new Color(100, 20, 20));
	        b1.setForeground(Color.white);
	        b1.addActionListener(this);
	       f1.add(b1);
	        
	        l4 = new JLabel();
	        ImageIcon i3 = new ImageIcon("E:\\java\\semester project\\New folder\\ADMIN logo.jpeg");
	        Image originalImage2 = i3.getImage();
	        Image scaledImage2 = originalImage2.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
	        i3 = new ImageIcon(scaledImage2);
	        l4.setIcon(i3);
	        l4.setOpaque(true);
	        l4.setVisible(true);
	        l4.setBounds(285, 200, 100, 100);
	        l4.setPreferredSize(new Dimension(100, 100));
	        f1.add(l4);
	        
	        b2 = new JButton("ADMIN");
	        b2.setBackground(new Color(100, 20, 20));
	        b2.setFont(new Font("Georgian", Font.BOLD, 22));
	        b2.setForeground(Color.white);
	        b2.setBounds(250, 320, 150, 30);
	        b2.addActionListener(this);
	        f1.add(b2);
	        
	        l5 = new JLabel();
	        ImageIcon i4 = new ImageIcon("E:\\java\\semester project\\New folder\\candidates logo.jpeg");
	        Image originalImage3 = i4.getImage();
	        Image scaledImage3 = originalImage3.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
	        i4 = new ImageIcon(scaledImage3);
	        l5.setIcon(i4);
	        l5.setOpaque(true);
	        l5.setVisible(true);
	        l5.setBounds(460, 180, 130, 130);
	        l5.setPreferredSize(new Dimension(100, 100));
	        f1.add(l5);
	        
	        b3 = new JButton("CANDIDATES");
	        b3.setBackground(new Color(100, 20, 20));
	        b3.setFont(new Font("Georgian", Font.BOLD, 16));
	        b3.setForeground(Color.white); 
	        b3.setBounds(450, 320, 150, 30);
	        b3.addActionListener(this);
	        f1.add(b3);
	        
	        f1.setVisible(true);
		}
		

			//Candidates Frame
		{
				f2 = new JFrame("Election System");
		        f2.setBounds(100, 100, 700, 500);
		        f2.setResizable(false);
		        f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        f2.getContentPane().setBackground(Color.white);
		        f2.setLayout(null);		     
		        f2.getRootPane().setBorder(BorderFactory.createEmptyBorder()); 
		        
		        b4 = new JButton("Back");
		        b4.setBackground(new Color(100, 20, 20));
		        b4.setFont(new Font("Georgian", Font.BOLD, 20));
		        b4.setForeground(Color.white);
		        b4.setBounds(450, 380, 150, 30);
		        b4.addActionListener(this);
		        f2.add(b4);
		        
		        l6 = new JLabel();
		        ImageIcon i1 = new ImageIcon("E:\\java\\semester project\\New folder\\PTI.jpeg");
		        Image originalImage1 = i1.getImage();
		        Image scaledImage1 = originalImage1.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		        i1 = new ImageIcon(scaledImage1);
		        l6.setIcon(i1);
		        l6.setOpaque(true);
		        l6.setVisible(true);
		        l6.setBounds(70, 10, 100, 100);
		        l6.setBackground(null); // Set background to null for transparency
		        f2.add(l6);

		        l7 = new JLabel();
		        ImageIcon i2 = new ImageIcon("E:\\java\\semester project\\New folder\\PPP.jpeg");
		        Image originalImage2 = i2.getImage();
		        Image scaledImage2 = originalImage2.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		        i2 = new ImageIcon(scaledImage2);
		        l7.setIcon(i2);
		        l7.setOpaque(true);
		        l7.setVisible(true);
		        l7.setBounds(220, 10, 100, 100); // Adjusted x position to create space for previous label
		        l7.setBackground(null); // Set background to null for transparency
		        f2.add(l7);

		        l8 = new JLabel();
		        ImageIcon i3 = new ImageIcon("E:\\java\\semester project\\New folder\\PML.jpeg");
		        Image originalImage3 = i3.getImage();
		        Image scaledImage3 = originalImage3.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		        i3 = new ImageIcon(scaledImage3);
		        l8.setIcon(i3);
		        l8.setOpaque(true);
		        l8.setVisible(true);
		        l8.setBounds(370, 10, 100, 100); // Adjusted x position to create space for previous labels
		        l8.setBackground(null); // Set background to null for transparency
		        f2.add(l8);

		        l9 = new JLabel();
		        ImageIcon i4 = new ImageIcon("E:\\java\\semester project\\New folder\\Awami.jpeg");
		        Image originalImage4 = i4.getImage();
		        Image scaledImage4 = originalImage4.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		        i4 = new ImageIcon(scaledImage4);
		        l9.setIcon(i4);
		        l9.setOpaque(true);
		        l9.setVisible(true);
		        l9.setBounds(520, 10, 100, 100); // Adjusted x position to create space for previous labels
		        l9.setBackground(null); // Set background to null for transparency
		        f2.add(l9);

		        l10 = new JLabel();
		        ImageIcon i5 = new ImageIcon("E:\\java\\semester project\\New folder\\MMA.jpeg");
		        Image originalImage5 = i5.getImage();
		        Image scaledImage5 = originalImage5.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		        i5 = new ImageIcon(scaledImage5);
		        l10.setIcon(i5);
		        l10.setOpaque(true);
		        l10.setVisible(true);
		        l10.setBounds(70, 120, 100, 100); // Adjusted y position to create a new row
		        l10.setBackground(null); // Set background to null for transparency
		        f2.add(l10);
		        
		        l11 = new JLabel();
		        ImageIcon i6 = new ImageIcon("E:\\java\\semester project\\New folder\\JUI.jpeg");
		        Image originalImage6 = i6.getImage();
		        Image scaledImage6 = originalImage6.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		        i6 = new ImageIcon(scaledImage6);
		        l11.setIcon(i6);
		        l11.setOpaque(true);
		        l11.setVisible(true);
		        l11.setBounds(220, 120, 100, 100); // Adjusted y position to create a new row
		        l11.setBackground(null); // Set background to null for transparency
		        f2.add(l11);
		        
		        f2.setVisible(false);
		}
		
		//Admin Frame
		 {
	            f3 = new JFrame("ADMIN");  
		        f3.setBounds(100, 100, 700, 500);
		        f3.setResizable(false);
		        f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        f3.getContentPane().setBackground(new Color(0, 40, 0));
		        f3.setLayout(null);
		        f3.getRootPane().setBorder(BorderFactory.createEmptyBorder());

	            l12=new JLabel("Please Enter Your Login Credentials");
	            l12.setBounds(135,30,450,100);
	            l12.setFont(new Font("Georgia",Font.BOLD,22));
	            l12.setForeground(Color.white);

	            l13=new JLabel("Username");
	            l13.setBounds(150,105,100,30);
	            l13.setFont(new Font("Georgia",Font.PLAIN,20));
	            l13.setForeground(Color.white);

	            t1=new JTextField();
	            t1.setBounds(280,110,250,30);
	            t1.setHorizontalAlignment(JTextField.CENTER);
	            t1.setBorder(new LineBorder(Color.black,1));

	            l14=new JLabel("Password");
	            l14.setBounds(150,150,100,30);
	            l14.setFont(new Font("Georgia",Font.PLAIN,22));
	            l14.setForeground(Color.white);

	            ps1=new JPasswordField("");
	            ps1.setBounds(280,150,250,30);
	            ps1.setHorizontalAlignment(JTextField.CENTER);
	            ps1.setBorder(new LineBorder(Color.black,1));
	            
	            

	            b5=new JButton("BACK");
	            b5.setBounds(280,200,120,30);
	            b5.setBackground(new Color(100, 20, 20));
	            b5.setForeground(Color.white);
	            b5.addActionListener(this);

	            b6=new JButton("LOGIN");
	            b6.setBounds(410,200,120,30);
	            b6.setBackground(new Color(100, 20, 20));
	            b6.setForeground(Color.white);
	            b6.addActionListener(this);

	            f3.add(l12);
	            f3.add(l13);
	            f3.add(t1);
	            f3.add(l14);
	            f3.add(ps1);
	            f3.add(b5);
	            f3.add(b6);
	            
	            f3.setVisible(false);
	        }
		
			 
		
		//Voter Frame
        {
            f4 = new JFrame("VOTER");  
	        f4.setBounds(100, 100, 700, 500);
	        f4.setResizable(false);
	        f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f4.getContentPane().setBackground(new Color(0, 40, 0));
	        f4.setLayout(null);
	        f4.getRootPane().setBorder(BorderFactory.createEmptyBorder());

            l15=new JLabel("Please Enter Your Login Credentials");
            l15.setBounds(135,30,450,100);
            l15.setFont(new Font("Georgia",Font.BOLD,22));
            l15.setForeground(Color.white);

            l16=new JLabel("CNIC");
            l16.setBounds(150,105,100,30);
            l16.setFont(new Font("Georgia",Font.PLAIN,20));
            l16.setForeground(Color.white);

            t2=new JTextField();
            t2.setBounds(280,110,250,30);
            t2.setHorizontalAlignment(JTextField.CENTER);
            t2.setBorder(new LineBorder(Color.black,1));

            l17=new JLabel("Birth yaer");
            l17.setBounds(150,150,250,30);
            l17.setFont(new Font("Georgia",Font.PLAIN,22));
            l17.setForeground(Color.white);

            ps2=new JPasswordField("");
            ps2.setBounds(280,150,250,30);
            ps2.setHorizontalAlignment(JTextField.CENTER);
            ps2.setBorder(new LineBorder(Color.black,1));
            
            ps5=new JPasswordField("");
            ps5.setBounds(4000,150,250,30);
            ps5.setHorizontalAlignment(JTextField.CENTER);
            ps5.setBorder(new LineBorder(Color.black,1));

            b7=new JButton("BACK");
            b7.setBounds(280,200,120,30);
            b7.setBackground(new Color(100, 20, 20));
            b7.setForeground(Color.white);
            b7.addActionListener(this);

            b8=new JButton("LOGIN");
            b8.setBounds(410,200,120,30);
            b8.setBackground(new Color(100, 20, 20));
            b8.setForeground(Color.white);
            b8.addActionListener(this);
            f4.add(l15);
            f4.add(l16);
            f4.add(t2);
            f4.add(l17);
            f4.add(ps2);
            f4.add(b7);
            f4.add(b8);
            f4.add(ps5);
            
            f4.setVisible(false);
        }
        
        //Admin authorities
        {
            f5=new JFrame("ADMIN");
            f5.setBounds(100, 100, 700, 500);
            f5.setResizable(false);
            f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f5.getContentPane().setBackground(new Color(0, 40, 0));
            f5.setLayout(null);
            
            l34 = new JLabel("Digital Voting System");
	        l34.setForeground(Color.white);
	        l34.setBounds(220, 40, 300, 30);
	        l34.setHorizontalAlignment(SwingConstants.CENTER);
	        l34.setFont(new Font("Georgian", Font.BOLD, 22));
	        f5.add(l34);
            
            l31 = new JLabel();
	        ImageIcon i2 = new ImageIcon("E:\\java\\semester project\\start.png");
	        Image originalImage1 = i2.getImage();
	        Image scaledImage1 = originalImage1.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
	        i2 = new ImageIcon(scaledImage1);
	        l31.setIcon(i2);
	        l31.setOpaque(true);
	        l31.setVisible(true);
	        l31.setBounds(60, 120, 150, 150);
	        f5.add(l31);
           
            b13=new JButton("START");
            b13.setBounds(50,300,180,30);
            b13.setBackground(new Color(100, 20, 20));
            b13.setForeground(Color.white);
            b13.addActionListener(this);
            f5.add(b13);
            
            l32 = new JLabel();
	        ImageIcon i3 = new ImageIcon("E:\\java\\semester project\\stop.png");
	        Image originalImage11 = i3.getImage();
	        Image scaledImage11 = originalImage11.getScaledInstance(200, 180, Image.SCALE_SMOOTH);
	        i3 = new ImageIcon(scaledImage11);
	        l32.setIcon(i3);
	        l32.setOpaque(true);
	        l32.setVisible(true);
	        l32.setBounds(245, 120, 200, 180);
	        f5.add(l32);
            
            b14=new JButton("STOP");
            b14.setBounds(255,300,180,30);
            b14.setBackground(new Color(100, 20, 20));
            b14.setForeground(Color.white);
            b14.addActionListener(this);
            f5.add(b14);
         
            b15=new JButton("BACK");
            b15.setBounds(500,400,180,30);
            b15.setBackground(new Color(100, 20, 20));
            b15.setForeground(Color.white);
            b15.addActionListener(this);
            f5.add(b15);
            
            l33 = new JLabel();
	        ImageIcon i31 = new ImageIcon("E:\\java\\semester project\\Screenshot 2023-05-24 234858.png");
	        Image originalImage111 = i31.getImage();
	        Image scaledImage111 = originalImage111.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
	        i31 = new ImageIcon(scaledImage111);
	        l33.setIcon(i31);
	        l33.setOpaque(true);
	        l33.setVisible(true);
	        l33.setBounds(480, 120, 150, 150);
	        f5.add(l33);
            
            b16=new JButton("CHECK RESULT");
            b16.setBounds(460,300,180,30);
            b16.setBackground(new Color(100, 20, 20));
            b16.setForeground(Color.white);
            b16.addActionListener(this);
            f5.add(b16);
            
            f5.setVisible(false);
        }
        
        //Voter Eligibility
        {
            f7 = new JFrame("VOTER");  
	        f7.setBounds(100, 100, 700, 500);
	        f7.setResizable(false);
	        f7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        f7.getContentPane().setBackground(new Color(0, 40, 0));
	        f7.setLayout(null);
	        f7.getRootPane().setBorder(BorderFactory.createEmptyBorder());
           
            l19=new JLabel("CHECK ELIGIBILITY");
            l19.setBounds(240,10,400,50);
            l19.setFont(new Font("Georgia",Font.BOLD,20));
            l19.setForeground(Color.white);
            f7.add(l19);
            
            l20=new JLabel("CNIC");
            l20.setBounds(100,48,450,50);
            l20.setFont(new Font("Georgia",Font.PLAIN,20));
            l20.setForeground(Color.white);
            f7.add(l20);
            
            t3=new JTextField();
            t3.setBounds(180,60,250,30);
            t3.setHorizontalAlignment(JTextField.CENTER);
            t3.setBorder(new LineBorder(Color.black,1));
            f7.add(t3);
            
	        b9 = new JButton("SEARCH");
	        b9.setBackground(new Color(100, 20, 20));
	        b9.setFont(new Font("Georgian", Font.PLAIN, 22));
	        b9.setForeground(Color.white);
	        b9.setBounds(450, 60, 150, 30);
	        b9.addActionListener(this);
	        f7.add(b9);
	        
            l21=new JLabel("NAME");
            l21.setBounds(140,127,400,50);
            l21.setFont(new Font("Georgia",Font.PLAIN,20));
            l21.setForeground(Color.white);
            f7.add(l21);
            
            t4=new JTextField();
            t4.setBounds(340,140,200,27);
            t4.setHorizontalAlignment(JTextField.CENTER);
            t4.setBorder(new LineBorder(Color.black,1));
            f7.add(t4);
            
            l22=new JLabel("FATHER NAME");
            l22.setBounds(140,160,400,50);
            l22.setFont(new Font("Georgia",Font.PLAIN,20));
            l22.setForeground(Color.white);
            f7.add(l22);
            
            t5=new JTextField();
            t5.setBounds(340,170,200,27);
            t5.setHorizontalAlignment(JTextField.CENTER);
            t5.setBorder(new LineBorder(Color.black,1));
            f7.add(t5);
            
            l23=new JLabel("BIRTH YEAR");
            l23.setBounds(140,190,400,50);
            l23.setFont(new Font("Georgia",Font.PLAIN,20));
            l23.setForeground(Color.white);
            f7.add(l23);
            
            t6=new JTextField();
            t6.setBounds(340,200,200,27);
            t6.setHorizontalAlignment(JTextField.CENTER);
            t6.setBorder(new LineBorder(Color.black,1));
            f7.add(t6);
            
            l24=new JLabel("CITY");
            l24.setBounds(140,220,400,50);
            l24.setFont(new Font("Georgia",Font.PLAIN,20));
            l24.setForeground(Color.white);
            f7.add(l24);
            
            t7=new JTextField();
            t7.setBounds(340,230,200,27);
            t7.setHorizontalAlignment(JTextField.CENTER);
            t7.setBorder(new LineBorder(Color.black,1));
            f7.add(t7);
            
            l25=new JLabel("CHECKER");
            l25.setBounds(140,250,400,50);
            l25.setFont(new Font("Georgia",Font.PLAIN,20));
            l25.setForeground(Color.white);
            f7.add(l25);
            
            t8=new JTextField();
            t8.setBounds(340,260,200,27);
            t8.setHorizontalAlignment(JTextField.CENTER);
            t8.setBorder(new LineBorder(Color.black,1));
            f7.add(t8);
            
	        b10 = new JButton("BACK");
	        b10.setBackground(new Color(100, 20, 20));
	        b10.setFont(new Font("Georgian", Font.PLAIN, 22));
	        b10.setForeground(Color.white); 
	        b10.setBounds(450, 400, 150, 30);
	        b10.addActionListener(this);
	        f7.add(b10);
            
	        b11 = new JButton("VOTE");
	        b11.setBackground(new Color(100, 20, 20));
	        b11.setFont(new Font("Georgian", Font.PLAIN, 22));
	        b11.setForeground(Color.white);
	        b11.setBounds(80, 400, 150, 30);
	        b11.addActionListener(this);
	        f7.add(b11);
	        
            f7.setVisible(false);
        }

		}
		
		//Frame to vote 
		{
			f8 = new JFrame("VOTE");
			f8.setBounds(100, 100, 700, 500);
			f8.setResizable(false);
			f8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			f8.getContentPane().setBackground(Color.white);
			f8.setLayout(null);
			f8.getRootPane().setBorder(BorderFactory.createEmptyBorder());

			b12 = new JButton("Back");
			b12.setBackground(new Color(100, 20, 20));
			b12.setFont(new Font("Georgian", Font.BOLD, 16));
			b12.setForeground(Color.BLACK);
			b12.setBounds(450, 380, 150, 30);
			b12.addActionListener(this);
			f8.add(b12);

			l25 = new JLabel();
			ImageIcon i1 = new ImageIcon("E:\\java\\semester project\\New folder\\PTI.jpeg");
			Image originalImage1 = i1.getImage();
			Image scaledImage1 = originalImage1.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
			i1 = new ImageIcon(scaledImage1);
			l25.setIcon(i1);
			l25.setOpaque(true);
			l25.setVisible(true);
			l25.setBounds(70, 10, 100, 100);
			l25.setBackground(null);
			f8.add(l25);

			ButtonGroup buttonGroup = new ButtonGroup();
			rB1 = new JRadioButton("PTI");
			buttonGroup.add(rB1);
			rB1.setOpaque(false);
			rB1.setContentAreaFilled(false);
			rB1.setBorder(null);
			rB1.setFont(new Font("Georgian", Font.PLAIN, 16));
			rB1.setForeground(Color.BLACK);
			rB1.setBounds(85, 120, 50, 20);
			rB1.addActionListener(this);
			f8.add(rB1);		

			l26 = new JLabel();
			ImageIcon i2 = new ImageIcon("E:\\java\\semester project\\New folder\\PPP.jpeg");
			Image originalImage2 = i2.getImage();
			Image scaledImage2 = originalImage2.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
			i2 = new ImageIcon(scaledImage2);
			l26.setIcon(i2);
			l26.setOpaque(true);
			l26.setVisible(true);
			l26.setBounds(220, 10, 100, 100);
			l26.setBackground(null);
			f8.add(l26);

			rB2 = new JRadioButton("PPP");
			buttonGroup.add(rB2);
			rB2.setOpaque(false);
			rB2.setContentAreaFilled(false);
			rB2.setBorder(null);
			rB2.setFont(new Font("Georgian", Font.PLAIN, 16));
			rB2.setForeground(Color.BLACK);
			rB2.setBounds(235, 120, 50, 20);
			rB2.addActionListener(this);
			f8.add(rB2);

			l27 = new JLabel();
			ImageIcon i3 = new ImageIcon("E:\\java\\semester project\\New folder\\PML.jpeg");
			Image originalImage3 = i3.getImage();
			Image scaledImage3 = originalImage3.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
			i3 = new ImageIcon(scaledImage3);
			l27.setIcon(i3);
			l27.setOpaque(true);
			l27.setVisible(true);
			l27.setBounds(370, 10, 100, 100);
			l27.setBackground(null);
			f8.add(l27);

			rB3 = new JRadioButton("PMLN");
			buttonGroup.add(rB3);
			rB3.setOpaque(false);
			rB3.setContentAreaFilled(false);
			rB3.setBorder(null);
			rB3.setFont(new Font("Georgian", Font.PLAIN, 16));
			rB3.setForeground(Color.BLACK);
			rB3.setBounds(375, 120, 70, 20);
			rB3.addActionListener(this);
			f8.add(rB3);

			l28 = new JLabel();
			ImageIcon i4 = new ImageIcon("E:\\java\\semester project\\New folder\\Awami.jpeg");
			Image originalImage4 = i4.getImage();
			Image scaledImage4 = originalImage4.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
			i4 = new ImageIcon(scaledImage4);
			l28.setIcon(i4);
			l28.setOpaque(true);
			l28.setVisible(true);
			l28.setBounds(520, 10, 100, 100);
			l28.setBackground(null);
			f8.add(l28);

			rB4 = new JRadioButton("ANP");
			buttonGroup.add(rB4);
			rB4.setOpaque(false);
			rB4.setContentAreaFilled(false);
			rB4.setBorder(null);
			rB4.setFont(new Font("Georgian", Font.PLAIN, 16));
			rB4.setForeground(Color.BLACK);
			rB4.setBounds(535, 120, 50, 20);
			rB4.addActionListener(this);
			f8.add(rB4);

			l29 = new JLabel();
			ImageIcon i5 = new ImageIcon("E:\\java\\semester project\\New folder\\MMA.jpeg");
			Image originalImage5 = i5.getImage();
			Image scaledImage5 = originalImage5.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
			i5 = new ImageIcon(scaledImage5);
			l29.setIcon(i5);
			l29.setOpaque(true);
			l29.setVisible(true);
			l29.setBounds(220, 200, 100, 100);
			l29.setBackground(null);
			f8.add(l29);

			rB5 = new JRadioButton("JUI");
			buttonGroup.add(rB5);
			rB5.setOpaque(false);
			rB5.setContentAreaFilled(false);
			rB5.setBorder(null);
			rB5.setFont(new Font("Georgian", Font.PLAIN, 16));
			rB5.setForeground(Color.BLACK);
			rB5.setBounds(235, 310, 50, 20);
			rB5.addActionListener(this);
			f8.add(rB5);

			l30 = new JLabel();
			ImageIcon i6 = new ImageIcon("E:\\java\\semester project\\New folder\\JUI.jpeg");
			Image originalImage6 = i6.getImage();
			Image scaledImage6 = originalImage6.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
			i6 = new ImageIcon(scaledImage6);
			l30.setIcon(i6);
			l30.setOpaque(true);
			l30.setVisible(true);
			l30.setBounds(70, 200, 100, 100);
			l30.setBackground(null);
			f8.add(l30);

			rB6 = new JRadioButton("MMA");
			buttonGroup.add(rB6);
			rB6.setOpaque(false);
			rB6.setContentAreaFilled(false);
			rB6.setBorder(null);
			rB6.setFont(new Font("Georgian", Font.PLAIN, 16));
			rB6.setForeground(Color.BLACK);
			rB6.setBounds(85, 310, 70, 20);
			rB6.addActionListener(this);
			f8.add(rB6);

			f8.setVisible(false);
		}

//Result frame
		{
			  f9 = new JFrame("Election System");
		      f9.setBounds(100, 100, 700, 500);
		      f9.setResizable(false);
		      f9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		     // f9.getContentPane().setBackground(Color.green);
		      f9.setLayout(null);
		      f9.getRootPane().setBorder(BorderFactory.createEmptyBorder());
		      p1 = new JPanel();
		      p1.setBounds(50, 10, 600, 400);
		      
		      String[] columnnames= {"pti","ppp","pmln","anp","jui","mma"};
		      model= new DefaultTableModel(columnnames,0);
		      JTable table = new JTable(model);
		      JScrollPane scrollbar = new JScrollPane(table);
		      p1.add(scrollbar);
		      f9.add(p1);
		      
		      
		
		      
		      f9.setVisible(false);
		}
		
//action listener method
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource()==b3) {
				f1.setVisible(false);
				f2.setVisible(true);
				System.out.println(PTIvotes);
			}
			else if(e.getSource()==b4) {
				f1.setVisible(true);
				f2.setVisible(false);
			}
			else if(e.getSource()==b2) {
				f1.setVisible(false);
				f3.setVisible(true);
			}
			else if(e.getSource()==b5) {
				f3.setVisible(false);
				f1.setVisible(true);
			}
			else if(e.getSource()==b1)
			{
				f1.setVisible(!bolvar);
				f4.setVisible(bolvar);
				if(!bolvar)
				{
					JOptionPane.showMessageDialog(null, "Voting Stopped by Admin");
				}
			}
			else if(e.getSource()==b7)
			{
				f4.setVisible(false);
				f1.setVisible(true);
			}
			else if(e.getSource()==b6)
			{
					f3.setVisible(false);
					f5.setVisible(true);
					if(e.getSource()==b6) {
						String s1=t1.getText();
						String s2=ps1.getText();
						
					if(s1.equals("hamayun") && s2.equals("muneeb")) {
						f3.setVisible(false);
						f5.setVisible(true);
						t1.setText("");
						ps1.setText("");
					}
					else {
						f3.setVisible(true);
						JOptionPane.showMessageDialog(null, "Incorrect UserName Or Password!");
					}
			}}
			
			
			
			
				if(e.getSource()==b8) {
					
					
					try {
						s1=t2.getText();
						Connection con=CP.createC();
						
						
						String query="Select birthyear from electiondata where cnic=?";
						
						PreparedStatement ps= con.prepareStatement(query);
						ps.setString(1, s1);
			
						ResultSet rs= ps.executeQuery();
					
						while (rs.next()) {	
								birthyear=rs.getInt("birthyear");				
                       	}			rs.close();		
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null, "CNIC not in database");
					}
					
					
					String s2=new String(ps2.getPassword());
					
				     String username = t2.getText();
				     password=String.valueOf(birthyear);
					
					
				if(s1.equals(username) && s2.equals(password)) {
					f4.setVisible(false);
					f7.setVisible(true);
					t2.setText("");
					ps2.setText("");
				}
				else {
					f4.setVisible(true);
					JOptionPane.showMessageDialog(null, "Incorrect CNIC Or Password!");
				}
				
			}
		  
				else if(e.getSource()==b10)
				{
					f7.setVisible(false);
					f4.setVisible(true);
					t3.setText("");
					t4.setText("");
					t5.setText("");
					t6.setText("");
					t7.setText("");
					t8.setText("");
				}
				else if(e.getSource()==b12)
				{
					f8.setVisible(false);
					f1.setVisible(true);
				}
				else if(e.getSource()==b13)
				{
					bolvar=true;
					if(bolvar)
					{
						JOptionPane.showMessageDialog(null, "Voting Started Successfully!");
					}
				}
				else if(e.getSource()==b14)
				{
					bolvar=false;
					if(!bolvar)
					{
						JOptionPane.showMessageDialog(null, "Voting Stopped Successfully!");
					}
					
				}
				if(e.getSource()==b11)
				{
					
					try {
						vc=t3.getText();
						Connection con=CP.createC();
						String query="Select checker from electiondata where cnic=?";
						PreparedStatement ps= con.prepareStatement(query);
						ps.setString(1, vc);
						ResultSet rs= ps.executeQuery();
						while (rs.next()) {	
								vcc=rs.getString("checker");	
                       	}			rs.close();		
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null, "CNIC not in database");
					}
					
					if(vcc.equals("yes")) {
					f7.setVisible(false);
					f8.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(null, "You have already Voted!");
					}
					t3.setText("");
					t4.setText("");
					t5.setText("");
					t6.setText("");
					t7.setText("");
					t8.setText("");
				}			
				if(e.getSource()==b15)
				{
					f5.setVisible(false);
					f1.setVisible(true);
				}
				
				if(e.getSource()==rB1)
				{
					
					
					try {
						
						Connection con=CP.createC();
						
						
						String query="update electiondata set checker='no' where cnic=?";
						
						PreparedStatement ps= con.prepareStatement(query);
						ps.setString(1, vc);
			
						 ps.executeUpdate();
		
                       
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Error!");
					}
					
					
					try {
					    Connection connection = CP.createC();
					    String query = "UPDATE vote SET pti = pti + 1";
					    PreparedStatement pst = connection.prepareStatement(query);
					   
					     pst.executeUpdate();
				
					} catch (Exception ex) {
					    ex.printStackTrace();
					    JOptionPane.showMessageDialog(null, "Error!");
					}
					
					
					
				}
				else if(e.getSource()==rB2)
				{
					try {
						
						Connection con=CP.createC();
						String query="update electiondata set checker='no' where cnic=?";
						PreparedStatement ps= con.prepareStatement(query);
						ps.setString(1, vc);
						 ps.executeUpdate();		
                       
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Error!");
					}
					try {
					    Connection connection = CP.createC();
					    String query = "UPDATE vote SET ppp = ppp + 1";
					    PreparedStatement pst = connection.prepareStatement(query);
					   
					     pst.executeUpdate();
				
					} catch (Exception ex) {
					    ex.printStackTrace();
					    JOptionPane.showMessageDialog(null, "Error!");
					}
					
				}
                
				else if(e.getSource()==rB3)
				{	
					try {
						
						Connection con=CP.createC();
						
						
						String query="update electiondata set checker='no' where cnic=?";
						
						PreparedStatement ps= con.prepareStatement(query);
						ps.setString(1, vc);
			
						 ps.executeUpdate();
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Error!");
					}
					
					
					try {
					    Connection connection = CP.createC();
					    String query = "UPDATE vote SET pmln = pmln + 1";
					    PreparedStatement pst = connection.prepareStatement(query);
					   
					     pst.executeUpdate();
				
					} catch (Exception ex) {
					    ex.printStackTrace();
					    JOptionPane.showMessageDialog(null, "Error!");
					}
				}
				else if(e.getSource()==rB4)
				{
					
					
					try {
						
						Connection con=CP.createC();	
						String query="update electiondata set checker='no' where cnic=?";		
						PreparedStatement ps= con.prepareStatement(query);
						ps.setString(1, vc);
						 ps.executeUpdate();
                       
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Error!");
					}
					
					
					try {
					    Connection connection = CP.createC();
					    String query = "UPDATE vote SET anp= anp + 1";
					    PreparedStatement pst = connection.prepareStatement(query);
					   
					     pst.executeUpdate();
				
					} catch (Exception ex) {
					    ex.printStackTrace();
					    JOptionPane.showMessageDialog(null, "Error!");
					}
				}
				else if(e.getSource()==rB5)
				{
					
					
					try {
						
						Connection con=CP.createC();
						String query="update electiondata set checker='no' where cnic=?";					
						PreparedStatement ps= con.prepareStatement(query);
						ps.setString(1, vc);			
						 ps.executeUpdate();
                       
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Error!");
					}
					
					try {
					    Connection connection = CP.createC();
					    String query = "UPDATE vote SET jui = jui + 1";
					    PreparedStatement pst = connection.prepareStatement(query);
					   
					     pst.executeUpdate();
				
					} catch (Exception ex) {
					    ex.printStackTrace();
					    JOptionPane.showMessageDialog(null, "Error!");
					}
				}
				else if(e.getSource()==rB6)
				{
					
					
					try {
						
						Connection con=CP.createC();
						String query="update electiondata set checker='no' where cnic=?";
						
						PreparedStatement ps= con.prepareStatement(query);
						ps.setString(1, vc);
						 ps.executeUpdate();
                       
				}
				catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Error!");
					}
					
					try {
					    Connection connection = CP.createC();
					    String query = "UPDATE vote SET mma = mma + 1";
					    PreparedStatement pst = connection.prepareStatement(query);
					   
					     pst.executeUpdate();
				
					} catch (Exception ex) {
					    ex.printStackTrace();
					    JOptionPane.showMessageDialog(null, "Error!");
					}
				}		
					if(e.getSource()==b10) {
						f7.setVisible(false);
						f4.setVisible(true);
					}
					else {
						try {
							Connection conc=CP.createC();
							String q="select * from electiondata where cnic = ?";
							PreparedStatement pst=conc.prepareStatement(q);
							
							pst.setString(1, t3.getText());
							ResultSet rs=pst.executeQuery();
							while(rs.next())
							{
								t4.setText(rs.getString(2));
								t5.setText(rs.getString(3));
								t6.setText(rs.getString(4));
								t7.setText(rs.getString(5));
								t8.setText(rs.getString(6));		
						}
					}
							catch(Exception ex) {
								
								JOptionPane.showMessageDialog(null, "Error!");
						}
					}
					if (e.getSource() == b16) {
					    f5.setVisible(false);
					    f9.setVisible(true);
					   try {
					        Connection conc = CP.createC();
					        
					        String q = "select * from vote";
					        PreparedStatement pst=conc.prepareStatement(q);
					       ResultSet rs=pst.executeQuery();
					      
					        
					        String fun, fna, i, se, p, fp;
					        while (rs.next()) {
					            fun = rs.getString(1);
					            fna = rs.getString(2);
					            i = rs.getString(3);
					            se = rs.getString(4);
					            p = rs.getString(5);
					            fp = rs.getString(6);
					            String[] row = { fun, fna, i, se, p, fp };
					            model.addRow(row);
					        }
					        rs.close();
					        conc.close();
					    } catch (SQLException ex) {
					        ex.printStackTrace();
					        // Handle specific SQL exception or display a more meaningful error message
					        JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
					    }
					}
				}
        
            }
			