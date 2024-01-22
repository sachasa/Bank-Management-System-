package bank.management.system.Login;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Transactions extends JFrame implements ActionListener {
    
    JLabel la1;
    JButton bu1,bu2,bu3,bu4,bu5,bu6,bu7;
    String pin;
    Transactions(String pin){
        this.pin = pin;
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bank.management.system/icons1/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1000, 1180, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel la2 = new JLabel(i3);
        la2.setBounds(0, 0, 960, 1080);
        add(la2);
        
        la1 = new JLabel("Please Select Your Transaction");
        la1.setForeground(Color.WHITE);
        la1.setFont(new Font("System", Font.BOLD, 16));
        
        
        bu1 = new JButton("Deposit");
        bu2 = new JButton("Cash Withdrawl");
        bu3 = new JButton("Fast Cash");
        bu4 = new JButton("Mini Statement");
        bu5 = new JButton("PIN change");
        bu6 = new JButton("Balance Enquiry");
        bu7 = new JButton("Exit");
        
        setLayout(null);
        
        la1.setBounds(235,400,700,35);
        la2.add(la1);
        
        bu1.setBounds(170,499,150,35);
        la2.add(bu1);
        
        bu2.setBounds(390,499,150,35);
        la2.add(bu3);
        
        bu3.setBounds(170, 543, 150, 50);
        la2.add(bu3);
        
        bu4.setBounds(390,588,150,35);
        la2.add(bu5);
        
        bu5.setBounds(170, 588, 150,35);
        la2.add(bu5);
        
        bu6.setBounds(390, 588, 150, 35);
        la2.add(bu6);
        
        bu7.setBounds(390,633,150,35);
        la2.add(bu7);
        
        bu1.addActionListener(this);
        bu2.addActionListener(this);
        bu3.addActionListener(this);
        bu4.addActionListener(this);
        bu5.addActionListener(this);
        bu6.addActionListener(this);
        bu7.addActionListener(this);
        
        setSize(960,1080);
        setLocation(500,0);
        setUndecorated(true);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==bu1){
            setVisible(false);
            new Deposit(pin).setVisible(true);
        }else if(ae.getSource()==bu2){
            setVisible(false);
            new Withdrawl(pin).setVisible(true);
        }else if(ae.getSource()==bu3){
            setVisible(false);
            new FastCash(pin).setVisible(true);
        }else if(ae.getSource()==bu4){
            new MiniStatement(pin).setVisible(true);
        }else if(ae.getSource()==bu5){
            setVisible(false);
            new Pin(pin).setVisible(true);
        }else if(ae.getSource()==bu6){
            this.setVisible(false);
            new BalanceEnquiry(pin).setVisible(true);
        }else if(ae.getSource()==bu7){
            System.exit(0);
    }
    }
    
    public static void main(String[] args){
        new Transactions("").setVisible(true);
    }


}
