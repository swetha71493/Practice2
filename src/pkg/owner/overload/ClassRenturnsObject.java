package pkg.owner.overload;
class ReturnObject{
	int a;
	ReturnObject(int i){
		a=i;
	}
	ReturnObject display(){
		ReturnObject obj=new ReturnObject(a+10);
		System.out.println(a);
		return obj;
		
		
	}
}
public class ClassRenturnsObject {
/**
 * class can return object also
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnObject con=new ReturnObject(10);
		ReturnObject obj3;
		obj3=con.display();
		System.out.println("Value of returned object variable: "+obj3.a);
		obj3=obj3.display();
		System.out.println("Value of returned object variable: "+obj3.a);


	
		
	}

}
