package desafio;

import model.Product;

import java.text.DecimalFormat;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioLambda {

    public static void main(String[] args) {
        Product product = new Product("iPad", 3235.89, 0.13);

        //Solução 1:
        BinaryOperator<Double> res = (n1, n2) -> n1 - (n1 * n2);
        BinaryOperator<Double> tax = (n1, n2) -> n1 >= 2500.00 ? n1 + (n1 * n2) : n1;
        UnaryOperator<Double> frete = (n) -> n >= 3000.00 ? n + 100.0 : n + 50;

        double impostoMunicipal = 0.085;
        double priceWithDiscount = res.apply(product.price, product.discount);
        double priceWithTax = tax.apply(priceWithDiscount, impostoMunicipal);
        double priceWithDelivery = frete.apply(priceWithTax);

        DecimalFormat decimalFormat = new DecimalFormat(".##");
        System.out.println("Preço com desconto R$" + decimalFormat.format(priceWithDiscount));
        System.out.println("Preço com taxa R$" + decimalFormat.format(priceWithTax));
        System.out.println("Preço com frete R$" + decimalFormat.format(priceWithDelivery));

        //Solução 2:

        Function<Product, Double> result = (p) -> p.price - (p.price * p.discount);
        UnaryOperator<Double> taxMun = (p) -> p >= 2500.00 ? p + (p * 0.085) : p;
        UnaryOperator<Double> priceDelivery = (p) -> p >= 3000.00 ? p + 100.00 : p + 50.0;
        Function<Double, String> formatPrice = (p) -> "R$".concat(decimalFormat.format(p));

        String precoFinal = result
                .andThen(taxMun)
                .andThen(priceDelivery)
                .andThen(formatPrice)
                .apply(product);

        System.out.println("Valor final: " + precoFinal);
    }
}
