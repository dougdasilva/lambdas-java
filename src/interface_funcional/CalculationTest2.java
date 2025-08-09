package interface_funcional;

import java.util.function.BinaryOperator;

public class CalculationTest2 {
    public static void main(String[] args) {
        BinaryOperator<Double> calc = Double::sum;
        System.out.println(calc.apply(2d, 3d));

        calc = (a, b) -> a * b;
        System.out.println(calc.apply(2d, 3d));
    }
}
