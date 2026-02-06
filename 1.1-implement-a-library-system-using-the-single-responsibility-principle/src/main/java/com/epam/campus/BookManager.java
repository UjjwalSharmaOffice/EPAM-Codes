package com.epam.campus;

import java.util.ArrayList;


public class BookManager {
    private ArrayList<Book> books = new ArrayList<>();
    private final BookValidator validator = new BookValidator();
    public void removeBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            System.out.println("Book has been removed");
        }
    }
    public void addBook(Book book) {
        if (!validator.isValid(book)) {
            System.out.println("The Book is invalid!");
        } else {
            books.add(book);
            System.out.println("Book has been added");
        }
    }
    public void listBooks(ArrayList<Book> books) {
        if (books.isEmpty()) {
            System.out.println("No books have been added");
        } else {
            books.forEach(System.out::println);
        }
    }
    public void listBookByID(int bookID) {
        boolean found = false;
        for (Book book : books) {
            if (bookID == book.getBookId()) {
                System.out.println(book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found");
        }
    }
    public void getBookByISBN(String ISBN) {
        boolean found = false;
        for (Book book : books) {
            if (ISBN.equals(book.getBookISBN())) {
                System.out.println(book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Book not found");
        }
    }
    public ArrayList<Book> getBooks() {
        return books;
    }
}
