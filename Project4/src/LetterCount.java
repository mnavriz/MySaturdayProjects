import java.util.LinkedHashMap;

public class LetterCount {


    /*
            Given one method name is charCount
            Parameter is a String
            Return type is LinkedHashMap<Character, Integer>

            Get an each char from String return the number of each charin the String

            For Example:

            String = aabbbcccc

            return should be a , 2
                             b , 3
                             c , 4

            Note: There could be any char in the String.

     */

    public LinkedHashMap<Character, Integer> charCount(String myStr){
        LinkedHashMap<Character, Integer> result = new LinkedHashMap<>();
//loop over the given String
        for (int i = 0; i < myStr.length(); i++) {
//checks chars in String (There could be any char in the String)
            char letter = myStr.charAt(i);
            Integer letterCounter = result.get(letter);
//checks if an char is only single time in the String
            if (letterCounter == null){
                letterCounter = 1;
//counts the char/ letter
            } else{
                letterCounter++;
            }//put the current result in the result map
                result.put(letter,letterCounter);


        } return result;

    }


}
