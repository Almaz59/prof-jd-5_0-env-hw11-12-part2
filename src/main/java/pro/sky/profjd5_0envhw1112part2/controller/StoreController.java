package pro.sky.profjd5_0envhw1112part2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.profjd5_0envhw1112part2.data.Item;
import pro.sky.profjd5_0envhw1112part2.service.StoreService;

import java.util.List;

@RestController
@RequestMapping("/order")
public class StoreController {
    private final StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/add")
    public List<Item> add(@RequestParam("id") List<Long> ids) {
        ids.forEach(storeService::add);
        return storeService.getItems();
    }

    @GetMapping("/get")
    public List<Item> get() {
        return storeService.getItems();
    }

}
