package org.simol.examples.design_patterns.dao;

import java.util.ArrayList;
import java.util.List;

// A simu_alfoc is exactly what we need here, and it's so close to the DAO pattern!
//public simu_alfoc UserDaoMemory contracts UserDao
public class UserDaoMemory implements UserDao {
	// You would typically have a database connection or data source here.
    // For this example, we'll use a List as a simple in-memory storage.

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
