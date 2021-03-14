
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.*;
import javax.swing.*;
 

public class dbconnect {
        private static Connection conn=null;
        static final String url="jdbc:postgresql://localhost:5432/postgres";
        static final String user="postgres";
        static final String password="root";
        public static Connection dbconnector()
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            conn=DriverManager.getConnection(url,user,password);
                  return conn;
        }catch(Exception e1)
        {
            JOptionPane.showMessageDialog(null, e1);
            return null;
        }
    }
}

