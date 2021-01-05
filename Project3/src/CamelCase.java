public class CamelCase {

    /*
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case

       For Example:

            my family live in united states

      Result should be

            My Family Live In United States

     */

    public String camelcase(String sentence) {


        //Character [] str = new Character[sentence.length()];
        //if (sentence.startsWith(sentence.toLowerCase())){
        /*for (int i = 0; i < sentence.length(); i++) {
            str[i]= sentence.charAt(i);
        }
        for

        }*/

        String array[] = sentence.split(" ");

        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].substring(0,1).toUpperCase() + array[i].substring(1);
        }
        sentence = "";
        for (String a : array){
            sentence+=a+" ";
        }
        sentence.trim();

        return sentence;
    }


    }










