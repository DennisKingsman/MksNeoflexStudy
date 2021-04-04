package service;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@EnableConfigurationProperties(ServiceProperties.class)
public class ServiceExample {

    private final ServiceProperties serviceProperties;

    public ServiceExample(ServiceProperties serviceProperties) {
        this.serviceProperties = serviceProperties;
    }

    public String message() {
        return this.serviceProperties.getMessage();
    }

}
