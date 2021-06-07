package studentManagementSystem;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;


public class LoginPage
 {
	 	private JComboBox<String> ComboBox;
	    private JLabel LabelPassword;
	    private JLabel LabelUserType;
	    private JLabel LabelUsername;
	    private JButton buttonCancel;
	    private JButton buttonLogin;
	    private JLabel titleLogin;
	    private JLabel iconUsername;
	    private JLabel colon1;
	    private JLabel colon2;
	    private JLabel colon3;
	    private JLabel iconPassword;
	    private JLabel labelSFIT;
	    private JPasswordField txtPassword;
	    private JTextField txtUsername;
	    
	    LoginPage()
	    {
	    	super();
	    	
	    	
	    	LabelUsername = new JLabel();
	        LabelPassword = new JLabel();
	        LabelUserType = new JLabel();
	        colon1 = new JLabel();
	        colon2 = new JLabel();
	        colon3 = new JLabel();
	        buttonLogin = new JButton();
	        buttonCancel = new JButton();
	        ComboBox = new JComboBox<>();
	        txtUsername = new JTextField();
	        txtPassword = new JPasswordField();
	        titleLogin = new JLabel();
	        iconUsername = new JLabel();
	        iconPassword = new JLabel();
	        labelSFIT = new JLabel();
	        
	        LabelUsername.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
	        LabelUsername.setText("Username");
	        LabelPassword.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
	        LabelPassword.setText("Password");
	        LabelUserType.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
	        LabelUserType.setText("User Type");

	        colon1.setText(":");
	        colon2.setText(":");
	        colon3.setText(":");

	        buttonLogin.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
	        buttonLogin.setText("Login");
//	        buttonLogin.addActionListener(new java.awt.event.ActionListener() 
//	        {
//	            public void actionPerformed(java.awt.event.ActionEvent evt) 
//	            {
//	                buttonLoginActionPerformed(evt);
//	            }
//	        });
	        ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Teacher/Faculty", "Student" }));
//	        ComboBox.addActionListener(new java.awt.event.ActionListener() 
//	        {
//	            public void actionPerformed(java.awt.event.ActionEvent evt) 
//	            {
//	                ComboBoxActionPerformed(evt);
//	            }
//	        });
	        
	        titleLogin.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
	        titleLogin.setText("LOGIN");

	        iconUsername.setText("UsernameICON");

	        iconPassword.setText("PasswordICon");

	        labelSFIT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/StudentManagementSystem/Icons/ImageSFIT.png"))); // NOI18N
	        labelSFIT.setText("mainIcon");
	    }
	    public static void main(String args[]) {
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException ex) {
	            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (InstantiationException ex) {
	            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (IllegalAccessException ex) {
	            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>

	        /* Create and display the form */
	        java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	                new LoginPage().setVisible(True);
	            }
	        });
	    }}	