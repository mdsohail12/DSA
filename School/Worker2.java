package School;

public class Worker2 {
    int salary;
      int working_hours;

      public void getInfo(int sl,int hr ){
        salary=sl;
        working_hours=hr;
      }
      public void AddSal(){
        if( salary<500){
          // double total = salary * working_hours;\
          salary +=10;
        }
      }
      public void AddWork(){
     if (working_hours > 6) {
       salary += 5;
    
}}}
