package com.example.login.page.services;

import com.example.login.page.entity.ProductDetails;
import com.example.login.page.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductDetailsService {
    @Autowired
    public ProductRepository userRepository;

    public ProductDetails createUser(ProductDetails productDetails) {
        return userRepository.save(productDetails);
    }

    public List<ProductDetails> createUsers(List<ProductDetails> productList) {
        return userRepository.saveAll(productList);
    }

    public ProductDetails getUserBYId(int id) {

        return userRepository.findById(id).orElse(null);
    }

    public List<ProductDetails> getUsers() {
        return userRepository.findAll();
    }

    public ProductDetails updateUser(ProductDetails productDetails) {
        ProductDetails closer=null;
        Optional<ProductDetails> optionaluser = userRepository.findById(productDetails.getId());
        if (optionaluser.isPresent()) {
            closer = optionaluser.get();
            closer.setName(productDetails.getName());
            closer.setAddress(productDetails.getAddress());
            userRepository.save(closer);
        }
        else {
            return new ProductDetails();
        }
        return closer;
    }
    public String deleteUserById(int id)
    {
        userRepository.deleteById(id);
        return "user got deleted";
    }
}

