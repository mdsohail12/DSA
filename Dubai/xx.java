package Dubai;

// import java.util.Scanner;

public class xx {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // System.out.println("HEllo now i am again start bro ");
        
        // System.out.println("Shal we Start bro ");
        // for(int i=0;i<n;i++){
        //     System.out.println("yes");

        // }

        String str1="madam";
        String str2="";
        for(int i=str1.length()-1;i>=0;i--){
           str2=str2+str1.charAt(i);
            }

            //this if block wrong answer because here is two address compare not
            //actual content ok bro thats why getting wrong answer ok bro 
        if(str1==str2){
            System.out.println(str1+"  is palindron");
        }else{
            System.out.println(str1+" is not palindrome ok");
        }


         if(str1.equalsIgnoreCase(str2)){
            System.out.println("Palindrome");
        }else System.out.println("Not Palindrome");
        // sc.close();
    }
    
}
