package predicate;

import model.Product;

import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {
        Predicate<Product> isHigh = prod -> prod.discount <= 0.04d || prod.discount >= 0.1d;
        Product product = new Product("Chocolate",4d,0.05d);

        System.out.println(isHigh.test(product));

        //Predicate Composição
        Predicate<Integer> isPar = number -> number % 2 == 0;
        Predicate<Integer> isTresDigitos = number -> number >= 100 && number <= 999;
        System.out.println(isPar.and(isTresDigitos).test(400));
    }
}
