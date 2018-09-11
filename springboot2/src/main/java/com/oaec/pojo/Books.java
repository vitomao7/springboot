package com.oaec.pojo;

public class Books {
    private Integer bookId;

    private String bookName;

    private Integer bookCount;

    private String bookAuthor;

    private String bookFrom;

    private String bookFromtime;

    private String bookIsbn;

    private String bookPic;

    private Float bookPrice;

    private String bookComment;

    private String bookContentdes;

    private String bookAuthordes;

    private String bookChapter;

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    public Integer getBookCount() {
        return bookCount;
    }

    public void setBookCount(Integer bookCount) {
        this.bookCount = bookCount;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor == null ? null : bookAuthor.trim();
    }

    public String getBookFrom() {
        return bookFrom;
    }

    public void setBookFrom(String bookFrom) {
        this.bookFrom = bookFrom == null ? null : bookFrom.trim();
    }

    public String getBookFromtime() {
        return bookFromtime;
    }

    public void setBookFromtime(String bookFromtime) {
        this.bookFromtime = bookFromtime == null ? null : bookFromtime.trim();
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn == null ? null : bookIsbn.trim();
    }

    public String getBookPic() {
        return bookPic;
    }

    public void setBookPic(String bookPic) {
        this.bookPic = bookPic == null ? null : bookPic.trim();
    }

    public Float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(Float bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookComment() {
        return bookComment;
    }

    public void setBookComment(String bookComment) {
        this.bookComment = bookComment == null ? null : bookComment.trim();
    }

    public String getBookContentdes() {
        return bookContentdes;
    }

    public void setBookContentdes(String bookContentdes) {
        this.bookContentdes = bookContentdes == null ? null : bookContentdes.trim();
    }

    public String getBookAuthordes() {
        return bookAuthordes;
    }

    public void setBookAuthordes(String bookAuthordes) {
        this.bookAuthordes = bookAuthordes == null ? null : bookAuthordes.trim();
    }

    public String getBookChapter() {
        return bookChapter;
    }

    public void setBookChapter(String bookChapter) {
        this.bookChapter = bookChapter == null ? null : bookChapter.trim();
    }
}