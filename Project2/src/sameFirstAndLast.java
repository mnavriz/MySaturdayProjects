import java.util.Scanner;

public class sameFirstAndLast {
   /*

    Given an array of ints, print true if the array is length 1 or more, and the first element and the last element are equal.

    sameFirstLast([1, 2, 3]) → false
    sameFirstLast([1, 2, 3, 1]) → true
    sameFirstLast([1, 2, 1]) → true
    sameFirstLast([1]) → true

    print just true or false

    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] useThisArray = myStr.split(" ");

//        code start here

        //int[] newArray = Integer.parseInt(useThisArray[i]);

        //for (int i = 0; i < newArray.length; i++) {
        if (useThisArray.length != 0) {

            if (useThisArray[0].equals(useThisArray[useThisArray.length - 1]) && useThisArray.length >= 1) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }else {
            System.out.println("false");

        }


        }

    }



