package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {

    String pin;
    JLabel label2;
    JButton back;
    BalanceEnquiry(String pin){
        this.pin =pin;

        ImageIcon atm = new ImageIcon("C:\\Users\\nagen\\Downloads\\atm2.png");
        Image atm1 = atm.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon atm2 = new ImageIcon(atm1);
        JLabel atmLabel = new JLabel(atm2);
        atmLabel.setBounds(0,0,1550,830);
        add(atmLabel);

        JLabel label1 = new JLabel("Your Current Balance is Rs ");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(430,180,700,35);
        atmLabel.add(label1);

        label2 = new JLabel();
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setBounds(430,220,400,35);
        atmLabel.add(label2);

        back = new JButton("Back");
        back.setBounds(700,406,150,35);
        back.setBackground(new Color(65,125,128));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        atmLabel.add(back);

        int balance =0;
        try{
            JDBCCon con = new JDBCCon();
            ResultSet resultSet = con.statement.executeQuery("Select * from bank where pin = '"+pin+"'");
            while (resultSet.next()){
                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        label2.setText(""+balance);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        new Main_Class(pin);
        setVisible(false);
    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}