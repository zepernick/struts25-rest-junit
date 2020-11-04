package com.zepernick.model.dao;

import com.zepernick.model.User;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by PaulZepernick on 11/3/2020.
 * Last Modified by PaulZepernick on 11/3/2020.
 */
public class UserDao implements IUserDao {

    public User read(Serializable id) {
        User u = new User();
        u.setId(UUID.randomUUID().toString());
        u.setFirstName("Paul");
        u.setLastName("Zepernick");
        return u;
    }

    public User create(User user) {
        user.setId(UUID.randomUUID().toString());
        return user;
    }
}
