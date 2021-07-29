package com.teluf.login;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

import com.teluf.login.exceptions.FileCreatedInterruptionException;

public class PathHandler {
	private static final String path = "C:" + File.separator + "Internal" + File.separator + "u21213_p";
	private static final String txtFilePath = path + File.separator + "uu12.txt";
	private static final String tempFilePath = path + File.separator + "Temp.txt";
	
	protected static void createFile() throws FileCreatedInterruptionException {
		File f = new File(path);
		File f1 = new File(txtFilePath);
		f.mkdirs();
		try {
			f1.createNewFile();
			JOptionPane.showMessageDialog(null, "credentials file now created", "Success", JOptionPane.INFORMATION_MESSAGE);
		} 
		catch (IOException e) {
			throw new FileCreatedInterruptionException("Something disrupted the file creation!");
		}
		catch(Exception e) {
			
		}
	}
	
	protected static String getTextFilePath() {
		return txtFilePath;
	}
	
	protected static String getTempFilePath() {
		return tempFilePath;
	}
}