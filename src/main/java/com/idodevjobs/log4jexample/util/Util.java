package com.idodevjobs.log4jexample.util;

import org.apache.log4j.Logger;

public class Util {
    private static Logger logger = Logger.getLogger(Util.class);
    
    public void aMethod() {
        logger.debug("aMethod:a sample debug message");
        logger.info ("aMethod:a sample info  message");
        logger.warn ("aMethod:a sample warn  message");
        logger.error("aMethod:a sample error message");
        logger.fatal("aMethod:a sample fatal message");
    }
}
