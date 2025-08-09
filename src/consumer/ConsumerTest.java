package consumer;

import model.Product;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerTest {
    public static void main(String[] args) {
        Consumer<Product> print = p -> System.out.println(p.name);
        Product product1 = new Product("caneta", 3.5d, 0.01d);

        print.accept(product1);

        Product product2 = new Product("lapis", 3d, 0.01d);
        Product product3 = new Product("caderno", 13d, 0.01d);
        Product product4 = new Product("borracha", 3.50d, 0.01d);

        List<Product> products = Arrays.asList(product1, product2, product3, product4);
        products.forEach(print);

        products.forEach(p -> System.out.println(p.name));

        products.forEach(System.out::println);
    }
}
