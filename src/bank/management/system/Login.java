
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class Login extends JFrame implements ActionListener{
    JButton Login,Clear,sign;
    JTextField CT;
    JPasswordField PT;
Login(){
    setTitle("Automater Transaction Machine ");
    
    setLayout(null);
    
    ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
    Image i2=i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT );
    ImageIcon i3=new ImageIcon(i2);
    JLabel label= new JLabel(i3);
    label.setBounds(70, 10, 100, 100);
    add(label );
    
    JLabel text =new JLabel("Welcome to ATM");
    text.setFont(new Font("Osward", Font.BOLD ,38));
   text.setBounds(200, 40, 400, 40);
    add(text);
    
    JLabel CardNo =new JLabel("Card No");
    CardNo.setFont(new Font("Osward", Font.BOLD ,28));
  CardNo.setBounds(120, 150, 150, 30);
    add(CardNo);
    
     CT= new JTextField();
    CT.setBounds(300,150,250,30);
    CT.setFont(new Font("Osward", Font.BOLD ,20));
    add(CT);
    
    
    JLabel Pin =new JLabel("Pin No");
    Pin.setFont(new Font("Osward", Font.BOLD ,28));
   Pin.setBounds(120, 220, 250, 30);
    add(Pin);
    
    Login =new JButton("SIGN IN");
    Login.setBounds(300,300,100,30);
    Login.setBackground(Color.BLACK);
    Login.setForeground(Color.WHITE);
    Login.addActionListener(this);
    add(Login);
    
    Clear =new JButton("CLEAR");
    Clear.setBounds(450,300,100,30);
    Clear.setBackground(Color.BLACK);
    Clear.setForeground(Color.WHITE);
    Clear.addActionListener(this);
    add(Clear);
    
    sign =new JButton("SIGN UP");
    sign.setBounds(300,350,250,30);
    sign.setBackground(Color.BLACK);
    sign.setForeground(Color.WHITE);
   sign.addActionListener(this);
    add(sign);
    
    PT= new JPasswordField();
    PT.setBounds(300,220,250,30);
    PT.setFont(new Font("Osward", Font.BOLD ,20));
    add(PT);
    
    
    
    getContentPane().setBackground(Color.PINK);
    
    setSize(800,480);
    setVisible(true);
    setLocation(350,200);
}
public void actionPerformed(ActionEvent ae){
    if(ae.getSource()==Clear){
        CT.setText("");
        PT.setText("");
    }else if (ae.getSource()==Login){
        Connect c=new Connect ();
        String CardNo=CT.getText();
        String Pin=PT.getText();
        String query="Select* from login where card='"+CardNo+"'and pin='"+Pin+"'";
        try{
          ResultSet rs=  c.s.executeQuery(query);
          if(rs.next()){
              setVisible(false);
              new Transaction(Pin).setVisible(true);
          }
          else{
              JOptionPane.showMessageDialog(null, "Incorrect Card Number Or Password ");
          }
        }catch(Exception e){
            System .out.println(e);
        }
    }else if(ae.getSource()==sign){
        setVisible(false);
        new SignUpOne().setVisible(true);
    }
}
    public static void main(String[] args) {
       new Login();
    }
    
}
