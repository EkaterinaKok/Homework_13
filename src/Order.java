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
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(customer, order.customer) && arraysEqual(basket, order.basket);
    }

    private boolean arraysEqual(Product[] arr1, Product[] arr2) {
        if (arr1 == arr2) return true;
        if (arr1 == null || arr2 == null) return false;
        if (arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == null || arr2[i] == null) {
                if (arr1[i] != arr2[i]) return false;
            } else if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
}
