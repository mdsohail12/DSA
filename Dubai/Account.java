package Dubai;

public class Account {
    private int accId;
    private String name;
    private double bal;
     public Account(){
        System.out.println("object created");
        accId=101;
        name="amit";
        bal=5000.0;
     }
     public void show(){
        System.out.println("id is"+accId+"name"+name+"bal"+bal);
     }
    
}
