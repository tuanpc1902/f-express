package com.tuanpc.fexpress;

import com.tuanpc.fexpress.reposiroty.config.DataSourceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(DataSourceConfig.class)
public class FExpressApplication {

    public static void main(String[] args) {
        SpringApplication.run(FExpressApplication.class, args);
    }

}
