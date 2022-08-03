package robatortas.code.achie.files.read;

import java.io.File;
import java.util.Scanner;

/*
 * I hope this interpreter to read data dynamically.
 * Meaning that you won't need to add datatypes to each variable.
 * 
 * The interpreter will be able to know what type of data (int, char, double, string, etc...) you're using.
 * This problem won't be a thing in the python version.
 * 
 * Basic Structure:
 * 
 * <Variable> = (int, string, char, etc.) NO SEMICOLON!
 * 
 */

public class Interpreter {
	
	private String path = "";
	// Scans user input
	private Scanner scan = new Scanner(System.in);
	
	private File achie = new File(path);
	
	// The directory that the jvm was invoked in the command prompt (where you called the jvm).
	private String workingDir = System.getProperty("user.dir");
	
	public Interpreter() {
		
	}
	
	public String getVariableName(String path) {
		this.path = path;
		return path;
	}
	
	// Parses the data type string to desired one.
	public void valueParser() {
		
	}
	
	// Returns string that will then be parsed to desired data type.
	public void getVariableValue() {
		
	}
}