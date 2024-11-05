package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class Signup3 extends JFrame implements ActionListener{
	JRadioButton button1,button2,button3,button4;
	JCheckBox c1,c2,c3,c4,c5,c6;
	JButton submit,cancel;
	String formno;
	private static final long serialVersionUID = 1L;

	Signup3(String formno){
		super("APPLICATION FORM");
		// Load the image
				ImageIcon bank1 = new ImageIcon("C:\\Users\\nagen\\Downloads\\bank.png");
				Image bank2 = bank1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
				ImageIcon bank3 = new ImageIcon(bank2);

				// Set up JLabel for image with specific bounds
				JLabel bankImage = new JLabel(bank3);
				bankImage.setBounds(25, 10, 100, 100); // (from left: 375,from top: 10, image width:100, image height: 100)
				add(bankImage); // adds image to the frame

				
				this.formno = formno;

				
				JLabel label1 = new JLabel("Page 3");
				label1.setFont(new Font("Ralway", Font.BOLD, 22));
				label1.setBounds(730, 30, 600, 30);
				add(label1);

				JLabel label2 = new JLabel("Account Details");
				label2.setFont(new Font("Raleway", Font.BOLD, 22));
				label2.setBounds(240, 30, 600, 30);
				add(label2);
				
				
				JLabel label3 = new JLabel("Account Type:");
				label3.setFont(new Font("Raleway", Font.BOLD, 18));
				label3.setBounds(100,140, 600, 30);
				add(label3);

				button1 = new JRadioButton("Saving Account");
				button1.setFont(new Font("Raleway", Font.BOLD, 18));
				button1.setBounds(100,180, 250, 30);
				button1.setBackground(new Color(215,252,252));
				add(button1);

				button2 = new JRadioButton("Fixed Deposit Account");
				button2.setFont(new Font("Raleway", Font.BOLD, 18));
				button2.setBounds(350,180, 250, 30);
				button2.setBackground(new Color(215,252,252));
				add(button2);

				button3 = new JRadioButton("Current Account");
				button3.setFont(new Font("Raleway", Font.BOLD, 18));
				button3.setBounds(100,230, 250, 30);
				button3.setBackground(new Color(215,252,252));
				add(button3);

				button4 = new JRadioButton("Recurring Deposit Account");
				button4.setFont(new Font("Raleway", Font.BOLD, 18));
				button4.setBounds(350,230, 300, 30);
				button4.setBackground(new Color(215,252,252));
				add(button4);
				
				ButtonGroup group = new ButtonGroup();
				group.add(button1);
				group.add(button2);
				group.add(button3);
				group.add(button4);
				
				JLabel label4 = new JLabel("Card No:");
				label4.setFont(new Font("Raleway", Font.BOLD, 18));
				label4.setBounds(100,300, 200, 30);
				add(label4);
				
				JLabel label5 = new JLabel("(Yout 16 digit card no)");
				label5.setFont(new Font("Raleway", Font.BOLD, 12));
				label5.setBounds(100,330, 300, 30);
				add(label5);
				
				JLabel label6 = new JLabel("XXXX-XXXX-XXXX-4841");
				label6.setFont(new Font("Raleway", Font.BOLD, 18));
				label6.setBounds(330,300, 300, 30);
				add(label6);
				
				JLabel label7 = new JLabel("(It would appear on atm card)");
				label7.setFont(new Font("Raleway", Font.BOLD, 12));
				label7.setBounds(330,330, 300, 30);
				add(label7);
				
				JLabel label8 = new JLabel("PIN: ");
				label8.setFont(new Font("Raleway", Font.BOLD, 18));
				label8.setBounds(100,370, 200, 30);
				add(label8);
				
				JLabel label9 = new JLabel("XXXX");
				label9.setFont(new Font("Raleway", Font.BOLD, 18));
				label9.setBounds(330,370, 200, 30);
				add(label9);
				
				JLabel label10 = new JLabel("Service Required :");
				label10.setFont(new Font("Raleway", Font.BOLD, 18));
				label10.setBounds(100,420, 200, 30);
				add(label10);
				
				c1 = new JCheckBox("ATM CARD");
				c1.setBackground(new Color(215,252,252));
				c1.setFont(new Font("Raleway", Font.BOLD, 16));
				c1.setBounds(100,480,200,30);
				add(c1);
				
				c2 = new JCheckBox("Internet Banking");
				c2.setBackground(new Color(215,252,252));
				c2.setFont(new Font("Raleway", Font.BOLD, 16));
				c2.setBounds(350,480,200,30);
				add(c2);
				
				c3 = new JCheckBox("Mobile Banking");
				c3.setBackground(new Color(215,252,252));
				c3.setFont(new Font("Raleway", Font.BOLD, 16));
				c3.setBounds(100,540,200,30);
				add(c3);
				
				c4 = new JCheckBox("Email-Alerts");
				c4.setBackground(new Color(215,252,252));
				c4.setFont(new Font("Raleway", Font.BOLD, 16));
				c4.setBounds(350,540,200,30);
				add(c4);
				
				c5 = new JCheckBox("Cheque Book");
				c5.setBackground(new Color(215,252,252));
				c5.setFont(new Font("Raleway", Font.BOLD, 16));
				c5.setBounds(100,590,200,30);
				add(c5);
				
				c6= new JCheckBox("E-Statement");
				c6.setBackground(new Color(215,252,252));
				c6.setFont(new Font("Raleway", Font.BOLD, 16));
				c6.setBounds(350,590,200,30);
				add(c6);
				
				JCheckBox c7 = new JCheckBox("I here by declare that the above entered details correct too the best of my knowledge");
				c7.setBackground(new Color(215,252,252));
				c7.setFont(new Font("Raleway", Font.BOLD, 12));
				c7.setBounds(100,640,600,30);
				add(c7);
				
				JLabel formNoLabel = new JLabel("form No :");
				formNoLabel.setFont(new Font("Raleway", Font.BOLD, 18));
				formNoLabel.setBounds(600,10,100,30);
				add(formNoLabel);
				
				JLabel formNo = new JLabel();
				formNo.setFont(new Font("Raleway", Font.BOLD, 18));
				formNo.setBounds(760,10, 60, 30);
				add(formNo);
				
				submit = new JButton("SUBMIT");
				submit.setFont(new Font("Raleway", Font.BOLD, 14));
				submit.setBounds(420,700, 110, 30);
				submit.setBackground(Color.black);
				submit.setForeground(Color.white);
				submit.addActionListener(this);
				add(submit);
				
				cancel = new JButton("CANCEL");
				cancel.setFont(new Font("Raleway", Font.BOLD, 14));
				cancel.setBounds(570,700, 110, 30);
				cancel.setBackground(Color.black);
				cancel.setForeground(Color.white);
				cancel.addActionListener(this);
				add(cancel);
				
				
				getContentPane().setBackground(new Color(215,252,252));
				setSize(850,800);
				setLayout(null);
				setLocation(450,80);
				setVisible(true);
	}
	
public static void main(String[] args) {
	new Signup3("");
}

@Override
public void actionPerformed(ActionEvent e) {
	String accountType = null;
	if(button1.isSelected()) {
		accountType = "Saving Account";
	}
	else if(button2.isSelected()) {
		accountType = "Fixed Deposit Account";
	}
	else if(button3.isSelected()) {
		accountType = "Current Account";
	}
	else if(button4.isSelected()) {
		accountType = "Recurring Deposit Account";
	}
	Random ran  = new Random();
	long first7 = (ran.nextLong()%900000000l)+14099630000000L;
	String  cardno = ""+Math.abs(first7);
	
	long first3 = (ran.nextLong()%9000L)+1000L;
	String pin = ""+Math.abs(first3);
	
	String service = "";
	if(c1.isSelected()) {
		service = "ATM CARD ";
	}
	else if(c2.isSelected()) {
		service += "Internet Banking ";
	}
	else if(c3.isSelected()) {
		service += "Mobile Banking ";
	}
	else if(c4.isSelected()) {
		service += "Email-Alerts ";
	}
	else if(c5.isSelected()) {
		service += "Cheque Book ";
	}
	else if(c6.isSelected()) {
		service += "E-Statement ";
	}
	try {
		if(e.getSource()==submit) {
			if(accountType.equals("")) {
				JOptionPane.showMessageDialog(null, "Fill all the fields");
			}else {
				JDBCCon con = new JDBCCon();
				String q1 = "insert into SignupThree values ('"+formno+"','"+accountType+"','"+cardno+"','"+pin+"','"+service+"')";
			    String q2  = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
			con.statement.executeUpdate(q1);
			con.statement.executeUpdate(q2);
			JOptionPane.showMessageDialog(null, "CardNo:"+ cardno+ "\n pin : " + pin + "\n account created successfully go to login" );
	
			new Deposit(pin);
			setVisible(false);
		}
		}
			else if(e.getSource()==cancel) {
				new Signup3(formno);
			}
		
	}catch(Exception E) {
	E.printStackTrace();
	}
}
}
