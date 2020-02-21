package TrianguloPascal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ScrollPaneConstants;
import java.awt.Color;
import java.awt.Dimension;

public class MyFrame extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtNroDeFilas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyFrame frame = new MyFrame();
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
	public MyFrame() {
		setTitle("Gabriel Valenzuela Segovia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 488);
		//setLayout(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.BLACK);
		//contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		//contentPane.setLayout(new BorderLayout(0, 0));
		contentPane.setLayout(null);
		//setContentPane(contentPane);
		getContentPane().add(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 38, 1184, 411);
		//contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFillsViewportHeight(true);
		table.setBackground(Color.GREEN);
		table.setSize(new Dimension(538, 411));
		scrollPane.setViewportView(table);
		contentPane.add(scrollPane);
		
		
		JButton btnNewButton = new JButton("Iniciar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				llenarTabla();
			}
		});
		btnNewButton.setBounds(10, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		txtNroDeFilas = new JTextField();
		txtNroDeFilas.setText("Nro de filas");
		txtNroDeFilas.setBounds(166, 12, 86, 20);
		contentPane.add(txtNroDeFilas);
		txtNroDeFilas.setColumns(10);
	}

	public void llenarTabla() {
		String [][] datos = getMatriz();
		String [] titulos = getTitulos();
		DefaultTableModel table = new DefaultTableModel(datos, titulos);
        this.table.setModel(table);
	}
	
	public String [][] getMatriz(){
        int filas = Integer.parseInt(txtNroDeFilas.getText());
        int columnas = filas*2-1;
        String [][] datos = new String[filas][columnas];
        int [][] intDatos = TrianguloPascal.getMatriz(filas);
        for(int i = 0; i<filas; i++){
            for(int j = 0; j<columnas; j++){
                if(intDatos[i][j]!=0){
                    datos[i][j] = String.valueOf(intDatos[i][j]);
                }else{
                    datos[i][j] = "";
                }
            }
        }
        return datos;
    }
	
	public String [] getTitulos(){
        int filas = Integer.parseInt(txtNroDeFilas.getText());
        String [] titulos = new String[filas*2-1];
        for(int i = 0; i<filas*2-1;i++){
            titulos[i] = " ";
        }
        return titulos;
    }
    
	
	
}
