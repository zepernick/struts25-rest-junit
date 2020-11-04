package com.zepernick.junit.actions.test;

import com.opensymphony.xwork2.ActionProxy;
import com.zepernick.actions.test.MyTestAction;
import com.zepernick.junit.ZepStrutsSpringTestCase;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by PaulZepernick on 11/4/2020.
 * Last Modified by PaulZepernick on 11/4/2020.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyTestActionSpringConfig.class)
public class MyTestActionTest extends ZepStrutsSpringTestCase<MyTestAction> {

    @Test
    public void testValidation() throws Exception{
        // Map to POST to fire create via the REST plugin
        request.setMethod("POST");

        ActionProxy proxy = getActionProxy("/test/my-test");
        Assert.assertNotNull(proxy);

        MyTestAction action = (MyTestAction)proxy.getAction();
        Assert.assertNotNull(action);

        String result = proxy.execute();

        Assert.assertTrue("expected some field errors", !action.getFieldErrors().isEmpty());
    }

}
