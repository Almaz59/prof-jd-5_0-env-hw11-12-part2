package pro.sky.profjd5_0envhw1112part2.service;

import org.springframework.stereotype.Service;
import pro.sky.profjd5_0envhw1112part2.basket.Basket;
import pro.sky.profjd5_0envhw1112part2.data.Item;

import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {
    private final Basket basket;

    public StoreServiceImpl(Basket basket) {
        this.basket = basket;
    }

    @Override
    public Item add(long id) {
        Item item = new Item(id);
        basket.add(item);
        return item;
    }

    @Override
    public List<Item> getItems() {
        return basket.getItems();
    }

}

