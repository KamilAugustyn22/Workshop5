package pl.coderslab.beans;

public class Book {
    private Long id;
    private String isbn;
    private String title;
    private String author;
    private String publisher;
    private String type;

    public Book(Long id, String isbn, String title, String author, String publisher, String type){
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.type = type;
    }
    public void setId(long id){
        this.id = id;
    }
    public long getId(){
        return id;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getIsbn(){
        return isbn;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getAuthor(){
        return author;
    }
    public void setPublisher(String publisher){
        this.publisher = publisher;
    }
    public String getPublisher(){
        return publisher;
    }
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }
}
