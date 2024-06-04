package set.PesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

  private Set<Contato> contatoSet;

  public AgendaContatos() {
    this.contatoSet = new HashSet<>();
  }

  public void adicionarContato(String nome, int numero) {
    contatoSet.add(new Contato(nome, numero));
  }

  public void exibirContatos() {
    System.out.println(contatoSet);
  }

  public Set<Contato> pesquisarPorNome(String nome) {
    Set<Contato> pesquisarNome = new HashSet<>();
    for (Contato contato : contatoSet) {
      if (contato.getNome().startsWith(nome)) {
        pesquisarNome.add(contato);
      }
    }
    return pesquisarNome;
  }

  public Contato atualizarNumeroContato(String nome, int novoNumero) {
    Contato contatoAtualizado = null;
    for (Contato contato : contatoSet) {
      if (contato.getNome().equals(nome)) {
        contato.setNumero(novoNumero);
        contatoAtualizado = contato;
        break;
      }
    }
    return contatoAtualizado;
  }

  public static void main(String[] args) {
    AgendaContatos agenda = new AgendaContatos();

    agenda.adicionarContato("Moizes", 96775201);
    agenda.adicionarContato("Alanna", 98757624);

    agenda.exibirContatos();
    // agenda.pesquisarPorNome("Moizes");
    agenda.atualizarNumeroContato("Moizes", 96775202);
    agenda.exibirContatos();
  }
}
