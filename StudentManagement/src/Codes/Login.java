package Codes;

//Packages start
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

import java.awt.Color;
import java.awt.Font;

//Packages end


public class Login extends JFrame{
	//Variables Start
	JFrame frame;
	JPanel panel; 
	JLabel labelTitle,labelPID,labelPassword, labelUserType, labelCreator;
	JLabel errorPID, errorPassword, errorUserType; //Error labels
	JButton buttonLogin,buttonCancel;
	JButton buttonLogin_1;
	private JButton buttonCancel_1;
	//private JButton buttonLogin;
	JTextField txtPID;
	JPasswordField txtPassword;
	JComboBox comboUserType;
	//Variables End

	public void infoMessage(String message, String Title)
	{
		JOptionPane.showMessageDialog(null, message, Title, JOptionPane.INFORMATION_MESSAGE);
	}
	public Login() 
	{
		components();
	}

	public void components()
	{
		frame = new JFrame("Login --- Student Management System");
		panel = new JPanel();
		panel.setBackground(new Color(213,132,17 ));
		labelPassword=new JLabel("Password");
		labelPassword.setSize(93, 26);
		buttonLogin=new JButton("Login");
		buttonCancel=new JButton("Cancel");
		txtPID = new JTextField();
		txtPassword = new JPasswordField();
		comboUserType = new JComboBox<>();
		
		
		panel.setLayout(null);
		
		labelPID=new JLabel("PID");
		labelPID.setFont(new Font("Dialog", Font.BOLD, 20));
		//labelPID.setFont(font1);
		labelPID.setBounds(37,113,32,26);
		panel.add(labelPID);
		
		labelTitle = new JLabel("Login");
		labelTitle.setBounds(109, 10, 110, 50);
		labelTitle.setFont(new Font("Arial", Font.BOLD, 40));
		panel.add(labelTitle);
		
		Font font1=new Font("Merriweather",Font.BOLD,20);
		Font font2 = new Font("Merriweather",Font.PLAIN,20);
		Font  font3=new Font("Dialog", Font.BOLD, 10);
		
		labelPassword.setFont(font1);
		labelPassword.setLocation(37, 158);
		panel.add(labelPassword);
		
		labelUserType = new JLabel("User Type");	
		labelUserType.setFont(font1);
		labelUserType.setBounds(37, 203, 98, 26);
		panel.add(labelUserType);
		
		buttonLogin_1 = new JButton("Login");
		buttonLogin_1.setBackground(new Color(255, 255, 255));
		buttonLogin_1.setFont(font1);
		buttonLogin_1.setBounds(37, 255, 95, 35);
		panel.add(buttonLogin_1);
		
		buttonCancel_1 = new JButton("Cancel");
		buttonCancel_1.setBackground(new Color(255, 255, 255));
		buttonCancel_1.setFont(font1);
		buttonCancel_1.setBounds(185, 252, 100, 35);
		panel.add(buttonCancel_1);
		
		txtPID = new JTextField();
		txtPID.setBounds(150, 113, 106, 27);
		txtPID.setFont(font2);
		panel.add(txtPID);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(150, 158, 106, 27);
		txtPassword.setFont(font2);
		panel.add(txtPassword);
		
		String users[]= {"-Select-","Admin","Teacher","Student"};
		comboUserType=new JComboBox(users);
		comboUserType.setBounds(150, 203, 106, 27);
		comboUserType.setBackground(Color.WHITE);
		comboUserType.setFont(font2);
		panel.add(comboUserType);
		
		labelCreator = new JLabel("Created by Austin, Abin and Atheena");
		labelCreator.setLocation(105, 292);
		labelCreator.setSize(124, 26);
		labelCreator.setFont(new Font("Dialog", Font.PLAIN, 7));
		panel.add(labelCreator);
		
		
		errorPID = new JLabel("PID Required!!");
		errorPID.setFont(font3);
		errorPID.setForeground(Color.RED);
		errorPID.setSize(150, 26);
		errorPID.setLocation(155, 135);
		//panel.add(errorPID);
		
//		errorPassword = new JLabel("Password Required!!");
//		errorPassword.setFont(font3);
//		errorPassword.setForeground(Color.RED);
//		errorPassword.setSize(150, 26);
//		errorPassword.setLocation(155, 180);
//		//panel.add(errorPassword);
//		
//		errorUserType = new JLabel("Select a User Type");
//		errorUserType.setFont(font3);
//		errorUserType.setForeground(Color.RED);
//		errorUserType.setSize(150, 26);
//		errorUserType.setLocation(155, 225);
//		//panel.add(errorUserType);
		
		frame.getContentPane().add(panel);
		frame.setBackground(Color.WHITE);
		frame.setSize(328, 357);
		frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);
       // frame.setLayout(GroupLayout());
        
		
		
	}
	public static void main(String[] args) 
	{
		Login login=new Login();
		//login.setVisible(true);
		//login.setLocationRelativeTo(null);

	}

}
