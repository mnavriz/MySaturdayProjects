import java.util.ArrayList;

public class DigitPowers {
    /*

          Given one method name is power4
          Parameter is one int
          Return type is an int

          Get each digit from the parameter int number
          Take the each number to the power 4
          Sum powered numbers
          Return the result

          Example: parameter int is 1234

          1⁴ + 2⁴ + 3⁴ + 4⁴ = 1 + 16 + 81 + 256

          result should be 354

       */

        public int power4(int num){


            int power = 4;
            int result = 0;
            int[] array = new int[num];

            for (int i = 0; i < array.length; i++) {
                result += (int) Math.pow((num % 10), power);
                num = num / 10;
            }

            return result;


        }




}
