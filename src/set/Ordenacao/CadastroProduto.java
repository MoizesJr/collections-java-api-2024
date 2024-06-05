package set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {

  private Set<Produto> produtoSet;

  public CadastroProduto() {
    this.produtoSet = new HashSet<>();
  }

  public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
    produtoSet.add(new Produto(nome, cod, preco, quantidade));
  }

  // TreeSet organiza o Set com o comparable
  public Set<Produto> exibirProdutosPorNome() {
    Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
    return produtosPorNome;
  }

  public Set<Produto> exibirProdutosPorPreco() {
    Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
    produtosPorPreco.addAll(produtoSet);
    return produtosPorPreco;
  }

  public static void main(String[] args) {
    CadastroProduto cp = new CadastroProduto();

    cp.adicionarProduto(1, "Feijão", 3, 2);
    cp.adicionarProduto(2, "arroz", 7, 3);
    cp.adicionarProduto(3, "carne", 20, 2);

    System.out.println(cp.exibirProdutosPorNome());

    System.out.println(cp.produtoSet);
    System.out.println(cp.exibirProdutosPorPreco());
  }
}
