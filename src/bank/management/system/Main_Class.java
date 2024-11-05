

package bank.management.system;

import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main_Class extends JFrame implements ActionListener {
    JButton deposit,withdrawl,fastCash,miniStatement,pinChange,balance,exit;
    String pin;
    Main_Class(String pin){
        this.pin = pin;

        ImageIcon atm = new ImageIcon("C:\\Users\\nagen\\Downloads\\atm2.png");
        Image atm1 = atm.getImage().getScaledInstance(1550,830,Image.SCALE_DEFAULT);
        ImageIcon atm2 = new ImageIcon(atm1);
        JLabel atmLabel = new JLabel(atm2);
        atmLabel.setBounds(0,0,1550,830);
        add(atmLabel);

        JLabel label = new JLabel("Please Select Your Transaction");
        label.setBounds(430,180,700,35);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System",Font.BOLD,28));
        atmLabel.add(label);

        deposit = new JButton("DEPOSIT");
        deposit.setForeground(Color.WHITE);
        deposit.setBackground(new Color(65,125,128));
        deposit.setBounds(410,274,150,35);
        deposit.addActionListener(this);
        atmLabel.add(deposit);

        withdrawl= new JButton("CASH WITHDRAWL");
        withdrawl.setForeground(Color.WHITE);
        withdrawl.setBackground(new Color(65,125,128));
        withdrawl.setBounds(700,274,150,35);
        withdrawl.addActionListener(this);
        atmLabel.add(withdrawl);

        fastCash = new JButton("FAST CASH");
        fastCash.setForeground(Color.WHITE);
        fastCash.setBackground(new Color(65,125,128));
        fastCash.setBounds(410,318,150,35);
        fastCash.addActionListener(this);
        atmLabel.add(fastCash);

        miniStatement = new JButton("MINI STATEMENT");
        miniStatement.setForeground(Color.WHITE);
        miniStatement.setBackground(new Color(65,125,128));
        miniStatement.setBounds(700,318,150,35);
        miniStatement.addActionListener(this);
        atmLabel.add(miniStatement);

        pinChange = new JButton("PIN CHANGE");
        pinChange.setForeground(Color.WHITE);
        pinChange.setBackground(new Color(65,125,128));
        pinChange.setBounds(410,362,150,35);
        pinChange.addActionListener(this);
        atmLabel.add(pinChange);

        balance = new JButton("BALANCE ENQUIRY");
        balance.setForeground(Color.WHITE);
        balance.setBackground(new Color(65,125,128));
        balance.setBounds(700,362,150,35);
        balance.addActionListener(this);
        atmLabel.add(balance);

        exit = new JButton("EXIT");
        exit.setForeground(Color.WHITE);
        exit.setBackground(new Color(65,125,128));
        exit.setBounds(700,406,150,35);
        exit.addActionListener(this);
        atmLabel.add(exit);

        setLayout(null);
        setSize(1550,1080);
        setLocation(0,0);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==deposit){
           new Deposit(pin);
            setVisible(false);
        }else if (e.getSource()==exit){
            System.exit(0);
        } else if (e.getSource()==withdrawl) {
            new Withdrawl(pin);
            setVisible(false);
        } else if (e.getSource()==balance) {
            new BalanceEnquiry(pin);
            setVisible(false);
        } else if (e.getSource()==fastCash) {
            new FastCash(pin);
            setVisible(false);
        } else if (e.getSource()==pinChange) {
            new Pin(pin);
            setVisible(false);
        } else if (e.getSource()== miniStatement) {
            new MiniStatement(pin);
        }
    }

    public static void main(String[] args) {
        new Main_Class("");
    }
}