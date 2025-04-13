package StreamApi.SupplierExample;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierExample {

    public static void main(String[] args) {
        //usar supplier com lambda para fornecer uma saudacao personalizada
        Supplier<String> saudacao = () -> "Olá, bem-vindo!";

        //usar supplier para uma lista com 5 saudaçoes
        List<String> listaSaudacoes = Stream.generate(saudacao)
                .limit(5)
                .toList();

        listaSaudacoes.forEach(System.out::println);
    }
}
