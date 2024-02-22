package CSEA;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class ecommerce {

	private JFrame frame;
	int i=0;
	int bill=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ecommerce window = new ecommerce();
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
	public ecommerce() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setBounds(100, 100, 827, 647);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBackground(Color.PINK);
		lblNewLabel_3.setBounds(669, 320, 98, 112);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\lucif\\OneDrive\\Desktop\\bo1.png"));
		lblNewLabel.setBounds(56, 116, 280, 245);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\lucif\\OneDrive\\Desktop\\bo2.png"));
		lblNewLabel_1.setBounds(376, 87, 216, 293);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Amazon");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_2.setBounds(318, 16, 158, 41);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lb = new JLabel("CART:0");
		lb.setFont(new Font("Tahoma", Font.BOLD, 17));
		lb.setBounds(669, 13, 134, 53);
		frame.getContentPane().add(lb);
		
		JLabel lblNewLabel_4 = new JLabel("120/-");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_4.setBounds(163, 405, 116, 34);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("140/-");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_5.setBounds(434, 405, 98, 34);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel b = new JLabel("BILL:0");
		b.setFont(new Font("Tahoma", Font.BOLD, 17));
		b.setBounds(669, 63, 106, 41);
		frame.getContentPane().add(b);
		
		JButton btnNewButton = new JButton("ADD TO CART ");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				i++;
			    bill+=120;
				b.setText("BILL:"+bill);
				
				lb.setText("CART:"+i);
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton.setBounds(86, 443, 193, 53);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ADD TO CART");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				bill+=140;
				b.setText("BILL:"+bill);
				lb.setText("CART:"+i);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnNewButton_1.setBounds(387, 449, 182, 41);
		frame.getContentPane().add(btnNewButton_1);
		
		
	}
}
