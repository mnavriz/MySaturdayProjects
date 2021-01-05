package Laptop;

import java.util.ArrayList;
import java.util.Scanner;

public class PriceForOneLaptop {

    /*
        Given one method name is getPrice

        Parameter is int

        Return type is int

        This method is calling the AllData method from Data class. Laptop ID is a parameter laptopID

        This method need to call all other methods in Calculation class and get the price and return that total Amount.
     */
    int total;

    public int getPrice(int laptopID){

        Data date = new Data();
        Calculation cal = new Calculation();



        total = cal.getColor(date.AllData(laptopID))+ cal.getCPU(date.AllData(laptopID))+ cal.getRam(date.AllData(laptopID))+ cal.getSize(date.AllData(laptopID));

        return total;
    }

    /*
        Given getDiscount

        Parameter is two int (amount , discount)

        Return type is int

        Make the discount from the amount

        And Return the discounted price

        Example

        Amount 1500
        discount 20

        After a 20% discount (1500 * %20 = 300)

        Result should be 1200 (because 1500 - 300 = 1200)
     */

    public int getDiscount(int num , int discount){

        total = num;

           discount = (total * discount)/100;

        return total-discount;
        }

    }




