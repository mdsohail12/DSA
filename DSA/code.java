public class code {
    public static void main(String[] args) {
         int x = 5;
        int y = 10;

        first: {
            second : {
                third : {
                    if(x == y >> 1) {
                        break second;
                    }
                    break third;

                }
            System.out.println(x);
            break first;
        }
            System.out.println(y);
            // break;
        }
    }
    }
    
