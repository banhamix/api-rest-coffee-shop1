package com.matheus.api_rest_coffee_shop.Controller;


import com.matheus.api_rest_coffee_shop.Model.Coffee;
import com.matheus.api_rest_coffee_shop.repositores.CoffeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping ("/coffe")

public class CoffeeController {

    @Autowired
    CoffeeRepository coffeeRepository;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Coffee> getallCoffee() {
        return coffeeRepository.findAll();
    }
        @PostMapping(value = "/createCoffee", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
        public Coffee createNewCoffee(@RequestBody Coffee Coffee) {
            Coffee createCoffee = new Coffee();

            createCoffee.setName(Coffee.getName());
            createCoffee.setPrice(Coffee.getPrice());

            return coffeeRepository.save(createCoffee);
        }
    }





