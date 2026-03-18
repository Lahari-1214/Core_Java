class ADD{
    public int add(int n1,int n2){
        int r = n1+n2;
        return r;
    }
}

public class Class_Object_14 {
    public static void main(String[] args)
    {
        int n1 = 12;
        int n2 = 13;

        ADD a1 = new ADD();
        int result = a1.add(n1, n2);
        System.out.println(result);

    }
}
