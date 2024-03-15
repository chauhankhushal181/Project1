import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Transactions extends JFrame implements ActionListener {
    JButton deposite, withdrawl, ministatement, pinchange, exit, balance, fastcash;
    String pinnumber;
    Transactions(String pinnumber) {
        this.pinnumber = pinnumber;
        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 700, 700);
        add(image);

        JLabel text = new JLabel("Please select your Transactions");
        text.setBounds(170, 210, 500, 35);
        text.setForeground(Color.white);
        text.setFont(new Font("System", Font.BOLD, 12));
        image.add(text);

        deposite = new JButton("Deposit");
        deposite.setBounds(118, 310, 150, 30);
        deposite.addActionListener(this);
        image.add(deposite);

        withdrawl = new JButton("Cash Withdrawal");
        withdrawl.setBounds(255, 310, 150, 30);
        withdrawl.addActionListener(this);
        image.add(withdrawl);

        fastcash = new JButton("Fastcash");
        fastcash.setBounds(118, 340, 150, 30);
        fastcash.addActionListener(this);
        image.add(fastcash);

        ministatement = new JButton("Mini Statement");
        ministatement.setBounds(255, 340, 150, 30);
        ministatement.addActionListener(this);
        image.add(ministatement);

        pinchange = new JButton("Pin Change");
        pinchange.setBounds(118, 370, 150, 30);
        pinchange.addActionListener(this);
        image.add(pinchange);

        balance = new JButton("Balance Enquiry");
        balance.setBounds(255, 370, 150, 30);
        balance.addActionListener(this);
        image.add(balance);

        exit = new JButton("Exit");
        exit.setBounds(118, 400, 150, 30);
        exit.addActionListener(this);
        image.add(exit);

        setSize(700, 700);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);

    }
    public static void main(String[] args) {
        new Transactions("");

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource()==exit){
            System.exit(0);
        }else if (ae.getSource()==deposite){
            setVisible(false);
            new Deposite(pinnumber).setVisible(true);
        }else if (ae.getSource() == withdrawl){
            setVisible(false);
            new Withdrawler(pinnumber).setVisible(true);
        }else if (ae.getSource()==fastcash){
            setVisible(false);
            new FastCash(pinnumber).setVisible(true);
        }else if (ae.getSource()==pinchange){
            setVisible(false);
            new PinChange(pinnumber).setVisible(true);
        }else if (ae.getSource()==balance){
            setVisible(false);
            new BalanceEnquiry(pinnumber).setVisible(true);
        }else if (ae.getSource()==ministatement){
            new MiniStatement(pinnumber).setVisible(true);
        }
    }
}