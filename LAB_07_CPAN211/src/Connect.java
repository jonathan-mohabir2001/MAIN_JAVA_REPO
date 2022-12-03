/*
Lab 07 created by Jonathan Mohabir. 
*/

import java.sql.Connection; 
import java.sql.Date; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import oracle.jdbc.pool.OracleDataSource;
import java.sql.Statement; 
// nessary sql classes imported. 




// jdbc:oracle:<drivertype>:<user>/<password>@
// configuration for connecting to database above. 
public class Connect {    
  
    public static final String DBURL = "jdbc:oracle:thin:n01374152/oracle@calvin.humber.ca:1521:grok";
    // final statement assigned value of oracle db. 
    
    public static void createATable() throws SQLException {
        
     
        
        
    }
    
    
    
    
    
    
    
    public static void main(String[] args) throws SQLException{ 
        
        createATable(); 
        
    }
    
}
