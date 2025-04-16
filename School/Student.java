package School;

public class Student {
    private int roll;
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
