package com.rakovets.course.java.core.practice.jcf_collection.WebService;

import java.util.HashSet;
import java.util.Set;

public class WebService {
    private Set<User> usersSet;

    public Set<User> getUsersSet() {
        return usersSet;
    }

    public WebService() {
        usersSet = new HashSet<>();
    }

    public void addNewUser(String login, String passWord) {
        User newUser = new User(login, passWord);
        usersSet.add(newUser);
    }

    public void deleteUser(User user) {
        usersSet.remove(user);
    }

    public boolean checkUserExist(String login) {
        boolean exists = false;
        for (User u : usersSet ) {
            if (u.getLogin().equals(login)) {
                exists = true;
                break;
            }
        }
        return exists;
    }

    public void changeUserLogin(String oldLogin, String newLogin) {
        for (User user : usersSet) {
            if (user.getLogin().equals(oldLogin)) {
                user.setLogin(newLogin);
            }
        }
    }

    public void changeUserPassWord(String oldPassWord, String newPassWord) {
        for (User user : usersSet) {
            if (user.getPassWord().equals(oldPassWord)) {
                user.setPassWord(newPassWord);
            }
        }
    }
}
