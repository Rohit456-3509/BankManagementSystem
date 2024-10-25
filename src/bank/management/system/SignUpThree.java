
package bank.management.system;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
public class SignUpThree extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton b1,b2;
    String form;
    SignUpThree(String form){
        this.form=form;
        setLayout(null);
        
        setTitle("NEW ACCOUNT APPLICATION FORM : PAGE 3");
        
    JLabel AC = new JLabel ("PAGE 3: ACCOUNT  DETAILS   ");
        AC.setFont (new Font("Raleway",Font.BOLD,22));
        AC.setBounds(280, 20, 250, 40);
        add(AC);
        
        setTitle("NEW ACCOUNT APPLICATION FORM : PAGE 3");
    
    JLabel atype = new JLabel ("ACCOUNT TYPE  ");
        atype.setFont (new Font("Raleway",Font.BOLD,22));
        atype.setBounds(100, 100, 250, 30);
        add(atype);
        
        r1= new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBounds(100,150,250,20);
        r1.setBackground(Color.PINK);
        add(r1);
        
        r2= new JRadioButton("Fixed Deposit  Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBounds(350,150,250,20);
        r2.setBackground(Color.PINK);
        add(r2);
        
        r3= new JRadioButton("Current  Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBounds(100,200,250,20);
        r3.setBackground(Color.PINK);
        add(r3);
        
        r4= new JRadioButton("Recurring Deposite Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBounds(350,200,250,20);
        r4.setBackground(Color.PINK);
        
        ButtonGroup Account = new ButtonGroup();
        Account.add(r1);
        Account.add(r2);
        Account.add(r3);
        Account.add(r4);
        add(r4);
        
         JLabel card = new JLabel ("Card Number  ");
        card.setFont (new Font("Raleway",Font.BOLD,22));
        card.setBounds(100, 250, 200, 30);
        add(card);
        
         JLabel number = new JLabel ("XXXX-XXXX-XXXX-6898   ");
        number.setFont (new Font("Raleway",Font.BOLD,22));
       number.setBounds(330, 250, 500, 30);
        add(number);
        
        
        JLabel carddetail = new JLabel ("Your 16th Digits Card number   ");
        carddetail.setFont (new Font("Raleway",Font.BOLD,12));
       carddetail.setBounds(100, 280, 330, 20);
        add(carddetail);
        
        JLabel pin = new JLabel ("PIN:   ");
        pin.setFont (new Font("Raleway",Font.BOLD,22));
        pin.setBounds(100, 330, 200, 30);
        add(pin);
        
         JLabel Pnumber = new JLabel ("XXXX   ");
        Pnumber.setFont (new Font("Raleway",Font.BOLD,22));
       Pnumber.setBounds(330, 330, 330, 30);
        add(Pnumber);
        
        JLabel pindetail = new JLabel ("Your 4th Digits Password");
        pindetail.setFont (new Font("Raleway",Font.BOLD,12));
       pindetail.setBounds(100, 360, 330, 20);
        add(pindetail);
        
        JLabel services  = new JLabel ("Services Required ");
        services.setFont (new Font("Raleway",Font.BOLD,22));
       services.setBounds(100, 420, 330, 20);
        add(services);
        
        c1=new JCheckBox("ATM Card");
        c1.setBackground(Color.PINK);
         c1.setFont (new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100, 460, 200, 30);
        add(c1);
         
        c2=new JCheckBox("Internet Banking ");
        c2.setBackground(Color.PINK);
         c2.setFont (new Font("Raleway",Font.BOLD,16));
        c2.setBounds(300, 460, 200, 30);
        add(c2);
        
        c3=new JCheckBox("Mobile Banking ");
        c3.setBackground(Color.PINK);
         c3.setFont (new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100, 510, 200, 30);
        add(c3);
        
        c4=new JCheckBox("Email & Sms Alert");
        c4.setBackground(Color.PINK);
         c4.setFont (new Font("Raleway",Font.BOLD,16));
        c4.setBounds(300, 510, 200, 30);
        add(c4);
        
        c5=new JCheckBox("Cheque Book");
        c5.setBackground(Color.PINK);
         c5.setFont (new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100, 560, 200, 30);
        add(c5);
        
        c6=new JCheckBox("E Statement ");
        c6.setBackground(Color.PINK);
         c6.setFont (new Font("Raleway",Font.BOLD,16));
        c6.setBounds(300, 560, 200, 30);
        add(c6);
        
        c7=new JCheckBox("I here by declares that the above entered details are correct to the best my knowledge");
        c7.setBackground(Color.PINK);
         c7.setFont (new Font("Raleway",Font.BOLD,12));
        c7.setBounds(100, 610, 600, 30);
        add(c7);
        
        b1 =new JButton("Submit  ");
        b1.setFont (new Font("Raleway",Font.BOLD,12));
        b1.setBackground(Color.WHITE );
        b1.setForeground(Color.BLACK);
        b1.setBounds(420, 650, 100, 30);
        b1.addActionListener(this);
        add(b1);
        
         b2 =new JButton("Cancel ");
        b2.setFont (new Font("Raleway",Font.BOLD,12));
        b2.setBackground(Color.WHITE );
        b2.setForeground(Color.BLACK);
        b2.setBounds(120, 650, 100, 30);
        b2.addActionListener(this);
        add(b2);
        
        setSize(850,800);
        setLocation(300,0);
        getContentPane().setBackground(Color.PINK);
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String atype=null;
            if(r1.isSelected()){
                atype ="Saving Account ";
            }
            else if(r2.isSelected()){
                atype ="Fixed Deposit  Account";
            }
            
            else if(r3.isSelected()){
                atype ="Current  Account";
            }
            else if(r4.isSelected()){
                atype ="Recurring  Deposit Account ";
            }
            
            Random random =new Random ();
            String card = ""+ Math.abs((random.nextLong() % 900000000L)+6189217800000000L);
            String pin = ""+ Math.abs((random.nextLong() % 9000L)+1000);
           String facilities  =" " ;
           if(c1.isSelected()){
               facilities = facilities +" ATM Card ";
           }else if(c2.isSelected()){
               facilities = facilities +" Internet Banking ";
           }else if(c3.isSelected()){
               facilities = facilities +" Mobile Banking  ";
           }else if(c4.isSelected()){
               facilities = facilities +" Email & Sms ";
           }else if(c5.isSelected()){
               facilities = facilities +" Cheque Book ";
           }else if(c6.isSelected()){
               facilities = facilities +" E Statement ";
           }
           
           try{
               if(atype.equals("")){
                   JOptionPane.showMessageDialog(null,"Please Select Account Type");
               }else{
                   Connect c=new Connect ();
                   String query1 ="insert into signupthree values('"+form+"','"+atype+"','"+card+"','"+pin+"','"+facilities+"')";
        
                  String querytwo="insert into login values ('"+form+"','"+card+"','"+pin+"')";
        
                   c.s.executeUpdate(query1);
                   c.s.executeUpdate(querytwo);
                   
                   
                   JOptionPane.showMessageDialog(null, "Card Number " +card + "\n" + "Password " + pin);
                    
                   setVisible(false);
                   new Deposit (pin).setVisible(true);
               }
           }catch(Exception e){
               System.out.println(e);
           }
           
        }else if(ae.getSource()==b2){
            setVisible(false);
            
        }
    }
    public static void main(String[] args) {
       new SignUpThree("");
    }
    
}
