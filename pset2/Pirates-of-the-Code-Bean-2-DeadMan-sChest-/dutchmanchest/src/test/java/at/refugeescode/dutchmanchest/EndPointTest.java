package at.refugeescode.dutchmanchest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;

class EndPointTest {

    @Test
    void getTreasure() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Treasure> forEntity = restTemplate.getForEntity("http://localhost:9001/" +
                "deadmanschest", Treasure.class);
        String message = forEntity.getBody().getMessage();
        Assertions.assertEquals("we found the treasure" ,message);
    }
}