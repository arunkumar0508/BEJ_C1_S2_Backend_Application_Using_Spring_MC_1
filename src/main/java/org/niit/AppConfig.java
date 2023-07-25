package org.niit;

import org.springframework.context.annotation.Bean;

public class AppConfig {

@Bean("m1")
    public Movie getMovie1(){
return new Movie("Mission Impossible","Christopher McQuarrine",4);
}

}
