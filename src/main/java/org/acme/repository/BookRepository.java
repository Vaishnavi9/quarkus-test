package org.acme.repository;

import jakarta.enterprise.context.ApplicationScoped;
import org.acme.model.Book;

import java.util.List;


@ApplicationScoped
public class BookRepository {


    public List<Book> getAllBooks() {
        return List.of(new Book(1, "Understanding Quarkus", "Antonio", "IT", 2020),
                new Book(2, "Practise Quarkus", "Antonio", "IT", 2020),
                new Book(3, "Effective Java", "Josh Bloch", "IT", 2001),
                new Book(4, "thinking in java", "Bruce Eckel", "IT", 1998));
    }


}
