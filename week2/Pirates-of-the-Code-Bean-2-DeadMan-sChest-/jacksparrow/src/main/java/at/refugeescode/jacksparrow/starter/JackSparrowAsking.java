package at.refugeescode.jacksparrow.starter;

import at.refugeescode.jacksparrow.model.Treasure;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@Configuration
public class JackSparrowAsking {
    @Value("${tiaDalma}")
    private String tiaDalma;
    @Bean
    ApplicationRunner startAdventure(RestTemplate restTemplate){
        return args -> {
            ResponseEntity<String> forEntity = restTemplate.getForEntity(tiaDalma,
                    String.class);
            String dutchManLoction = forEntity.getBody();
            System.out.println(dutchManLoction);
            ResponseEntity<Treasure> theTreasure = restTemplate.getForEntity(dutchManLoction
                    , Treasure.class);
            System.out.println(theTreasure.getBody().getMessage());
        };
    }
}
