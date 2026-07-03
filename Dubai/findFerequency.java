public class findFerequency {
    //         Find the frequency of each element in an array.
// 👉 Example: {1, 2, 2, 3, 1} → 1→2 times, 2→2 times, 3→1 time
    public static void main(String[] args) {
        int [] element= {1, 2, 2, 3, 1};
        int count=0;
        for(int i=0;i<element.length;i++){
            for(int j=0;j<element.length;j++){
                 if(element[i]==element[j]){
                count++;
            }

            }
             System.out.println(element[i] + " occurs " +count + " times");

           

                }
                
        
        

    }
    
}
