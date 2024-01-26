package org.simol.examples.design_patterns.dao;

import java.util.List;

import org.simol.simolframework.java.Simu_comp_worker;
import org.simol.simolframework.java.With_compat;

/* 20231003 An example of DAO design pattern in simol. */

//Just a simple technical Launcher, that's a good job for the computer!
//public simu_comp_worker Main
@Simu_comp_worker
public class Main {

	public static void main(String[] args) {
		//we need the memory version of the UserDao
		@With_compat UserDao userDao = new UserDaoMemory();

        // Create and save a new user
        User newUser = new User(1, "john_doe", "john@example.com");
        userDao.save(newUser);

        // Retrieve and print all users
        @With_compat List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println("User: " + user.getUsername() + ", Email: " + user.getEmail());
        }

        // Update user information
        User updatedUser = new User(1, "new_username", "new_email@example.com");
        userDao.update(updatedUser);

        // Retrieve and print the updated user
        User retrievedUser = userDao.findById(1);
        if (retrievedUser != null) {
            System.out.println("Updated User: " + retrievedUser.getUsername() + ", Email: " + retrievedUser.getEmail());
        }

        // Delete the user
        userDao.delete(1);

        // Verify that the user has been deleted
        User deletedUser = userDao.findById(1);
        if (deletedUser == null) {
            System.out.println("User with ID 1 has been deleted.");
        }

	}

}
