package com.lab5;

import java.sql.*;

public class CallStoredProcedure {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/companydb",
                    "root",
                    ""
            );

            CallableStatement cs = con.prepareCall("{call getEmployeeSalary(?,?)}");

            // IN parameter
            cs.setInt(1, 101);

            // OUT parameter
            cs.registerOutParameter(2, Types.DOUBLE);

            cs.execute();

            double salary = cs.getDouble(2);

            System.out.println("Employee Salary: " + salary);

            cs.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}