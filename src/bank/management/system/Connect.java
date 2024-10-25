
package bank.management.system;

import java.sql.*;
public class Connect {
Connection c;
Statement s;
    public Connect (){
        try{
            
            c =DriverManager.getConnection("jdbc:mysql:///bankermanagementsystem","root","Rohit_909");
            s=c.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
