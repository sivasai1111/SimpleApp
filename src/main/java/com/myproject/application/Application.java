package com.myproject.application;


import java.text.NumberFormat;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.myproject.application,"
		+ "com.myproject.Simple")
public class Application extends SpringBootServletInitializer{
	
	private static final Logger log = LogManager.getLogger(Application.class);
	 
    public static void main(String[] args) {
    	log.debug(">>>>> Starting Spring Application.....");
        
        new Application()
		.configure(new SpringApplicationBuilder(Application.class))
		.run(args);
        
        Runtime runtime = Runtime.getRuntime();
        final NumberFormat format = NumberFormat.getInstance();
        final long maxMemory = runtime.maxMemory();
         final long allocatedMemory = runtime.totalMemory();
         final long freeMemory = runtime.freeMemory();
         final long num=1024;
         final long mb = num * 1024;
         final String mega = " MB";
        log.debug("========================== Memory Info ==========================");
         log.debug("Free memory: " + format.format(freeMemory / mb) + mega);
         log.debug("Allocated memory: " + format.format(allocatedMemory / mb) + mega);
         log.debug("Max memory: " + format.format(maxMemory / mb) + mega);
         log.debug("Total free memory: " + format.format((freeMemory + (maxMemory - allocatedMemory)) / mb) + mega);
         log.debug("=================================================================\n");
    }
   
}