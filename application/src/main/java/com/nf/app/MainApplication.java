package com.nf.app;

import com.nf.service.ServiceExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.nf")
@RestController
public class MainApplication {

    private final ServiceExample serviceExample;

    public MainApplication(ServiceExample serviceExample) {
        this.serviceExample = serviceExample;
    }

    @GetMapping("/")
    public String home() {
        return serviceExample.message();
    }

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

}
