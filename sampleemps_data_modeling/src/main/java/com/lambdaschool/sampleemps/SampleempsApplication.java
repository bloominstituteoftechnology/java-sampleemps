package com.lambdaschool.sampleemps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SampleempsApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(SampleempsApplication.class,
                              args);
    }

}
