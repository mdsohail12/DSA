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
        String x="i am a good boy. he is gooding looking";
         String []word=x.split("\\.");
    System.out.println(Arrays.toString(word));  

            
        }
    }
    

