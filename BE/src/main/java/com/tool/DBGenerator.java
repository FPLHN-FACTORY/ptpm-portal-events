package com.tool;

import com.portalevent.infrastructure.repository.ApproverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author SonPT
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.portalevent.repository")
public class DBGenerator implements CommandLineRunner {

    @Autowired
    private ApproverRepository approverRepository;


    @Override
    public void run(String... args) throws Exception {

    }
}
