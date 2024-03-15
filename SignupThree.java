import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignupThree extends JFrame implements ActionListener {

    String formno;

    JRadioButton r1, r2, r3, r4;

    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;

    SignupThree(String formno) { //sign up three method
        this.formno=formno;
        setLayout(null);

        JLabel l1 = new JLabel("Page 3: Account Details"); //we create JLabel so we
        // extends our class to JFrame and import the new classes
        l1.setFont(new Font("Raleway", Font.BOLD, 22)); //for heading
        l1.setBounds(280, 40, 400, 40); //set the bounds of the Page 3 : Account Details
        add(l1);

        JLabel type = new JLabel("Account type"); //we create JLabel so we
        // extends our class to JFrame and import the new classes
        type.setFont(new Font("Raleway", Font.BOLD, 22)); //for heading
        type.setBounds(100, 140, 400, 40); //set the bounds of the Page 3 : Account type
        add(type);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Ralway", Font.BOLD, 16));
        r1.setBackground(Color.white);
        r1.setBounds(100, 180, 150, 20);
        add(r1);

        r2 = new JRadioButton("Fixed Deposite Account");
        r2.setFont(new Font("Ralway", Font.BOLD, 16));
        r2.setBackground(Color.white);
        r2.setBounds(350, 180, 250, 20);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Ralway", Font.BOLD, 16));
        r3.setBackground(Color.white);
        r3.setBounds(100, 210, 200, 20);
        add(r3);

        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("Ralway", Font.BOLD, 16));
        r4.setBackground(Color.white);
        r4.setBounds(350, 210, 250, 20);
        add(r4);

        ButtonGroup groupaccount = new ButtonGroup();
        groupaccount.add(r1);
        groupaccount.add(r2);
        groupaccount.add(r3);
        groupaccount.add(r4);

        JLabel Card = new JLabel("Card Number"); //we create JLabel so we
        // extends our class to JFrame and import the new classes
        Card.setFont(new Font("Raleway", Font.BOLD, 22)); //for heading
        Card.setBounds(100, 250, 200, 30); //set the bounds of the Card
        add(Card);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184"); //we create JLabel so we
        // extends our class to JFrame and import the new classes
        number.setFont(new Font("Raleway", Font.BOLD, 22)); //for heading
        number.setBounds(350, 250, 300, 30); //set the bounds of the XXXX XXXX XXXX 4184
        add(number);

        JLabel pin = new JLabel("PIN:"); //we create JLabel so we
        // extends our class to JFrame and import the new classes
        pin.setFont(new Font("Raleway", Font.BOLD, 22)); //for heading
        pin.setBounds(100, 290, 300, 30); //set the bounds of the Page Pin
        add(pin);

        JLabel pnumber = new JLabel("XXXX"); //we create JLabel so we
        // extends our class to JFrame and import the new classes
        pnumber.setFont(new Font("Raleway", Font.BOLD, 22)); //for heading
        pnumber.setBounds(350, 290, 300, 30); //set the bounds of the pnumber
        add(pnumber);

        JLabel carddetail = new JLabel("Your 16 Digit Card Number"); //we create JLabel so we
        // extends our class to JFrame and import the new classes
        carddetail.setFont(new Font("Raleway", Font.BOLD, 12)); //for small heading
        carddetail.setBounds(100, 270, 300, 20); //set the bounds of the Your 16 Digit Card Number
        add(carddetail);

        JLabel pindetail = new JLabel("Your 4 Digit Password"); //we create JLabel so we
        // extends our class to JFrame and import the new classes
        pindetail.setFont(new Font("Raleway", Font.BOLD, 12)); //for small heading
        pindetail.setBounds(100, 310, 300, 20); //set the bounds of the Your 16 Digit Card Number
        add(pindetail);

        JLabel services = new JLabel("Services Required "); //we create JLabel so we
        // extends our class to JFrame and import the new classes
        services.setFont(new Font("Raleway", Font.BOLD, 22)); //for small heading
        services.setBounds(100, 340, 200, 30); //set the bounds of Services Required
        add(services);

        c1 = new JCheckBox("ATM CARD");
        c1.setBackground(Color.white);
        c1.setFont(new Font("Raleway", Font.BOLD, 16));
        c1.setBounds(100, 370, 200, 30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setBackground(Color.white);
        c2.setFont(new Font("Raleway", Font.BOLD, 16));
        c2.setBounds(350, 370, 200, 30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setBackground(Color.white);
        c3.setFont(new Font("Raleway", Font.BOLD, 16));
        c3.setBounds(100, 400, 200, 30);
        add(c3);

        c4 = new JCheckBox("EMAIL & SMS Alerts");
        c4.setBackground(Color.white);
        c4.setFont(new Font("Raleway", Font.BOLD, 16));
        c4.setBounds(350, 400, 200, 30);
        add(c4);

        c5 = new JCheckBox("Cheque Book ");
        c5.setBackground(Color.white);
        c5.setFont(new Font("Raleway", Font.BOLD, 16));
        c5.setBounds(100, 430, 200, 30);
        add(c5);

        c6 = new JCheckBox("E Statement");
        c6.setBackground(Color.white);
        c6.setFont(new Font("Raleway", Font.BOLD, 16));
        c6.setBounds(350, 430, 200, 30);
        add(c6);

        c7 = new JCheckBox("Hereby declares that the above entered details are correct to the best of my knowledge");
        c7.setBackground(Color.white);
        c7.setFont(new Font("Raleway", Font.BOLD, 16));
        c7.setBounds(100, 460, 600, 30);
        add(c7);

        submit = new JButton("submit");
        submit.setBackground(Color.black);
        submit.setForeground(Color.white);
        submit.setFont(new Font("Raleway", Font.BOLD, 14));
        submit.setBounds(230, 500, 100, 30);
        submit.addActionListener(this);
        add(submit);

        cancel = new JButton("cancel");
        cancel.setBackground(Color.black);
        cancel.setForeground(Color.white);
        cancel.setFont(new Font("Raleway", Font.BOLD, 14));
        cancel.addActionListener(this);
        cancel.setBounds(420, 500, 100, 30);
        add(cancel);

        setSize(850, 820);
        setLocation(350, 0); //for frame
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == submit) {
            String accountType = null;
            if (r1.isSelected()) {
                accountType = "Saving Account";
            } else if (r2.isSelected()) {
                accountType = "Fixed Deposit Account";
            } else if (r3.isSelected()) {
                accountType = "Current Account";
            } else if (r4.isSelected()) {
                accountType = "Recurring Deposit Account";
            }
            Random random = new Random();
            String cardnumber = "" + Math.abs((random.nextLong() % 900000000L) + 5040936000000000L);
            String pinnumber = "" + Math.abs((random.nextLong() % 9000L) + 1000L);
            String facility = "";
            if (c1.isSelected()) {
                facility = facility + "ATM CARD";
            } else if (c2.isSelected()) {
                facility = facility + "Internet Banking";
            } else if (c3.isSelected()) {
                facility = facility + "Mobile Banking";
            } else if (c4.isSelected()) {
                facility = facility + "EMAIL & SMS Alerts";
            } else if (c5.isSelected()) {
                facility = facility + "Cheque Books";
            } else if (c6.isSelected()) {
                facility = facility + "E-Statement";
            }
                try {
                    if (accountType.equals("")){
                        JOptionPane.showMessageDialog(null,"Account Type is Required");
                    }else {
                        Conn conn = new Conn();
                        String query1 = "insert into signupThree values ('" + formno + "','" + accountType + "','" + cardnumber + "','" + pinnumber + "','" + facility + "')";
                        String query2 = "insert into login values ('" + formno + "','" + cardnumber + "','" + pinnumber + "')";
                        conn.s.executeUpdate(query1);
                        conn.s.executeUpdate(query2);
                        JOptionPane.showMessageDialog(null, "Card Number: " + cardnumber + "\n Pin: " + pinnumber);
                        setVisible(false);
                        new Deposite(pinnumber).setVisible(false);
                    }
                }catch (Exception e){
                    System.out.println(e);
                }

            } else if (ae.getSource() == cancel) {
            setVisible(false);
            new Login().setVisible(true);
            }
        }
    public static void main(String[] args) {
        new SignupThree("");
    }
}