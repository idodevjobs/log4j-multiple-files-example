package com.idodevjobs.log4jexample.main;

import com.idodevjobs.log4jexample.util.Util;
import org.apache.log4j.Logger;

public class Log4jExample {
    private static Logger logger = Logger.getLogger(Log4jExample.class);

    public static void main(String[] args) {
        logger.debug("log4jexample:a sample debug message");
        logger.info("log4jexample:a sample info  message");
        logger.warn("log4jexample:a sample warn  message");
        logger.error("log4jexample:a sample error message");
        logger.fatal("log4jexample:a sample fatal message");

        Util util = new Util();
        util.aMethod();
    }
}
