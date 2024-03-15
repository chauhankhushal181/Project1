import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposite extends JFrame implements ActionListener {

    JTextField ammount;
    JButton withdraw ,back;
    String pinnumber;

    Deposite(String pinnumber){
        this.pinnumber=pinnumber;
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,900);
        add(image);

        JLabel text = new JLabel("Enter the amount you want to Deposite");
        text.setForeground(Color.white);
        text.setFont(new Font("System", Font.BOLD,16));
        text.setBounds(190,200,400,200);
        image.add(text);

        ammount = new JTextField();
        ammount.setFont(new Font("Raleway",Font.BOLD,22));
        ammount.setBounds(175,320,320,25);
        image.add(ammount);

        withdraw= new JButton("Deposite");
        withdraw.setBounds(345,485,150,30);
        withdraw.addActionListener(this);
        image.add(withdraw);

        back = new JButton(" Back ");
        back.setBounds(345,520,150,30);
        back.addActionListener(this);
        image.add(back);

        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Deposite("");
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == withdraw){
            String number = ammount.getText();
            Date date = new Date();
            if (number.equals("")){
                JOptionPane.showMessageDialog(null,"Please enter the amount you want to Deposite");
            }else {
                try {
                    Conn conn = new Conn();
                    String query = "insert into bank values ('" + pinnumber + "','" + date + "','Deposite','" + number + "')";
                    conn.s.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Rs " + number + " Deposite Successfully");
                    setVisible(false);
                    new Transactions(pinnumber).setVisible(true);
                } catch (Exception e){
                    System.out.println(e);
                }
            }
        }else if (ae.getSource() == back){
            setVisible(false);
            new Transactions(pinnumber).setVisible(true);
        }
    }
}

