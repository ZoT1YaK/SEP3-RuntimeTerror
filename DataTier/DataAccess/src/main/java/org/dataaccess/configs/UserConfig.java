package org.dataaccess.configs;

import org.dataaccess.Shared.Product;
import org.dataaccess.Shared.User;
import org.dataaccess.repositories.ProductRepository;
import org.dataaccess.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class UserConfig
{
    @Bean
    CommandLineRunner userCommandLineRunner(ProductRepository repository)
    {
//        return args -> {
//            User user1 = new User(
//                    "ZoT1YaK",
//                    "password",
//                    "Roberts",
//                    "Zustars",
//                    0,
//                    "admin"
//            );
//
//            User user2 = new User(
//                    "MB",
//                    "password",
//                    "Marius",
//                    "Babin",
//                    0,
//                    "customer"
//            );

            return args -> {
                Product product = new Product(
                        "Greg Huisos",
                        "sadwe",
                        300,
                        "Sugi Pula"
                );

                Product product1 = new Product(
                        "Greg Pidr",
                        "ewrffre",
                        0,
                        "Pizda mati"
                );
//            List<User> users = new ArrayList<User>();
//            users.add(user1);
//            users.add(user2);
                List<Product> products = new ArrayList<>();
                products.add(product);
                products.add(product1);
            repository.saveAll(products);
        };
    }
}
