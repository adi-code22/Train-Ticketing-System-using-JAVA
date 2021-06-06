package railways;

import javax.swing.JTextField;
import java.text.SimpleDateFormat; 
import java.util.Date;  
import java.io.File;
import java.io.IOException;  
import java.io.FileWriter; 

public class FareCalculator  {
	
	
	Boolean success = false;
	String path = "";
	public String CreateAndWriteToFile(String i, String in1, String in2, String in3, String in4, String in5 ,String ta,String tc,String ts,String tt,String tp) {
		try {
			//, String in2, String in3, String in4, String in5
		      File file = new File(i + ".txt");
		      if (file.createNewFile()) {
		        System.out.println("File created: " + file.getName());
		       	path = file.getAbsolutePath();        
		      } else {
		        System.out.println("File already exists.");
		      }
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		try {
			  SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
			  Date date = new Date();  
		      FileWriter myWriter = new FileWriter(i + ".txt");
		      myWriter.write("\nSouth Coast Line Ticketing System\n");
		      myWriter.write("*********************************\n\n");
		      myWriter.write("Date:      " + "Time:\n");
		      myWriter.write(formatter.format(date) + "\n");
		      myWriter.write("*********************************\n");
		      if(in1.trim().length() != 0) {
			      myWriter.write("_________________________________\n\n");
			      myWriter.write(in1 + "\n");
			  }
		      System.out.println("here"+ in2 + "ends");
		      if(in2.trim().length() != 0) {
			      myWriter.write("_________________________________\n\n");
			      myWriter.write(in2+ "\n");
			  }
		      if(in3.trim().length() != 0) {
			      myWriter.write("_________________________________\n\n");
			      myWriter.write(in3+ "\n");
			  }
		      if(in4.trim().length() != 0) {
			      myWriter.write("_________________________________\n\n");
			      myWriter.write(in4+ "\n");
			  }
		      if(in5.trim().length() != 0) {
			      myWriter.write("_________________________________\n\n");
			      myWriter.write(in5+ "\n");
			  }
		      
		      myWriter.write("\n:::::::::::::::::::::::::::::::::\n\n");
		      myWriter.write(ta +" Adults, "+tc+" Children, " + ts + "Senior\n");
		      myWriter.write("Total Tickets: " + tt + "\n\n");
		      myWriter.write("Total Price: " + tp + "\n\n");
		      myWriter.write("'''''''''''''''''''''''''''''''''\n\n");
		      myWriter.write("Happy Journey!\n");
		      myWriter.write("................................\n\n");
		      myWriter.close();
		      System.out.println("Successfully wrote to the file.");
		      success = true; 
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
		if(success==true) {
			return path;
		}
		else {
			return "";
		}
	}
	
	public double AdultOne(int i, int j) {
		
		double sum = 0;
		if((i != 9) && (j != 9)) {
			double mod = i-j;
			mod = (mod > 0 ? mod : mod * -1 );
			sum = mod * 1.2 ;
		}
		else if(( i==9 || j==9 )) {
			double mod = i-j;
			mod = (mod > 0 ? mod : mod * -1 );
			sum = (mod * 1.2) + 15;
		}
		return sum;	
		
	}
	
	public double AdultRet(int i, int j) {
		
		return AdultOne(i, j) * 1.8;
		
	}
	
	public double AdultWeek(int i, int j) {
		
		return AdultRet(i, j) * 6;
		
	}
	
	//Children Ticket Fare Calculating
	
	public double ChildrenOne(int i, int j) {
		
		return AdultOne(i, j) * 0.5 ;
		
	}
	
	public double ChildrenRet(int i, int j) {
		
		return AdultRet(i, j) * 0.5 ;
		
	}
	
	public double ChildrenWeek(int i, int j) {
		
		return AdultWeek(i, j) * 0.5 ;
		
	}
	
	//Senior Ticket Fare Calculating
	
	public double SeniorOne(int i, int j) {
		
		return AdultOne(i, j) * 0.1 ;
		
	}
	
	public double SeniorRet(int i, int j) {
		
		return AdultRet(i, j) * 0.1 ;
		
	}
	public String readTF(JTextField obj) {
		
		String name;
		name = obj.getText();
		return name;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new TicketGenerator();
		
	}
}
