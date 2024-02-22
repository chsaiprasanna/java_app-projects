package CSEA;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Registartion {

	private JFrame frame;
	private JTextField tb1;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registartion window = new Registartion();
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
	public Registartion()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 703, 497);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("REGISTRATION");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 27));
		lblNewLabel.setBounds(247, 11, 220, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_1.setBounds(20, 104, 128, 27);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Emailid");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_2.setBounds(20, 152, 134, 27);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Phone num");
		lblNewLabel_3.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_3.setBounds(20, 198, 128, 27);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Branch");
		lblNewLabel_4.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_4.setBounds(20, 250, 128, 32);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(158, 109, 96, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(158, 157, 96, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(158, 203, 96, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "cse", "it", "mech", "aiml"}));
		cb1.setBounds(158, 257, 96, 25);
		frame.getContentPane().add(cb1);
		
		JLabel lblNewLabel_5 = new JLabel("Gender");
		lblNewLabel_5.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_5.setBounds(20, 316, 124, 20);
		frame.getContentPane().add(lblNewLabel_5);
		
		JRadioButton r1 = new JRadioButton("male");
		r1.setFont(new Font("Times New Roman", Font.BOLD, 17));
		r1.setBounds(143, 317, 111, 23);
		frame.getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("female");
		r2.setFont(new Font("Times New Roman", Font.BOLD, 17));
		r2.setBounds(262, 317, 111, 23);
		frame.getContentPane().add(r2);
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);
		
		JLabel lblNewLabel_6 = new JLabel("Languages");
		lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel_6.setBounds(20, 377, 96, 27);
		frame.getContentPane().add(lblNewLabel_6);
		
		JCheckBox c1 = new JCheckBox("Python");
		c1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		c1.setBounds(144, 381, 99, 23);
		frame.getContentPane().add(c1);
		
		JCheckBox c2 = new JCheckBox("Java");
		c2.setFont(new Font("Times New Roman", Font.BOLD, 16));
		c2.setBounds(247, 381, 99, 23);
		frame.getContentPane().add(c2);
		
		JButton b1 = new JButton("submit");
		b1.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
						String n=tb1.getText();
						String b=(String)cb1.getSelectedItem();
						String g;
						if(r1.isSelected()) 
						{
							g="male";
						}
						else if(r2.isSelected()) 
						{
							g="female";
						}
						else 
						{
							g="invalid";
						}
					    String p1="";
					    if(c1.isSelected()) {
					    	p1=p1+"Python";
					    }
					    if(c2.isSelected()) {
					    	p1=p1+"Java";
					    }
					    int res=0;
					    res=JOptionPane.showConfirmDialog(b1, "hello"+n+"\n please confirm details:\nbranch:"+b+"\ngender:"+g+"\nprogramming lang:"+p1);
						if(res==JOptionPane.YES_OPTION) {
							JOptionPane.showMessageDialog(b1,"reg done" );
							
						}
						else {
							JOptionPane.showMessageDialog(b1,"reg cancelled" );
						}
					
					}
			
		});
		b1.setBounds(284, 426, 89, 23);
		frame.getContentPane().add(b1);
	}
}

