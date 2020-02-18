import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextArea textArea;
	private JButton btn1;
	private JButton btn2;
	private int num = 0;
	
	
	
	public MainFrame() {
		super("Welcome to the Future!");
		
		setLayout(new BorderLayout());
		
		btn1 = new JButton("Boton 1");
		textArea = new JTextArea();
		btn2 = new JButton("Boton 2");
		
		// listen to button clicks; remember Android?
		// can be done also implementing it in the class
		
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//textArea.append("Soy SM\n");
				if(num % 2 ==0) {
					num = num + 1;
				}else {
					num = num + 2;
				}
				textArea.append(String.valueOf(num + "\n"));
			}
		});
		
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//textArea.append("Soy de la FISI\n");
				if(num % 2 ==0) {
					num = num + 2;
				}else {
					num++;
				}
				textArea.append(String.valueOf(num + "\n"));
				
			}
		});
		
		
		
		
		add(textArea, BorderLayout.CENTER);
		add(btn1, BorderLayout.NORTH);
		add(btn2, BorderLayout.SOUTH);
		
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
}
