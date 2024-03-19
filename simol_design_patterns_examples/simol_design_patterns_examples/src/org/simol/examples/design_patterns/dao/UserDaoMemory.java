package org.simol.examples.design_patterns.dao;

import java.util.ArrayList;
import java.util.List;

import org.simol.simolframework.java.Contracts;
import org.simol.simolframework.java.Simu_comp_worker;
import org.simol.simolframework.java.With_compat;

// A simu_comp_as_worker is exactly what we need here, and it's so close to the DAO pattern!
//public simu_comp_as_worker UserDaoMemory contracts UserDao
@Simu_comp_as_worker
public class UserDaoMemory implements @Contracts UserDao {
	// You would typically have a database connection or data source here.
    // For this example, we'll use a List as a simple in-memory storage.

	@With_compat
    private List<User> users = new ArrayList<>();

    @Override
    public User findById(int id) {
        for (User user : users) {
            if (user.getId() == id) {
                return user;
            }
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return users;
    }

    @Override
    public void save(User user) {
        users.add(user);
    }

    @Override
    public void update(User user) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId() == user.getId()) {
                users.set(i, user);
                return;
            }
        }
    }

    @Override
    public void delete(int id) {
        users.removeIf(user -> user.getId() == id);
    }
}
