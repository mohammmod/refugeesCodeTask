package at.refugeescode.myamazinghelloworld.HelloWolrd;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class TheMagicalSentence {
    @Bean
    public ApplicationRunner SayHelloWolrd(Hello hello,World world){
        return argv->{
            System.out.println(hello.getHello() +" "+world.getWorld() );
        };
    }
}
