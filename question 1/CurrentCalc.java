import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.script.ScriptException;

public class CurrentCalc {
	
	ArrayList <String> lines = new ArrayList();
    double[] results;
    String inputpath;
    String parentDirectory;
    double [][] inputNumbers;
    
	public CurrentCalc(String path, String parentdirectory) {
		// TODO Auto-generated constructor stub
		this.inputpath = path;
		this.parentDirectory = parentdirectory;
	}

	public void readfile(BufferedReader buffreader) throws IOException{
		// TODO Auto-generated method stub
		String CurrentLine= new String();
		
    	while ((CurrentLine = buffreader.readLine()) != null){
    		this.lines.add(CurrentLine);
    	}
    	
    	inputNumbers = new double[lines.size()][5];
    	results = new double[lines.size()];
    	// call method to sort arraylist into 2d array
    	SortintoArrray();
    	
	}

	private void SortintoArrray() {
		// TODO Auto-generated method stub
		for(int i=0;i<lines.size();i++){
			
	        String[] temp=lines.get(i).split(" ");
	        
	        	if(temp.length==5){
	        		inputNumbers[i][0]=Double.parseDouble(temp[0]);
	        		inputNumbers[i][1]=Double.parseDouble(temp[1]);
	        		inputNumbers[i][2]=Double.parseDouble(temp[2]);
	        		inputNumbers[i][3]=Double.parseDouble(temp[3]);
	        		inputNumbers[i][4]=Double.parseDouble(temp[4]);
	        	}
	    	}
	}

	public void calculate()throws ScriptException, IOException {
		// TODO Auto-generated method stub
		String newFile = "//forwardCurrent.txt";
        
	     String newPath = parentDirectory + newFile;

	     FileWriter writer = new FileWriter(newPath);
	     BufferedWriter buffwrite = new BufferedWriter(writer);
	     
		for (int i = 0; i<lines.size(); i++) {
			
			double VoltageSource = inputNumbers[i][0];
			double Resistor1 = inputNumbers[i][1];
			double Resistor2 = inputNumbers[i][2];
			double Resistor3 = inputNumbers[i][3];
			double Resistor4 = inputNumbers[i][4];
			
			double I1 = VoltageSource/Resistor1;
			double I2 = VoltageSource/Resistor2;
			double I3 = VoltageSource/Resistor3;
			double I4 = VoltageSource/Resistor4;
			
			double TotalCurrent = I1+I2+I3+I4;
			
			results[i] = TotalCurrent;
		}

	}

	public void writeToFile() throws IOException{
		// TODO Auto-generated method stub
		String newFile = "//forwardCurrent.txt";
        
	     String newPath = parentDirectory + newFile;

	     FileWriter writer = new FileWriter(newPath);
	     BufferedWriter buffwrite = new BufferedWriter(writer);
	     
	     for(int i=0; i<results.length; i++) {
	    	 if (results[i]<0) {
	    		 System.out.println("The following circuit designs contain atleast one branch with a negative current ");
				System.out.println((String)lines.get(i));
	    	 }
	    	 else {
				 buffwrite.write((String)lines.get(i));
			     buffwrite.newLine(); 
	    	 }
	     }
	     
	     buffwrite.close();
		 System.out.println("File with Forward Currents is written to: " + newPath);  
	}
}