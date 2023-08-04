package Assignment3;
//  Design separate method as String getStudentName(String name).
// which return student name to that method and print it on console.*/ 
public class Test {
	//Design the method with argument or parameter 
		String getStudentName(String name) {// shreyash is store into name.
	          return name;		
		}
		public static void main(String[] arge) {
			Test test = new Test(); // creating  the object of class. 
			String s = test.getStudentName("shreyash"); //calling of method
			         System.out.println("studant name>>" + s);
			//printing the name
		}
		

	}

