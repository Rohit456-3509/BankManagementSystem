
package bank.management.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class SignUpTwo extends JFrame implements ActionListener {
     JButton nex;
    JTextField  PN,ADH;
    JComboBox RE,CA,ED,OCC,INC;
    JRadioButton Ye,NO,Y,N;
    String form;
SignUpTwo(String form){
    this.form=form;
    setLayout(null);
    setTitle("NEW ACCOUNT APPLICATION FORM : PAGE 2");
    
    JLabel Detail = new JLabel ("PAGE 2: ADDITIONAL DETAILS   ");
        Detail.setFont (new Font("Raleway",Font.BOLD,25));
        Detail.setBounds(240, 80, 600, 40);
        add(Detail);
        
        JLabel RELI = new JLabel ("RELIGION  :");
        RELI.setFont (new Font("Raleway",Font.BOLD,20));
       RELI.setBounds(100, 140, 150, 30);
        add(RELI);
        
        JLabel CAT = new JLabel ("CATEGORY  :");
        CAT.setFont (new Font("Raleway",Font.BOLD,20));
       CAT.setBounds(100, 190, 200, 30);
        add(CAT);
        
        JLabel Inc = new JLabel ("INCOME  :");
        Inc.setFont (new Font("Raleway",Font.BOLD,20));
       Inc.setBounds(100, 240, 200, 30);
        add(Inc);
        
         JLabel EDU = new JLabel ("EDUCATION  :");
        EDU.setFont (new Font("Raleway",Font.BOLD,20));
       EDU.setBounds(100, 290, 200, 30);
        add(EDU);
        
        
         JLabel OC = new JLabel ("OCCUPATION   :");
        OC.setFont (new Font("Raleway",Font.BOLD,20));
       OC.setBounds(100, 340, 200, 30);
        add(OC);
        
         JLabel PAN = new JLabel ("PAN NUMBER  :");
        PAN.setFont (new Font("Raleway",Font.BOLD,20));
       PAN.setBounds(100, 390, 200, 30);
        add(PAN);
        
         JLabel aadhar = new JLabel ("AADHAR NUMBER   :");
       aadhar.setFont (new Font("Raleway",Font.BOLD,20));
       aadhar.setBounds(100, 440, 200, 30);
        add(aadhar);
        
         JLabel SC = new JLabel ("SENIOR CITIZENS  :");
        SC.setFont (new Font("Raleway",Font.BOLD,20));
      SC.setBounds(100, 490, 200, 30);
        add(SC);
        
         JLabel EA = new JLabel ("EXSISTING ACCOUNT  :");
       EA.setFont (new Font("Raleway",Font.BOLD,20));
       EA.setBounds(100, 540, 250, 30);
        add(EA);
        
        
        String Var_Rel[] ={"Hindu","Muslim","Sikh","Christian","Others"};
      RE =new JComboBox(Var_Rel);
        RE.setFont (new Font("Raleway",Font.BOLD,14));
        RE.setBounds(400, 140, 400, 30);
        RE.setBackground(Color.WHITE);
        add(RE);
        
        String Var_Cat[]={"SC","ST","OBC","GENERAL","OTHERS"};
        CA =new JComboBox(Var_Cat);
        CA.setFont (new Font("Raleway",Font.BOLD,14));
        CA.setBounds(400, 190, 400, 30);
        CA.setBackground(Color.WHITE);
        add(CA);
        
        String Varin[]={"Null","< 1,50,000","< 2,50,000","< 5,00000" ,"Upto 10,00,000"};
        INC =new JComboBox(Varin);
        INC.setFont (new Font("Raleway",Font.BOLD,14));
       INC.setBounds(400, 240, 400, 30);
       INC.setBackground(Color.WHITE);
        add(INC);
        
        String VarEdu[]={"NON-GRADUATE","GRADUATE ","POST-GRADUATATION","DOCTRATE","OTHERS"};
        ED =new JComboBox(VarEdu);
        ED.setFont (new Font("Raleway",Font.BOLD,14));
        ED.setBounds(400, 290, 400, 30);
       ED.setBackground(Color.WHITE);
        add(ED);
        
        String VarOC[]={"SALARIED ","SELF-EMPLOYED ","BUSSINESS","STUDENT","OTHERS"};
        OCC=new JComboBox(VarOC);
        OCC.setFont (new Font("Raleway",Font.BOLD,14));
        OCC.setBounds(400, 340, 400, 30);
       OCC.setBackground(Color.WHITE);
        add(OCC);
      
        PN =new JTextField();
        PN.setFont (new Font("Raleway",Font.BOLD,14));
        PN.setBounds(400, 390, 400, 30);
        add(PN);
        
        ADH =new JTextField();
        ADH.setFont (new Font("Raleway",Font.BOLD,14));
        ADH.setBounds(400, 440, 400, 30);
        ADH.setForeground(Color.BLACK);
        add(ADH);
        
       Ye =new JRadioButton("Yes");
        Ye.setFont (new Font("Raleway",Font.BOLD,14));
       Ye.setBounds(400, 490, 100, 30);
        Ye.setForeground(Color.BLACK);
        Ye.setBackground(Color.PINK);
        add(Ye);
        
         NO =new JRadioButton("No");
        NO.setFont (new Font("Raleway",Font.BOLD,14));
       NO.setBounds(550, 490, 100, 30);
        NO.setForeground(Color.BLACK);
        NO.setBackground(Color.PINK);
        add(NO);
        
        Y =new JRadioButton("Yes");
        Y.setFont (new Font("Raleway",Font.BOLD,14));
       Y.setBounds(400, 540, 120, 30);
        Y.setForeground(Color.BLACK);
        Y.setBackground(Color.PINK);
        add(Y);
        
         N =new JRadioButton("No ");
        N.setFont (new Font("Raleway",Font.BOLD,14));
       N.setBounds(550, 540, 140, 30);
        N.setForeground(Color.BLACK);
        N.setBackground(Color.PINK);
        add(N);
        
     ButtonGroup   senior_group= new ButtonGroup();
        senior_group.add(Ye);
        senior_group.add(NO);
         ButtonGroup   exist_group= new ButtonGroup();
        exist_group.add(Y);
       exist_group.add(N);
        
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
    String RELI =(String)RE.getSelectedItem();
    String CAT= (String)CA.getSelectedItem();
    String Inc= (String)INC.getSelectedItem();
    String SC=null;
    if(Ye.isSelected()){
        SC="Yes";
    }else if(NO.isSelected()){
        SC="No";
    }
    String EDU= (String)ED.getSelectedItem();
    String EA=null;
    if(Y.isSelected()){
        EA="Yes";
    }else if(N.isSelected()){
        EA="No";
    }
    String OC=(String)OCC.getSelectedItem();
    String PAN=PN.getText();
    String aadhar=ADH.getText();
    
    
    
try{
    if(RELI.equals("")){
          JOptionPane.showMessageDialog(null, "Please Enter a Valid details "); 
    }  
    
    else if(CAT.equals("")){
          JOptionPane.showMessageDialog(null, "Please Enter a Valid details "); 
    } 
     
    else if(Inc.equals("")){
          JOptionPane.showMessageDialog(null, "Please Enter a Valid details "); 
    } 
     
    else if(EDU.equals("")){
          JOptionPane.showMessageDialog(null, "Please Enter a Valid details "); 
    } 
       
    else if(OC.equals("")){
          JOptionPane.showMessageDialog(null, "Please Enter a Valid details "); 
    } 
     
     else if(PAN.equals("")){
          JOptionPane.showMessageDialog(null, "Please Enter a Valid details "); 
    } 
     
    else if(aadhar.equals("")){
          JOptionPane.showMessageDialog(null, "Please Enter a Valid details "); 
    } 
    else{
        Connect c = new Connect();
        String query ="insert into signuptwo values('"+form+"','"+RELI+"','"+CAT+"','"+Inc+"','"+EDU+"','"+OC+"','"+PAN+"','"+aadhar+"','"+SC+"','"+EA+"')";
        
       c.s.executeUpdate(query);
        setVisible(false);
       new SignUpThree(form).setVisible(true);
    }
} catch(Exception e){
    System .out.println(e);
}
        
    setSize(850,700);
    setLocation(300,10);
    setVisible(true);
}

   
    public static void main(String[] args) {
        new SignUpTwo("");
    }
    
}
