package org.example;

import org.example.entities.Continent;
import org.example.entities.Country;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@Profile("sa")
public class Beans {
    @Bean
    public Continent southAmerica(){
        return new Continent("SouthAmerica");
    }

    @Bean
    public Country brazil(){
        return new Country("Brazil", "Rio", 300, southAmerica());
    }

    @Bean Country peru(){
        Country per = new Country();
        per.setName("Peru");
        per.setCapital("Lima");
        per.setPop(76);
        per.setContinent(southAmerica());
        return per;
    }

    @Bean
    public Country venezuela(){
        return new Country("Venezuela", "Caracas", 28, southAmerica());
    }

}
