package com.kodilla.collections.adv.immutable.homework;

public class Task1 {

    public final class Task1 {
        private final String title;
        private final int numberOfPages;

        public Task(String title, int numberOfPages) {
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
}

