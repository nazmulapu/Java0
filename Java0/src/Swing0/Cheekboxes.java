package Swing0;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Cheekboxes {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cheekboxes window = new Cheekboxes();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Cheekboxes() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("off");
		label.setBounds(24, 54, 56, 16);
		frame.getContentPane().add(label);
		
		JCheckBox cheekbox = new JCheckBox("Example");
		cheekbox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = (cheekbox.isSelected()) ? "On" : "off";
				label.setText(text);
			}
		});
		cheekbox.setBounds(24, 24, 113, 25);
		frame.getContentPane().add(cheekbox);
		
		
	}
}
