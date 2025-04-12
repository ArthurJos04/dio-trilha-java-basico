package main.java.set.Pesquisa;
import java.util.HashSet;
import java.util.Set;
public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatoSet.add(new Contato( nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c: contatoSet) {
            //add no set tod'o contato que começar com certo nome, exemplo: Arthur S, Arthur X
            if(c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c: contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("contato 1 Silva", 11987665);
        agendaContatos.adicionarContato("contato 1 Silva", 11987667);
        agendaContatos.adicionarContato("contato 1 Ferreira", 11958676);
        agendaContatos.adicionarContato("contato 4", 11975642);
        agendaContatos.adicionarContato("contato 5", 11989000);
        agendaContatos.adicionarContato("contato 6", 119876575);
        agendaContatos.adicionarContato("contato 7", 119845677);

        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("contato 1"));
        agendaContatos.exibirContatos();

        System.out.println("Contato atualizado: " +
        agendaContatos.atualizarNumeroContato("Contato 4", 119695));


    }
}
