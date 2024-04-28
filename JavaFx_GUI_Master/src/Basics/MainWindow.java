package Basics;

import javax.swing.JFrame;

public class MainWindow {
	
	public MainWindow() {
		
		frame= new JFrame();
		frame.setTitle("Hello World");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setSize(800,500);
		frame.setLocationRelativeTo(null);
	}
	
	private JFrame frame;
	
	public void show() {
		frame.setVisible(true);
	}
	
}
