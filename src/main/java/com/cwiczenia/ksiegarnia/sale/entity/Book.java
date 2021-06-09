package com.cwiczenia.ksiegarnia.sale.entity;

public class Book {

    private Long id;
    private String name;
    private String authorLastName;
    private Category category;
    private int prise;

    public Book() {
    }

    public Book(Long id, String name, String authorLastName, Category category, int prise) {
        this.id = id;
        this.name = name;
        this.authorLastName = authorLastName;
        this.category = category;
        this.prise = prise;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthorLastName() {
        return authorLastName;
    }

    public void setAuthorLastName(String authorLastName) {
        this.authorLastName = authorLastName;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }
}
