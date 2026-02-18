package com.lab2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;

//Write a Java program that performs the following operations on a MySQL database:
public class second {
	static final String URL = "jdbc:mysql://localhost:3306/school1";
    static final String USER = "root";
    static final String PASSWORD = "";

    public static void main(String[] args) {

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(URL, USER, PASSWORD);

            // INSERT
            String insertSQL = "INSERT INTO student VALUES (?, ?, ?, ?)";
            PreparedStatement psInsert = (PreparedStatement) con.prepareStatement(insertSQL);
            psInsert.setInt(1, 1);
            psInsert.setString(2, "John");
            psInsert.setInt(3, 20);
            psInsert.setString(4, "john@example.com");
            psInsert.executeUpdate();
            System.out.println("Record Inserted");

            // UPDATE
            String updateSQL = "UPDATE student SET age=? WHERE id=?";
            PreparedStatement psUpdate = (PreparedStatement) con.prepareStatement(updateSQL);
            psUpdate.setInt(1, 21);
            psUpdate.setInt(2, 1);
            psUpdate.executeUpdate();
            System.out.println("Record Updated");

            // SELECT
            String selectSQL = "SELECT * FROM student";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(selectSQL);

            System.out.println("\nStudent Records:");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name") + " " +
                        rs.getInt("age") + " " +
                        rs.getString("email")
                );
            }

            // DELETE
            String deleteSQL = "DELETE FROM student WHERE id=?";
            PreparedStatement psDelete = (PreparedStatement) con.prepareStatement(deleteSQL);
            psDelete.setInt(1, 1);
            psDelete.executeUpdate();
            System.out.println("\nRecord Deleted");

            // Close Connection
            con.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

}
