package com.epam.campus;

import java.util.ArrayList;


public class UserManager {
    private ArrayList<User> users = new ArrayList<>();
    private final UserValidator validator = new UserValidator();
    public void addUser(User user) {
        if (!validator.isValid(user)) {
            System.out.println("The User is invalid!");
        } else {
            users.add(user);
            System.out.println("User has been added");
        }
    }
    public void removeUser(User user) {
        if (users.contains(user)) {
            users.remove(user);
            System.out.println("User has been removed");
        }
    }
    public void listUsers() {
        if (users.isEmpty()) {
            System.out.println("No users have been added");
        } else {
            users.forEach(System.out::println);
        }
    }
    public void getUserById(int id) {
        boolean found = false;
        for (User user : users) {
            if (id == user.getId()) {
                System.out.println(user);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("User not found");
        }
    }
    public void getUserByEmail(String email) {
        boolean found = false;
        for (User user : users) {
            if (email.equals(user.getEmail())) {
                System.out.println(user);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("User not found");
        }
    }
    public ArrayList<User> getUsers() {
        return users;
    }
}
