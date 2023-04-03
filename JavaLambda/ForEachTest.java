package JavaLambda;

import java.util.List;
import java.util.function.Consumer;

public class ForEachTest {
    public static void main(String[] args) {
        List<String> names = List.of("Pratama", "Rafa", "Raka");

        // for loop
        for(var value : names) {
            System.out.println(value);
        }

        // for each Anonymous class
        names.forEach(new Consumer<String>() {
            @Override
            public void accept(String value) {
                System.out.println(value);
            }
        });

        // Lambda
        names.forEach(value -> System.out.println(value));

        // Lambda Method Reference
        names.forEach(System.out::println);
    }
}
