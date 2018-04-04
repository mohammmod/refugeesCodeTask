package at.refugeescode.jacksparrow;

import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Coin {


    public Optional<Coin> GetTheCoin(){
        Optional <Coin> coin = Optional.of(new Coin());
        return coin;
    }
}
