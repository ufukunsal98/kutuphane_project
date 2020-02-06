
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kutuphane;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author UfukUnsal
 */
public class Database {
    String host="http://localhost:3306";
    String username="root";
    String password="12345678Aa";
    public Connection connect() throws ClassNotFoundException{
        Connection conn;
        Class.forName("com.mysql.cj.jdbc.Driver");
        try {  
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/kutuphane?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",username,password);
            return conn;
        } catch (Exception ex) {
            System.out.println(ex.toString());
            JOptionPane jp=new JOptionPane("veritabanı hatası",1);
            jp.setVisible(true);
            return null;
        }
   
    }
    
}
