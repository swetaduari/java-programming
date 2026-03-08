# ResultSet Interface in JDBC

## Theory

### 1. What is ResultSet in JDBC?

ResultSet is an interface in JDBC (Java Database Connectivity API) that
represents the table of data returned by an SQL query.

When a SELECT query is executed, the database returns records. These
records are stored in a ResultSet object.

Key points: - It stores data retrieved from the database - It allows
navigation through rows - It allows reading column values

Example flow:

Connection → Statement → executeQuery() → ResultSet

Example:

``` java
Statement stmt = con.createStatement();
ResultSet rs = stmt.executeQuery("SELECT * FROM students");
```

Here `rs` contains all rows from the students table.

------------------------------------------------------------------------

## Navigating Through ResultSet

The ResultSet uses a cursor that points to rows.

Initially, the cursor is before the first row.

Common navigation methods:

  Method          Description
  --------------- ------------------------------
  next()          Moves cursor to next row
  previous()      Moves cursor to previous row
  first()         Moves to first row
  last()          Moves to last row
  beforeFirst()   Moves before first row
  afterLast()     Moves after last row

Example:

``` java
rs.next();   // move to first row
rs.next();   // move to second row
```

------------------------------------------------------------------------

## Retrieving Data from ResultSet

You can retrieve column values using methods like:

  Method        Data Type
  ------------- -----------
  getInt()      Integer
  getString()   String
  getFloat()    Float
  getDouble()   Double

Example:

``` java
int id = rs.getInt("id");
String name = rs.getString("name");
```

or by column index:

``` java
int id = rs.getInt(1);
String name = rs.getString(2);
```

------------------------------------------------------------------------

# Lab Exercise

## Program: Execute SELECT Query and Process ResultSet

``` java
import java.sql.*;

public class ResultSetExample {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");

            Statement stmt = con.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);

            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            System.out.println("Forward Direction:");
            while(rs.next()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }

            System.out.println("\nBackward Direction:");
            while(rs.previous()) {
                System.out.println(rs.getInt("id") + " " + rs.getString("name"));
            }

            con.close();

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
```

------------------------------------------------------------------------

## Explanation

1.  Connection is established with the database.
2.  Statement is created with scrollable ResultSet support.
3.  A SELECT query retrieves records from the students table.
4.  `next()` is used to move forward through rows.
5.  `previous()` is used to move backward.
6.  Column values are accessed using `getInt()` and `getString()`.

------------------------------------------------------------------------

## Output Example

    Forward Direction:
    1 Rahul
    2 Priya
    3 Amit

    Backward Direction:
    3 Amit
    2 Priya
    1 Rahul
