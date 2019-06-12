package serialDeserial;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoSerialization {
	public static void main (String[]args) {
		Course c = new Course(); //create a new object(c)
		serializeData(c); //pass the object to serializeData
		c = deSerializeData(c); //pass the object to deserializeData
		if (c!=null)
			displayData(c);
		//endif
		
	}//end method main


	public static void serializeData(Course c) {
		//assign values to the Course class attributes
		c.name = "Java Programming";
		c.type = "Programming";
		c.courseCode = "JPL2";
		c.passingScore = 60;
		
		try { //try writing to the file
			FileOutputStream fileOut = new FileOutputStream("D:/KOM/Semester 6/FOOP/Tugas/itu/details.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(c);
			out.close();
			fileOut.close();
			System.out.printf("Serialized Data is saved in D:/KOM/Semester 6/FOOP/Tugas/itu/details.ser");
		}//end try
		catch(IOException i) {
			i.printStackTrace();
		}//end catch
	}//end method SerializeData
	
	public static Course deSerializeData(Course c) {
		try {
			FileInputStream fileIn = new FileInputStream("D:/KOM/Semester 6/FOOP/Tugas/itu/details.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			c = (Course) in.readObject();
			in.close();
			fileIn.close();
			return c;
		}
		catch(IOException i) {
			i.printStackTrace();
			return null;
		}//end catch
		catch(ClassNotFoundException e) {
			// catch any error where the class is not found
			System.out.println("Course class not found");
			return null;
		}//end catch
	}//end method deSerializeData
	

	private static void displayData(Course c) {
		// display the content of the class to screen
		System.out.println();
		System.out.println("Deserialized Course Detail ");
		System.out.println("Name: "+c.name);
		System.out.println("Type: "+c.type);
		System.out.println("Code: "+c.courseCode);
		System.out.println("Pass Score: "+c.passingScore);		
	}// end method displayData
}// end class DemoSerialization

