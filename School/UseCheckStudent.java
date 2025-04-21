package School;

public class UseCheckStudent {
    public static void main(String[] args) {
        CheckStudent s = new CheckStudent();
        //  s.name = "Sohail";
        //  s.age = -20; 
    // System.out.println(s.name +","+s.age);
    // dekhiye yha oops concept ka rull toot rha h kyoki ap outside the class kuchh bhi acces ya change nahi kar sakte h 
    // kyoki main method jo h wo entity class ke baher h aur isme dekhiye privat data nahi rahne se koi bhi change kar sakta h h kyoki insan ka age -20 kaise ho sakta to ye data ka violation ho rha h 
    // jis wajah se hamlog ko oops concept ko achhe se use karna chahiye obious security reason ok

    s.setName("Sohail");
     s.setAge(-20);     // ❌ "Invalid age" print hoga
     System.out.println(s.getAge()+","+s.getName());  // 0 (default)
     
    }
    
}
