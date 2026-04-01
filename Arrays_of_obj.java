class student{
    int roll_no;
    String name;
    float marks;
}

public class Arrays_of_obj {
    public static void main(String args[])
    {
        student s1 = new student();
        s1.roll_no = 10;
        s1.name = "Leela";
        s1.marks=90;

        student s2 = new student();
        s2.roll_no = 12;
        s2.name = "Prasad";
        s2.marks = 97;

        student s3 = new student();
        s3.roll_no = 14;
        s3.name = "Tanuja";
        s3.marks=78;

        student s[] = new student[3];
        
        s[0] = s1;
        s[1] = s2;
        s[2] = s3;

        for (int i =0; i < s.length;i++)
        {
            System.out.println(s[i].name+" "+s[i].marks);

        }



    }
}
