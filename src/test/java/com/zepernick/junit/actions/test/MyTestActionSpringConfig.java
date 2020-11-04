package com.zepernick.junit.actions.test;

import com.zepernick.junit.spring.beans.UserDaoTest;
import com.zepernick.model.dao.IUserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by PaulZepernick on 11/4/2020.
 * Last Modified by PaulZepernick on 11/4/2020.
 */
@Configuration
public class MyTestActionSpringConfig {

    @Bean
    public IUserDao userDao() {
        return new UserDaoTest();
    }

}
