package com.zepernick.model.dao;

import com.zepernick.model.User;

import java.io.Serializable;

/**
 * Created by PaulZepernick on 11/3/2020.
 * Last Modified by PaulZepernick on 11/3/2020.
 */
public interface IUserDao {

    User read(Serializable id);

    User create(User user);

}
