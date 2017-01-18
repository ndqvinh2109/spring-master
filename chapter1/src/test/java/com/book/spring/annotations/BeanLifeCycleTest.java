package com.book.spring.annotations;

import com.book.components.LifeCycleBean;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Quang on 01/19/2017.
 */
public class BeanLifeCycleTest {

    @Test
    public void showLifeCycle() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring/life-cycle-bean-config.xml",
                "classpath:spring/test-db-config.xml");
        LifeCycleBean lifeCycleBean = context.getBean("lifeCycleBean", LifeCycleBean.class);
        Assert.assertNotNull(lifeCycleBean);

        context.registerShutdownHook();
    }
}
