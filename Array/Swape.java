public class Swape {
    public static void main(String[] args) {
        int a=5,b=10;
        System.out.println("before swap a is "+a+" b is "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a);
        System.out.println(b);
    }

    
}
