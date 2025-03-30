import java.util.Scanner;

public class String4 {
    public static boolean isPalindrome(String s){
        int left=0,right=s.length()-1;
        while (left<right) {
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;            
        }

        return true;

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("check no. is palindrom or not");
        String input=sc.nextLine();
        if (isPalindrome(input)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        sc.close();
    }
    
}
