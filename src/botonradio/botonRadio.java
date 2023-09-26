package botonradio;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class botonRadio {

	private JFrame frmBotonRadio;
	private JLabel lblColor;
	private JRadioButton rdbtnRojo;
	private JRadioButton rdbtnVerde;
	private JRadioButton rdbtnAzul;
	private JRadioButton radnegro;
	private JRadioButton radrosa;
	private JRadioButton radamarillo;
	private JRadioButton radnaranja;
	private JRadioButton radmagenta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					botonRadio window = new botonRadio();
					window.frmBotonRadio.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public botonRadio() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmBotonRadio = new JFrame();
		frmBotonRadio.setIconImage(Toolkit.getDefaultToolkit().getImage(botonRadio.class.getResource("/botonradio/obb.png")));
		frmBotonRadio.setTitle("Boton Radio");
		frmBotonRadio.setBounds(100, 100, 450, 300);
		frmBotonRadio.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmBotonRadio.setLocationRelativeTo(null);
		frmBotonRadio.getContentPane().setLayout(null);
		
		rdbtnRojo = new JRadioButton("Rojo");
		rdbtnRojo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.red);	
			}
		});
		rdbtnRojo.setFont(new Font("Verdana", Font.BOLD, 12));
		rdbtnRojo.setBounds(6, 43, 109, 23);
		frmBotonRadio.getContentPane().add(rdbtnRojo);
		
		rdbtnVerde = new JRadioButton("Verde");
		rdbtnVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.green);
			}
		});
		rdbtnVerde.setFont(new Font("Vani", Font.BOLD, 12));
		rdbtnVerde.setBounds(6, 69, 109, 23);
		frmBotonRadio.getContentPane().add(rdbtnVerde);
		
		rdbtnAzul = new JRadioButton("Azul");
		rdbtnAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.blue);
			}
		});
		rdbtnAzul.setFont(new Font("Vani", Font.BOLD, 12));
		rdbtnAzul.setBounds(6, 95, 109, 23);
		frmBotonRadio.getContentPane().add(rdbtnAzul);
		
		lblColor = new JLabel("");
		lblColor.setOpaque(true);
		lblColor.setBounds(206, 45, 154, 154);
		frmBotonRadio.getContentPane().add(lblColor);
		
		radnegro = new JRadioButton("oswaldo");
		radnegro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.black);
			}
		});
		radnegro.setFont(new Font("Verdana", Font.BOLD, 12));
		radnegro.setBounds(6, 123, 109, 23);
		frmBotonRadio.getContentPane().add(radnegro);
		
		radrosa = new JRadioButton("la peppa");
		radrosa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.pink);
			}
		});
		radrosa.setFont(new Font("Verdana", Font.BOLD, 12));
		radrosa.setBounds(6, 149, 109, 23);
		frmBotonRadio.getContentPane().add(radrosa);
		
		radamarillo = new JRadioButton("bob esponja");
		radamarillo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.yellow);
			}
		});
		radamarillo.setFont(new Font("Verdana", Font.BOLD, 12));
		radamarillo.setBounds(6, 175, 109, 23);
		frmBotonRadio.getContentPane().add(radamarillo);
		
		radnaranja = new JRadioButton("esfera del dragon");
		radnaranja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground(Color.orange);
			}
		});
		radnaranja.setFont(new Font("Verdana", Font.BOLD, 12));
		radnaranja.setBounds(6, 201, 154, 23);
		frmBotonRadio.getContentPane().add(radnaranja);
		
		radmagenta = new JRadioButton("Barni");
		radmagenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblColor.setBackground( new Color(207 ,52 ,118));
			}
		});
		radmagenta.setFont(new Font("Verdana", Font.BOLD, 12));
		radmagenta.setBounds(6, 227, 109, 23);
		frmBotonRadio.getContentPane().add(radmagenta);
		
		ButtonGroup grupo=new ButtonGroup();
		grupo.add(rdbtnRojo);
		grupo.add(rdbtnVerde);
		grupo.add(rdbtnAzul);
		grupo.add(radnegro);
		grupo.add(radrosa);
		grupo.add(radamarillo);
		grupo.add(radnaranja);
		grupo.add(radmagenta);
		
	}
}
