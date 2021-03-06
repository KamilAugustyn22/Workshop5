package pl.coderslab.service;

import org.springframework.stereotype.Component;
import pl.coderslab.model.Book;

import java.util.ArrayList;
import java.util.List;

@Component
public class MockBookService implements BookService {
    private List<Book> books;
    public MockBookService(){
        books = new ArrayList<>();
        books.add(new Book(1L, "9788324631766", "Thiniking	in Java", "Bruce Eckel", "Helion", "programming"));
        books.add(new Book(2L, "9788324627738", "Rusz	glowa Java.", "Sierra Kathy,	Bates Bert", "Helion", "programming"));
        books.add(new Book(3L, "9780130819338", "Java	2. Podstawy", "Cay Horstmann, Gary Cornell", "Helion", "programming"));
    }
    public void setBooks(List<Book> books){
        this.books = books;
    }
    public List<Book> getBooks(){
        return books;
    }

}
