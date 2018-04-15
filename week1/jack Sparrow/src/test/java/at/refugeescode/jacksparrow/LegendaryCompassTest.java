package at.refugeescode.jacksparrow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LegendaryCompassTest {
    private LegendaryCompass legendaryCompass;
    private Coin coin;
    @BeforeEach
    void makeThingsReady(){
        this.coin = new Coin();
        legendaryCompass = new LegendaryCompass(coin);
    }
    @Test
    void tellMeWhereisTheCoin() {
        String result = legendaryCompass.tellMeWhereisTheCoin();
        String expacted = "i found the Coin";
        Assertions.assertEquals(expacted,result);



    }
}