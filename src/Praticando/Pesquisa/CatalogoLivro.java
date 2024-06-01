package Praticando.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivro {

  private List<Livro> listLivros;

  public CatalogoLivro() {
    this.listLivros = new ArrayList<>();
  }

  public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
    listLivros.add(new Livro(titulo, autor, anoPublicacao));
  }

  public List<Livro> pesquisarPorAutor(String autor) {
    List<Livro> livroAutor = new ArrayList<>();
    if (!listLivros.isEmpty()) {
      for (Livro livro : listLivros) {
        if (livro.getAutor().equalsIgnoreCase(autor)) {
          livroAutor.add(livro);
        }
      }
    }
    return livroAutor;
  }

  public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
    List<Livro> pesquisaAno = new ArrayList<>();
    if (!listLivros.isEmpty()) {
      for (Livro livro : listLivros) {
        if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
          pesquisaAno.add(livro);
        }
      }
    }
    return pesquisaAno;
  }

  public Livro pesquisarPorTitulo(String titulo) {
    Livro pesquisaTitulo = null;
    if (!listLivros.isEmpty()) {
      for (Livro livro : listLivros) {
        if (livro.getTitulo().equalsIgnoreCase(titulo)) {
          pesquisaTitulo = livro;
          break;
        }
      }
    }
    return pesquisaTitulo;
  }

  public static void main(String[] args) {
    CatalogoLivro list = new CatalogoLivro();

    list.adicionarLivro("Era uma vez", "Moizés", 2023);
    list.adicionarLivro("Era uma vez 2", "Alanna", 2024);
    list.adicionarLivro("Era uma vez 5", "Liz", 2020);
    System.out.println("Intervalo" + list.pesquisarPorIntervaloAnos(2023, 2024));
    System.out.println("Titulo" + list.pesquisarPorTitulo("Era uma vez 5"));
    System.out.println("Autor" + list.pesquisarPorAutor("Moizés"));
  }
}
