
public class var_arg {
    static int sum(int x, int ...arr){
        // Available as int [] arr
        int result = x;
        for (int i : arr) {
            result += i;
        }
        return result;
    }
    static int multi(int x, int ...arr){
        int result = x;
        for (int i: arr) {
            result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Ans="+sum(4, 5, 6, 89, 258, 69));
        System.out.println("Ans="+multi(1,2,3,4,5,6,7,8,9,0));
    }
    
}