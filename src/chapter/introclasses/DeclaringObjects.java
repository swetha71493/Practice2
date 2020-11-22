package chapter.introclasses;

public class DeclaringObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		we dont use the new operator while using the Primitive data types, we need to handle the objects unlike 
//		Primitive data types.
//		Creating object is nothing but creating a new variable of class type
		int s=10;
		System.out.println("I am in class");
		DeclaringObjects obj,obj2;
		obj=new DeclaringObjects();
//		obj2=new DeclaringObjects();
		obj2=obj;
		
		
		System.out.println(obj);
		System.out.println(obj2);
		obj=null;
		System.out.println(obj);
		
	}

}
