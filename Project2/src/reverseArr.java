import java.util.Arrays;
import java.util.Scanner;

public class reverseArr {

      /*
        Given String array

        reverse the String array

        print the reversed array

        NOTE: While printing the array dont use for loop
        Use Arrays.toString(your_array_name);


     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] useThisArray = myStr.split(" ");

//        code start here

        String[] newOutPut = new String[useThisArray.length];
        int j=0;
        for (int i = useThisArray.length-1; i >= 0; i--) {
          newOutPut[j] = useThisArray[i];
            j++;
            }
        System.out.println(Arrays.toString(newOutPut));
        }

    }


