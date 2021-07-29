package com.teluf.login;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import com.teluf.login.api.LoginListener;

public class Login extends JFrame implements ActionListener {
	private static final long serialVersionUID = 1L;
	private static final String SPACE = " ";
	
	private JPanel panel;
	private JLabel username, password, message;
	private JTextField username_text;
	private JPasswordField password_text;
	private JButton login, signup, forgot_p, reset_p, reset_u;
	
	private Validate v = new Validate();
	private SignUp s = new SignUp();
	private ForgotPassword fp = new ForgotPassword();
	private ResetPassword rp = new ResetPassword();
	private ResetUsername ru = new ResetUsername();
	
	private List<LoginListener> listeners;
	
	public Login() {
		this.listeners = new ArrayList<>();
	}
	
	public void addLoginListener(LoginListener listener) {
		listeners.add(listener);
	}
	
	public void run() {
		username = new JLabel();
		username.setText(SPACE + "username:");
		username_text = new JTextField();
		
		password = new JLabel();
		password.setText(SPACE + "password:");
		password_text = new JPasswordField();
		
		message = new JLabel();
		
		login = new JButton("login");
		login.addActionListener(this);
		
		signup = new JButton("sign up");
		signup.addActionListener(this);
		
		forgot_p = new JButton("forgot password?");
		forgot_p.addActionListener(this);
		
		reset_p = new JButton("reset password");
		reset_p.addActionListener(this);
		
		reset_u = new JButton("reset username");
		reset_u.addActionListener(this);
		
		panel = new JPanel(new GridLayout(5, 1));
		panel.add(username);
		panel.add(username_text);
		panel.add(password);
		panel.add(password_text);
		panel.add(login);
		panel.add(signup);
		panel.add(reset_p);
		panel.add(reset_u);
		panel.add(forgot_p);
		panel.add(message);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setVisible(true);
		setResizable(false);
		setLayout(new BorderLayout());
		add(panel, BorderLayout.CENTER);
		setTitle("login here");
		setSize(350, 150);
		setLocationRelativeTo(null);
	}
	
	@Override
	@SuppressWarnings("deprecation")
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand().equals("login")) {
			String u = username_text.getText();
			String p = password_text.getText();
			File credentials = new File(PathHandler.getTextFilePath());
			
			if(u.isEmpty() && p.isEmpty()) 
				JOptionPane.showMessageDialog(null, "Username and Password fields are blank", "Error", JOptionPane.ERROR_MESSAGE);
			else if(u.isEmpty()) 
				JOptionPane.showMessageDialog(null, "Username field is blank", "Error", JOptionPane.ERROR_MESSAGE);
			else if(p.isEmpty()) 
				JOptionPane.showMessageDialog(null, "Password field is blank", "Error", JOptionPane.ERROR_MESSAGE);
			
			try {
				boolean b = v.validate(u, p, credentials, message);
				if(b) {
					for(LoginListener listener: listeners) {
						listener.onSuccessfulLogin();
					}
				}
				else {
					for(LoginListener listener: listeners) {
						listener.onUnccessfulLogin();
					}
				}
			} 
			catch (Exception exc) {}
		}
		else if(ae.getActionCommand().equals("sign up")) {
			s.run(400, 115);
		}
		else if(ae.getActionCommand().equals("forgot password?")) {
			fp.run(400, 95);
		}
		else if(ae.getActionCommand().equals("reset password")) {
			rp.run(400, 125);
		}
		else if(ae.getActionCommand().equals("reset username")) {
			ru.run(400, 125);
		}
	}
}
