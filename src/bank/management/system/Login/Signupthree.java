package bank.management.system.Login;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import java.util.*;


public class Signupthree extends JFrame implements ActionListener {
    JLabel la1,la2,la3,la4,la5,la6,la7,la8,la9,la10,la11,la12;
    JRadioButton ra1,ra2,ra3,ra4;
    JButton b1,b2;
    JCheckBox ch1,ch2,ch3,ch4,ch5,ch6,ch7;
    String formno;
    Signupthree(String formno){
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 3");
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons1/logo.jpeg"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l14 = new JLabel(i3);
        l14.setBounds(150,0,100,100);
        add(l14);
        
        la1 = new JLabel("Page 3: Account Details");
        la1.setFont(new Font("Raleway", Font.BOLD, 22));
        
        la2 = new JLabel("Account Type:");
        la2.setFont(new Font("Raleway", Font.BOLD, 18));
        
        la3 = new JLabel("Card Number:");
        la3.setFont(new Font("Raleway", Font.BOLD, 18));
        
        la4 = new JLabel("XXXX-XXXX-XXXX-4184");
        la4.setFont(new Font("Raleway", Font.BOLD, 18));
        
        la5 = new JLabel("(Your 16-digit Card number)");
        la5.setFont(new Font("Raleway", Font.BOLD,12));
        
        la6 = new JLabel("It would appear on ATM Card/Cheque Book and Statement");
        la6.setFont(new Font("Raleway", Font.BOLD, 12));
        
        la7 = new JLabel("PIN");
        la7.setFont(new Font("Raleway", Font.BOLD, 18));
        
        la8 = new JLabel("XXXX");
        la8.setFont(new Font("Raleway", Font.BOLD,18));
        
        la9 = new JLabel("(4-digit password)");
        la9.setFont(new Font("Raleway", Font.BOLD, 12));
        
        la10 = new JLabel("Services Required");
        la10.setFont(new Font("Raleway", Font.BOLD, 18));
        
        la11 = new JLabel("Form NO:");
        la11.setFont(new Font("Raleway", Font.BOLD,14));
        
        la12 = new JLabel(formno);
        la12.setFont(new Font("Raleway", Font.BOLD,14));
        
        b1 = new JButton("Submit");
        b1.setFont(new Font("Raleway", Font.BOLD,14));
        b1.setBackground(Color.BLACK);
        b1.setBackground(Color.WHITE);
        
        b2 = new JButton("Cancel");
        b2.setFont(new Font("Raleway", Font.BOLD,14));
        b2.setBackground(Color.BLACK);
        b2.setBackground(Color.WHITE);
        
        ch1 = new JCheckBox("ATM CARD");
        ch1.setBackground(Color.WHITE);
        ch1.setFont(new Font("Raleway", Font.BOLD, 16));
        
        ch2 = new JCheckBox("Internet Banking");
        ch2.setBackground(Color.WHITE);
        ch2.setFont(new Font("Raleway", Font.BOLD, 16));
        
        ch3 = new JCheckBox("Mobile Banking");
        ch3.setBackground(Color.WHITE);
        ch3.setFont(new Font("Raleway", Font.BOLD, 16));
        
        ch4 = new JCheckBox("EMAIL Alerts");
        ch4.setBackground(Color.WHITE);
        ch4.setFont(new Font("Raleway", Font.BOLD, 16));
        
        ch5 = new JCheckBox("Cheque Book");
        ch5.setBackground(Color.WHITE);
        ch5.setFont(new Font("Raleway", Font.BOLD, 16));
        
        ch6 = new JCheckBox("E-Statement");
        ch6.setBackground(Color.WHITE);
        ch6.setFont(new Font("Raleway", Font.BOLD, 16));
        
        ch7 = new JCheckBox("I hereby declares that the above entered details correct to th best of my knowledge.\",true");
        ch7.setBackground(Color.WHITE);
        ch7.setFont(new Font("Raleway", Font.BOLD, 16));
        
        ra1 = new JRadioButton("Saving Account");
        ra1.setFont(new Font("Raleway", Font.BOLD, 16));
        ra1.setBackground(Color.WHITE);
        
        ra2 = new JRadioButton("Fixed Deposit Account");
        ra2.setFont(new Font("Raleway", Font.BOLD, 16));
        ra2.setBackground(Color.WHITE);
        
        ra3 = new JRadioButton("Current Account");
        ra3.setFont(new Font("Raleway", Font.BOLD, 16));
        ra3.setBackground(Color.WHITE);
        
        ra4 = new JRadioButton("Recurring Deposit Account");
        ra4.setFont(new Font("Raleway", Font.BOLD, 16));
        ra4.setBackground(Color.WHITE);
        
        ButtonGroup groupgender = new ButtonGroup();
        groupgender.add(ra1);
        groupgender.add(ra2);
        groupgender.add(ra3);
        groupgender.add(ra4);
        
        setLayout(null);
        
        la11.setBounds(700,10,70,30);
        add(la11);
        
        la12.setBounds(770,10,40,30);
        add(la12);
        
        la1.setBounds(280,40,400,40);
        add(la1); 
        
        la2.setBounds(100,140,200,30);
        add(la2);
        
        ra1.setBounds(100,180,150,30);
        add(ra1);
        
        ra2.setBounds(350,180,300,30);
        add(ra2);
        
        ra3.setBounds(100,220,250,30);
        add(ra3);
        
        ra4.setBounds(350,220,250,30);
        add(ra4);
        
        la3.setBounds(100,300,200,30);
        add(la3);
        
        la4.setBounds(330,300,250,30);
        add(la4);
        
        la5.setBounds(100,330,200,20);
        add(la5);
        
        la6.setBounds(330,330,500,20);
        add(la6);
        
        la7.setBounds(100,370,200,30);
        add(la7);
        
        la8.setBounds(330,370,200,30);
        add(la8);
        
        la9.setBounds(100,400,200,20);
        add(la9);
        
        la10.setBounds(100,450,200,30);
        add(la10);
        
        ch1.setBounds(100,500,200,30);
        add(ch1);
        
        ch2.setBounds(350,500,200,30);
        add(ch2);
        
        ch3.setBounds(100,550,200,30);
        add(ch3);
        
        ch4.setBounds(350,550,200,30);
        add(ch4);
        
        ch5.setBounds(100,600,200,30);
        add(ch5);
        
        ch6.setBounds(350,600,200,30);
        add(ch6);
        
        ch7.setBounds(100,680,600,20);
        add(ch7);
        
        b1.setBounds(250,720,100,30);
        add(b1);
        
        b2.setBounds(420,720,100,30);
        add(b2);
        
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,850);
        setLocation(500,120);
        setVisible(true);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        String atype = null;
        if(ra1.isSelected()){
            atype = "Saving Account";
        }
        else if(ra2.isSelected()){
            atype = "Fixed Deposit Account";
        }
        else if(ra3.isSelected()){
            atype = "Current Account";
        }
        else if(ra4.isSelected()){
            atype = "Recurring Deposit Account";
        }
        
        Random ran = new Random();
        long first7 = (ran.nextLong()% 90000000L) + 5040936000000000L;
        String cardno = ""+ Math.abs(first7);
        
        long first3 = (ran.nextLong()% 9000L) + 1000L;
        String pin = "" + Math.abs(first3);
        
        String facility = "";
        if(ch1.isSelected()){ 
            facility = facility + " ATM Card";
        }
        if(ch2.isSelected()){ 
            facility = facility + " Internet Banking";
        }
        if(ch3.isSelected()){ 
            facility = facility + " Mobile Banking";
        }
        if(ch4.isSelected()){ 
            facility = facility + " EMAIL Alerts";
        }
        if(ch5.isSelected()){ 
            facility = facility + " Cheque Book";
        }
        if(ch6.isSelected()){ 
            facility = facility + " E-Statement";
        }
        
        try{
            if(ae.getSource()==b1){
                
                if(atype.equals("")){
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }else{
                    Conn c1 = new Conn();
                    String q1 = "insert into signup3 values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+facility+"')";  
                    String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                    c1.s.executeUpdate(q1);
                    c1.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\n Pin:"+ pin);
                    
                    new Deposit(pin).setVisible(true);
                    setVisible(false);
                }
            
            }else if(ae.getSource()==b2){
                System.exit(0);
            }
            
        }catch(Exception ex){
            ex.printStackTrace();
        }
        
    }
    
    public static void main(String[] args){
        new Signupthree("").setVisible(true);
    }
    
}
        

    

