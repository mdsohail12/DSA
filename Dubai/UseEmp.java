public class UseEmp {
    public static void main(String[] args) {
        Emp e=new Emp("Sohail",24);
        Emp f=new Emp("Niranjan",25);
        Emp g=new Emp("Mukesh",30);
        e.GetShow();
        f.GetShow();
        g.GetShow();

        e.showNextId();
        f.showNextId();
        g.showNextId();
     
    }
    
}
