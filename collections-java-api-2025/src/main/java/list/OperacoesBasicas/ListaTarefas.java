package main.java.list.OperacoesBasicas;
import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefa> tarefaList;

    //sempre que criar um objeto lista de tarefa...
    public ListaTarefas() {
        //cria um array list esperando
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>(); //lista de tarefas que serao removidas se forem iguais

        //for para analisar se possui alguma tarefa igual que precisa ser eliminada
        for (Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t); //adicionou uma tarefa na lista que serao removidas
            }
        }

        tarefaList.removeAll(tarefasParaRemover); //remove as tarefas da tarefaList
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {

        //a partir daqui, ja é criada uma lista vazia
        ListaTarefas listaTarefa = new ListaTarefas();

        //conferindo se é 0
        System.out.println("O numero total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("O numero total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.removerTarefa("Tarefa 3");
        System.out.println("O numero total de tarefas é: " + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();
    }
}
