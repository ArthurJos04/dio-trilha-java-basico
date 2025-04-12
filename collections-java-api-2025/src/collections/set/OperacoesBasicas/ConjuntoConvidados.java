package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    //remover convidado por codigo do convite
    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadosSet) {
            if(c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        convidadosSet.remove(convidadoParaRemover);
    }

    public int contarConvidados () {
        return convidadosSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadosSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
        conjuntoConvidados.adicionarConvidado("Maria", 1231);
        conjuntoConvidados.adicionarConvidado("Maria", 8976);
        conjuntoConvidados.adicionarConvidado("Jose", 2342);
        conjuntoConvidados.adicionarConvidado("Arthur", 4345);
        conjuntoConvidados.adicionarConvidado("Thais", 1231);

        conjuntoConvidados.removerConvidadoPorCodigoConvite(8976);
        conjuntoConvidados.exibirConvidados();
        System.out.println("Foram convidadas "+ conjuntoConvidados.contarConvidados() + " pessoas!");

    }
}
