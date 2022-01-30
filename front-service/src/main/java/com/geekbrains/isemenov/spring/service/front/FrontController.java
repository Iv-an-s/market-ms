package com.geekbrains.isemenov.spring.service.front;

import com.geekbrains.isemenov.spring.common.ProductDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class FrontController {
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/api/v1/products")
    public List<ProductDto> getProductListFromProductService() {
        List<ProductDto> productDtoList = restTemplate.getForObject("http://product-service/api/v1/products", List.class);
        return productDtoList;
    }
}
