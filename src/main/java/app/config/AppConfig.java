package app.config;

import app.model.Animal;
import app.model.AnimalsCage;
import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {


    @Bean
    public Timer timer() {
        return new Timer();
    }

    @Bean
    public AnimalsCage animalsCage() {
        return new AnimalsCage(timer());
    }


    /*
     * Второй способо реализации - при котором все зависимости прописываются в AppConfig
     */

//    @Bean
//    public Animal dogBean() {
//        System.out.println("Создал собаку");
//        return new Dog();
//    }
//
//    @Bean
//    public Timer timer() {
//        System.out.println("Создал Таймер");
//        return new Timer();
//    }
//
//    @Bean
//    public AnimalsCage animalsCage() {
//        return new AnimalsCage(dogBean(),timer());
//    }


}
