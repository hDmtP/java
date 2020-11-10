import java.util.Scanner;

public class multidimensionalarr {
    public static void main(String[] args) {
        // one dimensional array
        // int [] marks;

        // two dimensional array
        int [][] flats;
        flats = new int [3][4];
        // flats[0][0] = 100;
        // flats[0][1] = 101;
        // flats[0][2] = 102;
        // flats[0][3] = 103;
        
        // flats[1][0] = 104;
        // flats[1][1] = 105;
        // flats[1][2] = 106;
        // flats[1][3] = 107;
        
        // flats[2][0] = 107;
        // flats[2][1] = 108;
        // flats[2][2] = 109;
        // flats[2][3] = 110;
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
               flats[i][j] = scan.nextInt();
            }
            System.out.print("\n");
        }
        
        System.out.println("Printing a 2-D array using a for loop");
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
