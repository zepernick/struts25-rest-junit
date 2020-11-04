package com.zepernick.junit.spring.beans;

import com.zepernick.model.User;
import com.zepernick.model.dao.IUserDao;

import java.io.Serializable;
import java.util.UUID;

/**
 * Created by PaulZepernick on 11/4/2020.
 * Last Modified by PaulZepernick on 11/4/2020.
 */
public class UserDaoTest implements IUserDao {

    @Override
    public User read(Serializable id) {
        User u = new User();
        u.setId(UUID.randomUUID().toString());
        u.setFirstName("Test First");
        u.setLastName("Test Last");
        return u;
    }

    @Override
    public User create(User user) {
        user.setId("Test ID");
        return user;
    }
}
