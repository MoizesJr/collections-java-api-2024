package map.operacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

  private Map<String, Integer> agendaMaps;

  public AgendaContatos() {
    this.agendaMaps = new HashMap<>();
  }

  public void adicionarContato(String nome, Integer telefone) {
    agendaMaps.put(nome, telefone);
  }

  public void removerContato(String nome) {
    if (!agendaMaps.isEmpty()) {
      agendaMaps.remove(nome);
    }
  }

  public void exibirContatos() {
    System.out.println(agendaMaps);
  }

  public Integer pesquisarPorNome(String nome) {
    Integer numeroPorNome = null;
    if (!agendaMaps.isEmpty()) {
      numeroPorNome = agendaMaps.get(nome);
    }
    return numeroPorNome;
  }
}
