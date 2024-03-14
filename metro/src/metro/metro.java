package metro;
//asdfggjhgjhk
//fhbcnvbn

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class metro {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metro window = new metro();
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
	public metro() {
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
		
		JLabel tb1 = new JLabel("Metro Ticket Booking");
		tb1.setForeground(new Color(255, 0, 128));
		tb1.setFont(new Font("Cambria Math", Font.BOLD | Font.ITALIC, 15));
		tb1.setBounds(151, 35, 161, 14);
		frame.getContentPane().add(tb1);
		
		JLabel lb1 = new JLabel("Name");
		lb1.setForeground(new Color(64, 0, 64));
		lb1.setFont(new Font("Cambria Math", Font.BOLD | Font.ITALIC, 14));
		lb1.setBounds(67, 78, 46, 14);
		frame.getContentPane().add(lb1);
		
		textField = new JTextField();
		textField.setBounds(172, 75, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "jbs", "uppal", "miyapur"}));
		comboBox.setBounds(172, 118, 86, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel cb1 = new JLabel("Source");
		cb1.setForeground(new Color(64, 0, 64));
		cb1.setFont(new Font("Cambria Math", Font.BOLD | Font.ITALIC, 14));
		cb1.setBounds(67, 122, 46, 14);
		frame.getContentPane().add(cb1);
	
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Ameerpet", "Dilsukhnagar", "paradise"}));
		comboBox_1.setBounds(172, 161, 86, 22);
		frame.getContentPane().add(comboBox_1);
		
		JLabel cb2 = new JLabel("New label");
		cb2.setBounds(11, 77, 46, -25);
		frame.getContentPane().add(cb2);
		
		JLabel lblNewLabel_2 = new JLabel("Tickets");
		lblNewLabel_2.setForeground(new Color(64, 0, 64));
		lblNewLabel_2.setFont(new Font("Cambria Math", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_2.setBounds(67, 201, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "3", "4"}));
		comboBox_2.setBounds(172, 194, 86, 22);
		frame.getContentPane().add(comboBox_2);
		
		JButton b1 = new JButton("Confirm");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String source=(String) cb1.getSelectedItem();
				String destination=(String) comboBox_1.getSelectedItem();
				String tickets=(String) comboBox_2.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				if(source.equals(destination))
				{
					JOptionPane.showMessageDialog(b1, "please check stations");
					
				}
				else
				{
					int bill=nt*45;
					JOptionPane.showMessageDialog(b1,"NAME"+name+"\n SOURCE"+source+"\n destination"+destination+"\n number of tickets"+tickets+"\n amount"+bill);)
				}
				
			}
		});
		b1.setBounds(299, 211, 89, 23);
		frame.getContentPane().add(b1);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ON LINE LAB\\Downloads\\metroo.png"));
		lblNewLabel_1.setBounds(0, 0, 424, 250);
		frame.getContentPane().add(lblNewLabel_1);
	}

}
