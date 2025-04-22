package School;

public class UseMember {
    public static void main(String args[]) {
        Employee obj = new Employee("Ram",25,"7003","Bangalore",1000,"cse");
        obj.print_details();
        
        Employee obj1 = new Employee("Shyam",250,"8098","Chennai",2000,"civil");
        obj1.print_details();
        
        Manager obj_Man = new Manager("babu",100,"1234","Bangalore",1000,"JP");
        obj_Man.print_details();
        
        Manager obj1_Man = new Manager("Rao",250,"456","Kerala",3000,"GC");
        obj1_Man.print_details();

    }
    
}
