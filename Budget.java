
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
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
public class Budget {
    
    private String name;
    private int ID;
    private String type;
    private int incomes;
    private int expenses;
    
    public Budget(String n)
    {
        name = n;
        
        String databaseURL = "jdbc:ucanaccess:///Users/SebastiandeRooy/FinBud/FinBudDB.accdb";
        
        
            try {
            Connection connection = DriverManager.getConnection(databaseURL);
                System.out.println("connected");
            
            Statement state = connection.createStatement();
            
            String sql = "SELECT * FROM tblBudget WHERE BUDGETNAME = '" + name + "'";
            
            ResultSet result = state.executeQuery(sql);
            
            while (result.next())
            {
            ID = result.getInt("BUDGETID");
            type = result.getString("BUDGETTYPE");
            incomes = result.getInt("INCOMES");
            expenses = result.getInt("EXPENSES");
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

    public String getType() {
        return type;
    }

    public int getIncomes() {
        return incomes;
    }

    public int getExpenses() {
        return expenses;
    }

    public void setName(String n) {
        String databaseURL = "jdbc:ucanaccess:///Users/SebastiandeRooy/FinBud/FinBudDB.accdb";
        
        
            try {
            Connection connection = DriverManager.getConnection(databaseURL);
            
            String sql = "UPDATE tblBudget SET BUDGETNAME = '" + n + "' WHERE BUDGETNAME = '" + name + "'";
            
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

    
    public void setType(String t) {
         String databaseURL = "jdbc:ucanaccess:///Users/SebastiandeRooy/FinBud/FinBudDB.accdb";
        
        
            try {
            Connection connection = DriverManager.getConnection(databaseURL);
            
            String sql = "UPDATE tblBudget SET BUDGETTYPE = '" + t + "' WHERE BUDGETNAME = '" + name + "'";
            
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

    public void setIncomes(int i) {
         String databaseURL = "jdbc:ucanaccess:///Users/SebastiandeRooy/FinBud/FinBudDB.accdb";
        
        
            try {
            Connection connection = DriverManager.getConnection(databaseURL);
            
            String sql = "UPDATE tblBudget SET INCOMES = '" + i + "' WHERE BUDGETNAME = '" + name + "'";
            
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

    public void setExpenses(int e) {
         String databaseURL = "jdbc:ucanaccess:///Users/SebastiandeRooy/FinBud/FinBudDB.accdb";
        
        
            try {
            Connection connection = DriverManager.getConnection(databaseURL);
            
            String sql = "UPDATE tblBudget SET EXPENSES = '" + e + "' WHERE BUDGETNAME = '" + name + "'";
            
            Statement state = connection.createStatement();
            
            int row = state.executeUpdate(sql);
            
            if (row > 0)
            {
                System.out.println("Completed");
            }
            
            } catch (SQLException ex)
                    {
                    System.out.println("Error");
                    }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}




