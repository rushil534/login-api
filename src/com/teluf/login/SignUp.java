package com.teluf.login;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.teluf.login.exceptions.FileCreatedInterruptionException;

public class SignUp extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private static final String SPACE = " ";
	
	JPanel panel;
	JLabel username, password, message;
	JTextField username_text;
	JPasswordField password_text;
	JButton confirm;
	
	Validate v = new Validate();
	
	protected void run(int x, int y) {
		if(panel == null) {
			username = new JLabel();
			username.setText(SPACE + "username:");
			username_text = new JTextField();
			
			password = new JLabel();
			password.setText(SPACE + "password:");
			password_text = new JPasswordField();
			
			message = new JLabel();
			
			confirm = new JButton("confirm");
			confirm.addActionListener(this);
			
			panel = new JPanel(new GridLayout(3, 1));
			panel.add(username);
			panel.add(username_text);
			panel.add(password);
			panel.add(password_text);
			panel.add(message);
			panel.add(confirm);
			
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
			setResizable(false);
			setLayout(new BorderLayout());
			add(panel, BorderLayout.CENTER);
			setTitle("sign up here");
			setSize(x, y);
			setLocationRelativeTo(null);
		}
		setVisible(true);
	}
	
	private void inputCredentialsToFile(String u, String p, File e) throws IOException, FileCreatedInterruptionException {
		if(u.isEmpty() && p.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Username and Password fields are blank\nErr code: Status.EMPTY_FIELD", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		if(u.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Username field is blank\nErr code: Status.EMPTY_FIELD", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		if(p.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Password field is blank\nErr code: Status.EMPTY_FIELD", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		if(u.contains(" ") || p.contains(" ")) {
			JOptionPane.showMessageDialog(null, "Spaces aren't allowed\nErr code: Status.FAILURE", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		if(p.length() <= 5) {
			JOptionPane.showMessageDialog(null, "Your password must be 5 characters or greater\nErr code: Status.FAILURE", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		if(v.usernameExists(u, e) == Status.USERNAME_EXISTS) {
			JOptionPane.showMessageDialog(null, "That username already exists\nErr code: Status.USERNAME_EXISTS", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		if(EncryptionHandler.strContainsUnallowedChar(p)) {
			JOptionPane.showMessageDialog(null, "Unallowed character in password field\nAllowed characters: A-Z a-z 0-9\nErr code: Status.FAILURE", "Error", JOptionPane.ERROR_MESSAGE);
			return;
		}
		
		p = EncryptionHandler.encrypt(p);
		BufferedWriter writer = new BufferedWriter(new FileWriter(e, true));
		writer.newLine();
		writer.append(u.trim() + ", " + p.trim());
		writer.close();
		JOptionPane.showMessageDialog(null, "Success", "Success", JOptionPane.INFORMATION_MESSAGE);
	}
	
	@Override
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("confirm")) {
			String u = username_text.getText();
			String p = password_text.getText();
			File credentials = new File(PathHandler.getTextFilePath());
			try {
				inputCredentialsToFile(u, p, credentials);
				username_text.setText("");
				password_text.setText("");
			} 
			catch(Exception exc) {}
		}
	}
}