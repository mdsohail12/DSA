package Dubai;

public class linearSearch {
    public static void main(String[] args) {
        int [] arr={10,20,30,40,50,60,70};
        // int target=80;
        int target=70;
        // int target=40;
        boolean flag=false;
        for(int i=0;i<=arr.length;i++){
            if(arr[i]==target){
                flag=true;
                System.out.println("Element found at index "+i);
                break;
            }
        }
         if(flag!=true){
                System.out.println("Element not found");
            }
    }}
    

