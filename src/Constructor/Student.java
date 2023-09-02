package Constructor;

public class Student {
	public int srno;
	public String name;
	public String branch;
	public static String collegename = "WCE";

	public  Student(int s, String n, String b) {
		srno = s;
		name = n;
		branch = b;

	}

	void display() {
		System.out.println("SrNo:" + srno +" "+ "Name:" + name + " "+"Branch:" + branch+" "+"collegename:"+collegename);
	}

	public static void main(String args[]) {
		Student s = new Student(101, "Jhon", "Comp");
		Student s1 = new Student(102, "Smith", "IT");
		Student s2 = new Student(102, "AMAN", "Mech");
		Student s3 = new Student(102, "Suman", "Elect");
		Student s4 = new Student(102, "Payal", "Civil");
		s.display();
		s1.display();
		s2.display();
		s3.display();
		s4.display();
	}
}
