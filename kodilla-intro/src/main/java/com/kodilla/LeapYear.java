package com.kodilla;

public class LeapYear {
    public static boolean LeapYear(int year) {
        if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int year = 2025;

        if (LeapYear(year)) {
            System.out.println(year + " jest rokiem przestępnym!");
        } else {
            System.out.println(year + " nie jest rokiem przestępnym.");
        }
    }
}
