package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.Principal;

import javax.swing.JPasswordField;
import java.awt.Label;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.TextArea;

public class Dashboard extends JFrame {
	private JTextField textFieldAmbiente;
	private JTextField textFieldUsuario;
	private JPasswordField passwordFieldSenha;
	private Principal principal;
	
	public Dashboard() {
		
		Principal principal = new Principal();
		getContentPane().setLayout(null);
		
		JLabel LabelAmbiente = new JLabel("Ambiente");
		LabelAmbiente.setBounds(20, 23, 46, 14);
		getContentPane().add(LabelAmbiente);
		
		textFieldAmbiente = new JTextField();
		textFieldAmbiente.setBounds(76, 20, 228, 20);
		getContentPane().add(textFieldAmbiente);
		textFieldAmbiente.setColumns(10);
		textFieldAmbiente.setText("https://sigma.cgna.gov.br/plni/loginPage");
		
		JLabel LabelUsuario = new JLabel("Usuario");
		LabelUsuario.setBounds(20, 65, 46, 14);
		getContentPane().add(LabelUsuario);
		
		textFieldUsuario = new JTextField();
		textFieldUsuario.setBounds(76, 62, 228, 20);
		getContentPane().add(textFieldUsuario);
		textFieldUsuario.setColumns(10);
		
		JLabel LabelSenha = new JLabel("Senha");
		LabelSenha.setBounds(20, 108, 46, 14);
		getContentPane().add(LabelSenha);
		
		passwordFieldSenha = new JPasswordField();
		passwordFieldSenha.setBounds(76, 105, 228, 17);
		getContentPane().add(passwordFieldSenha);
		
		TextArea textAreaMensagem = new TextArea();
		textAreaMensagem.setEditable(false);
		textAreaMensagem.setBounds(118, 128, 380, 160);
		getContentPane().add(textAreaMensagem);
		
		JButton ButtonAnalisar = new JButton("Analisar");
		ButtonAnalisar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
				principal.FPLTesteSuite(LabelAmbiente.getText(), LabelUsuario.getText(), LabelSenha.getText());
				}catch(Exception ex) {
					textAreaMensagem.setText(ex.getMessage());
				}
			}
		});
		ButtonAnalisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		ButtonAnalisar.setBounds(235, 305, 131, 41);
		getContentPane().add(ButtonAnalisar);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dashboard dashboard = new Dashboard();
		dashboard.setBounds(600, 300, 700, 400);
		dashboard.setVisible(true);


	}
}
