import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PinChange extends JFrame implements ActionListener {
    JPasswordField pin, repin;
    JButton Back, change;
    String pinnumber;

    PinChange(String pinnumber) {
        this.pinnumber=pinnumber;

        setLayout(null);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(700, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 700, 700);
        add(image);

        JLabel Text = new JLabel("CHANGE YOUR PIN");
        Text.setBounds(200, 210, 500, 35);
        Text.setForeground(Color.white);
        Text.setFont(new Font("System", Font.BOLD, 12));
        image.add(Text);

        JLabel pintext = new JLabel("New PIN:");
        pintext.setBounds(120, 250, 500, 35);
        pintext.setForeground(Color.white);
        pintext.setFont(new Font("System", Font.BOLD, 12));
        image.add(pintext);

        JLabel repinText = new JLabel("Re-Enter New PIN:");
        repinText.setBounds(120, 270, 500, 35);
        repinText.setForeground(Color.white);
        repinText.setFont(new Font("System", Font.BOLD, 12));
        image.add(repinText);

        pin = new JPasswordField();
        pin.setFont(new Font("Raleway", Font.BOLD, 16));
        pin.setBounds(250, 250, 150, 25);
        pin.setForeground(Color.white);
        pin.setFont(new Font("System", Font.BOLD, 12));
        image.add(pin);

        repin = new JPasswordField();
        repin.setFont(new Font("Raleway", Font.BOLD, 16));
        repin.setBounds(250, 270, 150, 25);
        repin.setForeground(Color.white);
        repin.setFont(new Font("System", Font.BOLD, 12));
        image.add(repin);

        change = new JButton("CHANGE");
        change.setBounds(250, 350, 150, 30);
        change.addActionListener(this);
        image.add(change);

        Back = new JButton("BACK");
        Back.setBounds(250, 380, 150, 30);
        Back.addActionListener(this);
        image.add(Back);


        setSize(700, 700);
        setLocation(300, 0);
        setUndecorated(true);
        setVisible(true);
    }


    public static void main(String[] args) {
        new PinChange("").setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == change) {
            try {
                String npin = pin.getText();
                String rpin = repin.getText();

                if (!npin.equals(rpin)) {
                    JOptionPane.showMessageDialog(null, "Entered PIN does not match");
                    return;
                }
                if (npin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Enter Pin ");
                    return;
                }
                if (rpin.equals("")) {
                    JOptionPane.showMessageDialog(null, "Please Re-enter new pin");
                    return;
                }
                Conn conn= new Conn();

                String query1 = "update bank set pin = '" + rpin + "' where pin = '" + pinnumber + "'";
                String query2 = "update login set pin = '" + rpin + "' where pin = '" + pinnumber + "'";
                String query3 = "update signupthree set pin = '" + rpin + "' where pin = '" + pinnumber + "'";

                conn.s.executeUpdate(query1);
                conn.s.executeUpdate(query2);
                conn.s.executeUpdate(query3);
                JOptionPane.showMessageDialog(null,"PIN changed successfully");

                setVisible(false);
                new Transactions(rpin).setVisible(true);


            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
}
