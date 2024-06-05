package Basics;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {
	private JLabel l;
	private JLabel l1;
	private JLabel label;
	private JLabel resultLabel;
	private JButton btn;
	private JPanel panel;
	private JTextField userName;
	private JPasswordField passWord;
	
	public Login() {
		initializeLabel();
		initializeTextBox();
		initializeButton();
		initializePanel();
		initializeFrame();
	}
	void initializeLabel() {
		l= new JLabel("Username:");
		l.setBounds(10, 20, 70, 20);
		l.setBackground(Color.CYAN);
		l.setOpaque(true);
		l1= new JLabel("Password:");
		l1.setBounds(10, 40, 70, 20);
		l1.setBackground(Color.YELLOW);
		l1.setOpaque(true);
		resultLabel = new JLabel("Login SuccesFull!!!!");
		resultLabel.setBounds(10,200,300,25);
		resultLabel.setText("");

	}
	
	void initializeTextBox() {
		
		userName = new JTextField();
		userName.setBounds(90, 20, 110, 20);
		userName.setBackground(Color.WHITE);
		passWord = new JPasswordField();
		passWord.setBounds(90, 40, 110, 20);
		passWord.setBackground(Color.WHITE);
	}
	

	void initializeFrame() {
		
		setSize(500,400);
		setLayout(null);
		setVisible(true);
		setTitle("Login Screen");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		add(l);
		add(l1);
		add(btn);
		add(resultLabel);
		add(userName);
		add(passWord);
		
		add(panel);
	}
	
	public void initializeButton()
	{
		btn = new JButton();
		btn.setText("Login");
		btn.setFocusable(false);
		btn.setBounds(80, 80, 100, 20);
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String user = userName.getText();
				String pass = passWord.getText();

				
				if(user.equals("admin") && pass.equals("admin@123")) {
					resultLabel.setText("Login SuccessFull!!!!");
					panel.setVisible(true);

				}else {
					resultLabel.setText("Wrong Credentials");
					panel.setVisible(false);
				}
				
			}
			
		});
	}
	JLabel makeGetPanel() {
		JLabel label = new JLabel("Image Label");
//		ImageIcon icon = new ImageIcon(getClass().getResource("/login_Screen/apple_logo.png"));
//		label.setIcon(icon);
		return label;
	}
	
	void initializePanel() {
		panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setBounds(110, 100, 100, 110);
		panel.add(makeGetPanel());
		panel.setVisible(false);
	}
	
	public static void main(String[] args) {
		new Login();
	}
}