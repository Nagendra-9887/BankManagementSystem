package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;




public class SignUp extends JFrame implements ActionListener{
	JTextField textName, textFatherName, textEmail, dob, address, state, pincode, city;
	JRadioButton genderButton1, genderButton2, marryButton1, marryButton2, marryButton3;;
	JButton NEXT;
	Random ran = new Random();
	long AFN = (ran.nextLong() % 9000L) + 1000L;
	String AFN1 = "" + Math.abs(AFN);

	private static final long serialVersionUID = 1L;

	SignUp() {
		super("APPLICATION FORM");

		setLayout(null);

		// image 1 : bank image
		// Load the image
		ImageIcon bank1 = new ImageIcon("C:\\Users\\nagen\\Downloads\\bank.png");
		Image bank2 = bank1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon bank3 = new ImageIcon(bank2);

		// Set up JLabel for image with specific bounds
		JLabel bankImage = new JLabel(bank3);
		bankImage.setBounds(25, 10, 100, 100); // (from left: 375,from top: 10, image width:100, image height: 100)
		add(bankImage); // adds image to the frame

		// Application form Number
		JLabel label1 = new JLabel("APPLICATION FORM NO: " + AFN1);
		label1.setFont(new Font("Ralway", Font.BOLD, 38));
		label1.setBounds(160, 20, 600, 40);
		add(label1);

		JLabel label2 = new JLabel("Page 1");
		label2.setFont(new Font("Ralway", Font.BOLD, 22));
		label2.setBounds(730, 70, 600, 30);
		add(label2);

		JLabel label3 = new JLabel("Personal Details");
		label3.setFont(new Font("Raleway", Font.BOLD, 22));
		label3.setBounds(290, 90, 600, 30);
		add(label3);

		// Name of the Applicant
		JLabel labelName = new JLabel("Name : ");
		labelName.setFont(new Font("Raleway", Font.BOLD, 20));
		labelName.setBounds(100, 190, 100, 30);
		add(labelName);

		textName = new JTextField();
		textName.setFont(new Font("Ralway", Font.BOLD, 14));
		textName.setBounds(300, 190, 400, 30);
		add(textName);

		// Father name of Applicant
		JLabel labelFName = new JLabel("Father's Name :");
		labelFName.setFont(new Font("Raleway", Font.BOLD, 20));
		labelFName.setBounds(100, 240, 200, 30);
		add(labelFName);

		textFatherName = new JTextField();
		textFatherName.setFont(new Font("Ralway", Font.BOLD, 14));
		textFatherName.setBounds(300, 240, 400, 30);
		add(textFatherName);

		// DOB
		JLabel DOB = new JLabel("DOB(DD/MM/YYYY) ");
		DOB.setFont(new Font("Raleway", Font.BOLD, 20));
		DOB.setBounds(100, 340, 400, 30);
		add(DOB);

		// Date of Birth
		dob = new JTextField();
		dob.setFont(new Font("Ralway", Font.BOLD, 14));
		dob.setBounds(300, 340, 400, 30);
		add(dob);

		// Gender
		JLabel gender = new JLabel("Gender");
		gender.setFont(new Font("Raleway", Font.BOLD, 20));
		gender.setBounds(100, 290, 200, 30);
		add(gender);

		genderButton1 = new JRadioButton("Male");
		genderButton1.setFont(new Font("Ralway", Font.BOLD, 14));
		genderButton1.setBackground(new Color(222, 255, 228));
		genderButton1.setBounds(300, 290, 60, 30);
		add(genderButton1);

		genderButton2 = new JRadioButton("Female");
		genderButton2.setFont(new Font("Ralway", Font.BOLD, 14));
		genderButton2.setBackground(new Color(222, 255, 228));
		genderButton2.setBounds(450, 290, 90, 30);
		add(genderButton2);

		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(genderButton1);
		buttonGroup.add(genderButton2);

		JLabel labelEmail = new JLabel("Email");
		labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
		labelEmail.setBounds(100, 390, 400, 30);
		add(labelEmail);

		textEmail = new JTextField();
		textEmail.setFont(new Font("Ralway", Font.BOLD, 14));
		textEmail.setBounds(300, 390, 400, 30);
		add(textEmail);

		// MaritalStatus
		JLabel labelMarriedStatus = new JLabel("Marrital Status");
		labelMarriedStatus.setFont(new Font("Raleway", Font.BOLD, 20));
		labelMarriedStatus.setBounds(100, 440, 400, 30);
		add(labelMarriedStatus);

		marryButton1 = new JRadioButton("Single");
		marryButton1.setFont(new Font("Ralway", Font.BOLD, 14));
		marryButton1.setBackground(new Color(222, 255, 228));
		marryButton1.setBounds(300, 440, 90, 30);
		add(marryButton1);

		marryButton2 = new JRadioButton("Married");
		marryButton2.setFont(new Font("Ralway", Font.BOLD, 14));
		marryButton2.setBackground(new Color(222, 255, 228));
		marryButton2.setBounds(450, 440, 90, 30);
		add(marryButton2);

		marryButton3 = new JRadioButton("Others");
		marryButton3.setFont(new Font("Ralway", Font.BOLD, 14));
		marryButton3.setBackground(new Color(222, 255, 228));
		marryButton3.setBounds(600, 440, 90, 30);
		add(marryButton3);

		ButtonGroup marriedButtonGroup = new ButtonGroup();
		marriedButtonGroup.add(marryButton1);
		marriedButtonGroup.add(marryButton2);
		marriedButtonGroup.add(marryButton3);

		JLabel labelAddress = new JLabel("Address ");
		labelAddress.setFont(new Font("Raleway", Font.BOLD, 20));
		labelAddress.setBounds(100, 490, 400, 30);
		add(labelAddress);

		// Date of Birth
		address = new JTextField();
		address.setFont(new Font("Ralway", Font.BOLD, 14));
		address.setBounds(300, 490, 400, 30);
		add(address);

		JLabel labelCity = new JLabel("City ");
		labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
		labelCity.setBounds(100, 540, 200, 30);
		add(labelCity);

		// Date of Birth
		city = new JTextField();
		city.setFont(new Font("Ralway", Font.BOLD, 14));
		city.setBounds(300, 540, 400, 30);
		add(city);

		JLabel labelState = new JLabel("State ");
		labelState.setFont(new Font("Raleway", Font.BOLD, 20));
		labelState.setBounds(100, 590, 400, 30);
		add(labelState);

		// Date of Birth
		state = new JTextField();
		state.setFont(new Font("Ralway", Font.BOLD, 14));
		state.setBounds(300, 590, 400, 30);
		add(state);

		JLabel labelPincode = new JLabel("Pincode ");
		labelPincode.setFont(new Font("Raleway", Font.BOLD, 20));
		labelPincode.setBounds(100, 640, 400, 30);
		add(labelPincode);

		// Date of Birth
		pincode = new JTextField();
		pincode.setFont(new Font("Ralway", Font.BOLD, 14));
		pincode.setBounds(300, 640, 400, 30);
		add(pincode);
		
		 NEXT = new JButton("Next");
		 NEXT.setFont(new Font("Raleway", Font.BOLD, 20));
		 NEXT.setForeground(Color.white);
		 NEXT.setBounds(400, 690, 100, 30);
		 NEXT.setBackground(Color.black);
		 NEXT.addActionListener(this);
		add(NEXT);
		
		
		
		getContentPane().setBackground(new Color(222, 255, 228));
		setSize(850, 800);
		setLocation(360, 40);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		new SignUp();
	}
	
	
    // Validates the given DOB is valid or invalid
	public static boolean isValidDate(String date) {
        // Regular expression for validating date format dd/mm/yyyy
        String regex = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";
        
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(date);
        
        return matcher.matches();
    }

	@Override
	public void actionPerformed(ActionEvent e) {
	String formNo = AFN1;
	String name = textName.getText();
	String fName = textFatherName.getText();
	String gender = null;
	if(genderButton1.isSelected()) {
		gender = "Male";
	}
	else if(genderButton2.isSelected()) {
		gender = "FeMale";
	}
	String date =dob.getText();

	String email = textEmail.getText();
	String marital = null;
	if(marryButton1.isSelected()) {
		marital = "Single"; 
	}
	else if(marryButton2.isSelected()) {
		marital = "Married";
	}
	else if(marryButton3.isSelected()) {
		marital = "Others";
	}
	String Address = address.getText();
	String Pincode  = pincode.getText();
	String State = state.getText();
	String City = city.getText();
	
	
	try {
		if(name.equals("") || !isValidDate(date) || email.equals("") || Address.equals("") || Pincode.equals("") || State.equals("") || City.equals("")  ) {
			JOptionPane.showMessageDialog(null,"Fill All The Fields Correctly");
		}
		else {
			JDBCCon con = new JDBCCon();
			String q = "insert into Signup values('"+formNo+"','"+name+"','"+fName+"','"+date+"','"+gender+"','"+email+"','"+marital+"','"+Address+"','"+City+"','"+Pincode+"','"+State+"')";
		con.statement.executeUpdate(q);
		new SignUpNext(AFN1);
		setVisible(false);
		}
	}catch(Exception E){
		E.printStackTrace();
	}
}
}
