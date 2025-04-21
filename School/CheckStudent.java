package School;

public class CheckStudent {
    // String name;//this is secirty problem
    // int age;
   private String name;
    private int age;

    public void setAge(int age){
        if(age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid age");
        } 
    }
    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
