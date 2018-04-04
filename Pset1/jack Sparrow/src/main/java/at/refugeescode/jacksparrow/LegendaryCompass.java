package at.refugeescode.jacksparrow;

import org.springframework.stereotype.Component;

@Component
public class LegendaryCompass {
    private Coin coin;

    public LegendaryCompass(Coin coin){
        this.coin = coin;

    }

    public String tellMeWhereisTheCoin() {

        if (coin.GetTheCoin().isPresent()){
            return "i found the Coin";
        }
        return "i didnt find the coin ";

    }
}
