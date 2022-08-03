package robatortas.code.achie.files.read;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
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
	
	private String path = "test.achie";
	// Scans user input
	private Scanner scan = new Scanner(System.in);
	
	private File achie = new File(path);
	
	// The directory that the jvm was invoked in the command prompt (where you called the jvm).
	private String workingDir = System.getProperty("user.dir");
	
	public Interpreter() {
		getVariableValue("Variable");
	}
	
	public String getVariableName(String path) {
		this.path = path;
		return path;
	}
	
	// Parses the data type string to desired one.
	public void valueParser() {
		
	}
	
	// Returns string that will then be parsed to desired data type.
	public String getVariableValue(String desiredValue) {
		String result = "";
		
		// Passes through every single line in the achie file
		try {
			BufferedReader reader = new BufferedReader(new FileReader(achie));
			int lines = 0;
			String buffer = "";
			while((buffer = reader.readLine()) != null) {
				lines++;
				result = buffer;
				System.out.println(result);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}
}