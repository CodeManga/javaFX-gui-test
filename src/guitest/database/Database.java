/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guitest.database;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

/**
 *
 * @author HILTON9
 */
public class Database {
    
    private Connection con;
    private PreparedStatement statement;
    
    public void getData() {
        String url = "jdbc:mysql://localhost:3306/guitest?zeroDateTimeBehavior=convertToNull";
        String driver = "com.mysql.jdbc.Driver";
        String userName = "root";
        String psw = "";

        try {
            Class.forName(driver);
            this.con = (Connection)DriverManager.getConnection(url, userName, psw);

            statement = con.prepareStatement("select * from address; ");
            ResultSet resultSet = statement.executeQuery();

            ResultSetMetaData data = resultSet.getMetaData();
            int c = data.getColumnCount();
            
            while (resultSet.next()) {
                System.out.println(resultSet.getString("street"));
                System.out.println(resultSet.getString("suburb"));
                System.out.println(resultSet.getString("city"));
                System.out.println(resultSet.getString("province"));
                System.out.println(resultSet.getString("postalCode"));
            }

            System.out.println("Success --->");
        } catch (ClassNotFoundException | SQLException sqle) {
            System.out.println(sqle);
        }
    }
    
    public Connection openConnection() {
        if (con == null) {
            String url = "jdbc:mysql://localhost:3306/guitest?zeroDateTimeBehavior=convertToNull";
            String dbName = "guitest";
            String driver = "com.mysql.jdbc.Driver";
            String userName = "root";
            String psw = "";
            
            try {
                Class.forName(driver);
                this.con = (Connection)DriverManager.getConnection(url, userName, psw);
                
                statement = con.prepareStatement("insert into address (street,suburb,city,province,postalCode) values(?,?,?,?,?); ");
                statement.setString(1, "701 Twala Section");
                statement.setString(2, "Katlehong");
                statement.setString(3, "Johannesburg");
                statement.setString(4, "Gauteng");
                statement.setInt(5, 1431);
                statement.executeUpdate();

                System.out.println("Success --->");
            } catch (ClassNotFoundException | SQLException sqle) {
                System.out.println(sqle);
            }
        }
        return con;
    }
}
