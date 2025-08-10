package supplier;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {
    public static void main(String[] args) {
        Supplier<List<String>> listSupplier =
                () -> Arrays.asList("Nestle","Ferrero","Nivea");

        System.out.println(listSupplier.get());
    }
}
