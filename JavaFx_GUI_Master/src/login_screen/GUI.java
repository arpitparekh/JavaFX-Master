package login_screen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class GUI  implements ActionListener{
	
	private static JPanel panel;
	private static JFrame frame;
	
	private static JLabel userLabel;
	private static JTextField userName;
	
	private static JLabel passwordLabel;
	private static JTextField password;
	
	private static JButton button;
	
	private static JLabel resultLabel;

	public static void main(String[] args) {
		
		panel = new JPanel();
		frame = new JFrame();
		frame.setSize(300, 300);
		frame.setTitle("Login");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel.setLayout(null);
		
		userLabel = new JLabel("Username");
		userLabel.setBounds(10,20,80,25);
		panel.add(userLabel);
		
		userName = new JTextField();
		userName.setBounds(100,20,165,25);
		panel.add(userName);
		
		passwordLabel = new JLabel("Password");
		passwordLabel.setBounds(10,50,80,25);
		panel.add(passwordLabel);
		
		password = new JPasswordField();
		password.setBounds(100,50,165,25);
		panel.add(password);
		
		button = new JButton();
		button.setBounds(110,90,80,25);
		button.setText("Login");
		button.addActionListener(new GUI());
		panel.add(button);
		
		resultLabel = new JLabel("Login Scucessful");
		resultLabel.setBounds(10,120,300,25);
		resultLabel.setText("");
		panel.add(resultLabel);
		
		
		frame.setVisible(true);
		frame.add(panel);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {// TODO Auto-generated method stub
			
		String user = userName.getText();
		String pass = password.getText();

		
		if(user.equals("admin") && pass.equals("admin@123")) {
			resultLabel.setText("Login SuccessFul");
		}else {
			resultLabel.setText("Wrong Credentials");
		}
		
	}
	
}
