package School;

public class Useworker2 {
    public static void main(String[] args) {
        Worker2 t=new Worker2();
        t.getInfo(400,7);
        t.AddSal();
        t.AddWork();
        System.out.println(t.salary);
        Worker2 x=new Worker2();
        x.getInfo(600,8);
        x.AddSal();
        x.AddWork();
        System.out.println(x.salary);
    }
    
}
