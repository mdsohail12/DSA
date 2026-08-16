package Dubai;

public class Worker {
    private int hw;
    private double payRate;

    public void setData(int h,double p){
        hw=h;
        payRate=p;
    }
    public double calculateSalary(){
        if(hw<=40){
            double sallary=hw*payRate;
           return sallary;
        }else{
            double salary = hw * (payRate * 2);
            return salary;
        } 


    }

    
}
