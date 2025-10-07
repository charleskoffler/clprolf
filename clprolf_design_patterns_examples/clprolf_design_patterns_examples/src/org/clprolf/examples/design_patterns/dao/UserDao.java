package org.clprolf.examples.design_patterns.dao;

import java.util.List;

import org.clprolf.framework.java.Compat_interf_version;

// a version compatiblity interface suits perfectly here! Because it's goal is to propose multiple implementations of the same purpose class.
// public compat_interf_version UserDao
@Compat_interf_version
public interface UserDao {
	public User findById(int id);
	public List<User> findAll();
	public void save(User user);
	public void update(User user);
	public void delete(int id);
}
