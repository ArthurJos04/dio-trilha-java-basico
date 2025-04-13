package StreamApi.Desafio;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class AcharSegundoMaior {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int segundoMaior = numeros.stream()
                .distinct()                             //Remove valores duplicados da Stream.
                .sorted(Comparator.reverseOrder())      //Ordena os elementos em ordem decrescente (do maior para o menor).
                .skip(1)                             //Pula o primeiro elemento da Stream (que nesse caso é o maior número).
                .findFirst()                            //Pega o primeiro elemento restante da Stream (após o skip).
                .orElse(-1);                      //Extrai o valor de dentro do Optional.
                                                        // Se não houver valor (ou seja, a lista não tem um segundo maior),
                                                        // lança uma exceção com a mensagem que você definir.

        System.out.println("O segundo maior numero é: " + segundoMaior);
    }
    }

