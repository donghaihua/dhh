package demo.com.example.demo.entity;

import java.util.Date;

public class SaleWishEntity {
    private Long id;
    private Long account_id;
    private Long shop_id;
    private Long item_id;
    private Long spec_id;
    private Date create_time;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccount_id() {
        return account_id;
    }

    public void setAccount_id(Long account_id) {
        this.account_id = account_id;
    }

    public Long getShop_id() {
        return shop_id;
    }

    public void setShop_id(Long shop_id) {
        this.shop_id = shop_id;
    }

    public Long getItem_id() {
        return item_id;
    }

    public void setItem_id(Long item_id) {
        this.item_id = item_id;
    }

    public Long getSpec_d() {
        return spec_id;
    }

    public void setSpec_d(Long spec_d) {
        this.spec_id = spec_d;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}
