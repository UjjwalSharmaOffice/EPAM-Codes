package com.epam.campus;


public class Book {
    private int bookId;
    private String bookName;
    private String bookAuthor;
    private String bookPublisher;
    private String bookISBN;
    private String bookDescription;
    private String bookCategory;
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getBookAuthor() {
        return bookAuthor;
    }
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }
    public String getBookPublisher() {
        return bookPublisher;
    }
    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }
    public String getBookISBN() {
        return bookISBN;
    }
    public void setBookISBN(String bookISBN) {
        this.bookISBN = bookISBN;
    }
    public String getBookDescription() {
        return bookDescription;
    }
    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }
    public String getBookCategory() {
        return bookCategory;
    }
    public void setBookCategory(String bookCategory) {
        this.bookCategory = bookCategory;
    }
    @Override
    public String toString() {
        return "Book{" +
                "id=" + bookId +
                ", name='" + bookName + '\'' +
                ", author='" + bookAuthor + '\'' +
                ", isbn='" + bookISBN + '\'' +
                ", category='" + bookCategory + '\'' +
                '}';
    }

}
