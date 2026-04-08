package oops;
class Human{
    private int age;
    private String name;

    public void setage(int age){
        this.age = age;
    }
    public void setname(String name){
        this.name = name;
    }
    public int getage(){
        return age;
    }
    public String getname(){
        return name;
    }


}
public class This_03 {
    public static void main(String args[])

    {
         Human h1 = new Human();
        h1.setage(34);
        h1.setname("Leela");
        int age = h1.getage();
        String name = h1.getname();
        System.out.println(name + " " + age);

    }
}
