import java.util.Random;
import java.util.Scanner;

public class RandomNum {


    /*
    Given a positive integer num name is max ,

    create a random number between 0 to max

    output should be int

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int max = Integer.parseInt(scanner.nextLine());

        //  code Start here don't change before this line

        Random random = new Random();

        int randomNumber2 = random.nextInt(max);
        System.out.println(randomNumber2);

    }
}