import java.util.HashSet;

public class TotalLength {

    /*

        Given getTotalLength method
        Parameter is one Set of Strings
        Return type is an int

       Get the total length of each String in the Set
       return the total

       Example:
       Set String is "repl" "is" "homework"

       result should be 14

       NOTE : IF RESULT IS EQUAL TO 0 THEN CHANGE IT TO -1

     */

    public int getTotalLength(HashSet<String> mySet) {

        int result = 0;

        for (String mySetStr:mySet) {
            result+= mySetStr.length();
        } {

            if (result==0) {
                return -1;
            }else
                return result;
        }

    }
}
