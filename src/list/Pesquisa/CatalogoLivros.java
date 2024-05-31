package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

  private List<Livro> livroList;

  public CatalogoLivros() {
    this.livroList = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    livroList.add(new Livro(titulo, autor, anoPublicacao));
  }

  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> livrosPorAutor = new ArrayList<>();
    if (!livroList.isEmpty()) {
      for (Livro livro : livroList) {
        if (livro.getAutor().equalsIgnoreCase(autor)) {
          livrosPorAutor.add(livro);
        }
      }
    }
    return livrosPorAutor;
  }

  public List<Livro> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal) {
    List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();
    if (!livroList.isEmpty()) {
      for (Livro livro : livroList) {
        if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
          livrosPorIntervaloDeAnos.add(livro);
        }
      }
    }
    return livrosPorIntervaloDeAnos;
  }

  public Livro pesquisarPorTitulo(String titulo) {
    Livro livroPorTitulo = null;
    if (!livroList.isEmpty()) {
      for (Livro livro : livroList) {
        if (livro.getTitulo().equalsIgnoreCase(titulo)) {
          livroPorTitulo = livro;
          break;
        }
      }
    }
    return livroPorTitulo;
  }

  public static void main(String[] args) {
    // Criando uma instância do catálogo de livros
    CatalogoLivros catalogoLivros = new CatalogoLivros();

    // Adicionando livros ao catálogo
    catalogoLivros.adicionarLivro("Microsserviços Prontos Para a Produção", "Susan J. Fowler", 2017);
    catalogoLivros.adicionarLivro("Java Guia do Programador", "Peter Jandl Junior", 2021);
    catalogoLivros.adicionarLivro("Código Limpo", "Robert C. Martin", 2009);
    catalogoLivros.adicionarLivro("O Codificador Limpo", "Robert C. Martin", 2012);

    System.out.println(catalogoLivros.pesquisarPorAutor("Robert C. Martin"));
    System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2017, 2021));
    System.out.println(catalogoLivros.pesquisarPorTitulo("Código Limpo"));
  }
}