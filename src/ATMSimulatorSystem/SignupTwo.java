package ATMSimulatorSystem;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.time.Year;

public class SignupTwo extends JFrame implements ActionListener {

    JTextField panTextField, aadharTextField;
    JRadioButton yes,no,Yes,No;
    JComboBox religionBox,categoryBox,incomeBox,educationBox,occupationBox;
    JButton next;
    SignupTwo(){

        setLayout(null);


        JLabel additionalDetails=new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway",Font.BOLD,38));
        additionalDetails.setBounds(140,20,600,40);
        add(additionalDetails);

//        JLabel personDetails=new JLabel("Page 1: Personal Details");
//        personDetails.setFont(new Font("Raleway",Font.BOLD,22));
//        personDetails.setBounds(290,80,400,30);
//        add(personDetails);

        JLabel religion=new JLabel("Religion:");
        religion.setFont(new Font("Raleway",Font.BOLD,22));
        religion.setBounds(100,140,100,30);
        add(religion);

        String[]r={"Hindu","Muslim","Christian","Sikh","Others"};
        religionBox=new JComboBox(r);
        religionBox.setBounds(300,140,400,30);
        religionBox.setBackground(Color.white);
        add(religionBox);

        JLabel category=new JLabel("Category:");
        category.setFont(new Font("Raleway",Font.BOLD,22));
        category.setBounds(100,190,200,30);
        add(category);

        String[]c={"General","OBC","SC","ST","Others"};
        categoryBox=new JComboBox(c);
        categoryBox.setBounds(300,190,400,30);
        categoryBox.setBackground(Color.white);
        add(categoryBox);

        JLabel income=new JLabel("Income:");
        income.setFont(new Font("Raleway",Font.BOLD,22));
        income.setBounds(100,240,200,30);
        add(income);

        String[]i={"Null","<=5LPA","5-10LPA",">10LPA"};
        incomeBox=new JComboBox(i);
        incomeBox.setBounds(300,240,400,30);
        incomeBox.setBackground(Color.white);
        add(incomeBox);

        JLabel edu=new JLabel("Educational");
        edu.setFont(new Font("Raleway",Font.BOLD,22));
        edu.setBounds(100,290,200,30);
        add(edu);



        JLabel qualification=new JLabel("Qualification:");
        qualification.setFont(new Font("Raleway",Font.BOLD,22));
        qualification.setBounds(100,320,200,30);
        add(qualification);

        String[]e={"Less than 10th","Upto 10th","Upto 12th","Graduate","Post-Graduate","Doctorate"};
        educationBox=new JComboBox(e);
        educationBox.setBounds(300,290,400,60);
        educationBox.setBackground(Color.white);
        add(educationBox);

        JLabel occupation=new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway",Font.BOLD,22));
        occupation.setBounds(100,370,200,30);
        add(occupation);

        String[]o={"Student","Self-Employed","Business","Salaried","Retired","Others"};
        occupationBox=new JComboBox(o);
        occupationBox.setBounds(300,370,400,30);
        occupationBox.setBackground(Color.white);
        add(occupationBox);

        JLabel pan=new JLabel("PAN Number:");
        pan.setFont(new Font("Raleway",Font.BOLD,22));
        pan.setBounds(100,420,200,30);
        add(pan);

        panTextField =new JTextField();
        panTextField.setFont(new Font("Raleway",Font.BOLD,20));
        panTextField.setBounds(300,420,400,30);
        add(panTextField);

        JLabel aadhar=new JLabel("Aadhar Number:");
        aadhar.setFont(new Font("Raleway",Font.BOLD,22));
        aadhar.setBounds(100,470,200,30);
        add(aadhar);

        aadharTextField =new JTextField();
        aadharTextField.setFont(new Font("Raleway",Font.BOLD,20));
        aadharTextField.setBounds(300,470,400,30);
        add(aadharTextField);

        JLabel senior=new JLabel("Senior Citizen:");
        senior.setFont(new Font("Raleway",Font.BOLD,22));
        senior.setBounds(100,520,200,30);
        add(senior);

        yes =new JRadioButton("Yes");
        yes.setBounds(300,520,100,30);
        yes.setBackground(Color.white);
        add(yes);

        no =new JRadioButton("No");
        no.setBounds(430,520,100,30);
        no.setBackground(Color.white);
        add(no);

        ButtonGroup seniorGroup=new ButtonGroup();
        seniorGroup.add(yes);
        seniorGroup.add(no);

        JLabel existingAccount=new JLabel("Existing Account:");
        existingAccount.setFont(new Font("Raleway",Font.BOLD,22));
        existingAccount.setBounds(100,570,200,30);
        add(existingAccount);

        Yes =new JRadioButton("Yes");
        Yes .setBounds(300,570,100,30);
        Yes .setBackground(Color.white);
        add(Yes );

        No=new JRadioButton("No");
        No.setBounds(430,570,100,30);
        No.setBackground(Color.white);
        add(No);

        ButtonGroup genderGroup=new ButtonGroup();
        genderGroup.add(Yes );
        genderGroup.add(No);

        next=new JButton("Next");
        next.setBounds(600,640,100,30);
        next.setFont(new Font("Raleway",Font.BOLD,14));
        next.setForeground(Color.white);
        next.setBackground(Color.black);
        next.addActionListener(this);
        add(next);



        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
        getContentPane().setBackground(Color.white);

    }
    @Override
    public void actionPerformed(ActionEvent ae){
        String religionString =(String)religionBox.getSelectedItem();
        String categoryString =(String)categoryBox.getSelectedItem();
        String incomeString =(String)incomeBox.getSelectedItem();
        String educationString =(String)educationBox.getSelectedItem();
        String occupationString =(String)occupationBox.getSelectedItem();
        String panString= panTextField.getText();
        String aadharString= aadharTextField.getText();
        String seniorString=null;
        if(yes.isSelected()){
            seniorString="Yes";
        }
        else if(no.isSelected()){
            seniorString="No";
        }
        String existingAccountString=null;
        if(Yes.isSelected()){
            existingAccountString="Yes";
        }
        else if(No.isSelected()){
            existingAccountString="No";
        }


    }

    public static void main(String[] args) {
        new SignupTwo();
    }

}

