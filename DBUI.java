/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author sebastianderooy
 */
public class DBUI {
    public static void main(String[] args) {
        
        //TESTING UI
        
        /*
        TESTING DATABASE CONNECTION
        
        String databaseURL = "jdbc:ucanaccess:///Users/SebastiandeRooy/FinBud/FinBudDB.accdb";
        
        
        try {
            Connection connection = DriverManager.getConnection(databaseURL);
            
            System.out.println("Connected");
            
            /*
            String sql = "INSERT INTO tblUser (Username, Password) VALUES ('seb', 'seb')";
            
            Statement state = connection.createStatement();
            int rows = state.executeUpdate(sql);
            
            if (rows > 0)
            {
                System.out.println("Completed");
            }
            
            String sql = "Select * from tblUser";
            
            Statement state = connection.createStatement();
            ResultSet result = state.executeQuery(sql);
            
            String[] str = new String[100];
            int i = 0;
                
            while (result.next())
            {
                String name = result.getString("UserName");
                str[i] = name;
                i++;
            }
            
            for (int j = 0; j < 10; j++) {
                
            }
            
            connection.close();

        } catch (SQLException ex) {
            Logger.getLogger(DBUI.class.getName()).log(Level.SEVERE, null, ex);
        }
*/
        
        /*
        //TESTING BUDGET OBJECT
        Budget budget = new Budget("sebby");
        System.out.println(budget.getID());
        System.out.println(budget.getName());
        System.out.println(budget.getType());
        System.out.println(budget.getIncomes());
        System.out.println(budget.getExpenses());
        budget.setIncomes(100);
        System.out.println(budget.getIncomes());
        */
        
        
        /*
        TESTING USER OBJECT
        User user = new User("maka");
        System.out.println(user.getID());
        System.out.println(user.getName());
        System.out.println(user.getPassword());
        user.setPassword("123");
        System.out.println(user.getPassword());
        */
            
        
        
        
    }
}
