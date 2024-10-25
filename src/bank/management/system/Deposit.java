
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener{
    JTextField amount ;
    JButton deposit,back;
    String Pin;
Deposit(String Pin){
    this.Pin=Pin;
    setLayout(null);
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image i2=i1.getImage().getScaledInstance(800, 750, Image.SCALE_DEFAULT );
    ImageIcon i3=new ImageIcon(i2);
    JLabel Image= new JLabel(i3);
    Image.setBounds(0, 0, 800, 750);
    add(Image );
    
    JLabel text =new JLabel("Enter amount you want to deposit : ");
    text.setBounds(170, 245, 600, 22);
     text.setFont (new Font("Raleway",Font.BOLD,15));
    text.setForeground(Color.WHITE);
    Image.add(text);
    
   amount =new JTextField();
    amount.setFont (new Font("Raleway",Font.BOLD,16));
     amount.setBounds(170, 280, 280, 22);
     Image.add(amount);
     
      deposit =new JButton("Deposit");
     deposit.setBounds(340, 405, 120, 25);
     Image.add(deposit);
     deposit.addActionListener(this);
     
      back =new JButton("Back");
     back.setBounds(340, 435, 120, 25);
     Image.add(back);
     back.addActionListener(this);
    
    setSize(800,750);
    setLocation(300,0);
    setVisible(true);
    
}
public void actionPerformed(ActionEvent ae){
    if(ae.getSource()== deposit){
        String number = amount.getText();
        Date date = new Date();
        if(number.equals("")){
            JOptionPane.showMessageDialog(null, "Please Enter the amount :");
        }else{
            try{
            Connect c = new Connect ();
            String query = "insert into bank values ('"+Pin+"','"+date+"','Deposit','"+number+"')";
            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Rs " + number + "    Deposit Successfully ");
            setVisible(false);
            new Transaction(Pin).setVisible(true);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }else if(ae.getSource()==back){
        setVisible(false);
        new Transaction(Pin).setVisible(true);
    }
}
    
    public static void main(String[] args) {
        new Deposit("");
    }
    
}
