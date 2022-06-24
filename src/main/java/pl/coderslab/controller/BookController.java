package pl.coderslab.controller;


import org.springframework.web.bind.annotation.*;
import pl.coderslab.service.BookService;
import pl.coderslab.model.Book;

import java.util.List;

@RestController
@RequestMapping(value ="/books", method = RequestMethod.GET)
public class BookController {

    private BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @GetMapping("")
    @ResponseBody
    public List<Book> getList() {
        return bookService.getBooks();
    }





    @RequestMapping("/helloBook")
    public Book helloBook() {
                return new Book(1L, "9788324631766", "Thinking in Java",
                                "Bruce Eckel", "Helion", "programming");
    }

}
