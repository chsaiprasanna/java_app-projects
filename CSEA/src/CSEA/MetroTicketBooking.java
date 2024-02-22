package CSEA;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MetroTicketBooking {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetroTicketBooking window = new MetroTicketBooking();
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
	public MetroTicketBooking() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 701, 487);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("MetroTicketBooking");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(205, 11, 249, 50);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_1.setBounds(43, 118, 79, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("From");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_2.setBounds(43, 159, 79, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("To");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_3.setBounds(43, 212, 79, 30);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tickets");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_4.setBounds(46, 262, 73, 30);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(174, 126, 125, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"JNTU", "MYP", "HITECH"}));
		c1.setBounds(174, 166, 125, 30);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"JNTU", "MYP", "HITECH"}));
		c2.setBounds(174, 219, 125, 23);
		frame.getContentPane().add(c2);
		
		JComboBox t = new JComboBox();
		t.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3"}));
		t.setBounds(174, 269, 115, 23);
		frame.getContentPane().add(t);
		
		JButton b1 = new JButton("BOOK");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int bill=40;
				String n=tb1.getText();
				//String to=(String) c2.getSelectedItem();
				//String from=(String) c1.getSelectedItem();
				
				String nt=(String) t.getSelectedItem();
				int k=Integer.parseInt(nt);
				String sm1=(String) c1.getSelectedItem();
				String sm2=(String) c2.getSelectedItem();
				if(sm1.equals(sm2)) {
					JOptionPane.showMessageDialog(b1, "you cannot choose the source and destination same");
					
				}
				else {
					JOptionPane.showMessageDialog(b1, "Hi "+n+"\nConfirm the details:"+"\nfrom:"+sm1+"\nto:"+sm2+"\nBill :"+bill*k);
					
				}
			}
		});
		b1.setFont(new Font("Tahoma", Font.BOLD, 18));
		b1.setBounds(275, 371, 115, 30);
		frame.getContentPane().add(b1);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\lucif\\OneDrive\\Desktop\\M.png"));
		lblNewLabel_5.setBounds(0, 11, 182, 104);
		frame.getContentPane().add(lblNewLabel_5);
	}

}
