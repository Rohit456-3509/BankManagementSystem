
package bank.management.system;

import java.awt.*;
import java.sql.*;
import java.awt.event.*;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.Date;

public class Fastcash extends JFrame implements ActionListener{
JButton hundred, five,thousand,twothousand,fivethousand,tenthousand,exist;
String Pin;

   Fastcash(String Pin){
    this.Pin=Pin;
       setLayout(null);
       setSize(800,750);
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image i2=i1.getImage().getScaledInstance(800, 700, Image.SCALE_DEFAULT );
    ImageIcon i3=new ImageIcon(i2);
    JLabel Image= new JLabel(i3);
    Image.setBounds(0, 0, 800, 740);
    add(Image );
        
    JLabel text =new JLabel("Select Withdrawl amount : ");
    text.setBounds(200, 255, 600, 35);
     text.setFont (new Font("Raleway",Font.BOLD,15));
    text.setForeground(Color.WHITE);
    Image.add(text);
    
    hundred=new JButton("Rs 100");
    hundred.setBounds(160,345,120,22);
   hundred.setFont (new Font("Raleway",Font.BOLD,12));
    //deposit.setForeground(Color.WHITE);
    hundred.addActionListener(this);
    Image.add(hundred);
    
   five=new JButton("Rs 500");
     five.setBounds(330,345,120,22);
     five.setFont (new Font("Raleway",Font.BOLD,12));
    //deposit.setForeground(Color.WHITE);
     five.addActionListener(this);
    Image.add( five);
    
    thousand=new JButton("Rs 1000");
    thousand.setBounds(160,370,120,22);
   thousand.setFont (new Font("Raleway",Font.BOLD,12));
    //deposit.setForeground(Color.WHITE);
    thousand.addActionListener(this);
    Image.add(thousand);
    
    twothousand=new JButton("Rs 2000");
   twothousand.setBounds(330,370,120,22);
    twothousand.setFont (new Font("Raleway",Font.BOLD,12));
    //deposit.setForeground(Color.WHITE);
    twothousand.addActionListener(this);
    Image.add(twothousand);
    
    fivethousand=new JButton("Rs 5000");
    fivethousand.setBounds(160,395,120,22);
    fivethousand.setFont (new Font("Raleway",Font.BOLD,12));
    //deposit.setForeground(Color.WHITE);
    fivethousand.addActionListener(this);
    Image.add(fivethousand);
    
     tenthousand =new JButton("Rs 10000");
    tenthousand.setBounds(330,395,120,22);
    tenthousand.setFont (new Font("Raleway",Font.BOLD,12));
    //deposit.setForeground(Color.WHITE);
    tenthousand.addActionListener(this);
    Image.add(tenthousand);
    
    exist=new JButton("Back");
    exist.setBounds(330,420,120,22);
    exist.setFont (new Font("Raleway",Font.BOLD,12));
    //deposit.setForeground(Color.WHITE);
    exist.addActionListener(this);
    Image.add(exist);
    
    

    
        setSize(800,740);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
       getContentPane().setBackground(Color.WHITE);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==exist){
            setVisible(false);
            new Transaction(Pin).setVisible(true);
        }
        else{
           String amount =((JButton)ae.getSource()).getText().substring(3);
           Connect c=new Connect ();
           try{
               ResultSet rs=c.s.executeQuery("select * from bank where pin ='"+Pin+"'");
               int balance=0;
               while(rs.next()){
                   if(rs.getString("type").equals("Deposit")){
                       balance +=Integer.parseInt(rs.getString("amount"));
                   }else{
                       balance -=Integer.parseInt(rs.getString("amount"));
                   }
               }
               if(ae.getSource()!=exist && balance < Integer.parseInt(amount)){
                   JOptionPane.showMessageDialog(null, "Insufficient Balance ");
                   return;
               }
               
          Date date =new Date();
               String query ="insert into bank values ('"+Pin+"','"+date+"','withdrawa','"+amount+"')";
               c.s.executeUpdate(query);
               JOptionPane.showMessageDialog(null, "Rs " + amount + "   Debited   Successfully ");
               setVisible(false);
            new Transaction(Pin).setVisible(true);
           }catch(Exception e){
               System.out.println(e);
           }
        }
    }
   
    public static void main(String[] args) {
        new Fastcash("");
    }
    
}
