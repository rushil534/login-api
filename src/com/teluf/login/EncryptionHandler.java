package com.teluf.login;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EncryptionHandler {
	protected static boolean strContainsUnallowedChar(String input) {
		Pattern letter = Pattern.compile("^[a-zA-Z0-9]*$");
		Matcher hasLetter = letter.matcher(input);
		return !(hasLetter.find());
	}
	
	protected static String encrypt(String x) {
		String encryptedString = "";
		for(int i  =  0; i < x.length(); i++) {
			char currentChar = x.charAt(i);
			
			switch(currentChar) {
				case 'a':  
	                encryptedString = encryptedString + "z";  
	                break;  
	            case 'b':  
	                encryptedString = encryptedString + "y";  
	                break;  
	            case 'c':  
	                encryptedString = encryptedString + "x";  
	                break;  
	            case 'd':  
	                encryptedString = encryptedString + "w";  
	                break;  
	            case 'e':  
	                encryptedString = encryptedString + "v";  
	                break;  
	            case 'f':  
	                encryptedString = encryptedString + "u";  
	                break;  
	            case 'g':  
	                encryptedString = encryptedString + "t";  
	                break;  
	            case 'h':  
	                encryptedString = encryptedString + "s";  
	                break;  
	            case 'i':  
	                encryptedString = encryptedString + "r";  
	                break;  
	            case 'j':  
	                encryptedString = encryptedString + "q";  
	                break;  
	            case 'k':  
	                encryptedString = encryptedString + "p";  
	                break;  
	            case 'l':  
	                encryptedString = encryptedString + "o";  
	                break;  
	            case 'm':  
	                encryptedString = encryptedString + "n";  
	                break;  
	            case 'n':  
	                encryptedString = encryptedString + "m";  
	                break;  
	            case 'o':  
	                encryptedString = encryptedString + "l";  
	                break;  
	            case 'p':  
	                encryptedString = encryptedString + "k";  
	                break;  
	            case 'q':  
	                encryptedString = encryptedString + "j";  
	                break;  
	            case 'r':  
	                encryptedString = encryptedString + "i";  
	                break;  
	            case 's' :  
	                encryptedString = encryptedString + "h";  
	                break;  
	            case 't':  
	                encryptedString = encryptedString + "g";  
	                break;  
	            case 'u':  
	                encryptedString = encryptedString + "f";  
	                break;  
	            case 'v' :  
	                encryptedString = encryptedString + "e";  
	                break;  
	            case 'w':  
	                encryptedString = encryptedString + "d";  
	                break;  
	            case 'x' :  
	                encryptedString = encryptedString + "c";  
	                break;  
	            case 'y':  
	                encryptedString = encryptedString + "b";  
	                break;  
	            case 'z' :  
	                encryptedString = encryptedString + "a";  
	                break;
	                
	            
	            case 'A':  
	                encryptedString = encryptedString + "Z";  
	                break;  
	            case 'B':  
	                encryptedString = encryptedString + "Y";  
	                break;  
	            case 'C':  
	                encryptedString = encryptedString + "X";  
	                break;  
	            case 'D':  
	                encryptedString = encryptedString + "W";  
	                break;  
	            case 'E':  
	                encryptedString = encryptedString + "V";  
	                break;  
	            case 'F':  
	                encryptedString = encryptedString + "U";  
	                break;  
	            case 'G':  
	                encryptedString = encryptedString + "T";  
	                break;  
	            case 'H':  
	                encryptedString = encryptedString + "S";  
	                break;  
	            case 'I':  
	                encryptedString = encryptedString + "R";  
	                break;  
	            case 'J':  
	                encryptedString = encryptedString + "Q";  
	                break;  
	            case 'K':  
	                encryptedString = encryptedString + "P";  
	                break;  
	            case 'L':  
	                encryptedString = encryptedString + "O";  
	                break;  
	            case 'M':  
	                encryptedString = encryptedString + "N";  
	                break;  
	            case 'N':  
	                encryptedString = encryptedString + "M";  
	                break;  
	            case 'O':  
	                encryptedString = encryptedString + "L";  
	                break;  
	            case 'P':  
	                encryptedString = encryptedString + "K";  
	                break;  
	            case 'Q':  
	                encryptedString = encryptedString + "J";  
	                break;  
	            case 'R':  
	                encryptedString = encryptedString + "I";  
	                break;  
	            case 'S' :  
	                encryptedString = encryptedString + "H";  
	                break;  
	            case 'T':  
	                encryptedString = encryptedString + "G";  
	                break;  
	            case 'U':  
	                encryptedString = encryptedString + "F";  
	                break;  
	            case 'V' :  
	                encryptedString = encryptedString + "E";  
	                break;  
	            case 'W':  
	                encryptedString = encryptedString + "D";  
	                break;  
	            case 'X' :  
	                encryptedString = encryptedString + "C";  
	                break;  
	            case 'Y':  
	                encryptedString = encryptedString + "B";  
	                break;  
	            case 'Z' :  
	                encryptedString = encryptedString + "A";  
	                break;    
	                
	            case '1':  
	                encryptedString = encryptedString + "{";  
	                break;  
	            case '2':  
	                encryptedString = encryptedString + "}";  
	                break;  
	            case '3':  
	                encryptedString = encryptedString + "(";  
	                break;  
	            case '4':  
	                encryptedString = encryptedString + ")";  
	                break;  
	            case '5':  
	                encryptedString = encryptedString + "<";  
	                break;  
	            case '6':  
	                encryptedString = encryptedString + ">";  
	                break;  
	            case '7':  
	                encryptedString = encryptedString + "[";  
	                break;  
	            case '8' :  
	                encryptedString = encryptedString + "]";  
	                break;  
	            case '9':  
	                encryptedString = encryptedString + "*";  
	                break;  
	            case '0':  
	                encryptedString = encryptedString + "$";  
	                break;
			}
		}
		return encryptedString;
	}
	
	protected static String decrypt(String x) {
		String decryptedString = "";
		for(int i  =  0; i < x.length(); i++) {
			char currentChar = x.charAt(i);
			
			switch(currentChar) {
				case 'a':  
	                decryptedString = decryptedString + "z";  
	                break;  
	            case 'b':  
	                decryptedString = decryptedString + "y";  
	                break;  
	            case 'c':  
	                decryptedString = decryptedString + "x";  
	                break;  
	            case 'd':  
	                decryptedString = decryptedString + "w";  
	                break;  
	            case 'e':  
	                decryptedString = decryptedString + "v";  
	                break;  
	            case 'f':  
	                decryptedString = decryptedString + "u";  
	                break;  
	            case 'g':  
	                decryptedString = decryptedString + "t";  
	                break;  
	            case 'h':  
	                decryptedString = decryptedString + "s";  
	                break;  
	            case 'i':  
	                decryptedString = decryptedString + "r";  
	                break;  
	            case 'j':  
	                decryptedString = decryptedString + "q";  
	                break;  
	            case 'k':  
	                decryptedString = decryptedString + "p";  
	                break;  
	            case 'l':  
	                decryptedString = decryptedString + "o";  
	                break;  
	            case 'm':  
	                decryptedString = decryptedString + "n";  
	                break;  
	            case 'n':  
	                decryptedString = decryptedString + "m";  
	                break;  
	            case 'o':  
	                decryptedString = decryptedString + "l";  
	                break;  
	            case 'p':  
	                decryptedString = decryptedString + "k";  
	                break;  
	            case 'q':  
	                decryptedString = decryptedString + "j";  
	                break;  
	            case 'r':  
	                decryptedString = decryptedString + "i";  
	                break;  
	            case 's' :  
	                decryptedString = decryptedString + "h";  
	                break;  
	            case 't':  
	                decryptedString = decryptedString + "g";  
	                break;  
	            case 'u':  
	                decryptedString = decryptedString + "f";  
	                break;  
	            case 'v' :  
	                decryptedString = decryptedString + "e";  
	                break;  
	            case 'w':  
	                decryptedString = decryptedString + "d";  
	                break;  
	            case 'x' :  
	                decryptedString = decryptedString + "c";  
	                break;  
	            case 'y':  
	                decryptedString = decryptedString + "b";  
	                break;  
	            case 'z' :  
	                decryptedString = decryptedString + "a";  
	                break;
			
				case 'A':  
	                decryptedString = decryptedString + "Z";  
	                break;  
	            case 'B':  
	                decryptedString = decryptedString + "Y";  
	                break;  
	            case 'C':  
	                decryptedString = decryptedString + "X";  
	                break;  
	            case 'D':  
	                decryptedString = decryptedString + "W";  
	                break;  
	            case 'E':  
	                decryptedString = decryptedString + "V";  
	                break;  
	            case 'F':  
	                decryptedString = decryptedString + "U";  
	                break;  
	            case 'G':  
	                decryptedString = decryptedString + "T";  
	                break;  
	            case 'H':  
	                decryptedString = decryptedString + "S";  
	                break;  
	            case 'I':  
	                decryptedString = decryptedString + "R";  
	                break;  
	            case 'J':  
	                decryptedString = decryptedString + "Q";  
	                break;  
	            case 'K':  
	                decryptedString = decryptedString + "P";  
	                break;  
	            case 'L':  
	                decryptedString = decryptedString + "O";  
	                break;  
	            case 'M':  
	                decryptedString = decryptedString + "N";  
	                break;  
	            case 'N':  
	                decryptedString = decryptedString + "M";  
	                break;  
	            case 'O':  
	                decryptedString = decryptedString + "L";  
	                break;  
	            case 'P':  
	                decryptedString = decryptedString + "K";  
	                break;  
	            case 'Q':  
	                decryptedString = decryptedString + "J";  
	                break;  
	            case 'R':  
	                decryptedString = decryptedString + "I";  
	                break;  
	            case 'S' :  
	                decryptedString = decryptedString + "H";  
	                break;  
	            case 'T':  
	                decryptedString = decryptedString + "G";  
	                break;  
	            case 'U':  
	                decryptedString = decryptedString + "F";  
	                break;  
	            case 'V' :  
	                decryptedString = decryptedString + "E";  
	                break;  
	            case 'W':  
	                decryptedString = decryptedString + "D";  
	                break;  
	            case 'X' :  
	                decryptedString = decryptedString + "C";  
	                break;  
	            case 'Y':  
	                decryptedString = decryptedString + "B";  
	                break;  
	            case 'Z' :  
	                decryptedString = decryptedString + "A";  
	                break;    
				
			
				case '{':  
		            decryptedString = decryptedString + "1";  
		            break;  
		        case '}':  
		            decryptedString = decryptedString + "2";  
		            break;  
		        case '(': 
		            decryptedString = decryptedString + "3";  
		            break;  
		        case ')':  
		            decryptedString = decryptedString + "4";  
		            break;  
		        case '<':  
		            decryptedString = decryptedString + "5";  
		            break;  
		        case '>':  
		            decryptedString = decryptedString + "6";  
		            break;  
		        case '[':  
		            decryptedString = decryptedString + "7";  
		            break;  
		        case ']':  
		            decryptedString = decryptedString + "8";  
		            break;  
		        case '*':  
		            decryptedString = decryptedString + "9";  
		            break;  
		        case '$':  
		            decryptedString = decryptedString + "0";  
		            break;  
			}
		}
		return decryptedString;
	}
}