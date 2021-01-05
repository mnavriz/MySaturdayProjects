import java.util.Random;
import java.util.Scanner;

public class RandomNumberBetweenTwoNumbers {


    /*
    Given two positive integer numbers

     integer 1 is min
     integer 2 is max

    create a random number between min and max

    output should be int

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();

        String[] elements = s1.split(" ");

        int min = Integer.parseInt(elements[0]);
        int max = Integer.parseInt(elements[1]);

        //  code Start here don't change before this line

       // int randomNumber = (int)(Math.random() * ((max - min) + 1)) + min;
      //  System.out.println(randomNumber);

        Random random = new Random(); // init it like scanner class
        // random.nextInt(bound) this function returns a random int between 0 and bound
        int randomNumber = random.nextInt(max - min) + min;
        System.out.println(randomNumber);


    }
}
