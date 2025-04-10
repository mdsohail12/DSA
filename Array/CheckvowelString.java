import java.util.Scanner;

public class CheckvowelString {
    public static int countVowels(String str) {
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
   ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            count++;
        }
return count;
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
         int x=countVowels(str);
         System.out.println(x);
         sc.close();

    }

}
