public class Box {
    private int speed;
    public Box(){
        System.out.println("Speed is khali  "+speed);
    }
    public Box(int x){
        speed=x;
        System.out.println("Speed is "+speed);
    }
    {
        speed=100;
        System.out.println("run the initializer block");
    }
    
}
