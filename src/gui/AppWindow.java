package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import org.antlr.v4.runtime.ANTLRInputStream;

import utils.Logs;
import cli.CmdLineInterface;


public class AppWindow implements ActionListener {

	private JFrame frmPlgEntrega;
	private JTextArea textAreaCodigo;
	private JTextArea textAreaMaquinaPila;
	private JTextArea textAreaTablaSimbolos;
	private JTextArea textAreaErrores;
	
	private JButton btnCargar;
	private JButton btnCompilar;
	private JButton btnExportar;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppWindow window = new AppWindow();
					window.frmPlgEntrega.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public AppWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPlgEntrega = new JFrame();
		frmPlgEntrega.setTitle("PLG - Entrega Enero");
		frmPlgEntrega.setBounds(100, 100, 686, 600);
		frmPlgEntrega.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPlgEntrega.getContentPane().setLayout(null);

		btnCompilar = new JButton("Compilar");
		btnCompilar.addActionListener(this);
		btnCompilar.setBounds(62, 341, 117, 29);
		frmPlgEntrega.getContentPane().add(btnCompilar);

		JLabel lblCodigo = new JLabel("C\u00F3digo");
		lblCodigo.setBounds(16, 6, 200, 16);
		frmPlgEntrega.getContentPane().add(lblCodigo);

		JLabel lblMaquinaPila = new JLabel("M\u00E1quina Pila");
		lblMaquinaPila.setBounds(468, 6, 200, 16);
		frmPlgEntrega.getContentPane().add(lblMaquinaPila);

		JScrollPane scrollPaneCodigo = new JScrollPane();
		lblCodigo.setLabelFor(scrollPaneCodigo);
		scrollPaneCodigo.setBounds(16, 34, 209, 265);
		frmPlgEntrega.getContentPane().add(scrollPaneCodigo);

		textAreaCodigo = new JTextArea();
		scrollPaneCodigo.setViewportView(textAreaCodigo);

		JScrollPane scrollPaneTablaSimbolos = new JScrollPane();
		scrollPaneTablaSimbolos.setBounds(240, 34, 200, 364);
		frmPlgEntrega.getContentPane().add(scrollPaneTablaSimbolos);

		textAreaTablaSimbolos = new JTextArea();
		textAreaTablaSimbolos.setEditable(false);
		scrollPaneTablaSimbolos.setViewportView(textAreaTablaSimbolos);

		JScrollPane scrollPaneMaquinaPila = new JScrollPane();
		lblMaquinaPila.setLabelFor(scrollPaneMaquinaPila);
		scrollPaneMaquinaPila.setBounds(452, 34, 216, 364);
		frmPlgEntrega.getContentPane().add(scrollPaneMaquinaPila);

		textAreaMaquinaPila = new JTextArea();
		textAreaMaquinaPila.setBackground(Color.WHITE);
		textAreaMaquinaPila.setEditable(false);
		scrollPaneMaquinaPila.setViewportView(textAreaMaquinaPila);

		JScrollPane scrollPaneErrores = new JScrollPane();
		scrollPaneErrores.setBounds(17, 410, 651, 150);
		frmPlgEntrega.getContentPane().add(scrollPaneErrores);

		textAreaErrores = new JTextArea();
		scrollPaneErrores.setViewportView(textAreaErrores);

		JLabel lblTablaDeSmbolos = new JLabel("Tabla de S\u00EDmbolos");
		lblTablaDeSmbolos.setLabelFor(scrollPaneTablaSimbolos);
		lblTablaDeSmbolos.setBounds(240, 6, 200, 16);
		frmPlgEntrega.getContentPane().add(lblTablaDeSmbolos);

		JLabel lblErrores = new JLabel("Errores");
		lblErrores.setLabelFor(scrollPaneErrores);
		lblErrores.setBounds(16, 382, 61, 16);
		frmPlgEntrega.getContentPane().add(lblErrores);
		
		btnCargar = new JButton("Cargar");
		btnCargar.addActionListener(this);
		btnCargar.setBounds(16, 300, 99, 29);
		frmPlgEntrega.getContentPane().add(btnCargar);
		
		btnExportar = new JButton("Exportar");
		btnExportar.addActionListener(this);
		btnExportar.setBounds(127, 300, 98, 29);
		frmPlgEntrega.getContentPane().add(btnExportar);
	}

	public JTextArea getTextAreaCodigo() {
		return textAreaCodigo;
	}

	public JTextArea getTextAreaMaquinaPila() {
		return textAreaMaquinaPila;
	}

	public JTextArea getTextAreaTablaSimbolos() {
		return textAreaTablaSimbolos;
	}

	public JTextArea getTextAreaErrores() {
		return textAreaErrores;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCargar) {
			
			// Cargar button onclick listener code
			
		} else if (e.getSource() == btnExportar) {
			
			// Exportar button onclick listener code
			
		} else if (e.getSource() == btnCompilar) {
			
			// Compilar button onclick listener code
			
			CmdLineInterface cli = new CmdLineInterface();
			
			ANTLRInputStream input = new ANTLRInputStream(getTextAreaCodigo().getText());
			cli.exec(input);
					
			textAreaTablaSimbolos.setText("");
			textAreaTablaSimbolos.append(cli.getCompiler().getTS());
			
			textAreaMaquinaPila.setText("");
			textAreaMaquinaPila.append(cli.getCompiler().getCode());
			
			textAreaErrores.setText("");
			textAreaErrores.append(Logs.getErrorsLog());
			
			Logs.clear(); // Ensure logs are cleared between executions
		}
	}
}
