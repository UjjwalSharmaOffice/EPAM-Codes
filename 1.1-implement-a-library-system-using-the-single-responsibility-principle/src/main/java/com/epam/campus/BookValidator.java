package com.epam.campus;


public class BookValidator {

    /**
     * Validates a book object based on business rules.
     * 
     * Validation rules:
     * - Book name must not be null or empty
     * - Book ISBN must not be null and must be exactly 13 characters long
     * - Book author must not be null or empty
     *
     * @param book the book to validate
     * @return true if the book is valid, false otherwise
     */
    public boolean isValid(Book book) {

        if (book.getBookName() == null || book.getBookName().isEmpty()) {
            return false;
        }

        if (book.getBookISBN() == null || book.getBookISBN().length() != 13) {
            return false;
        }

        if (book.getBookAuthor() == null || book.getBookAuthor().isEmpty()) {
            return false;
        }

        return true;
    }
}
