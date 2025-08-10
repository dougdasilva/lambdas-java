package desafio;

import model.Product;

import java.text.DecimalFormat;
import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class DesafioLambda {

    public static void main(String[] args) {
        Product product = new Product("iPad", 3235.89, 0.13);
        BinaryOperator<Double> res = (n1, n2) -> n1 - (n1 * n2);
        double impostoMunicipal = 0.085;

        BinaryOperator<Double> tax = (n1, n2) -> n1 >= 2500.00 ? n1 + (n1 * n2) : n1;
        UnaryOperator<Double> frete = (n) -> n >= 3000.00 ? n + 100.0 : n + 50;

        double priceWithDiscount = res.apply(product.price, product.discount);
        double priceWithTax = tax.apply(priceWithDiscount, impostoMunicipal);

        double priceWithDelivery = frete.apply(priceWithTax);

        DecimalFormat decimalFormat = new DecimalFormat(".##");
        System.out.println("Preço com desconto R$" + decimalFormat.format(priceWithDiscount));
        System.out.println("Preço com taxa R$" + decimalFormat.format(priceWithTax));
        System.out.println("Preço com frete R$" + decimalFormat.format(priceWithDelivery));
    }
}
