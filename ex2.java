
import java.util.Random;
import java.util.Scanner;

public class ex2 {
    
    public static void main(String[] args) {
        System.out.println("Hello");
        Scanner sCan = new Scanner(System.in);
        int n = sCan.nextInt();
        int [] arr;
        arr = new int [n];
        Random rAnd = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=rAnd.nextInt(1000);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+" ");
        }
        float sUm = 0;
        for (int i = 0; i < arr.length; i++) {
            sUm += arr[i];
        }
        System.out.println("avarage num of the array ="+ sUm/arr.length);
    }
    
}
