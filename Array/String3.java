import java.util.Arrays;

public class String3 {
    public static void main(String[] args) {
        // StringBuffer sb = new StringBuffer("Hello");
        // sb.append(" World");
        // System.out.println(sb);
        // System.out.println("Sohail");
        String sentence = "alice and bob love leetcode";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
       int wordCount = words.length;
       System.out.println(wordCount);
    

}
    
}
