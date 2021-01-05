package GameGuess;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    /*
        Create a method name is randomGenerator().

        This method will create random number from 0 to 100.

        This method will return that random number.

        Return type is int

     */
    public static int randomGenerator(){

        Random generator = new Random();
        int random= generator.nextInt(100);

        return random;
    }



  /*
        Create a method name is LetsGuess().

        This method take one int as a parameter.

        Return type is void.

        In this method you must continue to guess numbers until the you guess the correct number.

        When your number is less than random number then print "Your number is too low".

        When your number is more than random number then print "Your number is too high".

        When your guess number is equal to random number than print "You got it !!".

        And stop execution.

        Your maximum attempt to guess is 5.

        If your guess reach to 5 than print "You didn't get it dude!!!"

        Note:
         1) While guessing the numbers you must use the scanner class.
         2) Neither of these methods are static methods!

     */
public  void LetsGuess(int guess){

    Scanner sc = new Scanner(System.in);

    for (int i = 0; i <5 ; i++) {

        guess = sc.nextInt();
         randomGenerator();

         if (guess<randomGenerator()){
             System.out.println("Your number is too low");
         }
         else if (guess>randomGenerator()){
             System.out.println("Your number is too high");
         }
         else if (guess==randomGenerator()){
             System.out.println("You got it !!");
             break;
         }
          if (i==5){
             System.out.println("You didn't get it dude!!!");
         }
    }

}

}
