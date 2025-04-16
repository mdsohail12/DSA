public class Student1{
    private int  roll;
    private char grade;
    private double per;
    
    public void SetData(){
        roll=12;
        grade='A';
        per=7.9;
    }
    public void ShowData(){
        System.out.println(roll+","+grade+","+per);
    }
}




 class UseStudent1 {
    public static void main(String[] args) {
        Student1 s=new Student1();
        s.SetData();
        s.ShowData();
    }
   
    
}
