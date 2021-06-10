package com.cwiczenia.ksiegarnia.sale.controller;

//import com.cwiczenia.ksiegarnia.sale.dao.SaleManager;
//import com.cwiczenia.ksiegarnia.sale.entity.Book;
//import com.cwiczenia.ksiegarnia.sale.mapper.BookRequestMapper;
//import com.cwiczenia.ksiegarnia.sale.request.BookRequest;
import com.cwiczenia.ksiegarnia.sale.dao.SaleManager;
import com.cwiczenia.ksiegarnia.sale.entity.Book;
import com.cwiczenia.ksiegarnia.sale.mapper.BookRequestMapper;
import com.cwiczenia.ksiegarnia.sale.request.BookRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    public SaleManager saleManager;
    private BookRequestMapper bookRequestMapper;

    public BookController(SaleManager saleManager, BookRequestMapper bookRequestMapper) {
        this.saleManager = saleManager;
        this.bookRequestMapper = bookRequestMapper;
    }

    @PostMapping("/book")
    public ResponseEntity<Void> addBook(@RequestBody BookRequest bookRequest ){
        Book book = bookRequestMapper.mapToBook(bookRequest);
        if(saleManager.save(book)){
            return ResponseEntity.status(HttpStatus.CREATED).build();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
    }


}
