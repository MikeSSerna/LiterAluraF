package com.maico.LiterAlura.controller;

import com.maico.LiterAlura.model.Book;
import com.maico.LiterAlura.repository.BookRepository;
import com.maico.LiterAlura.client.GutendexClient;
import com.maico.LiterAlura.client.GutendexResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GutendexController {

    private final GutendexClient gutendexClient;
    private final BookRepository bookRepository;

    @Autowired
    public GutendexController(GutendexClient gutendexClient, BookRepository bookRepository) {
        this.gutendexClient = gutendexClient;
        this.bookRepository = bookRepository;
    }

    @GetMapping("/searchBooks")
    public String searchBooks(@RequestParam String title) {
        GutendexResponse response = gutendexClient.getBooksByTitle(title);

        if (response.getResults() == null || response.getResults().isEmpty()) {
            return "No books found for the title: " + title;
        }

        Book book = response.getResults().get(0);
        bookRepository.save(book);

        return "Book saved!\nTitle: " + book.getTitle() +
                "\nAuthor: " + book.getAuthor() +
                "\nLanguages: " + String.join(", ", book.getLanguages()) +
                "\nDownload Count: " + book.getDownloadCount();
    }
}



