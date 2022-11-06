

package GNConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class RegConnection {
    
    private static final String url="jdbc:mysql://localhost:8084/college";
    private static final String user="root";
    private static final String password="root";
    
    public static Connection getGNConnection() throws Exception, SQLException
    {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(url, user, password);
        return con;
    
    }

}


    

