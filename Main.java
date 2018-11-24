import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import javax.script.ScriptException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "C://Users//100654771//workspace//Parrallel Current Calc//src";
		String userdata;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter data file name");
		userdata = scan.nextLine();
		scan.close();
		
		String fullpath = path+"//"+userdata;
		
		try {
			CurrentCalc currentcalc = new CurrentCalc(fullpath,path);
			FileReader reader = new FileReader(fullpath);
			BufferedReader buffreader = new BufferedReader(reader);
			
			currentcalc.readfile(buffreader);
			currentcalc.calculate();
			currentcalc.writeToFile();
			
		}catch (FileNotFoundException ex) {
			System.out.println("Unable to open file");
		}catch(ScriptException ex) {
            System.out.println("Error executing operation");                
        }
		
		

	}

}
