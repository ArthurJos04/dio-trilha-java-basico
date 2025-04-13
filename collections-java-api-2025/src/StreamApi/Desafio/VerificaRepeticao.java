package StreamApi.Desafio;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class VerificaRepeticao {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        boolean todosNumerosDistintos = numeros.stream()
                .distinct()
                .count() == numeros.size();        //compara os distintos coletados com o tamanho da lista original


        if(todosNumerosDistintos){
            System.out.println("Não há números repetidos");
        }
        else{
            System.out.println("Há números repetidos");
        }
    }
}
