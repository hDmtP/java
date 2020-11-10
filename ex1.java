/**
 * ex1
 */
public class ex1 {
    static void strpatt(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i+j>=(n-1)) {
                    System.out.print("* ");                
                    
                } else {
                    System.out.print("");
                }
            }
        System.out.println();
        }
    }

    static void stpt_recur(int n){
       if (n>0) {
           
           for (int i = 0; i < n; i++) {
               //    if (i>=n-1) {
                   System.out.print("* ");
                   //    }
                }
                System.out.println();
            stpt_recur(n-1);   
    }
    }

    public static void main(String[] args) {
        // strpatt(5);
        stpt_recur(5);
    }
}