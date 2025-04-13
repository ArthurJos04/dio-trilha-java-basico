package StreamApi.FunctionExample;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        //usar function com expressao lambda para dobrar todos os numeros
        Function<Integer, Integer> dobrar = numero -> numero *2;

        //usar funçao para dobrar todos os numeros no Stream e armazena-los em outra lista
        List<Integer> numerosDobrados = numeros.stream()
                .map(dobrar) //ou (n-> n*2)
                .toList();

        numerosDobrados.forEach(System.out::println);
    }
}
