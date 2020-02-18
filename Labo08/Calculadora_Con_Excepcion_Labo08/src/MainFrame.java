import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


//public class MainFrame extends JFrame {
//
//	/**
//	 * 
//	 */
//	private static final long serialVersionUID = 1L;
//	private Calculadora calculadora;
//	
//	public MainFrame() {
//		super("Calculadora");
//		
//		setLayout(new BorderLayout());
//		
//		calculadora = new Calculadora();
//	
//		
//		
//		add(calculadora, BorderLayout.CENTER);
//		
//		setSize(400, 500);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setVisible(true);
//	}
//}


public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Calculadora calculadora;
	public JPanel pantalla;
	
	public MainFrame() {
		setTitle("Calculadora");
		
		this.setLayout(new BorderLayout());
		calculadora = new Calculadora();
		pantalla = new JPanel();
		
		this.add(pantalla, BorderLayout.NORTH);
		this.add(calculadora, BorderLayout.SOUTH);
		
		setSize(300, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}

