package com.hos.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {

	public static Connection main(String[] args) {
       
		Connection con = null;
        try {
            //Class.forName("com.mysql.jdbc.Driver");

            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital","root", "root");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
	}

	public static Connection getDBConnection() {
		// TODO Auto-generated method stub
		return null;
	}
}