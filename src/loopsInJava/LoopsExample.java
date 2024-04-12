package loopsInJava;

public class LoopsExample {

	int a = 5;
	String nameofStudent;
	String[] listofStudents = { "mandeep","sidhu","arsh","harsh" };
	int[] ageofStudent = { 5, 6, 7, 8 };
	
	
	public void printStudentName() {
		System.out.println("Name of the student"+"Name of the student");
	}

	
	public void printStudentFromArray() {
		System.out.println("Name of the student"+"Name of the student[2]");
	}
	
	
	public void incrementvale() {
		// a = a+1;
		System.out.println("A value intially" + a);
		a--;
		System.out.println("A value post decrement " + a);
		a++;
		System.out.println("A value post increment " + a);
		--a;
		System.out.println("A value pre decrement " + a);
		++a;
		System.out.println("A value pre decrement " + a);

	}

	public void findMandeep() {
		// for(counter;maximum condition for loop;increment condition ){ //}

		for (int counter = 0;
				counter < 4;
				counter++) {
             
		}
	}
}
