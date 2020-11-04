package com.zepernick.actions.test;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.validator.annotations.RequiredStringValidator;
import com.opensymphony.xwork2.validator.annotations.Validations;
import com.zepernick.model.User;
import com.zepernick.model.dao.IUserDao;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.convention.annotation.Results;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by PaulZepernick on 11/3/2020.
 * Last Modified by PaulZepernick on 11/3/2020.
 */
@Results({
        @Result(name = {"form", "editNew"}, location = "/WEB-INF/jsp/user-form.jsp"),
        @Result(name = "success-create", location = "/WEB-INF/jsp/user-form-success.jsp")
})
public class MyTestAction extends ActionSupport {

    @Autowired
    private IUserDao userDao;

    @lombok.Getter
    @lombok.Setter
    private User user;

    @Validations(
            requiredStrings = {
                    @RequiredStringValidator(fieldName = "user.firstName", message = "Required"),
                    @RequiredStringValidator(fieldName = "user.lastName", message = "Required")
            }
    )
    public String create() {
        setUser(userDao.create(getUser()));
        return "success-create";
    }

    public String index() {
        return "form";
    }

}
