package com.zepernick.spring;

import com.zepernick.model.dao.IUserDao;
import com.zepernick.model.dao.UserDao;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by PaulZepernick on 11/3/2020.
 * Last Modified by PaulZepernick on 11/3/2020.
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    public IUserDao userDao() {
        return new UserDao();
    }

}
