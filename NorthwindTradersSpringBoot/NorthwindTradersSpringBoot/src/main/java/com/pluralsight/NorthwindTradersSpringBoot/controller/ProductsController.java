package com.pluralsight.NorthwindTradersSpringBoot.controller;

import com.pluralsight.NorthwindTradersSpringBoot.dao.ProductDAO;
import com.pluralsight.NorthwindTradersSpringBoot.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductsController {

//    private List<Product> products = new ArrayList<>();
//
//    public ProductsController() {
//        products.add(new Product(1, "Chai", 1, 18.00));
//        products.add(new Product(2, "Chang", 1, 19.00));
//        products.add(new Product(3, "Aniseed Syrup", 2, 10.00));

        private final ProductDAO productDAO;

        @Autowired
        public ProductsController(ProductDAO productDAO) {
            this.productDAO = productDAO;
        }

        @GetMapping
        public List<Product> getAllProducts() {
            return productDAO.getAll();
        }

        @GetMapping("/{id}")
        public Product getProductById(@PathVariable int id) {
            return productDAO.getById(id);
        }
    }