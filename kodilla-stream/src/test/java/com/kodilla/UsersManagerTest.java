package com.kodilla.stream;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class UsersManagerTest {

    @Test
    public void testFilterChemistGroupUsernames() {
        List<String> result = UsersManager.filterChemistGroupUsernames();
        assertEquals(2, result.size());
        assertTrue(result.contains("Walter White"));
        assertTrue(result.contains("Gale Boetticher"));
    }

    @Test
    public void testFilterUsersOlderThan() {
        List<User> result = UsersManager.filterUsersOlderThan(40);
        assertTrue(result.stream().allMatch(user -> user.getAge() > 40));
    }

    @Test
    public void testFilterUsersWithMoreThanXPosts() {
        List<User> result = UsersManager.filterUsersWithMoreThanXPosts(100);
        assertTrue(result.stream().allMatch(user -> user.getNumberOfPost() > 100));
    }
}
