package Unit2;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltFucntionalInterface {
    public static void main(String[] args) {
        Predicate<Integer> isEven=(n)->n%2==0;
        System.out.println(isEven.test(12));
        Function<Integer, Integer> square=(n)->n*n;
        System.out.println(square.apply(12));
        Consumer<String> message=(msg)->System.out.println(msg);
        message.accept("Hello");
        Supplier<Double>  random=()->Math.random();
        System.out.println(random.get());
    }
}
