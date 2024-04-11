package bank.management.system;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {

    JButton next;
    JTextField  panTextField, aadharTextField;
    JRadioButton syes,sno,eyes,eno;
    JComboBox rel,cat,inc,edu,occu;
    String formno;

    SignupTwo(String formno) {

        this.formno = formno;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(100, 140, 100, 30);
        add(religion);

        String strReligion [] = {"Hindu","Muslim","Sikh","Christian","other"};
        rel = new JComboBox(strReligion);
        rel.setBounds(300, 140, 400, 30);
        rel.setBackground(Color.WHITE);
        add(rel);

        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(100, 190, 200, 30);
        add(category);
        
        String strCategory [] = {"General","OBC","SC","ST","other"};
        cat = new JComboBox(strCategory);
        cat.setBounds(300, 190, 400, 30);
        cat.setBackground(Color.WHITE);
        add(cat);

        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(100, 240, 200, 30);
        add(income);

        String strincome [] = {"Null","< 3,50,000","< 6,00,000","< 8,00,000","UPTO 15,00,000"};
        inc = new JComboBox(strincome);
        inc.setBounds(300, 240, 400, 30);
        inc.setBackground(Color.WHITE);
        add(inc);

        JLabel educational = new JLabel("Educational: /");
        educational.setFont(new Font("Raleway", Font.BOLD, 20));
        educational.setBounds(100, 290, 200, 30);
        add(educational);

        JLabel qualification = new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway", Font.BOLD, 20));
        qualification.setBounds(100, 315, 200, 30);
        add(qualification);
        
        String strQuali [] = {" Non-Graduation"," Graduation"," Post- Graduation"," P.hd"," Other"};
        edu = new JComboBox(strQuali);
        edu.setBounds(300, 315, 400, 30);
        edu.setBackground(Color.WHITE);
        add(edu);


        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(100, 390, 200, 30);
        add(occupation);
        
        String strOccu [] = {"Salaried"," Self-Employed"," Business"," Student"," Other"};
        occu = new JComboBox(strOccu);
        occu.setBounds(300, 390, 400, 30);
        occu.setBackground(Color.WHITE);
        add(occu);

        JLabel panno = new JLabel("PAN Number:");
        panno.setFont(new Font("Raleway", Font.BOLD, 20));
        panno.setBounds(100, 440, 200, 30);
        add(panno);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(300, 440, 400, 30);
        add(panTextField);

        JLabel aadharno = new JLabel("Aadhar Number:");
        aadharno.setFont(new Font("Raleway", Font.BOLD, 20));
        aadharno.setBounds(100, 490, 200, 30);
        add(aadharno);

        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(300, 490, 400, 30);
        add(aadharTextField);

        JLabel senior = new JLabel("Senior Citizen:");
        senior.setFont(new Font("Raleway", Font.BOLD, 20));
        senior.setBounds(100, 540, 200, 30);
        add(senior);

        syes = new JRadioButton("Yes");
        syes.setBounds(300, 540, 100, 30);
        syes.setBackground(Color.WHITE);
        add(syes);

        sno = new JRadioButton("No");
        sno.setBounds(450, 540, 100, 30);
        sno.setBackground(Color.WHITE);
        add(sno);

        ButtonGroup seniorgroup = new ButtonGroup();
        seniorgroup.add(syes);
        seniorgroup.add(sno);
        
        JLabel exisacco = new JLabel("Exisiting Account:");
        exisacco.setFont(new Font("Raleway", Font.BOLD, 20));
        exisacco.setBounds(100, 590, 200, 30);
        add(exisacco);
        
        eyes = new JRadioButton("Yes");
        eyes.setBounds(300, 590, 100, 30);
        eyes.setBackground(Color.WHITE);
        add(eyes);

        eno = new JRadioButton("No");
        eno.setBounds(450, 590, 100, 30);
        eno.setBackground(Color.WHITE);
        add(eno);

        ButtonGroup existinggroup = new ButtonGroup();
        existinggroup.add(eyes);
        existinggroup.add(eno);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);

        setSize(850, 800);
        setLocation(350, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
             
        String religion = (String) rel.getSelectedItem();
        String category = (String) cat.getSelectedItem();
        String income = (String) inc.getSelectedItem();
        String education = (String) edu.getSelectedItem();
        String occupation = (String) occu.getSelectedItem();
        String seniorcitizen = null;
        if (syes.isSelected()) {
            seniorcitizen = "Yes";
        } else if (sno.isSelected()) {
            seniorcitizen = "No";
        } 
        String existingaccount = null;
        if (eyes.isSelected()) {
            existingaccount = "Yes";
        } else if (eno.isSelected()) {
            existingaccount = "No";
        } 

        String pannum = panTextField.getText();
        String aadharnum = aadharTextField.getText();

        try {
                Conn c = new Conn();
                String query="insert into signuptwo values ('"+formno+"','"+religion+"', '"+category+"', '"+income+"', '"+education+"', '"+occupation+"', '"+pannum+"', '"+aadharnum+"', '"+seniorcitizen+"', '"+existingaccount+"');";
                c.s.executeUpdate(query);
                
                //SignupThree Object
                setVisible(false);
                new SignupThree(formno).setVisible(true);
                
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        new SignupTwo("");
    }

}

