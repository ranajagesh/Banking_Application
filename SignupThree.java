package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener {
    
    JRadioButton saving,fixed,current,recurring;
    JCheckBox atm, internet ,mobile,alerts,cheque,statement,declaration ;
    JButton submit,cancel;
    String formno;
    
    SignupThree(String formno) {

        this.formno = formno;
        setLayout(null);
        
        JLabel l1 = new JLabel("Page 3: Account Details:");
        l1.setFont(new Font("Raleway",Font.BOLD, 22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        JLabel type = new JLabel("Account Type:");
        type.setFont(new Font("Raleway",Font.BOLD, 22));
        type.setBounds(100,140,200,30);
        add(type);
        
        saving = new JRadioButton("Saving Account");
        saving.setFont(new Font("Raleway", Font.BOLD, 16));
        saving.setBackground(Color.WHITE);
        saving.setBounds(100,180,150,20);
        add(saving);
        
        fixed = new JRadioButton("Fixed Deposit Account");
        fixed.setFont(new Font("Raleway", Font.BOLD, 16));
        fixed.setBackground(Color.WHITE);
        fixed.setBounds(350,180,250,20);
        add(fixed);
        
        current = new JRadioButton("Current Account");
        current.setFont(new Font("Raleway", Font.BOLD, 16));
        current.setBackground(Color.WHITE);
        current.setBounds(100,220,150,20);
        add(current);
        
        recurring = new JRadioButton("Recurring deposit Account");
        recurring.setFont(new Font("Raleway", Font.BOLD, 16));
        recurring.setBackground(Color.WHITE);
        recurring.setBounds(350,220,250,20);
        add(recurring);
        
        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(saving);
        groupaccount.add(fixed);
        groupaccount.add(current);
        groupaccount.add(recurring);
        
        JLabel card = new JLabel("Card Number");
        card.setFont(new Font("Raleway",Font.BOLD, 22));
        card.setBounds(100,300,200,30);
        add(card);
        
        JLabel cardnumber = new JLabel("XXXX-XXXX-XXXX-5746");
        cardnumber.setFont(new Font("Raleway",Font.BOLD, 22));
        cardnumber.setBounds(330,300,300,30);
        add(cardnumber);
        
        JLabel carddetail = new JLabel("Your 16-Digit Card Number");
        carddetail.setFont(new Font("Raleway",Font.BOLD, 12));
        carddetail.setBounds(100,330,300,20);
        add(carddetail);
        
        JLabel pin = new JLabel("PIN");
        pin.setFont(new Font("Raleway",Font.BOLD, 22));
        pin.setBounds(100,370,200,30);
        add(pin);
        
        JLabel pinnumber = new JLabel("XXXX");
        pinnumber.setFont(new Font("Raleway",Font.BOLD, 22));
        pinnumber.setBounds(330,370,300,30);
        add(pinnumber);
        
         JLabel pindetail = new JLabel("Your 4-Digit Password");
        pindetail.setFont(new Font("Raleway",Font.BOLD, 12));
        pindetail.setBounds(100,400,300,20);
        add(pindetail);
        
        JLabel service = new JLabel("Services Required:");
        service.setFont(new Font("Raleway",Font.BOLD, 22));
        service.setBounds(100,450,300,30);
        add(service);
        
        atm = new JCheckBox("ATM CARD");
        atm.setBackground(Color.WHITE);
        atm.setFont(new Font("Raleway",Font.BOLD, 16));
        atm.setBounds(100,500,200,30);
        add(atm);
        
        internet = new JCheckBox("Internet Banking");
        internet.setBackground(Color.WHITE);
        internet.setFont(new Font("Raleway",Font.BOLD, 16));
        internet.setBounds(350,500,200,30);
        add(internet);
        
        mobile = new JCheckBox("Mobile bankig");
        mobile.setBackground(Color.WHITE);
        mobile.setFont(new Font("Raleway",Font.BOLD, 16));
        mobile.setBounds(100,550,200,30);
        add(mobile);
        
     
        alerts = new JCheckBox("EMAIL & SMS Alerts");
        alerts.setBackground(Color.WHITE);
        alerts.setFont(new Font("Raleway",Font.BOLD, 16));
        alerts.setBounds(350,550,200,30);
        add(alerts);
        
        cheque = new JCheckBox("Cheque Book");
        cheque.setBackground(Color.WHITE);
        cheque.setFont(new Font("Raleway",Font.BOLD, 16));
        cheque.setBounds(100,600,200,30);
        add(cheque);
        
        statement = new JCheckBox("E-Statement");
        statement.setBackground(Color.WHITE);
        statement.setFont(new Font("Raleway",Font.BOLD, 16));
        statement.setBounds(350,600,200,30);
        add(statement);
        
        declaration = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge");
        declaration.setBackground(Color.WHITE);
        declaration.setFont(new Font("Raleway",Font.BOLD, 12));
        declaration.setBounds(100,680,600,30);
        add(declaration);
        
        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
    
    }
    
    public void actionPerformed(ActionEvent ae) {
    
        if(ae.getSource() == submit) {
        
            String accountType = null;
            if(saving.isSelected()){
                accountType = "Saving Account";
            } else if(fixed.isSelected()) {
                accountType = "Fixed Deposit Account";
            } else if(current.isSelected()) {
                accountType = "Current Account";
            }else if(recurring.isSelected()) {
                accountType = "Recurring deposit Account";
            }
            
            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 90000000L) + 5040936000000000L);
            
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
            
            String facility = "";
            if(atm.isSelected()) {
               facility = facility + " ATM Card"; 
            } else if(internet.isSelected()) {
                facility = facility + " Internet Banking";
            } else if(mobile.isSelected()) {
                facility = facility + " Mobile Banking";
            } else if(alerts.isSelected()) {
                facility = facility + " EMAIL & SMS Alerts";
            } else if(cheque.isSelected()) {
                facility = facility + " Cheque Book";
            } else if(statement.isSelected()) {
                facility = facility + "E-Statement";
            }
            
            try {
              if (accountType.equals("")) {
                  JOptionPane.showMessageDialog(null,"Account Type is required");
              } else {
                  Conn conn = new Conn();
                  String query1 = "insert into signupthree values ('"+formno+"', '"+accountType+"' , '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";
                  String query2 = "insert into login values ('"+formno+"', '"+cardnumber+"', '"+pinnumber+"')";
                  
                  conn.s.executeUpdate(query1);
                  conn.s.executeUpdate(query2);
                  
                  JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n Pin: " + pinnumber);
                  
                  setVisible(false);
                  new Deposit(pinnumber).setVisible(true);
              
              } 
              
                
            } catch (Exception e) {
                System.out.println(e);
            }
            
            
            
        } else if(ae.getSource() == cancel) {
            setVisible(false);
            new Login().setVisible(true);
        }
        
    }
    
    public static void main(String args[]) {
        new SignupThree("");
    }
}
