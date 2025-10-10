package com.kodilla.stream.homework;

import com.kodilla.stream.User;

import java.util.List;

public class ForumStats {

    public double averagePostsForAge40AndAbove(List<User> users) {
        return users.stream()
                .filter(u -> u.getAge() >= 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }

    public double averagePostsForAgeBelow40(List<User> users) {
        return users.stream()
                .filter(u -> u.getAge() < 40)
                .mapToInt(User::getNumberOfPost)
                .average()
                .orElse(0.0);
    }

    public static void main(String[] args) {
        ForumStats stats = new ForumStats();
        List<User> users = com.kodilla.stream.UsersRepository.getUsersList();

        double avgAbove40 = stats.averagePostsForAge40AndAbove(users);
        double avgBelow40 = stats.averagePostsForAgeBelow40(users);

        System.out.println("Average posts for users age >= 40: " + avgAbove40);
        System.out.println("Average posts for users age < 40: " + avgBelow40);
    }
}
