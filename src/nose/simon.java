package nose;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;

public class simon {

	private JFrame frmLista;
	private JButton btnAgregar;
	private JTextField textNombre;
	private JList listNombres;
	private JButton btnBorrar;
	private JLabel lblHola;
	DefaultListModel model=new DefaultListModel();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					simon window = new simon();
					window.frmLista.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public simon() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLista = new JFrame();
		frmLista.setIconImage(Toolkit.getDefaultToolkit().getImage(simon.class.getResource("/nose/obb.png")));
		frmLista.setTitle("Lista");
		frmLista.setBounds(100, 100, 481, 499);
		frmLista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLista.setLocationRelativeTo(null);
		frmLista.getContentPane().setLayout(null);
		
		listNombres = new JList();
		listNombres.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent e) {
			lblHola.setText("Hola "+listNombres.getSelectedValue());	
			}
		});
		
		listNombres.setBorder(new LineBorder(new Color(0, 0, 0)));
		listNombres.setBounds(28, 218, 201, 223);
		frmLista.getContentPane().add(listNombres);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 117, 46, 14);
		frmLista.getContentPane().add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(62, 114, 86, 20);
		frmLista.getContentPane().add(textNombre);
		textNombre.setColumns(10);
		
		btnAgregar = new JButton("agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				model.addElement(textNombre.getText());
				listNombres.setModel(model);
			}
		});
		btnAgregar.setBounds(28, 167, 89, 23);
		frmLista.getContentPane().add(btnAgregar);
		
		btnBorrar = new JButton("borrar");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textNombre.setText("");
				model.clear();
				listNombres.setModel(model);
				lblHola.setText("");
			}
		});
		btnBorrar.setBounds(127, 167, 89, 23);
		frmLista.getContentPane().add(btnBorrar);
		
		lblHola = new JLabel("");
		lblHola.setBorder(new LineBorder(new Color(0, 0, 0), 3, true));
		lblHola.setBounds(234, 289, 209, 53);
		frmLista.getContentPane().add(lblHola);
	}
}
