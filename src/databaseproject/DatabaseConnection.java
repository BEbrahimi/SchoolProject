/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databaseproject;

/**
 *
 * @author Bashir Ebrahimi
 */
import java.sql.*;
public class DatabaseConnection {
    
    public static Connection getConnection()throws SQLException
    {
      String url = "jdbc:mysql://localhost:3306/javadatabasepro";
        String user = "root";
        String password = "";
        Connection conn = null;
       
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           conn = DriverManager.getConnection(url,user,password);
           
           System.out.println("Connected");
           
       }catch(ClassNotFoundException e){
           e.printStackTrace();
       }catch(SQLException e){
           e.printStackTrace();
       }
       
       return conn;
    }
    
}
