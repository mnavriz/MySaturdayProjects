package TestClasses;

import bankAccount.Users;
import org.junit.Assert;
import org.junit.Test;

public class yourTest {

    /*

        Create a Test for method in the Users randomNumberCreator
        Check all possible options

     */

    /*
        Create a Test for method in the Users checkAge
        Check all possible options

     */
    @Test public void checkAge1(){
        String actual = Users.checkAge("08/05/1990");
        String expected = "You can get a credit card";
        Assert.assertEquals(expected,actual);
    }
    @Test public void checkAge2(){
        String actual = Users.checkAge("09/05/2003");
        String expected = "You should be at least 18 years old to get a credit card.";
        Assert.assertEquals(expected,actual);
    }







}

