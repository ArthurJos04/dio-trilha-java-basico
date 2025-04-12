package main.java.list.Ordenacao;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        //duplicando lista para ordena-la depois
        List pessoasOrdenadasPorIdade = new ArrayList(pessoaList);
        Collections.sort(pessoasOrdenadasPorIdade);
        return pessoasOrdenadasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List pessoasOrdenadasPorAltura = new ArrayList(pessoaList);
        Collections.sort(pessoasOrdenadasPorAltura, new ComparatorPorAltura());
        return pessoasOrdenadasPorAltura;
    }

    public static void main(String[] args) {

        OrdenacaoPessoas ordenacaopessoa = new OrdenacaoPessoas();
        ordenacaopessoa.adicionarPessoa("Maria", 22, 1.5);
        ordenacaopessoa.adicionarPessoa("joca", 30, 1.7);
        ordenacaopessoa.adicionarPessoa("pedro", 50, 1.3);
        ordenacaopessoa.adicionarPessoa("ulisses", 43, 2.5);
        ordenacaopessoa.adicionarPessoa("arthur", 20, 1.8);

        System.out.println(ordenacaopessoa.pessoaList);
        System.out.println(ordenacaopessoa.ordenarPorIdade());
        System.out.println(ordenacaopessoa.ordenarPorAltura());
    }

}
