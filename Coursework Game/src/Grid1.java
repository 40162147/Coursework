import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;


public class Grid1 extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Grid1 frame = new Grid1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Grid1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 517, 403);
		getContentPane().setLayout(null);
		
		JButton btnMove = new JButton("Move");
		btnMove.setBounds(345, 329, 89, 23);
		getContentPane().add(btnMove);
		
		JButton btnChangeState = new JButton("Change State");
		btnChangeState.setBounds(216, 329, 117, 23);
		getContentPane().add(btnChangeState);
		
		JLabel lblHu = new JLabel("");
		lblHu.setIcon(new ImageIcon("\\\\napier-mail.napier.ac.uk\\students\\School of Computing\\User Data\\40162147\\Coursework\\Coursework Game\\background.png"));
		lblHu.setBackground(Color.WHITE);
		lblHu.setBounds(62, 23, 89, 64);
		getContentPane().add(lblHu);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("\\\\napier-mail.napier.ac.uk\\students\\School of Computing\\User Data\\40162147\\Coursework\\Coursework Game\\background.png"));
		label.setBackground(Color.WHITE);
		label.setBounds(150, 23, 89, 64);
		getContentPane().add(label);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("\\\\napier-mail.napier.ac.uk\\students\\School of Computing\\User Data\\40162147\\Coursework\\Coursework Game\\background.png"));
		label_1.setBackground(Color.WHITE);
		label_1.setBounds(238, 23, 89, 64);
		getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setIcon(new ImageIcon("\\\\napier-mail.napier.ac.uk\\students\\School of Computing\\User Data\\40162147\\Coursework\\Coursework Game\\background.png"));
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(327, 23, 89, 64);
		getContentPane().add(label_2);
		
		JLabel lblCurrentState = new JLabel("Current State: ");
		lblCurrentState.setBounds(50, 329, 156, 23);
		getContentPane().add(lblCurrentState);
		
		JLabel label_3 = new JLabel("");
		label_3.setIcon(new ImageIcon("\\\\napier-mail.napier.ac.uk\\students\\School of Computing\\User Data\\40162147\\Coursework\\Coursework Game\\background.png"));
		label_3.setBackground(Color.WHITE);
		label_3.setBounds(62, 89, 89, 64);
		getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setIcon(new ImageIcon("\\\\napier-mail.napier.ac.uk\\students\\School of Computing\\User Data\\40162147\\Coursework\\Coursework Game\\background.png"));
		label_4.setBackground(Color.WHITE);
		label_4.setBounds(150, 89, 89, 64);
		getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setIcon(new ImageIcon("\\\\napier-mail.napier.ac.uk\\students\\School of Computing\\User Data\\40162147\\Coursework\\Coursework Game\\background.png"));
		label_5.setBackground(Color.WHITE);
		label_5.setBounds(238, 89, 89, 64);
		getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setIcon(new ImageIcon("\\\\napier-mail.napier.ac.uk\\students\\School of Computing\\User Data\\40162147\\Coursework\\Coursework Game\\background.png"));
		label_6.setBackground(Color.WHITE);
		label_6.setBounds(327, 89, 89, 64);
		getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("");
		label_7.setIcon(new ImageIcon("\\\\napier-mail.napier.ac.uk\\students\\School of Computing\\User Data\\40162147\\Coursework\\Coursework Game\\background.png"));
		label_7.setBackground(Color.WHITE);
		label_7.setBounds(62, 156, 89, 64);
		getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("");
		label_8.setIcon(new ImageIcon("\\\\napier-mail.napier.ac.uk\\students\\School of Computing\\User Data\\40162147\\Coursework\\Coursework Game\\background.png"));
		label_8.setBackground(Color.WHITE);
		label_8.setBounds(150, 156, 89, 64);
		getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("");
		label_9.setIcon(new ImageIcon("\\\\napier-mail.napier.ac.uk\\students\\School of Computing\\User Data\\40162147\\Coursework\\Coursework Game\\background.png"));
		label_9.setBackground(Color.WHITE);
		label_9.setBounds(238, 156, 89, 64);
		getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("");
		label_10.setIcon(new ImageIcon("\\\\napier-mail.napier.ac.uk\\students\\School of Computing\\User Data\\40162147\\Coursework\\Coursework Game\\background.png"));
		label_10.setBackground(Color.WHITE);
		label_10.setBounds(327, 156, 89, 64);
		getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("");
		label_11.setIcon(new ImageIcon("\\\\napier-mail.napier.ac.uk\\students\\School of Computing\\User Data\\40162147\\Coursework\\Coursework Game\\background.png"));
		label_11.setBackground(Color.WHITE);
		label_11.setBounds(62, 222, 89, 64);
		getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("");
		label_12.setIcon(new ImageIcon("\\\\napier-mail.napier.ac.uk\\students\\School of Computing\\User Data\\40162147\\Coursework\\Coursework Game\\background.png"));
		label_12.setBackground(Color.WHITE);
		label_12.setBounds(150, 222, 89, 64);
		getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("");
		label_13.setIcon(new ImageIcon("\\\\napier-mail.napier.ac.uk\\students\\School of Computing\\User Data\\40162147\\Coursework\\Coursework Game\\background.png"));
		label_13.setBackground(Color.WHITE);
		label_13.setBounds(238, 222, 89, 64);
		getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("");
		label_14.setIcon(new ImageIcon("\\\\napier-mail.napier.ac.uk\\students\\School of Computing\\User Data\\40162147\\Coursework\\Coursework Game\\background.png"));
		label_14.setBackground(Color.WHITE);
		label_14.setBounds(327, 222, 89, 64);
		getContentPane().add(label_14);
	}
}
