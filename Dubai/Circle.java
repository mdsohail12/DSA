package Dubai;

public class Circle {
    private int  radius;

    public void setRadius(int r){
        radius=r;
        
    }
    public void getCalculateArea(){
        // double area=3.14*radius*radius;
        double area=Math.PI*Math.pow(radius, 2);
        System.out.println("circle of Area is ="+area);

    }
    public void getCalculateCircumference(){
        // double circum=2*3.14*radius;
        double circum=2*Math.PI*radius;
        System.out.println("circumference is= "+circum);

    }
    

    
}
