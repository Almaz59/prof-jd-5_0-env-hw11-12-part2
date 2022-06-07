package pro.sky.profjd5_0envhw1112part2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.profjd5_0envhw1112part2.data.Items;
import pro.sky.profjd5_0envhw1112part2.service.StoreService;

import java.util.List;

@RestController
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public Items addItem(@RequestParam("idItem") Integer idItem) {
        return storeService.addItem(idItem);
    }

    @GetMapping("/get")
    public List<Items> getList() {
        return storeService.getList();
    }

}
