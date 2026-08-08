public class palindromeString {
    public static void main(String[] args) {
        // String str1="madam";
        String str1="Level";
        String str2="";
        for(int i=str1.length()-1;i>=0;i--){
            str2=str2+str1.charAt(i);
        // str2=str1+str2;
        }
        if(str1.equalsIgnoreCase(str2)){
            System.out.println("Palindrome");
        }else System.out.println("Not Palindrome");
    }
    
}
