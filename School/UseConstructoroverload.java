package School;

public class UseConstructoroverload {
    public static void main(String[] args) {
        Constructoroverload c1=new Constructoroverload();//000
        Constructoroverload c2=new Constructoroverload(5,7,8);
        Constructoroverload c3=new Constructoroverload(10);
        Constructoroverload c4=new Constructoroverload(c2);

        c1.show();
        c2.show();
        c3.show();
        c4.show();
    } 
}
