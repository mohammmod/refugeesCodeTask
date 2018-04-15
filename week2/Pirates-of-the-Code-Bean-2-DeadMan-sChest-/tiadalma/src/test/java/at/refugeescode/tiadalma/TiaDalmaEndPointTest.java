package at.refugeescode.tiadalma;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;

class TiaDalmaEndPointTest {

    @Test
    void giveTheLoction() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> forEntity = restTemplate.getForEntity("http://localhost:8001/dutchman"
                , String.class);
        String url = forEntity.getBody();
        Assertions.assertEquals("http://localhost:9001/deadmanschest",url);
    }
}