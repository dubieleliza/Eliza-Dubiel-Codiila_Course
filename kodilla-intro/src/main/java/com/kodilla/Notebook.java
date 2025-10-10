package com.kodilla;

public class Notebook {
        int weight;
        int price;
        int year;

        public Notebook(int weight, int price, int year) {
            this.weight = weight;
            this.price = price;
            this.year = year;
        }

        public void checkPrice() {
            if (this.price < 600) {
                System.out.println("This notebook is very cheap.");
            } else if (this.price >= 600  && this.price <= 1000){
                System.out.println("The price is good ");
            } else {
                System.out.println("This notebook is expensive");
            }
        }
        public void checkWeight() {
            if (this.weight < 1000) {
                System.out.println("This notebook is light.");
            } else if (this.weight >= 1000 && this.weight <= 1800) {
                System.out.println("This notebook is not too heavy.");
            } else {
                System.out.println("This notebook is very heavy.");
            }
        }
        public void checkYear() {
            if (this.year <2015) {
                System.out.println("Notebook is old.");
            } else if(this.year >= 2015 && this.year <= 2022) {
                System.out.println("Notebook is standard.");
            } else {
                System.out.println("Notebook is modern.");
            }
        }
    }

