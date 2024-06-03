package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {

  private Set<Convidado> convidadoSet;

  public ConjuntoConvidado() {
    this.convidadoSet = new HashSet<>();
  }

  public void adicionarConvidado(String nome, int codigoConvite) {
    convidadoSet.add(new Convidado(nome, codigoConvite));
  }

  public void removerConvidadoPorCodigoConvite(int codigoConvite) {
    Convidado convidadoParaRemover = null;
    for (Convidado convidado : convidadoSet) {
      if (convidado.getCodigoConvite() == codigoConvite) {
        convidadoParaRemover = convidado;
        break;
      }
    }
    convidadoSet.remove(convidadoParaRemover);
  }

  public int contarConvidados() {
    return convidadoSet.size();
  }

  public void exibirConvidados() {
    System.out.println(convidadoSet);
  }

  public static void main(String[] args) {
    ConjuntoConvidado convidados = new ConjuntoConvidado();

    System.out.println("Existem " + convidados.contarConvidados());

    convidados.adicionarConvidado("Alice", 1234);
    convidados.adicionarConvidado("Bob", 1235);
    convidados.adicionarConvidado("Charlie", 1235);
    convidados.adicionarConvidado("David", 1236);

    System.out.println("Existem " + convidados.contarConvidados());

    convidados.exibirConvidados();
    convidados.removerConvidadoPorCodigoConvite(1234);
    convidados.exibirConvidados();
  }
}
