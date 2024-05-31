package Praticando.Operacoes;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {

  private List<Tarefa> listTarefas;

  public ListaTarefa() {
    this.listTarefas = new ArrayList<>();
  }

  public void adicionarTarefa(String descricao) {
    listTarefas.add(new Tarefa(descricao));
  }

  public void removerTarefa(String descricao) {
    List<Tarefa> removerItemList = new ArrayList<>();
    for (Tarefa tarefa : listTarefas) {
      if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
        removerItemList.add(tarefa);
      }
    }
    listTarefas.removeAll(removerItemList);
  }

  public int obterNumeroTotalTarefas() {
    if (listTarefas.isEmpty()) {
      System.out.println("Lista vazia");
    }
    return listTarefas.size();
  }

  public void obterDescricoesTarefas() {
    System.out.println(listTarefas);
  }

  public static void main(String[] args) {
    ListaTarefa list = new ListaTarefa();

    list.adicionarTarefa("tarefa 1");
    list.adicionarTarefa("tarefa 2");
    list.adicionarTarefa("tarefa 3");
    list.adicionarTarefa("tarefa 1");
    list.removerTarefa("tarefa 1");
    list.obterNumeroTotalTarefas();
    list.obterDescricoesTarefas();
  }
}
