package bank.management.system;

import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
   String pin;
   TextField textField;

   JButton deposit, back;
    Deposit(String pin){
        this.pin = pin;

        ImageIcon atm = new ImageIcon("C:\\Users\\nagen\\Downloads\\atm2.png");
        Image atm1 = atm.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon atm2 = new ImageIcon(atm1);
        JLabel atmLabel = new JLabel(atm2);
        atmLabel.setBounds(0,0,1550,830);
        add(atmLabel);

        JLabel label1 = new JLabel("ENETR AMOUNT YOU WANT TO DEPOSIT");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(460,180,400,35);
        atmLabel.add(label1);

        textField = new TextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        textField.setBounds(460,230,320,25);
        textField.setFont(new Font("Raleway", Font.BOLD,22));
        atmLabel.add(textField);

        deposit = new JButton("DEPOSIT");
        deposit.setBounds(700,362,150,35);
        deposit.setBackground(new Color(65,125,128));
        deposit.setForeground(Color.WHITE);
        deposit.addActionListener(this);
        atmLabel.add(deposit);

        back = new JButton("BACK");
        back.setBounds(700,406,150,35);
        back.setBackground(new Color(65,125,128));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        atmLabel.add(back);




        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String amount = textField.getText();
            Date date = new Date();
            if (e.getSource()==deposit){
                if (textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the Amount you want to Deposit");
                }else {
                    JDBCCon con = new JDBCCon();
                    con.statement.executeUpdate("insert into bank values('"+pin+"', '"+date+"','Deposit', '"+amount+"')");
                    JOptionPane.showMessageDialog(null,"Rs. "+amount+" Deposited Successfully");
                    setVisible(false);
                    new Main_Class(pin);
                }
            }else if (e.getSource()==back){
                setVisible(false);
                new Main_Class(pin);
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Deposit("");
    }
}