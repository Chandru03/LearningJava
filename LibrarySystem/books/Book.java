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

package books;

public class Book {
    private int bUid;
    private String bTitle;
    private String bAuthor;
    private boolean bAvailability;

    public Book(int bUid, String bTitle, String bAuthor, boolean bAvailability) {
        this.bUid = bUid;
        this.bTitle = bTitle;
        this.bAuthor = bAuthor;
        this.bAvailability = bAvailability;
        System.out.println("Book created: " + this.bUid + " - " + this.bTitle + " - " + this.bAuthor + " - " + this.bAvailability);
    }

    //getters
    public int getbUid() {
        return bUid;
    }

    public String getbTitle() {
        return bTitle;
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public boolean getbAvailability() {
        return bAvailability;
    }

    //borrow
    public void borrowBook() {
        this.bAvailability = false;
        System.out.println("Book borrowed: " + this.bUid + " - " + this.bTitle + " - " + this.bAuthor + " - " + this.bAvailability);
    }

    public void returnBook() {
        this.bAvailability = true;
        System.out.println("Book returned: " + this.bUid + " - " + this.bTitle + " - " + this.bAuthor + " - " + this.bAvailability);
    }
}
