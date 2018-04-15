package at.refugeescode.tiadalma;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dutchman")
public class TiaDalmaEndPoint {

    @Value("${dutchManLoction}")
    private String dutchManLoction;

    @GetMapping
    public String giveTheLoction(){
        return dutchManLoction;
    }

}
