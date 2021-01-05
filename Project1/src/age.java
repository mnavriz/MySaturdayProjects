import java.util.Scanner;

public class age {

     /*
        Given a int ,
            if the age less then and equal 10
                print  too young to create a Facebook account

             if the age less then and equal 16
                print  too young to get a driver's license

             if the age less then and equal 18
                print  too young to get a tattoo

            if the age less then and equal 21
                print  too young to drink alcohol

            if the age bigger or equal to 21
                print  do what ever you want to do

        Note: use if else statement.
     */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int myAge = scanner.nextInt();

        //  code Start here don't change before this line

        if (myAge<=10){
            System.out.println("too young to create a Facebook account");}
        if (myAge<=16){
                System.out.println("too young to get a driver's license");}
        if(myAge<=18){
                    System.out.println("too young to get a tattoo");}
        if(myAge<21){
                System.out.println("too young to drink alcohol");}
        else {
            System.out.println("do what ever you want to do");
        }

    }}

