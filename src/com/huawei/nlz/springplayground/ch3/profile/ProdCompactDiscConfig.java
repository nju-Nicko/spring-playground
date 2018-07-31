package com.huawei.nlz.springplayground.ch3.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("prod")
public class ProdCompactDiscConfig {

    @Bean("compactDisc")
    public CompactDisc compactDisc(){
        return new ProdSgtPeppers();
    }

}
