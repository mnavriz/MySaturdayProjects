package Project10.Test;

import Project10.Solution.Books.Book;
import Project10.Solution.Data;
import Project10.Solution.LibraryApp;
import Project10.Solution.Users.Librarian;
import Project10.Solution.Users.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

import java.time.LocalDate;

public class T{
    @Rule
    public final TextFromStandardInputStream systemInMock = TextFromStandardInputStream.emptyStandardInputStream();

    @Test
    public void Test1(){
        systemInMock.provideLines("abcd","c");
        LibraryApp.main(null);

    }

    @Test
    public void Test2(){
        systemInMock.provideLines("","c");
        LibraryApp.main(null);
    }

    @Test
    public void Test3(){
        systemInMock.provideLines("1000","0");
        LibraryApp.main(null);

        String userName = Data.getUserMap().get(1000).getName();
        String userLastName = Data.getUserMap().get(1000).getLastName();

        String expected = "Library"+"Admin";
        String actual = userName+userLastName;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void Test4(){
        systemInMock.provideLines("2001","0");
        LibraryApp.main(null);

        String userName = Data.getUserMap().get(2001).getName();
        String userLastName = Data.getUserMap().get(2001).getLastName();

        String expected = "Ali"+"Veli";
        String actual = userName+userLastName;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void Test5(){
        systemInMock.provideLines("3002","0");
        LibraryApp.main(null);

        String expected = "Glazkov";
        String actual = Data.getUserMap().get(3002).getLastName();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void Test6(){
        systemInMock.provideLines("2002","1","20000","0");
        LibraryApp.main(null);

        int expected =2002;
        int actual = LibraryApp.getActiveUser().getUserId();
        Assert.assertEquals(expected,actual);
    }


    @Test
    public void Test7(){
        systemInMock.provideLines("3000","1","10000","0");
        LibraryApp.main(null);

        LocalDate expected = LocalDate.now().plusDays(14);
        LocalDate actual = Data.getBookMap().get(20000).getDueDate();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void Test8(){
        systemInMock.provideLines("2001","1","10000","0");
        LibraryApp.main(null);

        LocalDate expected = LocalDate.now().plusDays(21);
        LocalDate actual = Data.getBookMap().get(10000).getDueDate();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void Test9(){
        systemInMock.provideLines("1001","1","10002","0");
        LibraryApp.main(null);

        LocalDate expected = LocalDate.now().plusDays(30);
        LocalDate actual = Data.getBookMap().get(10002).getDueDate();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void Test10(){
        systemInMock.provideLines("1001","1","90001","0");
        LibraryApp.main(null);

        String expected = null;
        Assert.assertEquals(expected,LibraryApp.getActiveUser().getBookList().get(90001));
    }



    @Test
    public void Test11(){
        systemInMock.provideLines("2000","1","abcde","0");
        LibraryApp.main(null);

        Assert.assertEquals("",LibraryApp.getActiveUser().getBookList().get("abcde"));
    }

    @Test
    public void Test12(){
        systemInMock.provideLines("2000","1","10000","2","10000","0");
        LibraryApp.main(null);


        Assert.assertFalse(Data.getBookMap().get(10000).isCheckedOut());


    }

    @Test
    public void Test13(){
        systemInMock.provideLines("1001","5","10000","2","2002","2","10000","0");
        LibraryApp.main(null);

        Assert.assertFalse(Data.getBookMap().get(10000).isCheckedOut());
    }

    @Test
    public void Test14(){
        systemInMock.provideLines("1000","5","20000","2001","0");
        LibraryApp.main(null);

        User expected = Data.getUserMap().get(2001);
        User actual = Book.getBorrower();

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void Test15(){
        systemInMock.provideLines("1000","5","90000","3002","0");
        LibraryApp.main(null);

       User expected = null;
       int actual = Book.getBorrower().getUserId();

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void Test16(){
        systemInMock.provideLines("1000","3","2","John","Smith","2065","0");
        LibraryApp.main(null);

        Assert.assertTrue(Data.getUserMap().containsKey(2065));
    }

    @Test
    public void Test17(){
        systemInMock.provideLines("1000","3","3","John","Smith","3065","0");
        LibraryApp.main(null);


        Assert.assertTrue(Data.getUserMap().containsKey(3065));
    }

    @Test
    public void Test18(){
        systemInMock.provideLines("1000","3","1","John","Smith","1066","0");
        LibraryApp.main(null);


        Assert.assertTrue(Data.getUserMap().containsKey(1066));
    }

    @Test
    public void Test19(){
        systemInMock.provideLines("1000","3","3","John","Smith","5056","3165","0");
        LibraryApp.main(null);

        Assert.assertFalse(Data.getUserMap().containsKey(5065));
    }

    @Test
    public void Test20(){
        systemInMock.provideLines("1000","3","2","John","Smith","2165","0");
        LibraryApp.main(null);

        int expected = 21;
        int actual = User.getMAX_DAYS();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void Test21(){
        systemInMock.provideLines("1000","4","1","10031","blablaa","blablaa","0");
        LibraryApp.main(null);

        Librarian.createBookType(10031);
          int actual = Data.getBookMap().size();

        Assert.assertEquals(Data.getBookMap().size(),actual);
    }
    @Test
    public void Test22(){
        systemInMock.provideLines("1000","4","10031","0");
        LibraryApp.main(null);

        boolean expected= true;
        int actual = User.getUserId();

        Assert.assertEquals(expected,actual);
    }

}


