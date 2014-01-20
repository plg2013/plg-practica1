package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
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

		btnCargar = new JButton("Cargar...");
		btnCargar.addActionListener(this);
		btnCargar.setBounds(16, 311, 209, 29);
		frmPlgEntrega.getContentPane().add(btnCargar);
		
		btnCompilar = new JButton("Compilar");
		btnCompilar.addActionListener(this);
		btnCompilar.setBounds(16, 351, 209, 29);
		frmPlgEntrega.getContentPane().add(btnCompilar);

		JLabel lblCodigo = new JLabel("C\u00F3digo");
		lblCodigo.setBounds(16, 6, 200, 29);
		frmPlgEntrega.getContentPane().add(lblCodigo);

		JLabel lblMaquinaPila = new JLabel("M\u00E1quina Pila");
		lblMaquinaPila.setBounds(454, 6, 200, 29);
		frmPlgEntrega.getContentPane().add(lblMaquinaPila);

		JScrollPane scrollPaneCodigo = new JScrollPane();
		lblCodigo.setLabelFor(scrollPaneCodigo);
		scrollPaneCodigo.setBounds(16, 34, 209, 265);
		frmPlgEntrega.getContentPane().add(scrollPaneCodigo);

		textAreaCodigo = new JTextArea();
		scrollPaneCodigo.setViewportView(textAreaCodigo);

		JScrollPane scrollPaneTablaSimbolos = new JScrollPane();
		scrollPaneTablaSimbolos.setBounds(240, 34, 200, 367);
		frmPlgEntrega.getContentPane().add(scrollPaneTablaSimbolos);

		textAreaTablaSimbolos = new JTextArea();
		textAreaTablaSimbolos.setEditable(false);
		scrollPaneTablaSimbolos.setViewportView(textAreaTablaSimbolos);

		JScrollPane scrollPaneMaquinaPila = new JScrollPane();
		lblMaquinaPila.setLabelFor(scrollPaneMaquinaPila);
		scrollPaneMaquinaPila.setBounds(452, 34, 216, 323);
		frmPlgEntrega.getContentPane().add(scrollPaneMaquinaPila);

		textAreaMaquinaPila = new JTextArea();
		textAreaMaquinaPila.setBackground(Color.WHITE);
		textAreaMaquinaPila.setEditable(false);
		scrollPaneMaquinaPila.setViewportView(textAreaMaquinaPila);

		JScrollPane scrollPaneErrores = new JScrollPane();
		scrollPaneErrores.setBounds(17, 421, 651, 139);
		frmPlgEntrega.getContentPane().add(scrollPaneErrores);

		textAreaErrores = new JTextArea();
		scrollPaneErrores.setViewportView(textAreaErrores);

		JLabel lblTablaDeSmbolos = new JLabel("Tabla de S\u00EDmbolos");
		lblTablaDeSmbolos.setLabelFor(scrollPaneTablaSimbolos);
		lblTablaDeSmbolos.setBounds(240, 6, 200, 29);
		frmPlgEntrega.getContentPane().add(lblTablaDeSmbolos);

		JLabel lblErrores = new JLabel("Errores");
		lblErrores.setLabelFor(scrollPaneErrores);
		lblErrores.setBounds(16, 392, 61, 33);
		frmPlgEntrega.getContentPane().add(lblErrores);
		
		btnExportar = new JButton("Exportar");
		btnExportar.addActionListener(this);
		btnExportar.setBounds(454, 369, 214, 29);
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
			
			final JFileChooser chooser = new JFileChooser();
			int ret = chooser.showOpenDialog(frmPlgEntrega);
			
			if (ret == JFileChooser.APPROVE_OPTION) {
	        
				File filename = chooser.getSelectedFile();
				
				FileReader filereader = null;
				try {
					filereader = new FileReader(filename);
				} catch (FileNotFoundException e1) {
					e1.printStackTrace();
				}
				
				BufferedReader buffreader=new BufferedReader(filereader);    
				try {
					textAreaCodigo.read(buffreader, null);
					buffreader.close();
				} catch (IOException e1) {
					e1.printStackTrace();
				}  
				 
					
	            
			}
            
            
        } else if (e.getSource() == btnExportar) {
                
        	final JFileChooser chooser = new JFileChooser();
			int ret = chooser.showOpenDialog(frmPlgEntrega);
			
			if (ret == JFileChooser.APPROVE_OPTION) {
	        
				File filename = chooser.getSelectedFile();
				
				try {
					FileWriter writer = new FileWriter(filename.toString(), false);
					textAreaMaquinaPila.write(writer);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
        	
        	
        	
                
        } else if (e.getSource() == btnCompilar) {
                
                // Crea la app de consola que actuara en segundo plano
                CmdLineInterface cli = new CmdLineInterface();
                
                // Ejecuta la cli con el texto introducido por el usuario
                ANTLRInputStream input = new ANTLRInputStream(getTextAreaCodigo().getText());
                cli.exec(input);
                                
                // Muestra la informacion al usuario
                textAreaTablaSimbolos.setText("");
                textAreaTablaSimbolos.append(cli.getCompiler().getTS());
                textAreaMaquinaPila.setText("");
                textAreaMaquinaPila.append(cli.getCompiler().getCode());
                textAreaErrores.setText("");
                textAreaErrores.append(Logs.getErrorsLog());
                
                Logs.clear(); // Vacia los logs entre ejecuciones para evitar redundancia de info
        }
	}
}
