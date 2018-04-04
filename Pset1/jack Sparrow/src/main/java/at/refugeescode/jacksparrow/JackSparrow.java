package at.refugeescode.jacksparrow;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JackSparrow {
    @Bean
    ApplicationRunner jackSparrowMain(JackSparrowHimself jackSparrowHimself){
        return args -> {
          jackSparrowHimself.getCoin();
        };

    }
}
