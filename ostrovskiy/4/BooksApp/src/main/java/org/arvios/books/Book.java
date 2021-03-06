package org.arvios.books;

import java.io.Serializable;

/**
 * Created by artem-ostrovsky on 10.10.2016.
 */
public class Book implements Serializable {
    private static final long serialVersionUID = -6105673935487900564L;

    private String author;
    private int numberOfPages;
    private String name;
    private String description;

    public Book() {
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
