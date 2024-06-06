package map.Pesquisa;

public class Produto {

  private String nome;
  private double preco;
  private int quantidade;
  private long codigo;

  public Produto(String nome, double preco, int quantidade, long codigo) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
    this.codigo = codigo;
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public long getCodigo() {
    return codigo;
  }

  @Override
  public String toString() {
    return "Produto [nome=" + nome +
        ", preco=" + preco +
        ", quantidade=" + quantidade +
        ", codigo=" + codigo + "]";
  }

}
