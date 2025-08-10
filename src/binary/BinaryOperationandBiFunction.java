package binary;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperationandBiFunction {
    public static void main(String[] args) {
        BinaryOperator<Double> media =
                (n1, n2) -> (n1 + n2) / 2;

        System.out.println(media.apply(9.8,3.0));

        BiFunction<Double, Double, String > result =
                (n1, n2) -> ((n1 + n2) / 2) >= 7 ? "Aprovado" : "Reprovado";

        System.out.println(result.apply(9.8,3.0));
    }
}
