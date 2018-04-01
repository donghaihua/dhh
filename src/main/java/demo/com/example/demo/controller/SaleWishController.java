package demo.com.example.demo.controller;

import demo.com.example.demo.entity.SaleWishEntity;
import demo.com.example.demo.service.SaleWishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class SaleWishController {
    @Autowired
    private SaleWishService saleWishService;

    @RequestMapping("/test")
    public List<SaleWishEntity> test(){
        return saleWishService.findAll();
    }


}
