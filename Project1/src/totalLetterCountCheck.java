import java.util.Scanner;

public class totalLetterCountCheck {

    /*
        Given a String ,
            if the count of the letter in the String is odd print true else print false

     */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        //  code Start here don't change before this line

        int count = word.length();

        if(count%2==1){//check the length of the word if its odd or not
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}
