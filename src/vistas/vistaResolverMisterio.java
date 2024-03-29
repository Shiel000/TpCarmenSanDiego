package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import dataDammy.CasoDummy;
import modelo.Caso;

import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vistaResolverMisterio extends JFrame {

	private JPanel contentPane;
	

	private CasoDummy casoDummy;
	
	private vistaJuego siguienteVista= vistaJuego.getVistaJuegoInterfaz();

	private static vistaResolverMisterio interfaz =new vistaResolverMisterio();

	public static vistaResolverMisterio getInterfaz() {
		return interfaz;
		
	}
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vistaResolverMisterio frame = new vistaResolverMisterio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public vistaResolverMisterio() {
		//casoDummy=new CasoDummy();
		//String nombre = casoDummy.getObjetoRobado();
		

		setTitle("aca tiene que ir el nombre del caso u objeto robado");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		
		
		JButton btnIrAInvestigar = new JButton("Ir a investigar");
		btnIrAInvestigar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				mostrarVentanaDeJuego();
				liberarRecurso();
				setVisible(false);
				
			}
		});
		btnIrAInvestigar.setBounds(38, 190, 125, 48);
		contentPane.add(btnIrAInvestigar);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(255, 190, 125, 48);
		contentPane.add(btnNewButton);
		
		JLabel lblAcaVaTexto = new JLabel("aca va texto del caso");
		lblAcaVaTexto.setBounds(0, 0, 432, 177);
		contentPane.add(lblAcaVaTexto);		
	}
	private synchronized void liberarRecurso() {
		this.notifyAll();
	}
	public void mostrarVentanaDeJuego() {
		siguienteVista.lanzar();
	}
	
	public void lanzar() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
