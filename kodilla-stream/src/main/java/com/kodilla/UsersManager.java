package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {

    public static void main(String[] args) {
        processUsersStream();
        System.out.println("\n--- Chemists only ---");
        List<String> chemistGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistGroupUsernames);
    }

    private static void processUsersStream() {
        UsersRepository.getUsersList()
                .stream()
                .map(UsersManager::getUserName)
                .forEach(System.out::println);
    }

    public static List<String> filterChemistGroupUsernames() {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(User::getUsername)
                .collect(Collectors.toList());
    }

    public static List<User> filterUsersOlderThan(int age) {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getAge() > age)
                .collect(Collectors.toList());
    }

    public static List<User> filterUsersWithMoreThanXPosts(int posts) {
        return UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getNumberOfPost() > posts)
                .collect(Collectors.toList());
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }
}
