package com.adickinson.program;

import javax.swing.*;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class swing extends JFrame {

	JButton butt;
	JFrame frame;
	JPanel panel;
	JLabel lbl;	
	JTextField txt;
	JLabel out;
	public swing()
	{
		createFrame();
		
	}
	
	public void createFrame(){
		frame = new JFrame();
		  frame.add(createPanel());
		  frame.setTitle("");
		  frame.setBounds(200,300,420,150);
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.setVisible(true);
		
	}
	
	public JPanel createPanel(){
		panel = new JPanel();
		panel.setLayout(new GridLayout(2,2,5,5));
		lbl= new JLabel("Enter Name");
		butt= new JButton("Enter");
		butt.addActionListener(new SubmitListener());
		txt= new JTextField("");
		out=new JLabel("");
		panel.add(lbl);
		panel.add(butt);
		panel.add(txt);
		panel.add(out);
		return panel;
	}
	
	private class SubmitListener implements ActionListener{
		
		 public void actionPerformed(ActionEvent arg0) {
			 String name = txt.getText();
			 out.setText(" Welcome "+name);
		 }
	}
	
}
