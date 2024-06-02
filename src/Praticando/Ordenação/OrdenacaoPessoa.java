package Praticando.Ordenação;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {

  private List<Pessoa> listPessoa;

  public OrdenacaoPessoa() {
    this.listPessoa = new ArrayList<>();
  }

  public List<Pessoa> getListPessoa() {
    return listPessoa;
  }

  /// Metodo para adicionar
  public void adicionarPessoa(String nome, int idade, double altura) {
    listPessoa.add(new Pessoa(nome, idade, altura));
  }

  // ORDENAÇÃO DAS IDADES
  public List<Pessoa> ordenarPorIdade() {
    List<Pessoa> ordenacaoIdade = new ArrayList<>(listPessoa);
    Collections.sort(ordenacaoIdade);
    return ordenacaoIdade;
  }

  public List<Pessoa> ordenarPorAltura() {
    List<Pessoa> ordencaoAltura = new ArrayList<>(listPessoa);
    Collections.sort(ordencaoAltura, new ComparetorPorAltura());
    return ordencaoAltura;
  }
}
