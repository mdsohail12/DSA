package School;

public class Worker {
    private int hw;
    private double payRate;

    public void setData(int h,double p){
        hw=h;
        payRate=p;
    }
    public double calculateSalary(){
        if (hw <= 40) {
            return hw * payRate;
        } else {
            return 40 * payRate + (hw - 40) * payRate * 2;
        }
    }

    
}
