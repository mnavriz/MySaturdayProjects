import java.util.Arrays;
import java.util.Scanner;

public class changeArray {

      /*
        Given one arrays of Strings
        If string contains Orange change all Orange to Apple

        For Example:
        Array : Peach , Berry , Orange , WaterMelon , Orange

        Result should be Peach , Berry , Apple , WaterMelon , Apple

        Print the Array

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String myStr = scan.nextLine();
        String[] UseThisArray = myStr.split(" ");

//        Code Start here
//        You should use -> UseThisArray

        for (int i = 0; i < UseThisArray.length; i++) {
            if(UseThisArray[i].contains("Orange")){
                UseThisArray[i]="Apple";
            }

        }
        System.out.println(Arrays.toString(UseThisArray));;


    }

}
