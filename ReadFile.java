package assessment;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

///////Task 5////////
public class ReadFile {

	static ArrayList<Person> people = new ArrayList<Person>();
	static ArrayList<Marina> marinas = new ArrayList<Marina>();
	static ArrayList<Boat> boats = new ArrayList<Boat>();
	
	public static void main(String [] args){
		
		// this allows changing of the file with the same format
				 String filename="stage_5_input.txt";
				 try{
				if (args[0].length()!=0)
				 filename=args[0];  
				 }catch(IndexOutOfBoundsException ex){}
					
			String mainFile = readFile(filename);	
			parseString(mainFile);
			
	}
	//this method reads the file (the file has been edited with the corrections)
	
	private static String readFile(String filename) {
		BufferedReader br = null; 
		
		try {
			br = new BufferedReader(new FileReader(filename));
			
		} catch (FileNotFoundException e) { 

			e.printStackTrace();
		}
		
		String mainFile = null;
		
		try {
		    StringBuilder sb = new StringBuilder();
		    String line = br.readLine();

		    while (line != null) {
		        sb.append(line);
		        sb.append(System.lineSeparator()); //this causes the file to be printed as separate lines instead of a single string  
		        line = br.readLine();
		    }
		    mainFile = sb.toString();
		    
		    
		} catch (IOException e) 
		{
			e.printStackTrace();
		} finally 
		{
		    try {
				br.close(); 
			} catch (IOException e) 
		    {
				e.printStackTrace();
			}
		}
		return mainFile;
	}	

//Assigning Objects
	
private static void parseString(String file){

	String[] objectType = file.split("\\n[\\n]+"); //splits the file by each empty line allowing us to ignore every other index number, this gives us only the data we need and discount all the object class headings 
 	
	String [] marinaArray = objectType[1].trim().split("\\|"); //double backslash to allow splitting by the pipe symbol, separating each occurance of the object
	
	for (int i=0;i<marinaArray.length;i++) //this for loop goes through each occurrence of the object and adds the attributes for each object
										   //it allows you to add new occurrences of the objects to the file and they will still be added 
	{
	
		String [] mParts=marinaArray[i].trim().split("\\r?\\n"); //separates each line for the individual objects and assigns them to the attributes
	
		Marina aMarina= new Marina(mParts[0].trim(), mParts[1].trim(), Integer.parseInt(mParts[2].trim()));
		marinas.add(aMarina);
		System.out.println("Added Marina : "+mParts[0]+" "+mParts[1]+" "+mParts[2]+"\n ");

	}
	
	//the same method was applied for the boat and the person array

	String [] boatArray = objectType[3].trim().split("\\|");

	
	for (int i=0;i<boatArray.length;i++)
	{
		String [] bParts=boatArray[i].trim().split("\\r?\\n");
		Boat aBoat = new Boat(bParts[0].trim(),bParts[1].trim(),Double.parseDouble(bParts[2].trim())); 
		boats.add(aBoat);
		System.out.println("Added Boat : "+bParts[0]+" "+bParts[1]+" "+bParts[2]+"\n ");
	}
	
	String [] personArray = objectType[5].trim().split("\\|");
	// loop through all people
	for (int i=0;i<personArray.length;i++)
	{
		String [] pParts=personArray[i].trim().split("\\r?\\n");
		
		String forename=pParts[0].split(" ")[0];  //this step separates the first line of the person attributes to give the first and second name separately
		String surname=pParts[0].split(" ")[1];
		
		
		Person aPerson=null;
		
		if (pParts[2].equals("British"))
		{ 
		aPerson = new Person(forename, surname, pParts[1].trim(), pParts[2].trim());
		people.add(aPerson);
		System.out.println("Added Person : "+forename+" "+surname+" "+pParts[1]+" "+pParts[2]);
		} 
		else
		{
		aPerson=new Person(forename, surname, pParts[1].trim(), pParts[2].trim(),pParts[3].trim());
		people.add(aPerson);
		System.out.println("Added Person : "+forename+" "+surname+" "+pParts[1]+" "+pParts[2]+" "+pParts[3]);
		}
	}
	}
}    

// I wasn't sure how to test the main method, I was thinking that it would be possible to test for the number of objects 
// in each array list but I don't know how I'd go about doing this.
// I also wanted to test for adding and removing objects to an arraylist. But, again, I wasn't sure how to do this.