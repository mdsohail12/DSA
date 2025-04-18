package School;

public class UseDemo {
    public static void main(String[] args) {
        Demo d1=new Demo();
        Demo d2=new Demo();
        Demo d3=new Demo();
        d1.a=10;
        d2.a=20;
        d3.a=30;
        System.out.println(d1.a+","+d2.a+","+d3.a);

        // d1.b=10;
        // d2.b=20;
        // d3.b=30;
        // System.out.println(d.b+","+d2.b+","+d3.b);//why this red color occure becouse we are storing the 
        // the static var from normal way thats whgy this occure rull stattic var ko class ke name se access kiya jata jata h ok dekho aage 
        Demo.b=10;
        Demo.b=20;
        Demo.b=30;
        System.out.println(Demo.b+","+Demo.b+","+Demo.b);
        
    }
    
}
