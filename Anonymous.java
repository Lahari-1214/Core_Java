package oops;

// Anonymous object is an object which is created without reference variable. It can be used when we want to use the object only once. It is also called as anonymous class. It is used to call the method of the class without creating an object of the class. It is also used to create an object of the class without reference variable. It is also used to call the constructor of the class without creating an object of the class.
    class A
{
	public A()
	{
		System.out.println("object created");
	}
	public void show()
	{
		System.out.println("in A show");
	}
}


public class Anonymous
{
	public static void main(String a[]) 
	{
		int marks;
		marks=99;
		
		new A();   //anonymous object
		new A().show();
		
//		A obj=new A();
		A obj;
		obj=new A();
		
		obj.show();
	}
}

