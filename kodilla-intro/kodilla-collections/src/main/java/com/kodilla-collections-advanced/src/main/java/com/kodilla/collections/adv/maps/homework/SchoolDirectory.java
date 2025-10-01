package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> schools = new HashMap<>();

        Principal smith = new Principal("Jan", "Szuster");
        Principal brown = new Principal("Anna", "Malicka");
        Principal white = new Principal("Michal", "Biajko");

        School highSchool = new School("Publiczna Szkoła Podstawowa  nr.5", 30, 28, 32, 29);
        School primarySchool = new School("Zespół Szkól Technicznych nr.1 ", 25, 27, 26, 28, 24);
        School technicalSchool = new School("Regionalne Centrum Edukacji Zawodowej", 31, 30, 29);

        schools.put(smith, highSchool);
        schools.put(brown, primarySchool);
        schools.put(white, technicalSchool);

        for (Map.Entry<Principal, School> entry : schools.entrySet()) {
            System.out.println("Dyrektor: " + entry.getKey()
                    + ", Szkoly: " + entry.getValue().getName()
                    + ", Liczba uczniów: " + entry.getValue().getTotalStudents());
        }
    }
}
