package com.lab4;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;


	
	public class SwingJDBCExample extends JFrame implements ActionListener {

	    JTextField idField, fnameField, lnameField, emailField;
	    JButton insertBtn, updateBtn, selectBtn, deleteBtn;

	    Connection con;

	    SwingJDBCExample() {

	        setTitle("JDBC Swing CRUD");

	        JLabel idLabel = new JLabel("ID:");
	        JLabel fnameLabel = new JLabel("First Name:");
	        JLabel lnameLabel = new JLabel("Last Name:");
	        JLabel emailLabel = new JLabel("Email:");

	        idField = new JTextField(15);
	        fnameField = new JTextField(15);
	        lnameField = new JTextField(15);
	        emailField = new JTextField(15);

	        insertBtn = new JButton("Insert");
	        updateBtn = new JButton("Update");
	        selectBtn = new JButton("Select");
	        deleteBtn = new JButton("Delete");

	        setLayout(null);

	        idLabel.setBounds(30,30,100,30);
	        idField.setBounds(130,30,150,30);

	        fnameLabel.setBounds(30,70,100,30);
	        fnameField.setBounds(130,70,150,30);

	        lnameLabel.setBounds(30,110,100,30);
	        lnameField.setBounds(130,110,150,30);

	        emailLabel.setBounds(30,150,100,30);
	        emailField.setBounds(130,150,150,30);

	        insertBtn.setBounds(30,200,100,30);
	        updateBtn.setBounds(150,200,100,30);
	        selectBtn.setBounds(30,240,100,30);
	        deleteBtn.setBounds(150,240,100,30);

	        add(idLabel); add(idField);
	        add(fnameLabel); add(fnameField);
	        add(lnameLabel); add(lnameField);
	        add(emailLabel); add(emailField);

	        add(insertBtn);
	        add(updateBtn);
	        add(selectBtn);
	        add(deleteBtn);

	        insertBtn.addActionListener(this);
	        updateBtn.addActionListener(this);
	        selectBtn.addActionListener(this);
	        deleteBtn.addActionListener(this);

	        setSize(350,350);
	        setVisible(true);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        connectDB();
	    }

	    public void connectDB() {
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            con = DriverManager.getConnection(
	                    "jdbc:mysql://localhost:3306/testdb",
	                    "root",
	                    ""
	            );
	        } catch(Exception e) {
	            e.printStackTrace();
	        }
	    }

	    public void actionPerformed(ActionEvent e) {

	        int id = Integer.parseInt(idField.getText());
	        String fname = fnameField.getText();
	        String lname = lnameField.getText();
	        String email = emailField.getText();

	        try {

	            if(e.getSource()==insertBtn) {

	                PreparedStatement ps = con.prepareStatement(
	                        "INSERT INTO users VALUES(?,?,?,?)");

	                ps.setInt(1,id);
	                ps.setString(2,fname);
	                ps.setString(3,lname);
	                ps.setString(4,email);

	                ps.executeUpdate();
	                JOptionPane.showMessageDialog(this,"Record Inserted");
	            }

	            if(e.getSource()==updateBtn) {

	                PreparedStatement ps = con.prepareStatement(
	                        "UPDATE users SET fname=?, lname=?, email=? WHERE id=?");

	                ps.setString(1,fname);
	                ps.setString(2,lname);
	                ps.setString(3,email);
	                ps.setInt(4,id);

	                ps.executeUpdate();
	                JOptionPane.showMessageDialog(this,"Record Updated");
	            }

	            if(e.getSource()==selectBtn) {

	                PreparedStatement ps = con.prepareStatement(
	                        "SELECT * FROM users WHERE id=?");

	                ps.setInt(1,id);

	                ResultSet rs = ps.executeQuery();

	                if(rs.next()) {
	                    fnameField.setText(rs.getString("fname"));
	                    lnameField.setText(rs.getString("lname"));
	                    emailField.setText(rs.getString("email"));
	                } else {
	                    JOptionPane.showMessageDialog(this,"Record Not Found");
	                }
	            }

	            if(e.getSource()==deleteBtn) {

	                PreparedStatement ps = con.prepareStatement(
	                        "DELETE FROM users WHERE id=?");

	                ps.setInt(1,id);

	                ps.executeUpdate();
	                JOptionPane.showMessageDialog(this,"Record Deleted");
	            }

	        } catch(Exception ex) {
	            ex.printStackTrace();
	        }
	    }

	    public static void main(String[] args) {
	        new SwingJDBCExample();
	    }
	}

