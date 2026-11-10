package com.zeferino.spring.vmzact3_t4;

import com.zeferino.spring.vmzact3_t4.model.Categoria;
import com.zeferino.spring.vmzact3_t4.repository.CategoriaRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initDatabase(CategoriaRepository catRepo) {
        return args -> {
            if (catRepo.count() == 0) {
                Categoria c1 = new Categoria();
                c1.setNombre("Electrónica");
                catRepo.save(c1);

                Categoria c2 = new Categoria();
                c2.setNombre("Ropa");
                catRepo.save(c2);
                
                System.out.println("✅ Categorías iniciales creadas en la base de datos.");
            }
        };
    }
}