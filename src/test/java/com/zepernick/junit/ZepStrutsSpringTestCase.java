package com.zepernick.junit;

import com.opensymphony.xwork2.ActionProxy;
import org.apache.struts2.ServletActionContext;
import org.apache.struts2.StrutsSpringJUnit4TestCase;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * The IWS base class for extending the base StrutsSpringJunit class.
 *
 *
 * Created by PaulZepernick on 10/14/2020.
 * Last Modified by PaulZepernick on 10/14/2020.
 */
@WebAppConfiguration
public abstract class ZepStrutsSpringTestCase<T> extends StrutsSpringJUnit4TestCase<T> {


    @Override
    protected ActionProxy getActionProxy(String uri) {

        // This is working around a issue in StrutsSpringJunit4TestCase
        // the super.getActionProxy() already sets this, but does it at the end of the method.
        // the ActionProxy proxy = ... line is already expecting it to be present and produces a NPE
        ServletActionContext.setServletContext(servletContext);
        ServletActionContext.setRequest(request);
        ServletActionContext.setResponse(response);

        return super.getActionProxy(uri);
    }
}
