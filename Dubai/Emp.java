public class Emp {
    private String name;
    private int age;
    private int id;
    private static int nextId=1;

    public Emp(String n,int a){
        name=n;
        age=a;
        id=nextId++;
    }

    public void GetShow(){
        System.out.println(name+","+age+","+id);
    }
    public void showNextId(){
        nextId++;
        System.out.println("next Emp id will will be "+nextId);
    }
    
}
