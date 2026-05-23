

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.*;

public class AppointmentGUI extends JFrame {

    JTextField patientField;
    JComboBox serviceBox;
    JButton bookButton;

    public AppointmentGUI() {

        setTitle("SmileCare Appointment Booking");
        setSize(400,300);
        setLayout(new java.awt.FlowLayout());

        patientField = new JTextField(20);

        String services[] = {"Cleaning","Filling","Root Canal"};
        serviceBox = new JComboBox(services);

        bookButton = new JButton("Book Appointment");

        add(new JLabel("Patient Name"));
        add(patientField);
        add(serviceBox);
        add(bookButton);

        setVisible(true);
    }
}