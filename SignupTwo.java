import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

    public class SignupTwo extends JFrame implements ActionListener {

//        private final String formno;
//        long random;
        JTextField pan,aadhar;
        String formno;
        JRadioButton syes,sno ,eyes,eno;
        JButton next;
        JComboBox religion ,cateogory, income, education,occupation;

        SignupTwo(String formno){
            this.formno = formno;
            setLayout(null);

            setTitle("NEW ACCOUNT APPLICATION FORM - PAGE  2");

            JLabel additionalDetail = new JLabel("Page 2:" + " Additional Detail");
            additionalDetail.setFont(new Font("Raleway", Font.BOLD,22));
            additionalDetail.setBounds(290,60,400,30);
            add(additionalDetail);

            JLabel name = new JLabel( "Religion:");
            name.setFont(new Font("Raleway", Font.BOLD,20));
            name.setBounds(100,100,100,30);
            add(name);

            String valReligion [] = {"Hindu","Muslim","Sikh","Christian","Other"};
            religion = new JComboBox(valReligion);
            religion.setBounds(300,100,400,30);
            religion.setBackground(Color.white);
            add(religion);

            JLabel Cateogary = new JLabel("Cateogary:");
            Cateogary.setFont(new Font("Raleway", Font.BOLD,20));
            Cateogary.setBounds(100,140,200,30);
            add(Cateogary);

            String valCateogory [] = {"General","OBC", "SC","ST","Other "};
            cateogory =new JComboBox(valCateogory);
            cateogory.setBounds(300,140,400,30);
            cateogory.setBackground(Color.white);
            add(cateogory);

            JLabel DOB = new JLabel("Income:");
            DOB.setFont(new Font("Raleway", Font.BOLD,20));
            DOB.setBounds(100,180,200,30);
            add(DOB);

            String incomecateogory[] = {"null ","< 1 lakh", "< 2 lakh","< 5 lakh","< 10 lakh"};
            income=new JComboBox(incomecateogory);
            income.setBounds(300,180,400,30);
            income.setBackground(Color.white);
            add(income);

//            dateChooser = new JDateChooser();
//            dateChooser.setBounds(300,180,400,30);
//            dateChooser.setForeground(new Color(105,105,105));
//            add(dateChooser);

            JLabel gender = new JLabel("Educational:");
            gender.setFont(new Font("Raleway", Font.BOLD,20));
            gender.setBounds(100,220,200,30);
            add(gender);

            JLabel Email= new JLabel("Qualification:");
            Email.setFont(new Font("Raleway", Font.BOLD,20));
            Email.setBounds(100,240,200,30);
            add(Email);

            String educationValue[] = {"Non-Graduation","Graduate", "Post-Graduation","Doctorate","Other"};
            education =new JComboBox(educationValue);
            education.setBounds(300,230,400,30);
            education.setBackground(Color.white);
            add(education);

            JLabel maritalStatus = new JLabel("Occupation:");
            maritalStatus.setFont(new Font("Raleway", Font.BOLD,20));
            maritalStatus.setBounds(100,300,200,30);
            add(maritalStatus);

            String occuptionalValues[] = {"Salaried","Self Emoployed","Student","Business","Retired","Other"};
            occupation =new JComboBox(occuptionalValues);
            occupation.setBounds(300,300,400,30);
            occupation.setBackground(Color.white);
            add(occupation);

            JLabel address = new JLabel("Pan number");
            address.setFont(new Font("Raleway", Font.BOLD,20));
            address.setBounds(100,340,200,30);
            add(address);

            pan = new JTextField();
            pan.setFont(new Font("Raleway",Font.BOLD, 14));
            pan.setBounds(300,380,400,30);
            add(pan);

            JLabel city = new JLabel("Aadhaar number ");
            city.setFont(new Font("Raleway", Font.BOLD,20));
            city.setBounds(100,380,200,30);
            add(city);

            aadhar = new JTextField();
            aadhar.setFont(new Font("Raleway",Font.BOLD,14));
            aadhar.setBounds(300,340,400,30);
            add(aadhar);

            JLabel State = new JLabel("Senior Citizen:");
            State.setFont(new Font("Raleway", Font.BOLD,20));
            State.setBounds(100,420,200,30);
            add(State);

            syes = new JRadioButton("yes");
            syes.setBounds(300,460,90,30);
            syes.setBackground(Color.white);
            add(syes);

            sno = new JRadioButton("No");
            sno.setBounds(450,460,90,30);
            sno.setBackground(Color.white);
            add(sno);

            ButtonGroup maritialGroup = new ButtonGroup();
            maritialGroup.add(syes);
            maritialGroup.add(sno);


            JLabel pincode = new JLabel("Existing account");
            pincode.setFont(new Font("Raleway", Font.BOLD,20));
            pincode.setBounds(100,460,200,30);
            add(pincode);

            eyes = new JRadioButton("yes");
            eyes.setBounds(300,420,90,30);
            eyes.setBackground(Color.white);
            add(eyes);

            eno = new JRadioButton("No");
            eno.setBounds(450,420,90,30);
            eno.setBackground(Color.white);
            add(eno);

            ButtonGroup emaritialGroup = new ButtonGroup();
            emaritialGroup.add(eyes);
            emaritialGroup.add(eno);

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
//            pinTextfield  = new JTextField();
//            pinTextfield.setFont(new Font("Raleway",Font.BOLD, 14));
//            pinTextfield.setBounds(300,460,400,30);
//            add(pinTextfield);

//            stateTextfield  = new JTextField();
//            stateTextfield.setFont(new Font("Raleway",Font.BOLD, 14));
//            stateTextfield.setBounds(300,420,400,30);
//            add(stateTextfield);

        public void actionPerformed(ActionEvent ae){
            String sreligion = (String) religion.getSelectedItem();
            String scateogory = (String) cateogory.getSelectedItem();
            String sincome = (String) income.getSelectedItem();
            String seducation = (String) education.getSelectedItem();
            String soccupation =(String)occupation.getSelectedItem();
            String seniorcitizen = null;

            if (syes.isSelected()) {
                seniorcitizen = "yes";
            }else if (sno.isSelected()){
                seniorcitizen = "no";
            }

            String existingaccount  = null;
            if (eyes.isSelected()){
                existingaccount= "yes";
            } else if (eno.isSelected()){
                existingaccount = "no";
            }
            String span = pan.getText();
            String saadhar = aadhar.getText();

            try {
                    Conn c = new Conn();
                    String query = "insert into signuptwo values ('"+formno+"','"+sreligion+"','"+scateogory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+saadhar+"','"+seniorcitizen+"','"+existingaccount+"')";
                    c.s.executeUpdate(query);
                    //Signup3 object
                setVisible(false);
                new SignupThree(formno).setVisible(true);
            } catch (Exception e){
                System.out.println(e);
            }
        }
        public static void main(String[] args) {
            new SignupTwo("");
        }
    }
