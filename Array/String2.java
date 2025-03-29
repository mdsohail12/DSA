public class String2 {
        static String delAlternate(String S) {
            // code here
            String newstring="";
            for(int i=0;i<S.length();i++){
                if(i%2==1){
                    continue;
                }
                newstring =newstring+S.charAt(i);
            }
            return newstring;
        }
        public static void main(String[] args) {
            String str="abcdef";
            str = delAlternate(str);
            System.out.print(str);

        }
    }
