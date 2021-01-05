import java.util.Scanner;

public class getTotal {


      /*

        Given three positive Strings
        remove all the non numeric numbers.
        change the Strings to int
        and print the total

        Example:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output should be == 65;

        NOTE : if the output less then 0 change output to -1

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String allElements = scanner.nextLine();

        String[] elements = allElements.split(" ");

        String num1 = elements[0];

        String num2 = elements[1];

        String num3 = elements[2];

        //  code Start here don't change before this line
        //   use Strings num1 , num2 , num3

        num1 = num1.replaceAll("[$]","");//$15-->15
        int num11 = Integer.parseInt(num1);
        num2 = num2.replaceAll("[$]","");;
        int num22 = Integer.parseInt(num2);
        num3 = num3.replaceAll("[$]","");;
        int num33 = Integer.parseInt(num3);

    int sum = num11+num22+num33;

    if (sum<0){
        System.out.println("-1");
    }else {
        System.out.println(sum);
    }


    }
}
