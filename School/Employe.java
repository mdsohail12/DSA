package School;

public class Employe {
   private String name;
    private int age;
    private int id;
    private static int nextId=1;
    public Employe(String n,int a){
        this.name=n;
        this.age=a;
        this.id=nextId++;//this is podt increment ye assign karne ke bad value ko increement karta h ok
    }
    public void Show(){
        System.out.println("Employe name is"+name+","+"Age is "+age+","+"id is"+id);
    }
    public void ShowNextId(){
        System.out.println("Id of next employe is "+nextId);
    }

    
}
