package bank.management.system;

/**
 * total 3 step
 * 1. Register the Driver 
 * 2. Create connection
 * 3. create statement
 * 4. Execute query
 * 5.close connection
 */

import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    
    public Conn(){
        try{
            //Class.forName(com.mysql.cj.jdbc.Driver);
            c = DriverManager.getConnection("Jdbc:mysql:///bankmanagementsystem","root","Shantiniketan@123");
            s = c.createStatement();
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
}
