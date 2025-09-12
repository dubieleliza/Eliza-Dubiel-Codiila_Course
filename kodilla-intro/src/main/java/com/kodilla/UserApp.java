package com.kodilla;

public class UserApp {
    public static void main(String[] args) {
        // Tworzymy tablicę użytkowników
        User[] users = new User[6];
        users[0] = new User("Eliza", 25);
        users[1] = new User("Karolina", 21);
        users[2] = new User("Barbara", 26);
        users[3] = new User("Artur", 17);
        users[4] = new User("Aleksandra", 13);
        users[5]= new User("Julianna", 36);

        int sum = 0;
        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].getAge();
        }
        double average = (double) sum / users.length;

        System.out.println("Średnia wieku: " + average);

        System.out.println("Użytkownicy poniżej średniej:");
        for (int i = 0; i < users.length; i++) {
            if (users[i].getAge() < average) {
                System.out.println(users[i].getName());
            }
        }
    }
}