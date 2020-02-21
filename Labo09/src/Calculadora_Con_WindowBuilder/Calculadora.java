package Calculadora_Con_WindowBuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private String op1 = "";
	private String op2 = "";
	private String operador = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora(){
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 460, 288);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.NORTH);
		
		//CON JTEXTFIELD
		
		textField = new JTextField();
		textField.setBackground(Color.ORANGE);
		//textField.setText("0");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(21, 21, 390, 48);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(textField.getText().contentEquals("INDEFINIDO!!"))
					textField.setText("");
				textField.setText(textField.getText() + 7);
			}
		});
		btnNewButton.setBounds(21, 80, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textField.getText().contentEquals("INDEFINIDO!!"))
					textField.setText("");
				textField.setText(textField.getText() + 8);
			}
		});
		
		btnNewButton_1.setBounds(120, 80, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textField.getText().contentEquals("INDEFINIDO!!"))
					textField.setText("");
				textField.setText(textField.getText() + 4);
			}
		});
		btnNewButton_2.setBounds(21, 114, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("5");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textField.getText().contentEquals("INDEFINIDO!!"))
					textField.setText("");
				textField.setText(textField.getText() + 5);
			}
		});
		btnNewButton_3.setBounds(120, 114, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("9");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textField.getText().contentEquals("INDEFINIDO!!"))
					textField.setText("");
				textField.setText(textField.getText() + 9);
			}
		});
		btnNewButton_4.setBounds(219, 80, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("6");
		btnNewButton_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textField.getText().contentEquals("INDEFINIDO!!"))
					textField.setText("");
				textField.setText(textField.getText() + 6);
			}
		});
		btnNewButton_5.setBounds(219, 114, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textField.getText().contentEquals("INDEFINIDO!!"))
					textField.setText("");
				textField.setText(textField.getText() + 1);
			}
			
		});
		btnNewButton_6.setBounds(21, 148, 89, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("2");
		btnNewButton_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textField.getText().contentEquals("INDEFINIDO!!"))
					textField.setText("");
				textField.setText(textField.getText() + 2);
			}
		});
		btnNewButton_7.setBounds(120, 148, 89, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("3");
		btnNewButton_8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textField.getText().contentEquals("INDEFINIDO!!"))
					textField.setText("");
				textField.setText(textField.getText() + 3);
			}
		});
		btnNewButton_8.setBounds(219, 148, 89, 23);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("/");
		btnNewButton_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				op1 = textField.getText();
				operador = "Division";
				textField.setText("");
			}
		});
		btnNewButton_9.setBounds(318, 80, 89, 23);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("x");
		btnNewButton_10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				op1 = textField.getText();
				operador = "Multiplicacion";
				textField.setText("");
			}	
		});
		btnNewButton_10.setBounds(318, 114, 89, 23);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton("-");
		btnNewButton_11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				op1 = textField.getText();
				operador = "Resta";
				textField.setText("");
			}
		});
		btnNewButton_11.setBounds(318, 148, 89, 23);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("0");
		btnNewButton_12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField.setText(textField.getText() + 0);
			}
			
		});
		btnNewButton_12.setBounds(21, 183, 89, 23);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton(".");
		btnNewButton_13.setBounds(120, 183, 89, 23);
		contentPane.add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("=");
		btnNewButton_14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				op2 = textField.getText();
				double result = 0;
				try {
					switch(operador) {
					case "Suma":
						result = Double.parseDouble(op1) + Double.parseDouble(op2);
						break;
						
					case "Resta":
						result = Double.parseDouble(op1) - Double.parseDouble(op2);
						break;
						
					case "Multiplicacion":
						result = Double.parseDouble(op1) * Double.parseDouble(op2);
						break;
						
					case "Division":
						result = Integer.parseInt(op1) / Integer.parseInt(op2);
						break;
						
					}
					
					textField.setText("" + result);
				} catch(ArithmeticException a) {
					textField.setText("INDEFINIDO!!");
				}
			}
		});
		btnNewButton_14.setBounds(219, 183, 89, 23);
		contentPane.add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("+");
		btnNewButton_15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				op1 = textField.getText();
				operador = "Suma";
				textField.setText("");
			}
		});
		btnNewButton_15.setBounds(318, 183, 89, 23);
		contentPane.add(btnNewButton_15);
	}
}
