package dbsystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLConnection {
    public static Connection getConnection(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection("jdbc:mysql://localhost/test?useSSL=false", "root", "root");
        }catch(SQLException exc){
            System.out.println(exc.getMessage());
        }
        return conn;
    }
}
