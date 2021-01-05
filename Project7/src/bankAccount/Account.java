package bankAccount;

public class Account {


    /*
        Create a static method name is deposit
        parameters are two int(int amountAccount1 , int amountToAdd)
        return type is int

        add amountToAdd to accountNumber
     */
public static int deposit (int amountAccount1 , int amountToAdd){
    return amountToAdd + amountAccount1;
}


    /*
         Create a static method name is withDraw
         parameters are two int(int amountAccount1 , int withdrawAmount)
         return type is int
         remove the withdrawAmount from the  accountAmount

     */

public static int withDraw (int amountAccount1 , int withdrawAmount){
    return amountAccount1 - withdrawAmount;
}

    /*
        Create a static method name is transferOtherUser
        Parameters are 2 objects of Users class(Users  sendingUser , Users receivingUser )and one int (transferAmount)
        Return type is String
        if the transferAmount is greater  than amountAccount1 variable of the object sendingUser
        Then return Sender is poor lol :)
       if the transferAmount is smaller than or equal to amountAccount1 variable of the object sendingUser
            Remove 1 percent from the transferAmount
            remove the transferAmount from the sendingUser amountAccount1( you need to use withDraw method)
            add the transferAmount to the receivingUser  amountAccount1 (you need to use deposit method)
        Then return "Transaction is completed successfully"
        For example:
        SendingUser amountAccount1 has 1000 dollar
        receiving user amountAccount1 has 200 dollar
        transferAmount 100
        After the transaction SendingUser amountAccount1 should have 901 dollar
        After the transaction receivingUser amountAccount1 should have 299 dollar
     */
public static String transferOtherUser(Users  sendingUser , Users receivingUser, int transferAmount ){
    if(transferAmount>sendingUser.amountAccount1){
        return "Sender is poor lol";
    }
    if(transferAmount<=sendingUser.amountAccount1){
        int onePrecent = transferAmount *1/100;
        int transferAmount1 = transferAmount-onePrecent;
        withDraw(sendingUser.amountAccount1,transferAmount1);
        deposit(receivingUser.amountAccount1,transferAmount1);
    }
    return "Transaction is completed successfully";
}



    /*
       Create a static method name is transferToOwnAccount
       parameter is One Users object(you can put any name) , one int transferAmount
       return type is String
       if the transferAmount is greater than variable amountAccount1 of the object of Users
        return "You need more money dude"
       if the transferAmount is smaller than or equal to variable amountAccount1 of the object of Users
        Remove 2 percent from the transferAmount
          remove the transferAmount from variable amountAccount1 of the object of Users  (use withDraw method)
          add transferAmount to variable amountAccount2 of the object of Users   (use deposit method)
        return "Transaction is completed successfully"
     */

public static String transferToOwnAccount(Users techno,int transferAmount){
    if (transferAmount>techno.amountAccount1){
        return "You need more money dude";
    }
    if (transferAmount<=techno.amountAccount1){

        int twoPrecent = transferAmount *2/100;
        int transferAmount1 = transferAmount-twoPrecent;
        withDraw(techno.amountAccount1,transferAmount1);
        deposit(techno.amountAccount2,transferAmount1);
    }
    return "Transaction is completed successfully";
}
}














