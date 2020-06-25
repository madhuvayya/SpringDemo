package usingjavaconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MessageConfig {

    @Bean
    public HelloWorld getMessage(){
        return new HelloWorld();
    }
}
