package botonradio;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.SpinnerNumberModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class Cuadrado extends JFrame {

	private JPanel contentPane;
	private JTextField txt1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Cuadrado frame = new Cuadrado();
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
	public Cuadrado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Lado");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 13));
		lblNewLabel.setBounds(64, 32, 73, 22);
		contentPane.add(lblNewLabel);
		JLabel a = new JLabel("");
		a.setFont(new Font("Verdana", Font.PLAIN, 13));
		a.setBounds(30, 120, 160, 22);
		contentPane.add(a);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(220, 131, 204, 119);
		contentPane.add(lblNewLabel_1);
		
		JButton spl = new JButton("Calcular");
		spl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double L=Double.parseDouble(txt1.getText());
				double ar=L*L;
				a.setText("El area es"+ar);
				
			}
		});
		spl.setBackground(Color.LIGHT_GRAY);
		spl.setFont(new Font("Verdana", Font.PLAIN, 13));
		spl.setBounds(269, 34, 89, 23);
		contentPane.add(spl);
		
		txt1 = new JTextField();
		txt1.setBounds(104, 35, 86, 20);
		contentPane.add(txt1);
		txt1.setColumns(10);
		
		JButton btnNewButton = new JButton("Volver al menu");
		btnNewButton.setBounds(269, 86, 125, 23);
		contentPane.add(btnNewButton);
		
		
	}
}
