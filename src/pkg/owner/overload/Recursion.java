package pkg.owner.overload;

class Exam{
	int values[];
	Exam(int k) {
		values = new int[k];
	}
	void display(int j){
		if (j==0)
		return;
		else display(j-1);
		System.out.println("[" + (j-1) + "] " + values[j-1]);
		
		
	}
}

public class Recursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam  ob=new Exam(10);
		for(int i=0;i<10;i++)
			ob.values[i]=i;
		ob.display(10);			
			

	}

}
