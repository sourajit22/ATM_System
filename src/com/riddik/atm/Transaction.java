package com.riddik.atm;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Transaction extends JFrame implements ActionListener{
	
	JLabel l1;
	JButton b1,b2,b3,b4,b5,b6,b7;
	String pin;
	
	Transaction(String pin){
		this.pin = pin;
		
		
		
		l1 = new JLabel("Please select your Transaction");
		l1.setFont(new Font("System", Font.BOLD, 38));
		//l1.setForeground(Color.BLACK);
		
		b1 = new JButton("DEPOSIT");
		b1.setFont(new Font("System", Font.BOLD, 18));
		b1.setBackground(Color.BLACK);
		b1.setForeground(Color.WHITE);
		
		b2 = new JButton("CASH WITHDRAWL");
		b2.setFont(new Font("System", Font.BOLD, 18));
		b2.setBackground(Color.BLACK);
		b2.setForeground(Color.WHITE);
		
		b3 = new JButton("FAST CASH");
		b3.setFont(new Font("System", Font.BOLD, 18));
		b3.setBackground(Color.BLACK);
		b3.setForeground(Color.WHITE);
		
		b4 = new JButton("MINI STATEMENT");
		b4.setFont(new Font("System", Font.BOLD, 18));
		b4.setBackground(Color.BLACK);
		b4.setForeground(Color.WHITE);
		
		b5 = new JButton("PIN CHANGE");
		b5.setFont(new Font("System", Font.BOLD, 18));
		b5.setBackground(Color.BLACK);
		b5.setForeground(Color.WHITE);
		
		b6 = new JButton("BALANCE ENQUIRY");
		b6.setFont(new Font("System", Font.BOLD, 18));
		b6.setBackground(Color.BLACK);
		b6.setForeground(Color.WHITE);
		
		b7 = new JButton("EXIT");
		b7.setFont(new Font("System", Font.BOLD, 18));
		b7.setBackground(Color.BLACK);
		b7.setForeground(Color.WHITE);
		
		setLayout(null);
		
		l1.setBounds(100, 100, 700, 40);
		add(l1);
		
		b1.setBounds(40,250,300,60);
		add(b1);
		
		b2.setBounds(440,250,300,60);
		add(b2);
		
		b3.setBounds(40,360,300,60);
		add(b3);
		
		b4.setBounds(440,360,300,60);
		add(b4);
		
		b5.setBounds(40,470,300,60);
		add(b5);
		
		b6.setBounds(440,470,300,60);
		add(b6);
		
		b7.setBounds(240,600,300,60);
		add(b7);
		
		getContentPane().setBackground(Color.WHITE);
		setSize(800, 800);
		setLocation(500, 90);
		//setUndecorated(true);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Transaction("").setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
