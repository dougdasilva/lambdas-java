package unary;

import java.util.function.UnaryOperator;

public class UnaryOperationTest {
    public static void main(String[] args) {
        UnaryOperator<Integer> soma = n -> n + 2;
        UnaryOperator<Integer> multiplica = n -> n * 2;
        UnaryOperator<Integer> potencializa = n -> n * n;

        int result = soma.andThen(multiplica)
                .andThen(potencializa).apply(0);
        System.out.println(result);

        int result1 = potencializa
                .compose(multiplica)
                .compose(soma)
                .apply(0);

        System.out.println(result1);
    }
}
