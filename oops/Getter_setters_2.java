package oops;
class Human{
    private int age;
    private String name;

    public void setage(int a){
        age = a;
    }
    public void setname(String n){
        name = n;
    }
    public int getage(){
        return age;
    }
    public String getname(){
        return name;
    }


}
public class Getter_setters_2 {
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
