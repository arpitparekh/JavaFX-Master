package java_gui_full;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;

public class JLabelDemo extends JFrame {   // program to load image from the separate thread with text
    
	private JLabel label;
    private ImageIcon image;
    private Border border = BorderFactory.createLineBorder(Color.GREEN,3);

    public JLabelDemo() {
        initComponents();
        createUI();
    }

    private void initComponents() {
        label = new JLabel("Image from saperate thread"); // SwingConstants.CENTER in second para
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setForeground(new Color(0x00ff00));
        label.setIconTextGap(20);
        label.setBackground(Color.black);
        label.setOpaque(true);
        label.setBorder(border);
        label.setPreferredSize(new Dimension(250, 250));   // 250*250 pixels if image is small
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
//        label.setBounds(100, 100, 250, 250);    // set x and y position
        Font customFont = new Font("Arial", Font.BOLD, 20); // Change the font name, style, and size as desired
        
        loadImage();
        
    }

    private void loadImage() {
        SwingWorker<ImageIcon, Object> worker = new SwingWorker<>() {
            @Override
            protected ImageIcon doInBackground() {
                try {
                    return new ImageIcon(getClass().getResource("/java_gui_full/window.png"));
                    
                    // create a imageIcon
                   
                } catch (Exception e) {
                    e.printStackTrace();
                    return null;
                }
            }

            @Override
            protected void done() {
                try {
                    image = get();
                    label.setIcon(image);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        worker.execute();
    }

    private void createUI() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        setSize(500, 500);
        setTitle("Image and Text");
        setLocationRelativeTo(null);
        add(label, BorderLayout.CENTER); // Add the JLabel to the CENTER
//        setLayout(null);
        
        setResizable(true);
        setVisible(true);
        pack();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new JLabelDemo());
    }
}