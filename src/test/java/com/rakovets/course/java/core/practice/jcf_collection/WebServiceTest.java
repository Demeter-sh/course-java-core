package com.rakovets.course.java.core.practice.jcf_collection;

import com.rakovets.course.java.core.practice.jcf_collection.WebService.User;
import com.rakovets.course.java.core.practice.jcf_collection.WebService.WebService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

@DisplayName("WebService Test")
public class WebServiceTest {
    WebService webService = new WebService();
    User userJayCut = new User("JayCut", "12345");

    @Test
    @DisplayName("addNewUserTest")
    void addNewUserTest() {
        webService. addNewUser("JayCut", "12345");
        Set<User> userSet = webService.getUsersSet();
        Assertions.assertTrue(userSet.contains(userJayCut));
    }

    @Test()
    @DisplayName("delete user test")
    void deleteUserTest() {
        webService.addNewUser("JayCut", "12345");
        webService.deleteUser(userJayCut);
        Assertions.assertFalse(webService.getUsersSet().contains(userJayCut));
    }

    @Test()
    @DisplayName("check user exist test")
    void checkUserExistTest() {
        webService.addNewUser("JayCut", "12345");
        webService.addNewUser("user1", "12345");
        webService.addNewUser("user2", "12345");

        Assertions.assertTrue(webService.checkUserExist("user1"));
    }

    @Test
    @DisplayName("changeUserLogin test")
    void changeUserLoginTest() {
        webService.addNewUser("JayCut", "12345");
        webService.changeUserLogin("JayCut", "Jay");
        User userJay = new User("Jay", "12345");

        Assertions.assertTrue(webService.getUsersSet().contains(userJay));
    }

    @Test
    @DisplayName("changeUserPassword test")
    void changeUserPassWordTest() {
        webService.addNewUser("JayCut", "12345");
        webService.changeUserPassWord("12345", "1");
        User userJay = new User("Jay", "1");

        Assertions.assertTrue(webService.getUsersSet().contains(userJay));
    }
}
