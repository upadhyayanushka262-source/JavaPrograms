class Library {
    int booksAvailable;
    static String libraryName = "College Library";

    void issueBook() {
        int remaining = booksAvailable - 1;

        if (booksAvailable > 0) {
            booksAvailable = remaining;
            System.out.println("Book Issued");
        } else {
            System.out.println("No Books Available");
        }

        System.out.println("Available Books: " + booksAvailable);
    }

    void returnBook() {
        int total = booksAvailable + 1;
        booksAvailable = total;

        System.out.println("Book Returned");
        System.out.println("Available Books: " + booksAvailable);
    }

    public static void main(String[] args) {
        Library l = new Library();
        l.booksAvailable = 10;

        System.out.println("Library: " + libraryName);
        l.issueBook();
        l.returnBook();
    }
}
