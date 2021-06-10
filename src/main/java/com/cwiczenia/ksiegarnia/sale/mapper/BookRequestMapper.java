package com.cwiczenia.ksiegarnia.sale.mapper;

import com.cwiczenia.ksiegarnia.sale.entity.Book;
import com.cwiczenia.ksiegarnia.sale.request.BookRequest;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public class BookRequestMapper {

    public Book mapToBook (BookRequest bookRequest){
        if(Objects.isNull(bookRequest)){
            return null;
        }
        Book book = new Book();
        book.setName(bookRequest.getNameRequest());
        book.setAuthorLastName(bookRequest.getAuthorLastNameRequest());
        book.setCategory(bookRequest.getCategoryRequest());
        book.setPrise(bookRequest.getPriseRequest());
        return book;

    }
}
