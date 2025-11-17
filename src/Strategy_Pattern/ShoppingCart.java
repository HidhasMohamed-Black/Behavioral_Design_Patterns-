package Strategy_Pattern;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Item> items;

    public ShoppingCart() {
        items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
        System.out.println("Added item worth " + item.getPrice());
    }

    public int calculateTotal() {
        int total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    // The strategy is passed here
    public void pay(PaymentStrategy strategy) {
        int amount = calculateTotal();
        System.out.println("Total: " + amount);
        strategy.pay(amount);
    }
}
