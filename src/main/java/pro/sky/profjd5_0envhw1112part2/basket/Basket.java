package pro.sky.profjd5_0envhw1112part2.basket;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import pro.sky.profjd5_0envhw1112part2.data.Items;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class Basket {
    private List<Items> items = new ArrayList<>();

    public void addItem(Items item) {
        items.add(item);
    }

    public List<Items> getList() {
        return new ArrayList<>(items);
    }

}
