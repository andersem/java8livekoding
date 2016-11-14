import java.util.function.Consumer;
import java.util.stream.IntStream;

public class O5Consumer {

    public static void main(String[] args) {

        // forEach tar inn en consumer
        // Lag en formel som tar inn en consumer

        IntStream.range(0, 100).forEach(System.out::println);
        gjoerNoe(new Person("Anders Emil", 30), System.out::println);

    }


    public static void gjoerNoe(Person person, Consumer<Person> consumer) {
        consumer.accept(person);
    }

    static class Person {
        final String navn;
        final int alder;

        Person(String navn, int alder) {
            this.navn = navn;
            this.alder = alder;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "navn='" + navn + '\'' +
                    ", alder=" + alder +
                    '}';
        }
    }
}
