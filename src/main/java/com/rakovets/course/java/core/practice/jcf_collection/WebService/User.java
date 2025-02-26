package com.rakovets.course.java.core.practice.jcf_collection.WebService;

import java.util.Objects;

public class User {
    private String login;
    private String passWord;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public User(String login, String passWord) {
        this.login = login;
        this.passWord = passWord;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(login, user.login) && Objects.equals(passWord, user.passWord);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, passWord);
    }
}
