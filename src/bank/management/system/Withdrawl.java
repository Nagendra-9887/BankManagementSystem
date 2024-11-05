package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {

    String pin;
    TextField textField;

    JButton withdraw, back;
    Withdrawl(String pin){
        this.pin=pin;
        ImageIcon atm = new ImageIcon("C:\\Users\\nagen\\Downloads\\atm2.png");
        Image atm1 = atm.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon atm2 = new ImageIcon(atm1);
        JLabel atmLabel = new JLabel(atm2);
        atmLabel.setBounds(0,0,1550,830);
        add(atmLabel);

        JLabel label1 = new JLabel("MAXIMUM WITHDRAWL AMOUNT IS 10,000");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(460,180,400,35);
        atmLabel.add(label1);

        JLabel label2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setBounds(460,220,400,35);
        atmLabel.add(label2);


        textField = new TextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        textField.setBounds(460,260,320,25);
        textField.setFont(new Font("Raleway", Font.BOLD,22));
        atmLabel.add(textField);

        withdraw = new JButton("WITHDRAW");
        withdraw.setBounds(700,362,150,35);
        withdraw.setBackground(new Color(65,125,128));
        withdraw.setForeground(Color.WHITE);
        withdraw.addActionListener(this);
        atmLabel.add(withdraw);

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
        if(e.getSource()==withdraw) {
            try {
                String amount = textField.getText();
                Date date = new Date();
                if (amount.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount you want to withdraw");
                } else {
                    JDBCCon con = new JDBCCon();
                    ResultSet resultSet = con.statement.executeQuery("select * from bank where pin = '" + pin + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insuffient Balance");
                        return;
                    }

                    con.statement.executeUpdate("insert into bank values('" + pin + "', '" + date + "', 'Withdrawl', '" + amount + "' )");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                    setVisible(false);
                    new Main_Class(pin);

                }
            } catch (Exception E) {
                 E.printStackTrace();
            }
        } else if (e.getSource()==back) {
            setVisible(false);
            new Main_Class(pin);
        }
    }

    public static void main(String[] args) {
        new Withdrawl("");
    }
}