
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Transaction extends JFrame implements ActionListener{
JButton deposit,withdraw,fastcash,ministatement,pinchange,balanceenquiry,exist;
String Pin;
    Transaction(String Pin){
        this.Pin=Pin;
        setLayout(null);
        
       ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image i2=i1.getImage().getScaledInstance(800, 700, Image.SCALE_DEFAULT );
    ImageIcon i3=new ImageIcon(i2);
    JLabel Image= new JLabel(i3);
    Image.setBounds(0, 0, 800, 740);
    add(Image );
        
    JLabel text =new JLabel("Please Select Transaction ");
    text.setBounds(200, 255, 600, 35);
     text.setFont (new Font("Raleway",Font.BOLD,15));
    text.setForeground(Color.WHITE);
    Image.add(text);
    
    deposit=new JButton("Deposit");
    deposit.setBounds(160,345,120,22);
    deposit.setFont (new Font("Raleway",Font.BOLD,12));
    //deposit.setForeground(Color.WHITE);
    deposit.addActionListener(this);
    Image.add(deposit);
    
   withdraw=new JButton("Withdraw");
    withdraw.setBounds(330,345,120,22);
    withdraw.setFont (new Font("Raleway",Font.BOLD,12));
    //deposit.setForeground(Color.WHITE);
    withdraw.addActionListener(this);
    Image.add(withdraw);
    
    fastcash=new JButton("Fastcash");
    fastcash.setBounds(160,370,120,22);
    fastcash.setFont (new Font("Raleway",Font.BOLD,12));
    //deposit.setForeground(Color.WHITE);
    fastcash.addActionListener(this);
    Image.add(fastcash);
    
    ministatement=new JButton("MiniStatement");
    ministatement.setBounds(330,370,120,22);
    ministatement.setFont (new Font("Raleway",Font.BOLD,12));
    //deposit.setForeground(Color.WHITE);
    ministatement.addActionListener(this);
    Image.add(ministatement);
    
    pinchange=new JButton("PinChange");
    pinchange.setBounds(160,395,120,22);
    pinchange.setFont (new Font("Raleway",Font.BOLD,12));
    //deposit.setForeground(Color.WHITE);
    pinchange.addActionListener(this);
    Image.add(pinchange);
    
     balanceenquiry =new JButton("Balance Enquiry");
    balanceenquiry.setBounds(330,395,120,22);
    balanceenquiry.setFont (new Font("Raleway",Font.BOLD,12));
    //deposit.setForeground(Color.WHITE);
    balanceenquiry.addActionListener(this);
    Image.add(balanceenquiry);
    
    exist=new JButton("Exit");
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
            System.exit(0);
        }
        else if(ae.getSource()==deposit){
            setVisible(false);
            new Deposit(Pin).setVisible(true);
        }else if(ae.getSource()==withdraw){
        setVisible(false);
            new Withdrawa(Pin).setVisible(true);
    }else if(ae.getSource()==fastcash){
        setVisible(false);
          new Fastcash(Pin).setVisible(true);
    }
        else if(ae.getSource()==pinchange){
        setVisible(false);
          new Pinchange(Pin).setVisible(true);
    }else if(ae.getSource()==balanceenquiry){
        setVisible(false);
          new BalanceEnquiry(Pin).setVisible(true);
    }else if(ae.getSource()==ministatement){
        setVisible(false);
          new Ministatement(Pin).setVisible(true);
    }
    }
    public static void main(String[] args) {
        new Transaction("");
    }
    
}
