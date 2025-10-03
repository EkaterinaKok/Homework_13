//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Product product1 = new Product(1, "картофель", 30, "овощи");
        Product productCopy = new Product(1, "картофель", 30, "овощи");
        Product product2 = new Product(2, "Морковь", 15, "овощи");
        Product product3 = new Product(3, "яблоко", 50, "фрукты");

        System.out.println("\nСписок продуктов:");
        System.out.println(product1);
        System.out.println(productCopy);
        System.out.println(product2);
        System.out.println(product3);

        System.out.println("\nСравнение продуктов:");
        System.out.println(product1.equals(productCopy));
        System.out.println(product1.equals(product2));
        System.out.println(product2.equals(product3));
        System.out.println(product1.equals(product3));

        Product[] basket1 = {product1, product2};
        Product[] basket2 = {product1, productCopy};
        Product[] basket3 = {product2, product3};
        Product[] basket4 = {product1, productCopy};
        Order order1= new Order("Иван", basket1);
        Order order2 = new Order("Олег", basket2);
        Order order3 = new Order("Юлия", basket3);
        Order order4 = new Order("Ирина", basket4);

        System.out.println("\nВывод на экран покупателя с корзиной покупок:");
        System.out.println(order1);

        System.out.println("\nСравнение заказов:");
        System.out.println("Заказ 1 и Зааказ 2: " + order1.equals(order2));
        System.out.println("Заказ 1 и Зааказ 3: " + order1.equals(order3));
        System.out.println("Заказ 1 и Зааказ 4: " + order1.equals(order4));
       System.out.println("Заказ 2 и Зааказ 3: " + order2.equals(order3));

    }
}