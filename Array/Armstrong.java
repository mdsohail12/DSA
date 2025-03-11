public class Armstrong {
        static void check_armstrong(int n){
            int temp=n;
            int sum=0;
            while(n>0){
                int rem=n%10;
                sum+=rem*rem*rem;
                n=n/10;
        
         }
     
         if(temp==sum){
             System.out.println("Armstrong");
         }
         else{
             System.out.println("not answer");
         }
     }
         public static void main(String[] args) {
             int n=153;
             check_armstrong(n);
             
         }
         
     }
