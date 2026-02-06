package com.epam.campus;


public class Main {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();
        UserManager userManager = new UserManager();

        Book book = new Book();
        book.setBookId(1);
        book.setBookName("Clean Code");
        book.setBookAuthor("Robert C. Martin");
        book.setBookPublisher("Prentice Hall");
        book.setBookISBN("9780132350884");
        book.setBookDescription("A Handbook of Agile Software Craftsmanship");
        book.setBookCategory("Software Engineering");

        User user = new User();
        user.setId(1);
        user.setFirstName("Alice");
        user.setLastName("Johnson");
        user.setEmail("alice@example.com");
        user.setPassword("password123");
        user.setRole("Member");

        System.out.println("Adding entities");
        bookManager.addBook(book);
        userManager.addUser(user);

        System.out.println("Listing books");
        bookManager.listBooks(bookManager.getBooks());

        System.out.println("Listing users");
        userManager.listUsers();

        System.out.println("Lookup by ID/ISBN");
        bookManager.listBookByID(1);
        bookManager.getBookByISBN("9780132350884");
        userManager.getUserById(1);
        userManager.getUserByEmail("alice@example.com");
    }
}
