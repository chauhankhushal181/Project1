
import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;
//import java.awt.event.ActionListener;

public class SignupOne extends JFrame implements ActionListener {

    long random;
    JTextField nameTextField, fatherTextField, EmailTextField , addressTextfield , cityTextfield
            ,stateTextfield, pinTextfield ;
    JRadioButton married , unmarried,male , female  ;
    JButton next;
    JDateChooser dateChooser;


    SignupOne(){
        setLayout(null);
        Random ran = new Random();
        random = Math.abs(ran.nextLong() % 9000L +1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO. " + random );
        formno.setFont(new Font("Raleway", Font.BOLD,38));
        formno.setBounds(140,20,600,40);
        add(formno);

        JLabel personalDetail = new JLabel("Page 1:" + " Personal Detail");
        personalDetail.setFont(new Font("Raleway", Font.BOLD,22));
        personalDetail.setBounds(290,60,400,30);
        add(personalDetail);

        JLabel name = new JLabel( "Name:");
        name.setFont(new Font("Raleway", Font.BOLD,20));
        name.setBounds(100,100,100,30);
        add(name);

        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        nameTextField.setBounds(300,100,400,30);
        add(nameTextField);

        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD,20));
        fname.setBounds(100,140,200,30);
        add(fname);

        fatherTextField = new JTextField();
        fatherTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        fatherTextField.setBounds(300,140,400,30);
        add(fatherTextField);

        JLabel DOB = new JLabel("Date of Birth:");
        DOB.setFont(new Font("Raleway", Font.BOLD,20));
        DOB.setBounds(100,180,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(300,180,400,30);
        dateChooser.setForeground(new Color(105,105,105));
        add(dateChooser);

        JLabel gender = new JLabel("Gender");
        gender.setFont(new Font("Raleway", Font.BOLD,20));
        gender.setBounds(100,220,200,30);
        add(gender);

        male = new JRadioButton("Married");
        male.setBounds(300,300,90,30);
        add(male);

        female= new JRadioButton("Unmarried");
        female.setBounds(450,300,90,30);
        add(female);

        JLabel Email= new JLabel("Email Address:");
        Email.setFont(new Font("Raleway", Font.BOLD,20));
        Email.setBounds(100,260,200,30);
        add(Email);

        EmailTextField = new JTextField();
        EmailTextField.setFont(new Font("Raleway",Font.BOLD, 14));
        EmailTextField.setBounds(300,260,400,30);
        add(EmailTextField);

        JLabel maritalStatus = new JLabel("Marital status");
        maritalStatus.setFont(new Font("Raleway", Font.BOLD,20));
        maritalStatus.setBounds(100,300,200,30);
        add(maritalStatus);

        married = new JRadioButton("Male");
        married.setBounds(300,220,90,30);
        add(married);

        unmarried= new JRadioButton("Female");
        unmarried.setBounds(450,220,90,30);
        add(unmarried);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD,20));
        address.setBounds(100,340,200,30);
        add(address);

        addressTextfield = new JTextField();
        addressTextfield.setFont(new Font("Raleway",Font.BOLD, 14));
        addressTextfield.setBounds(300,340,400,30);
        add(addressTextfield);

        JLabel city = new JLabel("City: ");
        city.setFont(new Font("Raleway", Font.BOLD,20));
        city.setBounds(100,380,200,30);
        add(city);

        JLabel State = new JLabel("State:");
        State.setFont(new Font("Raleway", Font.BOLD,20));
        State.setBounds(100,420,200,30);
        add(State);

        stateTextfield  = new JTextField();
        stateTextfield.setFont(new Font("Raleway",Font.BOLD, 14));
        stateTextfield.setBounds(300,420,400,30);
        add(stateTextfield);

        cityTextfield = new JTextField();
        cityTextfield.setFont(new Font("Raleway",Font.BOLD, 14));
        cityTextfield.setBounds(300,380,400,30);
        add(cityTextfield);

        JLabel pincode = new JLabel("Pincode");
        pincode.setFont(new Font("Raleway", Font.BOLD,20));
        pincode.setBounds(100,460,200,30);
        add(pincode);

        pinTextfield  = new JTextField();
        pinTextfield.setFont(new Font("Raleway",Font.BOLD, 14));
        pinTextfield.setBounds(300,460,400,30);
        add(pinTextfield);

        next = new JButton("Next");
        next.setBackground(Color.black);
        next.setForeground(Color.white);
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBounds(300,500,90,30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.lightGray);
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent ae){
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fatherTextField.getName();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null ;
        if (male.isSelected()) {
            gender = "Male";
        }else if (female.isSelected()){
            gender = "female";
        }
        String email = EmailTextField.getText();
        String marital = null;
        if (married.isSelected()){
            marital= "Married";
        } else if (unmarried.isSelected()){
            marital = " unmarried ";
        }
        String address = addressTextfield.getText();
        String city = cityTextfield.getText();
        String state = stateTextfield.getText();
        String pin = pinTextfield.getText();

        try {
            if (name.equals("")){
                JOptionPane.showMessageDialog( null, "Name is Required");
            } else {
                Conn c = new Conn();
                String query = "insert into signup values ('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pin+"','"+state+"')";
                c.s.executeUpdate(query);
                setVisible(false);
                new SignupTwo(formno).setVisible(true);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
            public static void main(String[] args) {
        new SignupOne();
    }
}
