package Project10.Solution.Users;

import Project10.Solution.Books.Book;
import Project10.Solution.Books.Reference;
import Project10.Solution.Data;
import Project10.Solution.LibraryApp;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class User {
    private String name, lastName;
    public static int userId;
    private Map<Integer, Book> bookList = new HashMap<>();
    private final int BOOK_LIMIT;
    public static  int MAX_DAYS;

    public User(String name, String lastName, int userId, int bookLimit, int maxDays) {
        this.name = name;
        this.lastName = lastName;
        this.userId = userId;
        this.BOOK_LIMIT = bookLimit;
        this.MAX_DAYS = maxDays;
    }

    public static int getMAX_DAYS() {
        return MAX_DAYS;
    }

    public int getBOOK_LIMIT() {
        return BOOK_LIMIT;
    }

    private static void addToBookList(User user, Book book) {
        user.bookList.put(book.getBookId(), book);
        book.setCheckedOut(true);
        book.setBorrower(user);

    }

    public Map<Integer, Book> getBookList() {
        return bookList;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public static int getUserId() {
        return userId;
    }

    protected void checkOutBookToUser(User user, Book book) {
        if (user.getBookList().size() >= user.BOOK_LIMIT) {
            System.out.println("You have already reached your book limit. You cannot borrow more books.");
        } else if (book instanceof Reference) {
            System.out.println("This is a reference book, and it cannot be checked out.");
        } else {
            addToBookList(user, book);
            book.setDueDate(user.MAX_DAYS);
            book.setBorrower(user);
            System.out.println("It has successfully checked out." +
                    "\nBorrower's Name: " + book.getBorrower().getName() + " " + book.getBorrower().getLastName() +
                    "\nBook ID        : " + book.getBookId() +
                    "\nBook Title     : " + book.getBookName() +
                    "\nAuthor         : " + book.getAuthor() +
                    "\nCheck Out Date : " + LocalDate.now() +
                    "\nDue Date       : " + book.getDueDate()
            );
        }
    }

    public void selfCheckOut(int bookId) {
        if (Data.getBookMap().containsKey(bookId)) {
            Book bookToBeCheckOut = Data.getBookMap().get(bookId);
            checkOutBookToUser(LibraryApp.getActiveUser(), bookToBeCheckOut);
        } else {
            System.out.println("This is not a valid book ID.");
        }
    } // end of selfCheckOut method

    public void checkIn(int bookId) {
        if (Data.getBookMap().containsKey(bookId)) {
            Book bookToBeCheckedIn = Data.getBookMap().get(bookId);
            if (bookToBeCheckedIn.isCheckedOut()) {
                if (bookToBeCheckedIn.getDueDate().isAfter(LocalDate.now())) {
                    System.out.println("Thanks for returning it on time. Have a great day.");
                } else {
                    System.out.println("Thanks for returning. The due date was: " + bookToBeCheckedIn.getDueDate() +
                            ". Please do your best to return the books on time next time!");
                }
                bookToBeCheckedIn.getBorrower().bookList.remove(bookId, bookToBeCheckedIn);
                bookToBeCheckedIn.setBorrower(null);
                bookToBeCheckedIn.setDueDate(0);
                bookToBeCheckedIn.setCheckedOut(false);
            } else {
                System.out.println("This is is not checked out to any user yet!");
            }
        } else {
            System.out.println("This is not a valid book ID.");
        }
    }  // end of checkIn method


}
