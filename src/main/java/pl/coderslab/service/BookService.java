package pl.coderslab.service;

import org.springframework.stereotype.Component;
import pl.coderslab.model.Book;

import java.util.List;

@Component
public interface BookService {

    List<Book>getBooks();
}
