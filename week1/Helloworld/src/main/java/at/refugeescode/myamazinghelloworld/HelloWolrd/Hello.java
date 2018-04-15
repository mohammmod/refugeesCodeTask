package at.refugeescode.myamazinghelloworld.HelloWolrd;

import org.springframework.stereotype.Component;

@Component
public class Hello {
    private String hello = "hello";

    public String getHello() {
        return this.hello;
    }
}
