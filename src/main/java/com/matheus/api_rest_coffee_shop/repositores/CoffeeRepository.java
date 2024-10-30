package com.matheus.api_rest_coffee_shop.repositores;

import com.matheus.api_rest_coffee_shop.Model.Coffee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CoffeeRepository  extends JpaRepository <Coffee , Long > {}
