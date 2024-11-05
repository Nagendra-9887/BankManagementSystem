package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;

public class Login extends JFrame implements ActionListener {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JLabel label1, label2, label3;
	JTextField textField1;
	JPasswordField passWordField1;
	JButton signInButton, signUpButton, clearButton;

	Login() {
		super("Bank Management System");

		// Set layout to null to allow absolute positioning
		setLayout(null);

		// image 1 : bank image
		// Load the image
		ImageIcon bank1 = new ImageIcon("C:\\Users\\nagen\\Downloads\\bank.png");
		Image bank2 = bank1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon bank3 = new ImageIcon(bank2);

		// Set up JLabel for image with specific bounds
		JLabel bankImage = new JLabel(bank3);
		bankImage.setBounds(375, 10, 100, 100); // (from left: 375,from top: 10, image width:100, image height: 100)
		add(bankImage); // adds image to the frame

		// image 2 : ATM cards image
		ImageIcon atm1 = new ImageIcon("C:\\Users\\nagen\\Downloads\\card.png");
		Image atm2 = atm1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon atm3 = new ImageIcon(atm2);
		JLabel atmImage = new JLabel(atm3);
		atmImage.setBounds(630, 345, 100, 100);
		add(atmImage);

		// label1
		label1 = new JLabel("WELCOME TO ATM");
		label1.setForeground(Color.orange);
		label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
		label1.setBounds(230, 125, 450, 48);
		add(label1);

		// label2
		label2 = new JLabel("Card No:");
		label2.setFont(new Font("Ralway", Font.BOLD, 28));
		label2.setForeground(Color.white);
		label2.setBounds(150, 190, 375, 30);
		add(label2);

		// textField
		textField1 = new JTextField(15);
		textField1.setFont(new Font("Arial", Font.BOLD, 14));
		textField1.setBounds(325, 190, 230, 30);
		add(textField1);

		// label3
		label3 = new JLabel("PIN: ");
		label3.setFont(new Font("Ralway", Font.BOLD, 28));
		label3.setForeground(Color.WHITE);
		label3.setBounds(150, 250, 375, 30);
		add(label3);

		// passwordField
		passWordField1 = new JPasswordField(15);
		passWordField1.setBounds(325, 250, 230, 30);
		passWordField1.setFont(new Font("Arial", Font.BOLD, 14));
		add(passWordField1);

		// sign in button
		signInButton = new JButton("SIGN IN");
		signInButton.setFont(new Font("Arial", Font.BOLD, 14));
		signInButton.setBounds(300, 300, 100, 30);
		signInButton.setForeground(Color.WHITE);
		signInButton.setBackground(Color.black);
		signInButton.addActionListener(this);
		add(signInButton);

		// clear button
		clearButton = new JButton("CLEAR");
		clearButton.setFont(new Font("Arial", Font.BOLD, 14));
		clearButton.setBounds(420, 300, 100, 30);
		clearButton.setForeground(Color.WHITE);
		clearButton.setBackground(Color.black);
		clearButton.addActionListener(this);
		add(clearButton);

		// Sign up button
		signUpButton = new JButton("SIGN UP");
		signUpButton.setFont(new Font("Arial", Font.BOLD, 14));
		signUpButton.setBounds(300, 340, 220, 30);
		signUpButton.setForeground(Color.WHITE);
		signUpButton.setBackground(Color.black);
		signUpButton.addActionListener(this);
		add(signUpButton);

		// image 3 : background image
		ImageIcon backGround1 = new ImageIcon("C:\\Users\\nagen\\Downloads\\backbg.png");
		// Image backGround2 = backGround1.getImage().getScaledInstance(800, 480,
		// Image.SCALE_DEFAULT); // this line of code is no longer required because we
		// need to fit the image with the frame.
		// ImageIcon backGround3 = new ImageIcon(backGround2); // similarly here also we
		// are not using Image so what is the need of using ImageIcon object to convert
		// Image to ImageIcon so this is also not required.
		JLabel backGroundImage = new JLabel(backGround1);
		backGroundImage.setBounds(0, 0, 800, 480);
		add(backGroundImage);

		// Set frame properties
		setSize(800, 480);
		setLocation(450, 200);
		setVisible(true);
	}



	@Override
	public void actionPerformed(ActionEvent e) {
	    try {
	    	if(e.getSource()==signInButton) {
	    		JDBCCon c = new JDBCCon();
                String cardno = textField1.getText();
                String pin = passWordField1.getText();
                String q = "select * from login where card_no = '"+cardno+"' and  pin = '"+pin+"'";
                ResultSet resultSet = c.statement.executeQuery(q);
                if (resultSet.next()){
                    setVisible(false);
                    new Main_Class(pin);
                }else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or PIN");
                }
	    	}
else  if(e.getSource() == signUpButton) {
	    		new SignUp();
	    		setVisible(false);
	    	}
	    }catch(Exception E) {
	    	E.printStackTrace();
	    }
	}
	
	public static void main(String[] args) {
		new Login();
	}
}
