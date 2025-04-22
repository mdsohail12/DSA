package School;

public class Member {
    String Name;
    int Age;
    String Phone_number;
    String Address;
    int Sallary;

    public Member(String n,int a,String p,String ad,int s){
        Name=n;
        Age=a;
        Phone_number=p;
        Address=ad;
        Sallary=s;
    }
     public void printSalary(){
        System.out.println(Sallary);
    }
}
// emloye class
class Employee extends Member{
    String Specialization;
    public Employee(String n,int a,String p,String ad,int s,String spec){
        super(n,a,p,ad,s);
        this.Specialization=spec;
    }
    public void print_details(){
        System.out.println(Name);
        System.out.println(Specialization);
        super.printSalary();
    }
}
// mangaer class
class Manager extends Member{
    String Specialization;
    public Manager(String n,int a,String p,String ad,int s,String spec){
        super(n,a,p,ad,s);
        this.Specialization=spec;
    }
    public void print_details(){
        System.out.println(Name);
        System.out.println(Specialization);
        super.printSalary();
    } 
    
}
