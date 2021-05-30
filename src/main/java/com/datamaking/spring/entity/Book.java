package com.datamaking.spring.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
    @Id
    private Integer id;
    private String name;
    private String desc;
    private Integer yearOfPublication;
    private String bookType;

    public Book() {

    }

    public Book(Integer id, String name, String desc, Integer yearOfPublication, String bookType) {
        this.id = id;
        this.name = name;
        this.desc = desc;
        this.yearOfPublication = yearOfPublication;
        this.bookType = bookType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public Integer getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(Integer yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }
}
