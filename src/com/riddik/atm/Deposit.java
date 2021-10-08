package com.riddik.atm;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Deposit extends JFrame implements ActionListener{
	
	JLabel l1,l2;
	JTextField t1;
	JButton b1,b2,b3;
	String pin;
	
	Deposit(String pin){
		this.pin = pin;
		setTitle("AUTOMATED TELLER MACHINE");
		
		l1 = new JLabel("Enter the Amount to be Deposited");
        l1.setFont(new Font("Osward", Font.BOLD, 38));
        l1.setBounds(200,40,450,40);
        add(l1);
        
        
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
