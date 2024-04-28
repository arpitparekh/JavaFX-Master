package Basics;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUI implements ActionListener{
	
	private int count = 0;
	private JLabel label;
	private JFrame frame;
	private JPanel panel;
	
	public GUI(){
		
		frame = new JFrame();
		panel = new JPanel();
		
		JButton button = new JButton("Click me");
		button.addActionListener(this);	
		
		label = new JLabel("No Click is " + count);
		
		panel.setBorder(BorderFactory.createEmptyBorder(200,200,200,200));
		panel.setLayout(new GridLayout(0,1));  // layout manager
		panel.add(button);
		panel.add(label);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Our GUI");
		frame.pack();
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new GUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("No Click is "+ count);
	}

}
