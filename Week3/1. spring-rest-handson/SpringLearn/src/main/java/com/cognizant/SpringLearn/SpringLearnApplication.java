package com.cognizant.SpringLearn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringLearnApplication {

    private static final Logger LOGGER =
            LoggerFactory.getLogger(SpringLearnApplication.class);

    public static void main(String[] args) {

        LOGGER.info("SpringLearnApplication Started");

        displayCountry();

        LOGGER.info("SpringLearnApplication Stopped");
    }

    public static void displayCountry() {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("country.xml");

        Country country = context.getBean("country", Country.class);

        LOGGER.info("Country Code {}", country.getCode());
        LOGGER.info("Country Name {}", country.getName());
        LOGGER.info("{}", country.toString());

        ((ClassPathXmlApplicationContext) context).close();
    }
}
