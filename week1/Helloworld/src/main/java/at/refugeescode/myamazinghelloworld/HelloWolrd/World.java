package at.refugeescode.myamazinghelloworld.HelloWolrd;

import org.springframework.stereotype.Component;

@Component
public class World {
    private String world = "world";

    public String getWorld() {
        return this.world;
    }
}
