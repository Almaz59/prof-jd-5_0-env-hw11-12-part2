package pro.sky.profjd5_0envhw1112part2.service;

import org.springframework.stereotype.Service;
import pro.sky.profjd5_0envhw1112part2.basket.Basket;
import pro.sky.profjd5_0envhw1112part2.data.Items;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {
    private final Basket basket;

    public StoreServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public Items addItem(Integer idItem) {
        Items item = new Items(idItem);
        basket.addItem(item);
        return item;
    }

    @Override
    public List<Items> getList() {
        return basket.getList();
    }

    public Basket getBasket() {
        return basket;
    }

}

