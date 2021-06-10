package com.cwiczenia.ksiegarnia.sale.dao;

import com.cwiczenia.ksiegarnia.sale.entity.Book;
import com.cwiczenia.ksiegarnia.sale.entity.Category;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SaleManager {

    private final List<Book> books = new ArrayList<>();

    public SaleManager() {
    }


    public List<Book> findAll() {
        return books;
    }

    public Optional<Book> findById(Long index) {
        return books.stream()
                .filter(e -> e.getId().equals(index))
                .findFirst();
    }

    public Optional<Book> findByName(String name) {
        return books.stream()
                .filter(e -> e.getName().equals(name))
                .findFirst();
    }

    public Optional<Book> findByCategory(Category category) {
        return books.stream()
                .filter(e -> e.getCategory().equals(category))
                .findFirst();
    }

    public Optional<Book> findByPrise(int prise) {
        return books.stream()
                .filter(e -> e.getPrise()==prise)
                .findFirst();
    }

    public Optional<Book> findByAuthorLastName(String authorLastName) {
        return books.stream()
                .filter(e -> e.getAuthorLastName().equals(authorLastName))
                .findFirst();
    }

    public boolean save(Book book){
        return books.add(book);
    }

    public boolean deleteById(Long index){
        return books.remove(index);
    }

//    @EventListener(ApplicationReadyEvent.class)
//    public void fillDB(){
//        save(new Book(1L,"Kod Da Vinci", "Di Caprio", Category.ACTION, 200));
//
//    }

}
