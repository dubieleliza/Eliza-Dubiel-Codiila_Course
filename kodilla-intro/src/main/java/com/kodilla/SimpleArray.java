package com.kodilla;

public class SimpleArray {
    public static void main(String[] args) {
        String[] book = new String[5];
        book[0] = "Ania z Zielonego Wzgórza";
        book[1] = "Szatan z siódmej klasy";
        book[2] = "Czarnoksięznik z krainy Oz";
        book[3] = "Anna Karenina";
        book[4] = "Zbrodnia i kara";

        String thirdhBook = book[2];
        System.out.println(thirdhBook);

        int numberOfElements = book.length;
        System.out.println("Moja tablica zawiera " + numberOfElements + " elementów");
    }
}
