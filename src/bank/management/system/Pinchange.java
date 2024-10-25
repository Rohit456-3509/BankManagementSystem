
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pinchange extends JFrame implements ActionListener{
    String Pin;
    JPasswordField pinchange,repinchange;
    JButton change, back;
Pinchange(String Pin){
    this.Pin=Pin;
    setLayout(null);
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
    Image i2=i1.getImage().getScaledInstance(800, 740, Image.SCALE_DEFAULT );
    ImageIcon i3=new ImageIcon(i2);
    JLabel Image= new JLabel(i3);
    Image.setBounds(0, 0, 800, 740);
    add(Image );
    
    JLabel text =new JLabel("CHANGE YOUR PIN  ");
    text.setBounds(230, 235, 600, 35);
     text.setFont (new Font("Raleway",Font.BOLD,15));
    text.setForeground(Color.WHITE);
    Image.add(text);
    
    JLabel pintext =new JLabel("New PIN  ");
    pintext.setBounds(160, 265, 160, 35);
     pintext.setFont (new Font("Raleway",Font.BOLD,15));
    pintext.setForeground(Color.WHITE);
    Image.add(pintext);
    
    JLabel repintext =new JLabel("Re-Enter New PIN  ");
    repintext.setBounds(160, 300, 160, 22);
     repintext.setFont (new Font("Raleway",Font.BOLD,15));
    repintext.setForeground(Color.WHITE);
    Image.add(repintext);
    
    pinchange =new JPasswordField();
    pinchange.setFont (new Font("System",Font.BOLD,15));
     pinchange.setBounds(300, 270, 160, 22);
     Image.add(pinchange);
    
    repinchange =new JPasswordField();
    repinchange.setFont (new Font("System",Font.BOLD,15));
     repinchange.setBounds(300, 300, 160, 22);
     Image.add(repinchange);
    
    change =new JButton("Change");
      change.setBounds(340, 400, 120, 25);
     Image.add( change);
      change.addActionListener(this);
     
      back =new JButton("Back");
     back.setBounds(340, 430, 120, 25);
     Image.add(back);
     back.addActionListener(this);
    
    
     setSize(800,740);
        setLocation(300,0);
        setUndecorated(true);
        setVisible(true);
}
   public void actionPerformed(ActionEvent ae){
       if(ae.getSource()==change ){
       try {
           String npin=pinchange.getText();
           String rpin=repinchange.getText();
           
           
           if(!npin.equals(rpin)){
               JOptionPane.showMessageDialog(null, "Pin Does'nt Match");
               return;
           }
           else if(npin.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter the New Pin");
               return;
           }
           else if(rpin.equals("")){
                JOptionPane.showMessageDialog(null, "Please Enter  Re-Enter New Pin");
               return;
           }
       
       Connect c=new Connect ();
       String query1="update bank set pin ='"+rpin+"'where pin = '"+Pin+"'";
           String query2="update login set pin ='"+rpin+"'where pin = '"+Pin+"'";
           String query3="update signupthree set pin ='"+rpin+"'where pin = '"+Pin+"'";
           c.s.executeUpdate(query1);
                           c.s.executeUpdate(query2);
                                           c.s.executeUpdate(query3);
                  JOptionPane.showMessageDialog(null, "Pin Change Successfully ");   
                   setVisible(false);
           new Transaction(rpin).setVisible(true);
}
       catch(Exception e){
           System.out.println(e);
       }
}else{
           setVisible(false);
           new Transaction(Pin).setVisible(true);
       }
       
   }
    public static void main(String[] args) {
        new Pinchange("");
    }
    
}
