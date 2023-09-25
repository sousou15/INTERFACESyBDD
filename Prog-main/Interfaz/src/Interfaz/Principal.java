package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;
import java.awt.Font;

public class Principal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setResizable(false); // Impedimos cambiar el tamaño de ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 248);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Mostrar contraseña");
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 8));
		chckbxNewCheckBox.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
                if (chckbxNewCheckBox.isSelected()==true) {
                	passwordField.setEchoChar((char)0);
                }else {
                	passwordField.setEchoChar('●');
                }
         }
			
		});
		chckbxNewCheckBox.setBounds(292, 123, 136, 23);
		chckbxNewCheckBox.setOpaque(false);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_3 = new JLabel("titulo");
		lblNewLabel_3.setIcon(new ImageIcon(Principal.class.getResource("/Interfaz/picturetopeople.org-58e30dd42bab1064505291952703d766d591fbada8dd8eca49 (1).png")));
		lblNewLabel_3.setBounds(78, 11, 266, 20);
		contentPane.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(171, 75, 115, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Usuario");
		lblNewLabel.setIcon(new ImageIcon(Principal.class.getResource("/Interfaz/picturetopeople.org-c52453e2eb47787976b5f392cac17ae3149ac6d07dfbc8ef90 (1).png")));
		lblNewLabel.setBounds(65, 78, 61, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Contraseña");
		lblNewLabel_1.setIcon(new ImageIcon(Principal.class.getResource("/Interfaz/picturetopeople.org-65b57afc1861b6df5e947ef8d5d959e7747c620a45f5ec67c6 (1).png")));
		lblNewLabel_1.setBounds(65, 127, 72, 14);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(171, 124, 115, 20);
		contentPane.add(passwordField);
		
		JButton btnNewButton = new JButton("Inicio");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String correo = textField.getText();
				String contrasena = passwordField.getText();
				VerificarUsuario verificar = new VerificarUsuario();
				if(verificar.verificarUsuario(correo, contrasena)) {
					Bienvenido bvn = new Bienvenido();
					bvn.setVisible(true);
					setVisible(false);
				}else {
					JOptionPane.showMessageDialog(btnNewButton,"Contraseña o usuario incorrectos!",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		/*botón INICIO*/
		btnNewButton.setBounds(117, 180, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Registrarse");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Registro r = new Registro();
				r.setVisible(true);
				setVisible(false);	
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(241, 180, 115, 23);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(Principal.class.getResource("/Interfaz/24868.gif")));
		lblNewLabel_2.setBounds(0, -32, 434, 261);
		contentPane.add(lblNewLabel_2);
	}
}
