package pl.coderslab.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.coderslab.beans.Book;

@RestController
@RequestMapping(value ="/books", method = RequestMethod.GET)
public class BookController {
    @RequestMapping("/helloBook")
    public Book helloBook() {
                return new Book(1L, "9788324631766", "Thinking in Java",
                                "Bruce Eckel", "Helion", "programming");
            }
}
