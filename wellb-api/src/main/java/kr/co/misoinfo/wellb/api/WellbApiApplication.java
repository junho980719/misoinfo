package kr.co.misoinfo.wellb.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "kr.co.misoinfo.core",
})
public class WellbApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(WellbApiApplication.class, args);
    }

}
