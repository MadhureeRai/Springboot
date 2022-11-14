package com.example.login.page.controller;

import com.example.login.page.entity.ProductDetails;
import com.example.login.page.services.ProductDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProductController {

    @Autowired
    private ProductDetailsService userService;

    @PostMapping("/api/addProduct")
    public ProductDetails addUser(@RequestBody ProductDetails productDetails) {

        return userService.createUser(productDetails);
    }

    @PostMapping("/api/addProducts")
    public List<ProductDetails> addUsers(@RequestBody List<ProductDetails> users) {
        return userService.createUsers(users);
    }

    @GetMapping("/api/product/{id}")
    public ProductDetails getUserById(@PathVariable int id) {
        return userService.getUserBYId(id);
    }

    @GetMapping("/api/products")
    public List<ProductDetails>getAllUsers(){

        return userService.getUsers();
    }

    @PutMapping("/api/product/update")
    public ProductDetails updateUser(@RequestBody ProductDetails productDetails){

        return userService.updateUser(productDetails);
    }

    @DeleteMapping("/api/product/{id}")
    public String deleteUser(@PathVariable int id){

        return userService.deleteUserById(id);
    }

}
