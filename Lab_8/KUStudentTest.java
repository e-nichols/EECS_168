import java.util.Scanner;

public class KUStudentTest {

	public static void main (String[] args) {

		//declare scanner and new KUStudent Object
		
		KUStudent myKUstu = new KUStudent();

		Scanner myScan = new Scanner(System.in);
		
		String fname;
		String lname;
		String kuid;
		String dept;
		
		//get user input for first and last name, uses set_name method on myKUstu

		System.out.println("Please input the student's name (firstname lastname): ");

		fname = myScan.next();
		lname = myScan.next();

		myKUstu.set_name(fname, lname);
		
		//get user input for KU ID and department, uses setkuinfo method on myKUstu
		
		System.out.println("Please input the student's KUID and department: ");

		kuid = myScan.next();
		dept = myScan.next();
		
		myKUstu.set_kuinfo(kuid, dept);
		
		//call writeOutput method, which displays all info to user
		
		writeOutput(myKUstu);

		myScan.close();
	}

	public static void writeOutput(KUStudent stu) {

		System.out.println("Student: "+ stu.get_fname() + " " + stu.get_lname());
		System.out.println("KUID:" + stu.get_id());
		System.out.println("Department: "+stu.get_dept());
		
	}

}