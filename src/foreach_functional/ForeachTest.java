package foreach_functional;

import java.util.List;

public class ForeachTest {
    public static void main(String[] args) {
        List<String> names = List.of("Doug","Douglas","Dougão");

        System.out.println("---> Tradicional");
        for (String name : names){
            System.out.println(name);
        }

        System.out.println("---> Lambda 01");
        names.forEach(name -> System.out.println(name));

        System.out.println("---> Método de Referência");
        names.forEach(System.out::println);


        System.out.println("---> Lambda 02");
        names.forEach(name -> imprimirNome(name));

        System.out.println("---> Método de Referência");
        names.forEach(ForeachTest::imprimirNome);

    }

    private static void imprimirNome(String name) {
        System.out.println("Name: " + name);
    }
}
