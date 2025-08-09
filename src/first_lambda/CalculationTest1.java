package first_lambda;

import model.Calculation;
import model.Multiply;
import model.Sum;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class CalculationTest1 {
    public static void main(String[] args) {

        Calculation calculation = (a, b) -> a + b;
        System.out.println("Lambda:" + calculation.execute(2, 3));

        calculation = new Sum();
        calculation.execute(2, 3);
        System.out.println("Sem Lambda:" + calculation.execute(2, 3));

        calculation = (a, b) -> a * b;
        System.out.println("Lambda:" + calculation.execute(4, 5));

        calculation = new Multiply();
        calculation.execute(4, 5);
        System.out.println("Sem Lambda:" + calculation.execute(4, 5));

    }
}