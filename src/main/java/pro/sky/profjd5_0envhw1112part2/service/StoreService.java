package pro.sky.profjd5_0envhw1112part2.service;

import pro.sky.profjd5_0envhw1112part2.data.Item;

import java.util.List;

public interface StoreService {

    Item add(long id);

    List<Item> getItems();
}
