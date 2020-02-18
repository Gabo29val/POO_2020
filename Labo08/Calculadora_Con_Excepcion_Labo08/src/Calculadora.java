import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

//public class Calculadora extends JPanel implements ActionListener{
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	private JButton btn1;
//	private JButton btn2;
//	
//	private JButton btnSum;
//	private JButton btnIgual;
//	
//	private int oper1 = 0;
//	private int oper2 = 0;
//	private String operador;
//	
//	// Bad Implementation: the Toolbar and the TextPanel are not
//	// fully separated
//	private JTextArea textArea;
//	
//	public Calculadora() {
//		btn1 = new JButton("1");
//		btn2 = new JButton("2");
//		btnSum = new JButton("+");
//		btnIgual = new JButton("=");
//		
//		btn1.addActionListener(this);
//		btn2.addActionListener(this);
//		btnIgual.addActionListener(this);
//		btnSum.addActionListener(this);
//		
//		textArea = new JTextArea();
//		
//		setLayout(new FlowLayout(FlowLayout.LEFT));
//		
//		add(btn1);
//		add(btn2);
//		add(btnIgual);
//		add(btnSum);
//		
//		add(textArea);
//	}
//
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		
//		JButton btnClicked = (JButton)e.getSource();
//		
//		if (btnClicked == btn1) {
//			textArea.append("1");
//		} else if (btnClicked == btn2) {
//			textArea.append("2");
//		}else if(btnClicked == btnSum) {
//			String opers1 = textArea.getText();
//			oper1 = Integer.parseInt(opers1);
//			operador = "Suma";
//			
//			textArea.setText("");
//		}else if(btnClicked == btnIgual) {
//			String opers2 = textArea.getText();
//			oper2 = Integer.parseInt(opers2);
//			
//			//switch-case () las operaciones
//			
//			textArea.setText(""+(oper1+oper2));
//		}
//		
//		
//		
//	}
//}

public class Calculadora extends JPanel implements ActionListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn10;
	private JButton btn11;
	private JButton btn12;
	private JButton btn13;
	private JButton btn14;
	private JButton btn15;
	private JButton btn16;
	private JButton btn17;
	
	private double oper1 = 0;
	private double oper2 = 0;
	private String operador;
	
	
	private JTextArea textArea;
	
	public Calculadora() {
		
		setLayout(new GridLayout(5, 4, 20, 20));
		//param:	filas,columnas,espacio entre filas
		//			espacio entre columnas
		btn1 = new JButton("7");
		btn2 = new JButton("8");
		btn3 = new JButton("9");
		btn4 = new JButton("/");
		btn5 = new JButton("4");
		btn6 = new JButton("5");
		btn7 = new JButton("6");
		btn8 = new JButton("x");
		btn9 = new JButton("1");
		btn10 = new JButton("2");
		btn11 = new JButton("3");
		btn12 = new JButton("-");
		btn13 = new JButton("0");
		btn14 = new JButton(".");
		btn15 = new JButton("=");
		btn16 = new JButton("+");
		btn17 = new JButton("AC");
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btn10.addActionListener(this);
		btn11.addActionListener(this);
		btn12.addActionListener(this);
		btn13.addActionListener(this);
		btn14.addActionListener(this);
		btn15.addActionListener(this);
		btn16.addActionListener(this);
		btn17.addActionListener(this);
		
		textArea = new JTextArea();
		add(textArea);
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		add(btn6);
		add(btn7);
		add(btn8);
		add(btn9);
		add(btn10);
		add(btn11);
		add(btn12);
		add(btn13);
		add(btn14);
		add(btn15);
		add(btn16);
		add(btn17);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btnClicked = (JButton)e.getSource();
		
		//operandos
		String opers1;
		String opers2;
		
		//numeros
		if(btnClicked == btn1)
			textArea.append("7");
		if(btnClicked == btn2)
			textArea.append("8");
		if(btnClicked == btn3)
			textArea.append("9");
		if(btnClicked == btn5)
			textArea.append("4");
		if(btnClicked == btn6)
			textArea.append("5");
		if(btnClicked == btn7)
			textArea.append("6");
		if(btnClicked == btn9)
			textArea.append("1");
		if(btnClicked == btn10)
			textArea.append("2");
		if(btnClicked == btn11)
			textArea.append("3");
		if(btnClicked == btn13)
			textArea.append("0");
		if(btnClicked == btn17)
			textArea.setText("");
		
		//asignando operador
		if(btnClicked == btn16) {
			opers1 = textArea.getText();
			oper1 = Double.parseDouble(opers1);
			operador = "Suma";
			textArea.setText("");
		}
		if(btnClicked == btn12) {
			opers1 = textArea.getText();
			oper1 = Double.parseDouble(opers1);
			operador = "Resta";
			textArea.setText("");
		}
		if(btnClicked == btn8) {
			opers1 = textArea.getText();
			oper1 = Double.parseDouble(opers1);
			operador = "Multiplicacion";
			textArea.setText("");
		}
		if(btnClicked == btn4) {
			opers1 = textArea.getText();
			oper1 = Double.parseDouble(opers1);
			operador = "Division";
			textArea.setText("");
		}
		if(btnClicked == btn15) {
			opers2 = textArea.getText();
			oper2 = Double.parseDouble(opers2);
			
			switch(operador) {
			case "Suma":
				textArea.setText(""+(oper1 + oper2));
				break;
			case "Resta":
				textArea.setText(""+(oper1 - oper2));
				break;
			case "Multiplicacion":
				textArea.setText(""+(oper1 * oper2));
				break;
			case "Division":
				try {
					textArea.setText(""+(oper1 / oper2));
				} catch(ArithmeticException a) {
					System.out.println("No se puede dividir por cero!!");
				}
				break;
			}
		}
		
	}
}
