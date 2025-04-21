package School;

public class Constructoroverload {
    private int l,b,h;
    
    public Constructoroverload(){
        l=b=h=0;
    }
    public Constructoroverload(int s){
        l=b=h=s;
    }
    public Constructoroverload(int i,int j,int k){
        l=i;
        b=j;
        h=k;
    }
    public Constructoroverload(Constructoroverload p){
        l=p.l;
        b=p.b;
        h=p.h;
    }
    
    public void show(){
        System.out.println(l+","+b+","+l);
    }
    
}
