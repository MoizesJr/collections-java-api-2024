package map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {

  private Map<Long, Produto> produtoMap;

  public EstoqueProduto() {
    this.produtoMap = new HashMap<>();
  }

  public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
    produtoMap.put(cod, new Produto(nome, preco, quantidade, cod));
  }

  public void exibirProdutos() {
    System.out.println(produtoMap);
  }

  public double calcularValorTotalEstoque() {
    double valoTotalEstoque = 0;
    if (!produtoMap.isEmpty()) {
      for (Produto p : produtoMap.values()) {
        valoTotalEstoque += p.getQuantidade() * p.getPreco();
      }
    }
    return valoTotalEstoque;
  }

  public Produto obterProdutoMaisCaro() {
    Produto produtoMaisCaro = null;
    double maiorPreco = Double.MIN_VALUE;
    if (!produtoMap.isEmpty()) {
      for (Produto p : produtoMap.values()) {
        if (p.getPreco() > maiorPreco) {
          produtoMaisCaro = p;
        }
      }
    }
    return produtoMaisCaro;
  }

  public Produto obterProdutoMaisBarato() {
    Produto produtoMaisBarato = null;
    double menorPreco = Double.MAX_VALUE;
    if (!produtoMap.isEmpty()) {
      for (Produto p : produtoMap.values()) {
        if (p.getPreco() < menorPreco) {
          produtoMaisBarato = p;
        }
      }
    }
    return produtoMaisBarato;
  }

  public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
    Produto produtoMaiorQuantidadeValorNoEstoque = null;
    double maiorValorTotalProdutoEstoque = 0d;
    if (!produtoMap.isEmpty()) {
      for (Map.Entry<Long, Produto> entry : produtoMap.entrySet()) {
        double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
        if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
          maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
          produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
        }
      }
    }
    return produtoMaiorQuantidadeValorNoEstoque;
  }
}
