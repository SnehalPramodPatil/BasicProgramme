package User;
class college {
	private int rollno;
	private String name;

	public void setRollno(int r) {
		this.rollno = r;
	}

	public void setName(String n) {
		this.name = n;
	}

	public int getRollno() {
		return this.rollno;
	}

	public String getName() {
		return this.name;
	}
}

public class Student {

	public static void main(String args[]) {
		college s1 = new college();
		s1.setRollno(101);
		s1.setName("Yash");
		System.out.println("Roll No:" + s1.getRollno() +" "+"Name:" + s1.getName());
	}
}

