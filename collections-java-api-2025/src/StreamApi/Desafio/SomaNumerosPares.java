package StreamApi.Desafio;

import java.util.Arrays;
import java.util.List;

public class SomaNumerosPares {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int somaPar = numeros.stream()
                .filter(n -> n % 2 == 0)
                .reduce(0, (a, b) -> a + b);

        System.out.println("A soma de nuneros pares é: " + somaPar);

    }
}
