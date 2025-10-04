package com.kodilla.collections.adv.immutable;

public class BooKHacked {
    private String title;

    public BookHacked(String author, String title) {
        super(author, title);
    }

    public void modifyTitle(String newTitle) {
        title = newTitle;
    }
}
    

