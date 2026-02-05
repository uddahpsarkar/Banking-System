package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author uddhap
 */
public class SignupTwo extends JFrame implements ActionListener{
    
    JTextField pan, aadhar;
    JRadioButton  syes, sno, eyes, eno;
    JButton next;
    JComboBox religion, category, occupation, education, income;
    String formno;
    
    SignupTwo(String formno){
        this.formno = formno;
        
        setLayout(null);
        
        setTitle("new account application form page 2");
 
        
        JLabel additinalDelails = new JLabel("Page 2: Additional Details");
        additinalDelails.setFont(new Font("Raleway",Font.BOLD,22));
        additinalDelails.setBounds(290,80,400,30);
        add(additinalDelails);
        
        JLabel name = new JLabel("Religion: ");
        name.setFont(new Font("Raleway",Font.BOLD,20));
        name.setBounds(100,140,100,30);
        add(name);
        
        String vaiReligion[] = {"Hindu","Muslim","Sikh","Cristian"};
        religion = new JComboBox(vaiReligion);
        religion.setBounds(300,140,400,30);
        religion.setBackground(Color.WHITE);
        add(religion);
       
        
        JLabel lcategory = new JLabel("Category: ");
        lcategory.setFont(new Font("Raleway",Font.BOLD,20));
        lcategory.setBounds(100,190,200,30);
        add(lcategory);
        
            String valCategory[] = {"General","OBC", "SC", "ST", "OTHER"};
            category = new JComboBox(valCategory);
            category.setBounds(300,190,400,30);
            category.setBackground(Color.WHITE);
            add(category);
        
        JLabel lincom = new JLabel("Income: ");
        lincom.setFont(new Font("Raleway",Font.BOLD,20));
        lincom.setBounds(100,240,200,30);
        add(lincom);
        
            String incomeCategory[] = {"Null","<1,50,000", "< 2,50,000", "< 5,00,000", "up to 10,00,0000"};
            income = new JComboBox(incomeCategory);
            income.setBounds(300,240,400,30);
            income.setBackground(Color.WHITE);
            add(income);
        
        JLabel leducation = new JLabel("Education");
        leducation.setFont(new Font("Raleway",Font.BOLD,20));
        leducation.setBounds(100,290,200,30);
        add(leducation);
        
        JLabel lqualifaction = new JLabel("qualification: ");
        lqualifaction.setFont(new Font("Raleway",Font.BOLD,20));
        lqualifaction.setBounds(100,315,200,30);
        add(lqualifaction);
        
            String educationValue[] = {"Non-Graduation","Graduation", "post-Graduation", "Doctrate", "other"};
            education = new JComboBox(educationValue);
            education.setBounds(300,315,400,30);
            education.setBackground(Color.WHITE);
            add(education);
        
        JLabel loccupation = new JLabel("Occupation: ");
        loccupation.setFont(new Font("Raleway",Font.BOLD,20));
        loccupation.setBounds(100,390,200,30);
        add(loccupation);
        
            String occupationValue[] = {"Salaried","Self-employ", "Business", "Student","Retired", "other"};
            occupation = new JComboBox(occupationValue);
            occupation.setBounds(300,390,400,30);
            occupation.setBackground(Color.WHITE);
            add(occupation);
            
//           
        
        JLabel lpan = new JLabel("PAN Number: ");
        lpan.setFont(new Font("Raleway",Font.BOLD,20));
        lpan.setBounds(100,440,200,30);
        add(lpan);
        
            pan = new JTextField();
            pan.setFont(new Font("Raileway", Font.BOLD,14));
            pan.setBounds(300,440,400,30);
            add(pan);
        
        JLabel laadhr = new JLabel("Aadhar No: ");
        laadhr.setFont(new Font("Raleway",Font.BOLD,20));
        laadhr.setBounds(100,490,200,30);
        add(laadhr);
        
            aadhar = new JTextField();
            aadhar.setFont(new Font("Raileway", Font.BOLD,14));
            aadhar.setBounds(300,490,400,30);
            add(aadhar);
        
        JLabel state = new JLabel("Senior citizen: ");
        state.setFont(new Font("Raleway",Font.BOLD,20));
        state.setBounds(100,540,200,30);
        add(state);
        
            syes = new JRadioButton("YES");
            syes.setBounds(300,540,100,30);
            syes.setBackground(Color.WHITE);
            add(syes);
            
            sno = new JRadioButton("NO");
            sno.setBounds(450,540,100,30);
            sno.setBackground(Color.WHITE);
            add(sno);
           
            
            ButtonGroup maritalgroup = new ButtonGroup();
            maritalgroup.add(syes);
            maritalgroup.add(sno);
 
        
        JLabel pincode = new JLabel("Existing Account: ");
        pincode.setFont(new Font("Raleway",Font.BOLD,20));
        pincode.setBounds(100,590,200,30);
        add(pincode);
        
           eyes = new JRadioButton("YES");
            eyes.setBounds(300,590,100,30);
            eyes.setBackground(Color.WHITE);
            add(eyes);
            
            eno = new JRadioButton("NO");
            eno.setBounds(450,590,100,30);
            eno.setBackground(Color.WHITE);
            add(eno);
           
            
            ButtonGroup emaritalgroup = new ButtonGroup();
            emaritalgroup.add(syes);
            emaritalgroup.add(sno);
        
            
        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD,14));
        next.setBounds(620,660,80,30);
        next.addActionListener(this);
        add(next);
            
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
//        String formno = "" + random;// if u adda "" infront of int then it eill convert in string
        String sreligin = (String) religion.getSelectedItem();
        String scategory = (String) category.getSelectedItem();
        String sincome = (String) income.getSelectedItem();
        String seducation = (String) education.getSelectedItem();
        String soccupation = (String) occupation.getSelectedItem();
        String seniorcitizen = null;
        if(syes.isSelected()){
            seniorcitizen = "YES";
        }else if(sno.isSelected()){
            seniorcitizen = "NO";
        }
        
         String existingaccount = null;
        if(eyes.isSelected()){
            existingaccount = "YES";
        }else if(eno.isSelected()){
            existingaccount =  "NO";
        }
        
        String span = pan.getText();
        String saadhar = aadhar.getText();
        
        try{
                Conn c = new Conn();
                String query = "insert into signupTwo values('"+formno+"', '"+sreligin+"', '"+scategory+"', '"+sincome+"', '"+seducation+"', '"+soccupation+"', '"+seniorcitizen+"', '"+existingaccount+"', '"+span+"','"+saadhar+"')";
                c.s.executeUpdate(query);
         
                setVisible(false);
                new SignupThree(formno).setVisible(true);
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    
    public static void main(String args[]){
        new SignupTwo("");
    }
}
