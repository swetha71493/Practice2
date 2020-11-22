package pkg.owner.overload;

//Objects may be passed to methods.
 class Test{
	int a,b;
	Test(int i,int j){
		a=i;
		b=j;
		System.out.println(a+" "+b);
		}
	boolean equals(Test o){
		System.out.println(o.a+" "+o.b);
		if (o.a==a&&o.b==b)
			return true;
		
		else return false;
		
	}
}
class ObjectAsParameters{
	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Test obj=new Test(10,22);
		Test obj2=new Test(10,22);
		Test obj3= new Test(3,4);
		System.out.println("obj==obj2 "+obj.equals(obj2));
		System.out.println("obj==obj2 "+obj.equals(obj3));
		
		

	}
}