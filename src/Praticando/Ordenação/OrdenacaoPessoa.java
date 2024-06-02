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

  public static void main(String[] args) {
    OrdenacaoPessoa ordenacaoPessoas = new OrdenacaoPessoa();

    // Adicionando pessoas à lista
    ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
    ordenacaoPessoas.adicionarPessoa("Bob", 30, 1.80);
    ordenacaoPessoas.adicionarPessoa("Charlie", 25, 1.70);
    ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

    // System.out.println(ordenacaoPessoas.listPessoa);
    // System.out.println(ordenacaoPessoas.ordenarPorIdade());
    System.out.println(ordenacaoPessoas.ordenarPorAltura());
  }
}
