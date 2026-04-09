package oops;
// Encapsulation is the process of wrapping code and data together into a single unit. It is also known as data hiding. It is used to hide the internal details of an object from the outside world. It is used to protect the data from unauthorized access. It is used to achieve security and maintainability of the code. It is achieved by using access modifiers like private, public, protected, etc. It is also achieved by using getter and setter methods to access the private data members of a class.
class Human
{
	//int age;
	//private int age=11;
	private int age;
	//String name;
	//private String name="Navin";
	private String name;
	
	public int getAge()
	{
		return age;
	}
	public void SetAge(int a)
	{
		age=a;
	}
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name=n;
	}
}

public class Encapsulation {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();
		obj.SetAge(30);
		obj.setName("Reddy");
//		obj.age=11;
//		obj.name="Navin";
		
		System.out.println(obj.getName()+" : "+obj.getAge());
	
	}
}
