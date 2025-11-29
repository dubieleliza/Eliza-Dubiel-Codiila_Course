package com.kodilla.rest.domain;

import java.util.Objects;

public class BookDto {
    private String title;
    private String author;

    // 👇 KONSTRUKTOR BEZPARAMETROWY (potrzebny do JSON → obiekt)
    public BookDto() {
    }

    // 👇 KONSTRUKTOR Z PARAMETRAMI (do ręcznego tworzenia)
    public BookDto(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // jeśli to ten sam obiekt
        if (o == null || getClass() != o.getClass()) return false; // jeśli inny typ
        BookDto bookDto = (BookDto) o;
        return Objects.equals(title, bookDto.title) &&
                Objects.equals(author, bookDto.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author);
    }
}

