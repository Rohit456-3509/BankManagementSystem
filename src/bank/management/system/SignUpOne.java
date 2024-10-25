
package bank.management.system;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

import com.toedter.calendar.JDateChooser;
public class SignUpOne extends JFrame implements ActionListener{
JTextField NT ,FT ,EMT ,ADT , CTY,ST,PIT;
    JDateChooser DB;
    JRadioButton M,F,Ma,Un;
    JButton nex;
    long random;
    SignUpOne(){
        setLayout(null);
        
        
        
        Random R1 = new Random ();
         random =Math.abs(R1.nextLong()%9000L + 1000L);
        
        JLabel form = new JLabel ("APPLICATION FORM  NO : " +random );
        form.setFont (new Font("Raleway",Font.BOLD,38));
        form.setBounds(140, 20, 600, 40);
        add(form);

        JLabel Detail = new JLabel ("PAGE 1  : PERSONAL DEATAILS  ");
        Detail.setFont (new Font("Raleway",Font.BOLD,22));
        Detail.setBounds(210, 80, 380, 30);
        add(Detail);

       JLabel name = new JLabel ("NAME :");
        name.setFont (new Font("Raleway",Font.BOLD,20));
       name.setBounds(100, 140, 100, 30);
        add(name);
        
         NT =new JTextField();
        NT.setFont (new Font("Raleway",Font.BOLD,14));
        NT.setBounds(400, 140, 400, 30);
        add(NT);
        
        FT =new JTextField();
        FT.setFont (new Font("Raleway",Font.BOLD,14));
        FT.setBounds(400, 190, 400, 30);
        add(FT);
        
        EMT =new JTextField();
        EMT.setFont (new Font("Raleway",Font.BOLD,14));
        EMT.setBounds(400, 340, 400, 30);
        add(EMT);
        
        ADT =new JTextField();
        ADT.setFont (new Font("Raleway",Font.BOLD,14));
        ADT.setBounds(400, 440, 400, 30);
        add(ADT);
        
        CTY =new JTextField();
        CTY.setFont (new Font("Raleway",Font.BOLD,14));
        CTY.setBounds(400, 490, 400, 30);
        add(CTY);
        
        ST =new JTextField();
        ST.setFont (new Font("Raleway",Font.BOLD,14));
        ST.setBounds(400, 540, 400, 30);
        add(ST);
        
        PIT =new JTextField();
        PIT.setFont (new Font("Raleway",Font.BOLD,14));
        PIT.setBounds(400, 590, 400, 30);
        add(PIT);
        
        DB =new JDateChooser();
        DB.setFont (new Font("Raleway",Font.BOLD,14));
        DB.setBounds(400, 240, 400, 30);
        DB.setForeground(Color.BLACK);
        add(DB);
        
        M =new JRadioButton("Male");
        M.setFont (new Font("Raleway",Font.BOLD,14));
       M.setBounds(400, 290, 100, 30);
        M.setForeground(Color.BLACK);
        M.setBackground(Color.WHITE);
        add(M);
        
         F =new JRadioButton("Female");
        F.setFont (new Font("Raleway",Font.BOLD,14));
       F.setBounds(550, 290, 100, 30);
        F.setForeground(Color.BLACK);
        F.setBackground(Color.WHITE);
        add(F);
        
        Ma =new JRadioButton("Married");
        Ma.setFont (new Font("Raleway",Font.BOLD,14));
       Ma.setBounds(400, 390, 120, 30);
        Ma.setForeground(Color.BLACK);
        Ma.setBackground(Color.WHITE);
        add(Ma);
        
         Un =new JRadioButton("Unmarried ");
        Un.setFont (new Font("Raleway",Font.BOLD,14));
       Un.setBounds(550, 390, 140, 30);
        Un.setForeground(Color.BLACK);
        Un.setBackground(Color.WHITE);
        add(Un);
        
     ButtonGroup   gendergroup= new ButtonGroup();
        gendergroup.add(M);
        gendergroup.add(F);
         ButtonGroup   maritalgroup= new ButtonGroup();
        maritalgroup.add(Ma);
       maritalgroup.add(Un);
        JLabel Fnam = new JLabel ("FATHER'S NAME :");
        Fnam.setFont (new Font("Raleway",Font.BOLD,20));
       Fnam.setBounds(100, 190, 200, 30);
        add(Fnam);
        
        JLabel DOB = new JLabel ("DATE OF BIRTH :");
        DOB.setFont (new Font("Raleway",Font.BOLD,20));
       DOB.setBounds(100, 240, 200, 30);
        add(DOB);
        
         JLabel gen = new JLabel ("GENDER:");
        gen.setFont (new Font("Raleway",Font.BOLD,20));
       gen.setBounds(100, 290, 200, 30);
        add(gen);
        
   
         JLabel EMAIL = new JLabel ("EMAIL ID:");
        EMAIL.setFont (new Font("Raleway",Font.BOLD,20));
       EMAIL.setBounds(100, 340, 200, 30);
        add(EMAIL);
        
         JLabel MS = new JLabel ("MARITAL STATUS :");
        MS.setFont (new Font("Raleway",Font.BOLD,20));
       MS.setBounds(100, 390, 200, 30);
        add(MS);
        
         JLabel AD = new JLabel ("ADDRESS :");
        AD.setFont (new Font("Raleway",Font.BOLD,20));
       AD.setBounds(100, 440, 200, 30);
        add(AD);
        
         JLabel CIT = new JLabel ("CITY :");
        CIT.setFont (new Font("Raleway",Font.BOLD,20));
       CIT.setBounds(100, 490, 200, 30);
        add(CIT);
        
         JLabel STA = new JLabel ("STATE :");
        STA.setFont (new Font("Raleway",Font.BOLD,20));
       STA.setBounds(100, 540, 200, 30);
        add(STA);
        
        JLabel PCOD = new JLabel ("PIN CODE :");
        PCOD.setFont (new Font("Raleway",Font.BOLD,20));
       PCOD.setBounds(100, 590, 200, 30);
        add(PCOD); 
        
        
       nex =new JButton("Next Page");
    nex.setBounds(680,640,120,30);
    nex.setBackground(Color.BLACK);
    nex.setForeground(Color.WHITE);
     nex.setFont (new Font("Raleway",Font.BOLD,14));
    nex.addActionListener(this);
    add(nex);
        
        getContentPane().setBackground(Color.PINK  );
        setSize(850,800);
        setLocation(300,10);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
    String form=""+random;
    String name =NT.getText();
    String fnam=FT.getText();
    String DOB=((JTextField)DB.getDateEditor().getUiComponent()).getText();
    String gen=null;
    if(M.isSelected()){
        gen="Male";
    }else if(F.isSelected()){
        gen="Female";
    }
    String EMAIL=EMT.getText();
    String MS=null;
    if(Ma.isSelected()){
        MS="Married";
    }else if(Un.isSelected()){
        MS="Unmarried";
    }
    String AD=ADT.getText();
    String CIT=CTY.getText();
    String STA=ST.getText();
    String PCOD=PIT.getText();
    
    
    
try{
    if(name.equals("")){
          JOptionPane.showMessageDialog(null, "Please Enter a Valid details "); 
    }  
    
    else if(fnam.equals("")){
          JOptionPane.showMessageDialog(null, "Please Enter a Valid details "); 
    } 
     
    else if(DOB.equals("")){
          JOptionPane.showMessageDialog(null, "Please Enter a Valid details "); 
    } 
     
    else if(EMAIL.equals("")){
          JOptionPane.showMessageDialog(null, "Please Enter a Valid details "); 
    } 
     
    else if(MS.equals("")){
          JOptionPane.showMessageDialog(null, "Please Enter a Valid details "); 
    } 
     
    else if(CIT.equals("")){
          JOptionPane.showMessageDialog(null, "Please Enter a Valid details "); 
    } 
     
     else if(ST.equals("")){
          JOptionPane.showMessageDialog(null, "Please Enter a Valid details "); 
    } 
     
    else if(PCOD.equals("")){
          JOptionPane.showMessageDialog(null, "Please Enter a Valid details "); 
    } 
    else{
        Connect c = new Connect();
        String query ="insert into signup values('"+form+"','"+name+"','"+fnam+"','"+DOB+"','"+gen+"','"+EMAIL+"','"+MS+"','"+AD+"','"+CIT+"','"+STA+"','"+PCOD+"')";
        
        c.s.executeUpdate(query);
        setVisible(false);
       new SignUpTwo(form).setVisible(true);
    }
} catch(Exception e){
    System .out.println(e);
}
     
}
    public static void main(String[] args) {
        new SignUpOne();
    }
    
}
