package StreamApi.Desafio;

import java.util.Arrays;
import java.util.List;

public class MediaNumerosMaiorQueCinco {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int mediaNumMaiorQueCinco = numeros.stream()
                .filter(n -> n > 5)
                .reduce(0, (a, b) -> (a + b)/2);

        System.out.println(mediaNumMaiorQueCinco);
    }
}
