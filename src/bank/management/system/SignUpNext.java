package bank.management.system;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class SignUpNext extends JFrame implements ActionListener{
	String formno;
	JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
	JTextField textPan,textAdhar;
	JRadioButton button1,button2;
	JButton next;
	private static final long serialVersionUID = 1L;

	SignUpNext(String formno) {
		super("APPLICATION FORM");
		setLayout(null);
		// Load the image
		ImageIcon bank1 = new ImageIcon("C:\\Users\\nagen\\Downloads\\bank.png");
		Image bank2 = bank1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon bank3 = new ImageIcon(bank2);

		// Set up JLabel for image with specific bounds
		JLabel bankImage = new JLabel(bank3);
		bankImage.setBounds(25, 10, 100, 100); // (from left: 375,from top: 10, image width:100, image height: 100)
		add(bankImage); // adds image to the frame

		this.formno = formno;

		JLabel label1 = new JLabel("Page 2");
		label1.setFont(new Font("Ralway", Font.BOLD, 22));
		label1.setBounds(730, 30, 600, 30);
		add(label1);

		JLabel label2 = new JLabel("Additonal Details");
		label2.setFont(new Font("Raleway", Font.BOLD, 22));
		label2.setBounds(240, 30, 600, 30);
		add(label2);

		JLabel religionLabel = new JLabel("Religion");
		religionLabel.setFont(new Font("Raleway", Font.BOLD, 18));
		religionLabel.setBounds(100, 120, 100, 30);
		add(religionLabel);

		String religion[] = { "Hindu", "Muslim", "sikh", "Christian", "Other" };

		comboBox = new JComboBox(religion);
		comboBox.setBackground(getBackground());
		comboBox.setFont(new Font("Raleway", Font.BOLD, 16));
		comboBox.setBounds(350,120,320,30);
		add(comboBox);
		

		JLabel categoryLabel = new JLabel("Category");
		categoryLabel.setFont(new Font("Raleway", Font.BOLD, 18));
		categoryLabel.setBounds(100, 170, 100, 30);
		add(categoryLabel);

		String category[] = { "general", "O-BC", "SC", "ST", "OC","Other" };
		comboBox2 = new JComboBox(category);
		comboBox2.setBackground(getBackground());
		comboBox2.setFont(new Font("Raleway", Font.BOLD, 16));
		comboBox2.setBounds(350,170,320,30);
		add(comboBox2);
		
		JLabel incomeLabel = new JLabel("Income :");
		incomeLabel.setFont(new Font("Raleway", Font.BOLD, 18));
		incomeLabel.setBounds(100,220, 100, 30);
		add(incomeLabel);

		String income[] = { "Null", "<1.5 lakh", "< 2.5 lakh", "< 5 lakh", "< 10 lakh","< 50 lakh" };
		comboBox3 = new JComboBox(income);
		comboBox3.setBackground(getBackground());
		comboBox3.setFont(new Font("Raleway", Font.BOLD, 16));
		comboBox3.setBounds(350,220,320,30);
		add(comboBox3);
		
		JLabel educationLabel = new JLabel("Education");
		educationLabel.setFont(new Font("Raleway", Font.BOLD, 18));
		educationLabel.setBounds(100,270, 100, 30);
		add(educationLabel);

		String educational[] = { "Below 10th", "Intermediate", "Graduate", "Post Graduate"};
		comboBox4 = new JComboBox(educational);
		comboBox4.setBackground(getBackground());
		comboBox4.setFont(new Font("Raleway", Font.BOLD, 16));
		comboBox4.setBounds(350,270,320,30);
		add(comboBox4);
		
		
		JLabel occupationLabel = new JLabel("Occupation");
		occupationLabel.setFont(new Font("Raleway", Font.BOLD, 18));
		occupationLabel.setBounds(100,320, 200, 30);
		add(occupationLabel);

		String occupation[] = { "Salaried", "Self-Employed", "Business", "Student","Retired"};
		comboBox5 = new JComboBox(occupation);
		comboBox5.setBackground(getBackground());
		comboBox5.setFont(new Font("Raleway", Font.BOLD, 16));
		comboBox5.setBounds(350,320,320,30);
		add(comboBox5);
		

		JLabel panLabel = new JLabel("PAN No :");
		panLabel.setFont(new Font("Raleway", Font.BOLD, 18));
		panLabel.setBounds(100,370, 100, 30);
		add(panLabel);
		
		textPan = new JTextField();
		textPan.setBackground(getBackground());
		textPan.setFont(new Font("Raleway", Font.BOLD, 16));
		textPan.setBounds(350,370,320,30);
		add(textPan);
		
		
		JLabel adharLabel = new JLabel("Adhar No :");
		adharLabel.setFont(new Font("Raleway", Font.BOLD, 18));
		adharLabel.setBounds(100,430, 100, 30);
		add(adharLabel);
		
		textAdhar = new JTextField();
		textAdhar.setBackground(getBackground());
		textAdhar.setFont(new Font("Raleway", Font.BOLD, 16));
		textAdhar.setBounds(350,430,320,30);
		add(textAdhar);
		
		JLabel existLabel = new JLabel("Existing Account :");
		existLabel.setFont(new Font("Raleway", Font.BOLD, 18));
		existLabel.setBounds(100,490, 200, 30);
		add(existLabel);
		
		 button1 = new JRadioButton("Yes");
		 button1.setBackground(new Color(252, 208, 76));
		 button1.setFont(new Font("Raleway", Font.BOLD, 16));
		 button1.setBounds(350,490,100,30);
		add(button1);
		
		 button2 = new JRadioButton("No");
		 button2.setBackground(new Color(252, 208, 76));
		 button2.setFont(new Font("Raleway", Font.BOLD, 16));
		 button2.setBounds(550,490,100,30);
		add(button2);
		
		ButtonGroup buttonGroup = new ButtonGroup();
		buttonGroup.add(button1);
		buttonGroup.add(button2);
		
		JLabel formNoLabel = new JLabel("form No :");
		formNoLabel.setFont(new Font("Raleway", Font.BOLD, 18));
		formNoLabel.setBounds(600,10,100,30);
		add(formNoLabel);
		
		JLabel formNo = new JLabel(formno);
		formNo.setFont(new Font("Raleway", Font.BOLD, 18));
		formNo.setBounds(760,10, 60, 30);
		add(formNo);
		
		next = new JButton("Next");
		next.setFont(new Font("Raleway", Font.BOLD, 18));
		next.setBounds(550,600, 100, 30);
		next.setBackground(Color.WHITE);
	    next.setForeground(Color.black);
	    next.addActionListener(this);
		add(next);
		
		
		setSize(850, 800);
		setLocation(450, 80);
		getContentPane().setBackground(new Color(252, 208, 76));
		setVisible(true);
	}

	public static void main(String[] args) {
		new SignUpNext("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String religion = (String)comboBox.getSelectedItem();
		String category = (String)comboBox2.getSelectedItem();
		String income = (String)comboBox3.getSelectedItem();
		String education = (String)comboBox4.getSelectedItem();
		String occupation = (String)comboBox5.getSelectedItem();
		String pan = textPan.getText();
		String adhar = textAdhar.getText();
		
		String existingAccount = null;
		if(button1.isSelected()) {
			existingAccount = "Yes";
		}
		else if (button2.isSelected()) {
			existingAccount = "No";
		}
		
		try {
			if(pan.equals("") || adhar.equals("")) {
			JOptionPane.showMessageDialog(null, "Fill all the Fields");
			}
			else {
				JDBCCon con = new JDBCCon();
				String q = "insert into SignupTwo values('"+formno+"','"+religion+"','"+category+"','"+income+"','"+education+"','"+occupation+"','"+pan+"','"+adhar+"','"+existingAccount+"')";
				con.statement.executeUpdate(q);
				new Signup3(formno);
				setVisible(false);
			}
			
		}catch(Exception E) {
			E.printStackTrace();
		}
	}
}
