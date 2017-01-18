package com.book.components;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Quang on 01/18/2017.
 */
public class LifeCycleBean implements InitializingBean, DisposableBean {

    Logger logger = LoggerFactory.getLogger(LifeCycleBean.class);

    private String internal;

    public LifeCycleBean() {
        logger.info("1. Constructor.");
    }

    public void setInternal(String internal) {
        logger.info("2. Setter.");
        this.internal = internal;
    }

    @PostConstruct
    public void postConstruct() {
        logger.info("3. @PostConstruct");
    }

    /**
     * Invoked by a BeanFactory after it has set all bean properties supplied
     * (and satisfied BeanFactoryAware and ApplicationContextAware).
     * <p>This method allows the bean instance to perform initialization only
     * possible when all bean properties have been set and to throw an
     * exception in the event of misconfiguration.
     *
     * @throws Exception in the event of misconfiguration (such
     *                   as failure to set an essential property) or if initialization fails.
     */
    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("4. afterPropertiesSet");
    }

    public void initMethod() {
        logger.info("5. init-method");
    }

    @PreDestroy
    public void preDestroy() {
        logger.info("6. @PreDestroy");
    }

    /**
     * Invoked by a BeanFactory on destruction of a singleton.
     *
     * @throws Exception in case of shutdown errors.
     *                   Exceptions will get logged but not rethrown to allow
     *                   other beans to release their resources too.
     */
    @Override
    public void destroy() throws Exception {
        logger.info("7. destroy()");
    }

    public void destroyMethod() {
        logger.info("8. destroy-method");
    }

}
