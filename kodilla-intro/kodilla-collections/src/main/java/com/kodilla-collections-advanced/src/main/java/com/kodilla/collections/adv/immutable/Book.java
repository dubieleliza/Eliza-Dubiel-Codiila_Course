package com.kodilla.collections.adv.immutable.homework;

public final class Book {
    private final String title;
    private final int numberOfPages;

    public Book(String title, int numberOfPages) {
        this.title = title;
        this.numberOfPages = numberOfPages;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    @Override
    public String toString() {
        return title + " (" + numberOfPages + " pages)";
    }
}
