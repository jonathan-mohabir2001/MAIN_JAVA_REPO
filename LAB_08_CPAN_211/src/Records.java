/*
Lab 08 created by Jonathan M. 
JDBC jar file added to libraries folder within this project. 

connection string format provided below.
"jdbc:oracle:thin:n01374152/oracle@calvin.humber.ca:1521:grok"
*/

import java.sql.*; 
// import everything from java sql classet. 
public class Records {
    /*
    Table to be created first below. 
    */
    static final String DB_URL = "jdbc:oracle:thin:n01374152/oracle@calvin.humber.ca:1521:grok";
    // A string static variable is declared in order to hold the connection string needed. 
    
    public static void main(String[] args) {
  /*
  try(Connection conn = DriverManager.getConnection(DB_URL);
  Statement stmt = conn.createStatement();
      ) {		      
          String sql = "CREATE TABLE n01374152_orders " +
                  // create the table named student number orders
                   "(customer VARCHAR(25)," +
                   " product VARCHAR(25), " + 
                   " price FLOAT(2)," + 
                   " PRIMARY KEY ( customer))"; 
                   // three fields added with data types and size.
                   
         stmt.executeUpdate(sql);
         // execute the sql string 
         System.out.println("Created table in given database...");  
         
      }
        catch (SQLException e) {
         e.printStackTrace();
         // catch any exceptions, and print them. 
      } 
   
        END OF TABLE CREATION CODE. 
        
    */
  
    // START OF POPULATING THE TABLE.
    
   try(Connection conn = DriverManager.getConnection(DB_URL);
           // pass the connection string variable to getConnection. 
         Statement stmt = conn.createStatement();
           // statement object created. 
      ) {		      
         // Statements to insert values into n01374152_orders
         System.out.println("Inserting records into the table...");          
         
         String sql = "INSERT INTO n01374152_orders VALUES ('Washington', 'Dress',119)";
         stmt.executeUpdate(sql);
        // 1st record. Washington 
         
         sql = "INSERT INTO n01374152_orders VALUES ( 'Adams', 'Shirt', 55)";
         stmt.executeUpdate(sql);
         // 2nd record. Adams(Shirt)
         
         sql = "INSERT INTO n01374152_orders VALUES ( 'Adams', 'Tie', 22)";
         stmt.executeUpdate(sql);
         // 3rd  record. Adams(Tie) 
         
         sql = "INSERT INTO n01374152_orders VALUES ( 'Washington', 'Blouse', 75)";
         stmt.executeUpdate(sql);
         // 4th record . Washington (Blouse)
         
         sql = "INSERT INTO n01374152_orders VALUES ( 'Franklin', 'Hat', 33)";
         stmt.executeUpdate(sql);
         // 5th record. 
         
         sql = "INSERT INTO n01374152_orders VALUES ( 'Livingston', 'Gloves', 19)";
         stmt.executeUpdate(sql);
         // 6th record. 
          
         sql = "INSERT INTO n01374152_orders VALUES ( 'Livingston', 'Pants', 89)";
         stmt.executeUpdate(sql);
         // 7th record. 
         
          
         sql = "INSERT INTO n01374152_orders VALUES ( 'Read', 'Dress', 99)";
         stmt.executeUpdate(sql);
         // 8th record. 
                 
         System.out.println("Inserted records into the table...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
    
    //END OF POPULATING THE TABLE. 
  
  
  
  
  
        
        
    }
    
    

}
