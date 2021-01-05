package bankAccount;

import org.junit.Assert;

import java.time.LocalDate;
import java.util.Date;

public class AddRelative {


    /*
    Create an instance variable
        String fullName , String relativeDoB
     */
    String fullName , relativeDoB;
    /*
        Create a constructor AddRelative
            parameters String fullName and  String relativeDoB
        instance variable fullName equals to parameter fullName
        If the age is greater than  and equal to 18, so the  instance variable relativeDoB equals to parameter relativeDoB (use relativeAgeChecker method)
        If the age is less than 18, so the instance variable relativeDoB equals to "0"
     */
public AddRelative(String fullName, String relativeDoB){
    this.fullName = fullName;
    if(relativeAgeChecker(relativeDoB)){
        this.relativeDoB = relativeDoB;
    }else{
        this.relativeDoB = "0";
    }
}

    /*
        Create a method name is relativeAgeChecker
        parameter String(relativeDoB)
        return type is boolean
        if the relativeAge more and equal to 18 return true
        else false
        Note: use a Users class checkAge method(check which statement gives you the age is greater than and equal to 18)
     */
public boolean relativeAgeChecker(String relativeDoB){
    //LocalDate now = LocalDate.now();
    int birth = Integer.parseInt(relativeDoB);
    if (Users.checkAge(relativeDoB).equals("You can get a credit card")){
        return true;
    }

        return false;
}
}


