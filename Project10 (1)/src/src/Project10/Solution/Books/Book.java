package Project10.Solution.Books;

import Project10.Solution.Users.User;

import java.time.LocalDate;

public class Book {
    private String bookName, author;
    protected static int bookId;
    private static boolean isCheckedOut;
    private static User borrower;
    private LocalDate dueDate;

    public void setDueDate(int maxDays){
        if(maxDays == 0) {
            dueDate = null;
        } else {
            dueDate = LocalDate.now().plusDays(maxDays);
        }
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public static User getBorrower() {
        return borrower;
    }

    public void setBorrower(User borrower) {
        this.borrower = borrower;
    }

    public String getBookName() {
        return bookName;
    }

    public String getAuthor() {
        return author;
    }

    public static int getBookId() {
        return bookId;
    }

    public static boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public Book(String bookName, String author, int bookId){
        this.bookName = bookName;
        this.author = author;
        this.bookId = bookId;
    }

}
