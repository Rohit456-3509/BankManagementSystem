
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BalanceEnquiry extends JFrame implements ActionListener{
    String Pin;
    JButton back;
BalanceEnquiry(String pinchange ){
    setLayout(null);
    this.Pin=Pin;
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image i2=i1.getImage().getScaledInstance(800, 740, Image.SCALE_DEFAULT );
    ImageIcon i3=new ImageIcon(i2);
    JLabel Image= new JLabel(i3);
    Image.setBounds(0, 0, 800, 740);
    add(Image );
    
     back =new JButton("Back");
     back.setBounds(340, 430, 120, 25);
     Image.add(back);
     back.addActionListener(this);
    
    Connect c=new Connect ();
     int balance=0;
           try{
               ResultSet rs=c.s.executeQuery("select * from bank where pin ='"+Pin+"'");
              
               while(rs.next()){
                   if(rs.getString("type").equals("Deposit")){
                       balance +=Integer.parseInt(rs.getString("amount"));
                   }else{
                       balance -=Integer.parseInt(rs.getString("amount"));
                   }
               }
           }catch(Exception e){
               System.out.println(e);
           }
           
           JLabel text =new JLabel("Your Current Account Balance is Rs " +balance);
           text.setForeground(Color.WHITE);
           text.setBounds(160, 250, 600, 30);
           Image.add(text);
    
    setSize(800,740);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
}
public void actionPerformed(ActionEvent ae){
    setVisible(false);
    new  Transaction(Pin).setVisible(true);
}
   
    public static void main(String[] args) {
       new BalanceEnquiry("");
    }
    
}
