package at.refugeescode.dutchmanchest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class EndPoint {
    @GetMapping("/deadmanschest")
    public Treasure getTreasure(Treasure treasure){
        treasure.setMessage("we found the treasure");
        return treasure;
    }
}
