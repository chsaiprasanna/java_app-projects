package CSEA;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BookMyShow {

	private JFrame frame;
	private JTextField tb1;
	private JComboBox c1;
	private JComboBox c2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BookMyShow window = new BookMyShow();
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
	public BookMyShow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(176, 206, 186));
		frame.setBounds(100, 100, 630, 434);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BookMyShow");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(216, 11, 241, 43);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_1.setBounds(10, 133, 75, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Movie");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(10, 170, 68, 29);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tickets");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_3.setBounds(10, 210, 75, 26);
		frame.getContentPane().add(lblNewLabel_3);
		
		tb1 = new JTextField();
		tb1.setBounds(120, 139, 96, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		c1 = new JComboBox();
		c1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "m1", "m2", "m3"}));
		c1.setBounds(120, 177, 96, 20);
		frame.getContentPane().add(c1);
		
		c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"select", "1", "2", "3", "4"}));
		c2.setBounds(120, 216, 96, 20);
		frame.getContentPane().add(c2);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=tb1.getText();
				String sm=(String) c1.getSelectedItem();
				String nt=(String) c2.getSelectedItem();
				int t=Integer.parseInt(nt);
				int bill=0;
				if(sm.equals("m1")) {
					bill=400*t;
					JOptionPane.showMessageDialog(btnNewButton, "hello"+"\n selected movie:"+sm+"\n tickets:"+t+"\n your bill:"+bill);
					
				}
				else if(sm.equals("m2")) {
					bill=500*t;
					JOptionPane.showMessageDialog(btnNewButton, "hello"+"\n selected movie:"+sm+"\n tickets:"+t+"\n your bill:"+bill);
					
				}
				else if(sm.equals("m3")) {
					bill=300*t;
					JOptionPane.showMessageDialog(btnNewButton, "hello"+"\n selected movie:"+sm+"\n tickets:"+t+"\n your bill:"+bill);
					
				}
				else  {
					
					JOptionPane.showMessageDialog(btnNewButton, "hello");
					
				}
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton.setBounds(248, 329, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
