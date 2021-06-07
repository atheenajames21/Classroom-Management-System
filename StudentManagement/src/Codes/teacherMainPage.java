package Codes;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;

import java.awt.Color;
import java.awt.Font;

public class teacherMainPage extends JFrame
{
	JFrame frame;
	JPanel panel;
	
	
	
	
	public teacherMainPage()
	{
		components();
	}
	
	public void components() 
	{
		//frame.getContentPane.add(panel);
		frame.setBackground(Color.WHITE);
		frame.setSize(328, 357);
		frame.setLocationRelativeTo(null);  
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
	    frame.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
