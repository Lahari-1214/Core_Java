public class String_23 {
   public static void main(String args[])
   {
    String name = new String();
        System.out.println(name);
		System.out.println(name.hashCode());
		System.out.println("hello "+name);
		System.out.println(name.concat("reddy"));

    // String pool
    String Name="navin";
		Name=Name+"reddy";
		System.out.println("hello"+Name);
		
		String s1="Navin";
		String s2="Navin";
		
		System.out.println(s1==s2);	
		
   }
}
