package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

  private List<Item> listaItem;

  public CarrinhoDeCompras() {
    this.listaItem = new ArrayList<>();
  }

  public void adicionarItem(String nome, double preco, int quantidade) {
    Item intem = new Item(nome, preco, quantidade);
    this.listaItem.add(intem);
  }

  public void removerItem(String nome) {
    List<Item> itensRemover = new ArrayList<>();
    if (!listaItem.isEmpty()) {
      for (Item item : listaItem) {
        if (item.getNome().equalsIgnoreCase(nome)) {
          itensRemover.add(item);
        }
      }
      listaItem.removeAll(itensRemover);
    } else {
      System.out.println("A lista está vazia");
    }
  }

  public double calcularValorTotal() {
    double valorTotal = 0;
    if (!listaItem.isEmpty()) {
      for (Item item : listaItem) {
        double valorItem = item.getPreco() * item.getQuantidade();
        valorTotal += valorItem;
      }
      return valorTotal;
    } else {
      throw new RuntimeException("A lista está vazia");
    }
  }

  public void exibirItens() {
    if (!listaItem.isEmpty()) {
      System.out.println(this.listaItem);
    } else {
      System.out.println("A lista está vazia!");
    }
  }

  @Override
  public String toString() {
    return "CarrinhoDeCompras{" +
        "itens=" + listaItem + '}';
  }
}
