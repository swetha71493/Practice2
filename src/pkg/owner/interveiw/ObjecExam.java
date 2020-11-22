package pkg.owner.interveiw;

public class ObjecExam {
	int x = 10;
	static String s="Hello";
	public static void main(String[] args) {
		System.out.println("cant access non static in static area");
		System.out.println(s.length());
		ObjecExam ob=new ObjecExam();
		ObjecExam ob1=new ObjecExam();
		System.out.println(ob);
		System.out.println(ob.hashCode());
	}

	public void displayThroughInstanceVariable() {
		System.out.println("value of nonn staticvariable x=" + x);
	}
}
