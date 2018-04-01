package demo.com.example.demo.service.impl;

import demo.com.example.demo.entity.SaleWishEntity;
import demo.com.example.demo.mapper.SaleWishMapper;
import demo.com.example.demo.service.SaleWishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SaleWishServiceImpl implements SaleWishService {
    @Autowired
    private SaleWishMapper saleWishMapper;
    @Override
    public List<SaleWishEntity> findAll() {

        return saleWishMapper.findAll();
    }
}
