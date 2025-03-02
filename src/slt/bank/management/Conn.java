package slt.bank.management;
import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try {
            c = DriverManager.getConnection("jdbc:mysql:///sltbank", "root", "shivpal");
            s = c.createStatement();
        }catch (Exception e){
            System.out.println(c);
        }
    }
}
