package TestPackage;

import Settings.UserNameAndPassword;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class YourTest {

    /*
        Given before class

              Do not change the before class
    */
    UserNameAndPassword userNameAndPassword = new UserNameAndPassword();
    @Before
    public void beforeClass(){
        userNameAndPassword.addUserToList();
    }


    /*
    YOUR CODE IS STARTING HERE

    Test the UserNameAndPassword class setUsername method

    Check all the possible options.

    NOTE :  For each possibility you need to create a different @Test method
    For Example  one of the condition is if the UserNameLists has myusername , you are supposed to create your test case for this.
    You will do the same approach for each condition of the both methods.

     */

    @Test
    public void test1(){

        String tesUser = "Barbara@gmail.com";
        System.out.println(userNameAndPassword.setUsername(tesUser));

    }
    @Test
    public void test2(){
        String testUser = "myuse";
        System.out.println(userNameAndPassword.setUsername(testUser));


    }
    @Test
    public void test3(){
        String testUser = "myusesafsfsaf";
        System.out.println(userNameAndPassword.setUsername(testUser));

    }
    @Test
    public void test4(){
        String testUser = "myuses afsfsaf";
        String expected  = userNameAndPassword.setUsername(testUser);
        System.out.println(expected);
    }
    @Test
    public void test5(){
        String testUser = "mnavriz@gmail.com";
        String expected  = userNameAndPassword.setUsername(testUser);
        System.out.println(expected);
    }
    @Test
    public void test6(){
        String testPW = "hell";
        System.out.println(userNameAndPassword.setPassword(testPW));
    }
    @Test
    public void test7(){
        String testPW = "hello";
        System.out.println(userNameAndPassword.setPassword(testPW));
    }
}
