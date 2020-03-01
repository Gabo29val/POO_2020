package exercise_02;

import java.awt.Color;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Ventana extends javax.swing.JFrame implements Runnable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArregloPersonas personas = new ArregloPersonas();

	public Ventana() {
		initComponents();
		this.setSize(600, 500);
		this.setLocationRelativeTo(null);
		this.setTitle("Valenzuela Segovia Gabriel");

		iniciarReloj();
		cargarTabla();
	}

	public void cargarTabla() {
		String[] titulos = personas.getTitulos();
		String[][] datos = personas.getPersonas();
		DefaultTableModel tabla = new DefaultTableModel(datos, titulos);
		this.jTable.setModel(tabla);
	}

	public void limpiarCampos() {
		this.jTId.setText("");
		this.jTNombre.setText("");
		this.jTApellido.setText("");
		this.jTEdad.setText("");
	}

	public void iniciarReloj() {
		Thread t = new Thread(this);
		t.start();
	}

	private void initComponents() {

		jPanel = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jTNombre = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jTApellido = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jTEdad = new javax.swing.JTextField();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable = new javax.swing.JTable();
		jButtonGuardar = new javax.swing.JButton();
		jLabel4 = new javax.swing.JLabel();
		jTId = new javax.swing.JTextField();
		jPanel1 = new javax.swing.JPanel();
		jLReloj = new javax.swing.JLabel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel.setLayout(null);
		jPanel.setBackground(Color.GREEN);

		jLabel1.setText("Nombre:");
		jPanel.add(jLabel1);
		jLabel1.setBounds(140, 130, 50, 16);
		jPanel.add(jTNombre);
		jTNombre.setBounds(220, 130, 240, 24);

		jLabel2.setText("Apellido:");
		jPanel.add(jLabel2);
		jLabel2.setBounds(140, 170, 50, 16);
		jPanel.add(jTApellido);
		jTApellido.setBounds(220, 170, 240, 24);

		jLabel3.setText("Edad:");
		jPanel.add(jLabel3);
		jLabel3.setBounds(140, 210, 33, 16);
		jPanel.add(jTEdad);
		jTEdad.setBounds(220, 210, 240, 24);

		jTable.setModel(
				new javax.swing.table.DefaultTableModel(
						new Object[][] { { null, null, null, null }, { null, null, null, null },
								{ null, null, null, null }, { null, null, null, null } },
						new String[] { "Title 1", "Title 2", "Title 3", "Title 4" }));
		jScrollPane1.setViewportView(jTable);

		jPanel.add(jScrollPane1);
		jScrollPane1.setBounds(50, 300, 500, 160);

		jButtonGuardar.setText("Guardar");
		jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButtonGuardarActionPerformed(evt);
			}
		});
		jPanel.add(jButtonGuardar);
		jButtonGuardar.setBounds(240, 250, 77, 32);

		jLabel4.setText("Id:");
		jPanel.add(jLabel4);
		jLabel4.setBounds(140, 90, 25, 16);
		jPanel.add(jTId);
		jTId.setBounds(220, 90, 240, 24);

		// jPanel1.setBackground(new java.awt.Color(204, 255, 51));
		jPanel1.setBackground(Color.ORANGE);
		jPanel1.setLayout(null);

		jLReloj.setBackground(new java.awt.Color(255, 204, 0));
		jLReloj.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
		jLReloj.setText("00:00:00");
		jPanel1.add(jLReloj);
		jLReloj.setBounds(130, 10, 150, 40);

		jPanel.add(jPanel1);
		jPanel1.setBounds(90, 20, 410, 60);

		getContentPane().add(jPanel, java.awt.BorderLayout.CENTER);

		pack();
	}

	private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonGuardarActionPerformed
		String id = this.jTId.getText();
		String nombre = this.jTNombre.getText();
		String apellido = this.jTApellido.getText();
		int edad = Integer.parseInt(this.jTEdad.getText());

		Persona p = new Persona(id, nombre, apellido, edad);
		if (personas.addPersona(p)) {
			JOptionPane.showMessageDialog(null, "Agregado con exito!");
			cargarTabla();
			limpiarCampos();
		}
	}// GEN-LAST:event_jButtonGuardarActionPerformed

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Ventana().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JButton jButtonGuardar;
	private javax.swing.JLabel jLReloj;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextField jTApellido;
	private javax.swing.JTextField jTId;
	private javax.swing.JTextField jTEdad;
	private javax.swing.JTextField jTNombre;
	private javax.swing.JTable jTable;
	// End of variables declaration//GEN-END:variables

	@Override
	public void run() {
		Date tiempo;
		while (true) {
			tiempo = new Date();
			this.jLReloj.setText(tiempo.getHours() + ":" + tiempo.getMinutes() + ":" + tiempo.getSeconds());

		}

	}
}
