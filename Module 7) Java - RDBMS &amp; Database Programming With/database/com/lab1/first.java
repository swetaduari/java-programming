package com.lab1;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
//Write a Java program that connects to a MySQL database and executes a simple query to retrieve all records from a table

import com.mysql.jdbc.Connection;

public class first {
    public static void main(String[] args) {
    	
    	String host="jdbc:mysql://localhost:3306/";
     	String db="company";
     	String url=host+db;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.jdbc.Driver");

            // Establish Connection
            java.sql.Connection con = DriverManager.getConnection(
                    url,
                    "root",
                    ""
            );

            // Create Statement
            Statement stmt = con.createStatement();

            // SQL Query
            String sql = "SELECT * FROM employee";

            // Execute Query
            ResultSet rs = stmt.executeQuery(sql);

            // Process ResultSet
            while (rs.next()) {
                System.out.println(
                        rs.getInt("emp_id") + " " +
                        rs.getString("fname") + " " +
                        rs.getString("lname")
                );
            }

            // Close Connection
            con.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }


}
