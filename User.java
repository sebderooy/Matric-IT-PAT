
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sebastianderooy
 */
public class User {
    
    private String name;
    private int ID;
    private String password;
    
    public User(String n)
    {
        name = n;
        
        String databaseURL = "jdbc:ucanaccess:///Users/SebastiandeRooy/FinBud/FinBudDB.accdb";
        
        
            try {
            Connection connection = DriverManager.getConnection(databaseURL);
                System.out.println("connected");
            
            Statement state = connection.createStatement();
            
            String sql = "SELECT * FROM tblUSer WHERE USERNAME = '" + name + "'";
            
            ResultSet result = state.executeQuery(sql);
            
            while (result.next())
            {
            ID = result.getInt("USERID");
            password = result.getString("PASSWORD");
            }
            
            } catch (SQLException ex)
            {
                Logger.getLogger(DBUI.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public String getPassword() {
        return password;
    }

    public void setName(String n) {
        String databaseURL = "jdbc:ucanaccess:///Users/SebastiandeRooy/FinBud/FinBudDB.accdb";
        
        
            try {
            Connection connection = DriverManager.getConnection(databaseURL);
            
            String sql = "UPDATE tblUser SET USERNAME = '" + n + "' WHERE USERNAME = '" + name + "'";
            
            Statement state = connection.createStatement();
            
            int row = state.executeUpdate(sql);
            
            if (row > 0)
            {
                System.out.println("Completed");
            }
            
            } catch (SQLException e)
                    {
                    System.out.println("Error");
                    }
    }

    public void setPassword(String p) {
        String databaseURL = "jdbc:ucanaccess:///Users/SebastiandeRooy/FinBud/FinBudDB.accdb";
        
        
            try {
            Connection connection = DriverManager.getConnection(databaseURL);
            
            String sql = "UPDATE tblUser SET PASSWORD = '" + p + "' WHERE USERNAME = '" + name + "'";
            
            Statement state = connection.createStatement();
            
            int row = state.executeUpdate(sql);
            
            if (row > 0)
            {
                System.out.println("Completed");
            }
            
            } catch (SQLException e)
                    {
                    System.out.println("Error");
                    }
    }
    
    
    
    
    
    
    
}
