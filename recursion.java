

public class recursion {

    static int factorial(int n){
        if (n==0 || n==1) {
            return 1;
        } else {
            return n*factorial(n-1);
        }
    }
    static int fact_iter(int n){
        if (n==0 || n==1) {
            return 1;
        } else {
            int r=1;
            for (int i = 1; i <= n; i++) {
                r*=i;
            }
            return r;
        }
    }
    public static void main(String[] args) {
       System.out.println(factorial(8)); 
       System.out.println(fact_iter(9)); 
    }
}
