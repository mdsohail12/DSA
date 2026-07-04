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
    // public static void myMethod(String fname,int age){
    //     System.out.println("My name is "+fname+" and age is  "+ age);
    // }
    // start with if else
    // public static void myMethod(int age){
    //     if(age<18){
    //          System.out.println("Access denied - You are not old enough!");
    //     }else{
    //         System.out.println("Access granted - You are old enough!");
    //     }
       
    // }
    // public static int myMethod(int x){
    //    return x+5;
    // }
    // public static int myMethod(int x,int y){
    //    return x+y;
    // }
    public static int myMethod(int x,int y){
       return x+y;
    }
    public static void main(String[] args) {
        // myMethod();
        // myMethod("Sohail");
        // myMethod("Soaib");
        // myMethod("Sohail",26);
        // myMethod("Soaib",32);
        // myMethod(20);
        //    System.out.println(  myMethod(20));
        //    System.out.println(  myMethod(20,10));
        int z=myMethod(20,10);
           System.out.println(z);
      
        
        
    }
    
}
