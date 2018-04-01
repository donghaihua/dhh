package demo.com.example.demo.mapper;

import demo.com.example.demo.entity.SaleWishEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SaleWishMapper {
    @Select("select * from tbl_sale_wish")
    public List<SaleWishEntity> findAll();
}
