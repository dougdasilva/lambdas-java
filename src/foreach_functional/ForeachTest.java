package foreach_functional;

import java.util.List;

public class ForeachTest {
    public static void main(String[] args) {
        List<String> names = List.of("Doug","Douglas","Dougão");

        System.out.println("---> Tradicional");
        for (String name : names){
            System.out.println(name);
        }

        System.out.println("---> Lambda");
        names.forEach(name -> System.out.println(name));

        System.out.println("---> Método de Referência");
        names.forEach(System.out::println);

    }
}
