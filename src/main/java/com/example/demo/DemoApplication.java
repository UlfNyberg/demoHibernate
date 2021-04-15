package com.example.demo;

import com.example.demo.models.Kompis;
import com.example.demo.repositories.KompisRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }


    @Bean
    public CommandLineRunner demo (KompisRepository repository){
        return (args) -> {
            //hard-coded a few friends
            repository.save(new Kompis(1,"Mr. Burns", "efef@efef.cmo", "0702-232"));
            repository.save(new Kompis(2,"Ralph", "efef@efef.cmo", "0702-2333232"));
            repository.save(new Kompis(3,"Wiggums", "efef@efef.cmo", "073-45645"));

            for (Kompis kompis : repository.findAll()){
                System.out.println(kompis.toString());
            }
        };
    }
}
