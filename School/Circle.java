package School;

public class Circle {
    private double radius;
    // set the dat radius as a n argument
    public void setRadius(int r){
        radius=r;
    }
    // ye code without return ka h ok bro 
    // public void calculateArea(){
    //     // double area=Math.PI * Math.pow(radius, 2);ye bhi likh sakte h 
    //     double area=Math.PI * radius * radius;//wecan write both
    //     System.out.println(area);
    // }
    // with return type code ok
    public double calculateArea(){
        // double area=Math.PI * Math.pow(radius, 2);ye bhi likh sakte h 
        double area=Math.PI * radius * radius;//wecan write both
       return area;
    }

    // ye bhi without return type
    // public void calculateCircumFerence(){
    //     double cirm=2 * Math.PI * radius;
    //     System.out.println(cirm);
    // }

    // with return type
    public double calculateCircumFerence(){
        double cirm=2 * Math.PI * radius;
       return cirm;
    }
    // aur ye return hokar kha jayega jha se is method ko call kiya gya h ok bro
    
}
