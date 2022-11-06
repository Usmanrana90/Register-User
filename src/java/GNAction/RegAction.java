

package GNAction;

import GNBean.RegBean;
import GNConnection.RegConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class RegAction {
  
    public int InsertRegRecord(RegBean data) throws ClassNotFoundException, SQLException
    { 
       int i=0;
       try
       {
           Connection con=RegConnection.getGNConnection();
            Statement s=con.createStatement();
            
           i= s.executeUpdate("insert into reg values('"+data.getName()+"','"+data.getEmail()+"','"+data.getCity()+"','"+data.getMobile()+"','"+data.getPassword()+"')");
            
        
       
       }
       catch(Exception e)
       {
       
       
       
       }
         return i;
            
            
         }
    
    
    public ResultSet updateUser(String email) throws SQLException, Exception
    {
    
        
            Connection con=RegConnection.getGNConnection();
            Statement s=con.createStatement();
            
              ResultSet rs= s.executeQuery("selct * from reg where email='"+email+"'");
              return rs;
    }
}
         
    

   
   