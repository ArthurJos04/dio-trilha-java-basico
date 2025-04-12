package StreamApi.PredicateExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {
        //criar lista de palavras
        List<String> palavras = Arrays.asList("java", "python", "c+++++++", "javascript", "c", "c++", "c");

        //criar predicate que verifica se tem mais de 5 caracteres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        palavras.stream()
                .filter(maisDeCincoCaracteres) //ou (p -> p.lenght() > 5)
                .forEach(System.out::println);
    }
}
