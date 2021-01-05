import java.util.Scanner;

public class perfectSquare {


    /*
    Given a positive integer num, write a function which returns true if num is a perfect square else false.

        Note: Do not use any built-in library function such as sqrt.

        Example 1:
        Input: 16
        Output: true
        Note: this number is perfect square because 4*4 is 16

        Example 2:
        Input: 25
        Output: true
        Note: this number is perfect square because 5*5 is 25

        Example 2:
        Input: 14
        Output: false

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        //  code Start here don't change before this line
        int Int;
        int sqr = input / 2;
    do {
        Int = sqr;
        sqr = (Int + (input /Int))/2;
    }while (Int - sqr != 0);

        if(sqr*sqr==input){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
