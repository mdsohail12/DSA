package Dubai;

public class recursionPalindromeString {
    public static boolean palindromString(String str,int left,int right){
        if(left>=right){
            return true;
        }
        if(str.charAt(left) != str.charAt(right)){
        return false;
       }
        return palindromString(str, left + 1, right - 1);
       }
    public static void main(String[] args) {
        String str="Madam";
        str = str.toLowerCase();
        int left=0;
        int right=str.length()-1;
       System.out.println( palindromString(str,left,right));
        
    }
}
    
