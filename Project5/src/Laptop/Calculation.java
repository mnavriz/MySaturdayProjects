package Laptop;

import java.util.ArrayList;
import java.util.Scanner;

public class Calculation {

     /*
        Create method whose name is getRam

        Parameter is ArrayList<String>
        return type is int

        if ram is 32 gb add 300 to price
        if ram is 16 gb add 200 to price
        if ram is 8 gb add 100 to price
        if ram is 4 gb add 50 to price

        return the price.
     */
    public  int getRam (ArrayList<String> listGB){

        int price = 0;

            if (listGB.contains("32 gb")){
               price += 300;
            }
            else if (listGB.contains("16 gb")){
                price+=200;
            }
            else if (listGB.contains("8 gb")){
                price+=100;
            }
            else if (listGB.contains("4 gb")){
                price+=50;
            }
        return price;
        }





    /*
       Create method name is getCPU

        return type is int
        Parameter is ArrayList<String>

        if CPU is i3 add 200 to price
        if CPU is i5 add 300 to price
        if CPU is i7 add 500 to price

        return the price.
     */

    public int getCPU (ArrayList<String> listCPU){

        int price = 0;


            if (listCPU.contains("i3")){
                price+=200;
            }
            else if (listCPU.contains("i5")){
                price+=300;
            }
            else if (listCPU.contains("i7")){
                price+=500;
            }

        return price;
        }



    /*
      Create method name is getColor

      Parameter is ArrayList<String>

      return type is int

      if Color is Red add 400 to price
      if Color is Orange add 300 to price
      if Color is Silver add 200 to price
      if Color is Black add 150 to price

      return the price.
   */

    public int getColor (ArrayList<String> listColor){


        int price = 0;


            if (listColor.contains("Red")){
                price += 400;
            }
            else if (listColor.contains("Orange")){
                price+=300;
            }
            if (listColor.contains("Silver")){
                price+=200;
            }
            if (listColor.contains("Black")){
                price+=150;
            }
        return price;
        }





    /*
      Create method name is getSize

      return type is int

      Parameter is ArrayList<String>

      if Size contains "Mini" add 100 to price
      if Size contains "Middle" add 200 to price
      if Size contains "Max" add 300 to price

      return the price.
   */
    public int getSize (ArrayList<String> listSize){

        int price=0;
        for (int i = 0; i < listSize.size(); i++) {
            if(listSize.get(i).contains("Mini")){
                price +=100;
            }else if(listSize.get(i).contains("Middle")){
                price+=200;
            }
            else if(listSize.get(i).contains("Max")) {
                price += 300;
            }
        }

        return price;
        }

    }


