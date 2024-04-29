package java_gui_full;


import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JPanelDemo {

    public static ImageIcon icon;

    public JPanelDemo() {
        loadIcon();
    }

    private void loadIcon() {
        icon = new ImageIcon(getClass().getResource("/java_gui_full/window.png"));
    }

    public static void main(String[] args) {
        JPanelDemo panelDemo = new JPanelDemo();

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0, 0, 200, 200);

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(200, 0, 200, 200);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE);
        bluePanel.setBounds(0, 200, 400, 200);

        JLabel label = new JLabel();
        label.setText("Hello");
        label.setForeground(Color.GREEN);
        label.setBounds(10, 0, 200,100);
        
//        label.setVerticalAlignment(JLabel.TOP);
//        label.setHorizontalAlignment(JLabel.LEFT);

        if (icon != null) {
            label.setIcon(icon);
        } else {
            System.out.println("Icon path is not found");
        }

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(500, 500);
        frame.setTitle("JPanel Demo");
        frame.setVisible(true);
        
        greenPanel.setLayout(null);
        greenPanel.add(label);
        
        redPanel.setLayout(null);
        redPanel.add(label);
        
//        bluePanel.setLayout(null);
//        bluePanel.add(label);
        
        frame.add(greenPanel);
        frame.add(redPanel);
        frame.add(bluePanel);
    }
    
}