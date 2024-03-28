/*
Library management
    - manage books and library members
    - each book has
        - unique id: string
        - title: string
        - author: string
        - availability status: boolean
    - each member has
        - unique id: string
        - name: string
        - list of borrowed books: list of strings
    - library should allow
        - borrow book
        - return book
        - add new book to library
*/
package members;

import java.util.ArrayList;
import java.util.List;
import books.Book;

public class Member {
    int mUid;
    String mName;
    List<Book> mBorrowedBooks = new ArrayList<>();


    public Member(int mUid, String mName) {
        this.mUid = mUid;
        this.mName = mName;
        this.mBorrowedBooks = new ArrayList<>();
        System.out.println("Member added: " + this.mUid + " - " + this.mName);
    }

    //getters
    public int getmUid() {
        return mUid;
    }

    public String getmName() {
        return mName;
    }

    public void borrowBook(Book book) {
        mBorrowedBooks.add(book);
    }

    public void returnBook(Book book) {
        mBorrowedBooks.remove(book);
    }
}
