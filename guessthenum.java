import java.util.Scanner;
public class guessthenum {
    public static void GTN(){
    // Scanner Class 
    Scanner sc = new Scanner(System.in); 

    // Generate the numbers between 1 to 100
    int number = 1 + (int)(100* Math.random()); 

    // Given K trials 
    int K = 10; 

    int i, guess; 
    System.out.println( 
    "A number is chosen"
    + " between 1 to 100."
    + "Guess the number"
    + " within 10 trials."); 
    
    // Interate over K Trials 
    for (i = 0; i < K; i++) { 

        System.out.println( 
            "Guess the number:"); 

        // Take input for guessing 
        guess = sc.nextInt(); 

        // If the number is guessed 
        if (number == guess) { 
            System.out.println( 
                "Congratulations!"
                + " You guessed the number in "+i+" attempts. SCORE = "+100/i); 
            break; 
        } 
        else if (number > guess*7 
                    && i != K - 1) { 
            System.out.println( 
                "The number is VERY "
                + "greater than " + guess); 
        } 
        else if (number > guess 
                    && i != K - 1) { 
            System.out.println( 
                "The number is "
                + "greater than " + guess); 
        } 
        else if (number < guess/7
                    && i != K - 1) { 
            System.out.println( 
                "The number is VERY "
                + " less than " + guess); 
        } 
        else if (number < guess 
                    && i != K - 1) { 
            System.out.println( 
                "The number is"
                + " less than " + guess); 
        } 
    } 
    if (i == K) { 
        System.out.println( 
            "You have exhausted"
            + " K trials."); 

        System.out.println( 
            "The number was " + number); 
    } 
    }
    public static void main(String[] args) {
        GTN();
    } 
}

