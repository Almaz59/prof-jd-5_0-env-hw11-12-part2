package pro.sky.profjd5_0envhw1112part2.service;

import pro.sky.profjd5_0envhw1112part2.data.Items;

import java.util.List;

public interface StoreService {

    Items addItem(Integer idItem);

    List<Items> getList();
}
