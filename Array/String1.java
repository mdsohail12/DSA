import java.util.Arrays;

public class String1 {
    public static void main(String[] args) {
        // String x="Sohail";
        // Acces the elemet
        // System.out.println(x.charAt(0));
         //this is method to use get the length of element
        // System.out.println("the length is "+x.length());
        // how to iterate the element
        // for(int i=0;i<x.length();i++){
        //     System.out.println(x.charAt(i));
        // }
        // print the sub string
        // System.out.println(x.substring(2, 5));
        // int i=x.charAt(0);
        // System.err.println(i);
        //  char i=97;
        //  System.err.println(i);
        //  String a="this is a ";
        //  String b="Good boy";
        //  System.out.println(a+b+3);
    //     String x="i am a good boy. he is gooding looking";
    //      String []word=x.split("\\.");
    // System.out.println(Arrays.toString(word));  
    String s1 = "  Geeks for Geeks  ";
    // String s1=s.trim();
    // Printing String after removing the whitespaces
    // System.out.println(s.trim());
    // System.out.println(s1);
    // Printing string to observe original string
    // System.out.println(s);
  
      // Before Trim() method
      System.out.println("String 1: " + s1);
      System.out.println("Length: " + s1.length());
      String s2=s1.trim();
      System.out.println("String 2: " + s2);
      System.out.println("Length: " + s2.length());

      if (s1 == s2) {
        System.out.println("\nEqual");
    } else {
        System.out.println("\nNot Equal");
            
        }
    }}
    

