package com.tool;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author SonPT
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.portalevent.repository")
public class DBGenerator implements CommandLineRunner {


    @Override
    public void run(String... args) throws Exception {

    }
}
