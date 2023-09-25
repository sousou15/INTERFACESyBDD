package Interfaz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Registro extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Registro frame = new Registro();
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
	public Registro() {
		setResizable(false); // Impedimos cambiar el tamaño de ventana
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 524);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Principal p = new Principal();
				p.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_2.setIcon(new ImageIcon(Registro.class.getResource("/Interfaz/iniciosec (1).png")));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(390, 364, 108, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Principal p = new Principal();
				p.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setIcon(new ImageIcon(Registro.class.getResource("/Interfaz/cancel (1).png")));
		btnNewButton_1.setBackground(UIManager.getColor("Button.darkShadow"));
		btnNewButton_1.setBounds(390, 273, 108, 23);
		contentPane.add(btnNewButton_1);
/*botón CREAR CUENTA*/		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(passwordField.getText().equals(passwordField_1.getText()) && passwordField.getText().length()>7 && textField_2.getText().length() > 0
						&& textField_3.getText().length() > 0 && textField_1.getText().contains("@")&& textField_1.getText().contains(".")) {
					Principal p = new Principal();
					p.setVisible(true);
					setVisible(false);
				}else {
					JOptionPane.showMessageDialog(btnNewButton,"Revisa que las contraseñas sean iguales y tengan por lo menos 8 caracteres. ",
                            "ERROR", JOptionPane.ERROR_MESSAGE);
				}

			}
		});
		btnNewButton.setIcon(new ImageIcon(Registro.class.getResource("/Interfaz/crear (1).png")));
		btnNewButton.setBounds(390, 192, 108, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setIcon(new ImageIcon(Registro.class.getResource("/Interfaz/nosoyrobbot (1).png")));
		lblNewLabel_5.setBounds(169, 423, 102, 23);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Registro.class.getResource("/Interfaz/registro (1).png")));
		lblNewLabel_3.setBounds(149, 32, 284, 37);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Registro.class.getResource("/Interfaz/picturetopeople.org-c52453e2eb47787976b5f392cac17ae3149ac6d07dfbc8ef90 (1).png")));
		lblNewLabel.setBounds(66, 121, 72, 14);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(169, 118, 137, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(169, 274, 137, 20);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(169, 325, 137, 20);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(169, 365, 137, 20);
		contentPane.add(textField_3);
		
		JLabel lblCorreo = new JLabel("Correo electrónico");
		lblCorreo.setIcon(new ImageIcon(Registro.class.getResource("/Interfaz/correo (1).png")));
		lblCorreo.setBounds(45, 277, 102, 14);
		contentPane.add(lblCorreo);
		
		JLabel lblRepetirContrasea = new JLabel("");
		lblRepetirContrasea.setIcon(new ImageIcon(Registro.class.getResource("/Interfaz/repetircontra (3).png")));
		lblRepetirContrasea.setBounds(45, 223, 114, 17);
		contentPane.add(lblRepetirContrasea);
		
		JLabel lblApellidos = new JLabel("Apellidos");
		lblApellidos.setIcon(new ImageIcon(Registro.class.getResource("/Interfaz/apellidos (1).png")));
		lblApellidos.setBounds(66, 368, 72, 14);
		contentPane.add(lblApellidos);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(169, 171, 137, 20);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Registro.class.getResource("/Interfaz/picturetopeople.org-65b57afc1861b6df5e947ef8d5d959e7747c620a45f5ec67c6 (1).png")));
		lblNewLabel_4.setBounds(60, 174, 78, 14);
		contentPane.add(lblNewLabel_4);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(169, 223, 137, 20);
		contentPane.add(passwordField_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setBounds(285, 423, 21, 23);
		chckbxNewCheckBox.setOpaque(false);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_1 = new JLabel("Nombre");
		lblNewLabel_1.setIcon(new ImageIcon(Registro.class.getResource("/Interfaz/nombre (1).png")));
		lblNewLabel_1.setBounds(66, 328, 72, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Registro.class.getResource("/Interfaz/1230601.jpg")));
		lblNewLabel_2.setBounds(-394, 0, 1019, 607);
		contentPane.add(lblNewLabel_2);
	}
}
