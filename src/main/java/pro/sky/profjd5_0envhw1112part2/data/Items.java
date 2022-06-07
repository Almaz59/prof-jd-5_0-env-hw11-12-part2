package pro.sky.profjd5_0envhw1112part2.data;

import java.util.Objects;

public class Items {
    private final Integer idItem;

    public Items(Integer idItem) {
        this.idItem = idItem;
    }

    public Integer getIdItem() {
        return idItem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Items items = (Items) o;
        return idItem.equals(items.idItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idItem);
    }
}
