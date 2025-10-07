//Класс Order

import java.util.Arrays;
import java.util.Objects;

public class Order {
    String customer;
    Product[] basket;

    public Order(String customer, Product[] basket) {
        this.customer = customer;
        this.basket = basket;
    }

    @Override
    public String toString() {
        return "Покупатель: " + customer + " Корзина: " + Arrays.toString(basket);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Order order = (Order) o;
        return Objects.equals(customer, order.customer) && arraysEqual(basket, order.basket);
    }

    private boolean arraysEqual(Product[] product1, Product[] product2) {
        if (product1 == product2) return true;
        if (product1 == null || product2 == null) return false;
        if (product1.length != product2.length) return false;
        boolean arrEqual = true;
        for (int i = 0; i < product1.length; i++) {
            if (product1[i] == null || product2[i] == null) {
                if (product1[i] != product2[i]) {
                    arrEqual = false;
                    break;
                }
            } else if (!product1[i].equals(product2[i])) {
                arrEqual = false;
                break;
            }
        }
        return arrEqual;
    }
}
