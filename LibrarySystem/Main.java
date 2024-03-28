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
import books.Book;
import members.Member;


public class Main {
    public static void main(String[] args) {
        Book book1 = new Book(0, "Sapiens", "Noah Harrari", true);

        Member member1 = new Member(0, "Chandru");

        member1.borrowBook(book1);
    }
}
