package io.maveric.booklist.Model;

public class Book
{
    private String title;
    private String author;
    private String category;
    private String urlImage;

    public Book(){}

    public Book(String title,String author,String category,String urlImage)
    {
        this.title=title;
        this.author=author;
        this.category=category;
        this.urlImage= urlImage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
