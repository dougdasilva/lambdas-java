package function;

import java.util.function.Function;

public class FunctionTest {
    public static void main(String[] args) {

        Function<Integer, String> parOuImpar =
                number -> (number & 2) == 0 ? "PAR" : "IMPAR";

        Function<String, String> result =
                value -> "O número é: " + value;

        Function<String, String> ex = x -> x + " !!!!";

        String finalResult = parOuImpar
                .andThen(result)
                .andThen(ex)
                .apply(56);

        System.out.println(finalResult);
        System.out.println(parOuImpar.apply(4));

    }
}
