package org.kunggea.demo.config;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    private static final Logger logger = LoggerFactory.getLogger(LoggingAspect.class);

    @Pointcut("execution(* org.kunggea.demo.mapper.*.*(..))")
    public void mapperMethods() {}

    @Before("mapperMethods()")
    public void logBefore() {
        logger.info("Executing SQL query...");
    }

    @After("mapperMethods()")
    public void logAfter() {
        logger.info("SQL query executed successfully.");
    }
}