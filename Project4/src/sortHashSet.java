import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class sortHashSet {

    /*
        Given the method whose name is sort
        Given allNumbers Integer Hashset as parameter
        Returns an ArrayList of Integers

        Sort the allNumbers hashset

        Change the result to ArrayList

        Return the ArrayList

        NOTE : DO NOT USE COLLECTION CLASS WHILE SOLVING THE QUESTION USE FOR LOOP OR DIFFERENT SET TYPES

     */

    public ArrayList<Integer> sort(HashSet<Integer> allNumbers){
        ArrayList<Integer> result  = new ArrayList<>(allNumbers);



        for (int i = 0; i < result.size(); i++) {
            for (int j = result.size()-1; j > i; j--) {
                if (result.get(i)> result.get(j)){

                    int tmp = result.get(i);
                    result.set(i,result.get(j)) ;
                    result.set(j,tmp);
                }
            }

        }

        return  result;
    }

}
