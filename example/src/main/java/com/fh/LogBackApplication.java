package com.fh;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * logback是直接实现slf4j的接口
 */
public class LogBackApplication {

    private final static Logger logger = LoggerFactory.getLogger(LogBackApplication.class);

    public static void main(String[] args) {
        logger.info("logback");
    }
}
