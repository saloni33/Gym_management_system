package Gym_management;
import java.sql.*;
public class Connection_Class {
    Connection con;
    Statement stm;
    
    Connection_Class(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
    }
    
}
