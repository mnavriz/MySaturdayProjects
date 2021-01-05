import java.util.Arrays;
import java.util.Scanner;

public class minNumber {

      /*
        Create int 2D array

        Which is {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}}

        print the min number from the 2d array
     */

    public static void main(String[] args) {
        int[][] i1 = new int[][]{{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}};

        int min = 1 ;
        for( int i = 0 ; i < i1.length ; i++){
            for(int j =0 ; j< i1[i].length ; j++){

                if(i1[i][j] < min){
                    min = i1[i][j];
                }
            }

}
        System.out.println(min);
}
}
