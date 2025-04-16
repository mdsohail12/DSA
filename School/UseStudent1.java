package School;

public class UseStudent1 {
    public static void main(String []args)
    {
        Student1 obj =new Student1();
        Student1 obj1=new Student1("vaibhav",101);
        Student1 obj2=new Student1("rahul",102);
        System.out.println(obj1.Name+","+obj1.roll_no);
        System.out.println(obj2.Name+","+obj2.roll_no);
        System.out.println(obj.Name);
    }
}
