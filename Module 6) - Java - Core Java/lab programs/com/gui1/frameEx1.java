package com.gui1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class frameEx1 implements ActionListener {

	JFrame frame;
	JTextField tf1, tf2, tf3;
	JLabel l1, l2;
	JButton btn1, btn2;

	public frameEx1() {
		frame = new JFrame();// initialization

		tf1 = new JTextField();
		tf1.setBounds(120, 40, 200, 25);

		tf2 = new JTextField();
		tf2.setBounds(120, 90, 200, 25);

		tf3 = new JTextField();
		tf3.setBounds(180, 180, 100, 25);
		tf3.setEditable(false);

		l1 = new JLabel("Enter Number 1: ");
		l1.setBounds(15, 40, 200, 25);

		l2 = new JLabel("Enter Number 2: ");
		l2.setBounds(15, 90, 200, 25);

		btn1 = new JButton("+");
		btn1.setBounds(120, 150, 100, 25);

		btn2 = new JButton("-");
		btn2.setBounds(230, 150, 100, 25);

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		// frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		frame.add(tf1);
		frame.add(tf2);
		frame.add(l1);
		frame.add(l2);
		frame.add(btn1);
		frame.add(btn2);
		frame.add(tf3);
		frame.setSize(500, 500);
		frame.setLayout(null);
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		new frameEx1();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String a = tf1.getText().toString();
		String b = tf2.getText().toString();
		int c = 0;

		if (e.getSource() == btn1) {
			c = Integer.parseInt(a) + Integer.parseInt(b);
			tf3.setText(String.valueOf(c));
		}
		if (e.getSource() == btn2) {
			c = Integer.parseInt(a) - Integer.parseInt(b);
			tf3.setText(String.valueOf(c));
		}

	}

}
