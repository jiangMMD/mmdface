package com.mmd.mmdface;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com/mmd/mmdface/dao")
@EnableScheduling
public class MmdfaceApplication {

    public static void main(String[] args) {
        SpringApplication.run(MmdfaceApplication.class, args);
    }

}

