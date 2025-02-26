package com.rakovets.course.java.core.practice.jcf_collection;

import com.rakovets.course.java.core.practice.jcf_collection.WebService.User;
import com.rakovets.course.java.core.practice.jcf_collection.WebService.WebService;

public class WebServerDemo {
    public static void main(String[] args) {
        WebService webService = new WebService();
        User userJayCut = new User("JayCut", "12345");
        User userJay = new User("Jay", "12345");

        webService.addNewUser("JayCut", "12345");

        System.out.println("Before change user login " + webService.getUsersSet().contains(userJayCut));
        for (User u : webService.getUsersSet()) {
            System.out.println(u.getLogin() + " " + u.getPassWord());
        }

        webService.changeUserLogin("JayCut", "Jay");
        System.out.println("After change login " +  webService.getUsersSet().contains(userJay));

        for (User u : webService.getUsersSet()) {
            System.out.println(u.getLogin() + " " + u.getPassWord());
        }
        System.out.println(webService.getUsersSet().contains(userJay));
    }
}
