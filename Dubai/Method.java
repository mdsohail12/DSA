public class Method {
    // A method must be declared within a class. 
    // public static void myMethod(){
    //     System.out.println("i just got executed");
    // }
    // A method with paramiter
    // public static void myMethod(String fname){
    //     System.out.println(fname+ " refnes");
    // }
    // with two paramiter
    public static void myMethod(String fname,int age){
        System.out.println("My name is "+fname+" and age is  "+ age);
    }
    public static void main(String[] args) {
        // myMethod();
        // myMethod("Sohail");
        // myMethod("Soaib");
        myMethod("Sohail",26);
        myMethod("Soaib",32);
        
        
    }
    
}
