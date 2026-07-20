public class recursionFun {
    public static void fun1(){
        System.out.println("we are in fun1 body and call fun2 ok");
        fun2();
        System.out.println("Returned to fun1");
    }
    public static void fun2(){
        System.out.println("now we are in fun2 body  and  call fun3");
        fun3();
        System.out.println("Returned to fun2");
    }
    public static void fun3(){
        System.out.println("now we are fun3 body and return to goes fun1 after return ");
        return;

    }
    public static void main(String[] args) {
        fun1();
        System.out.println("after return");

    }
    
}
