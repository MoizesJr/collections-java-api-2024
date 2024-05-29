package list.OperacoesBasicas;

public class App {
    public static void main(String[] args) throws Exception {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Feijão", 2.30, 1);
        carrinho.adicionarItem("Arroz", 8, 3);
        carrinho.exibirItens();
        System.out.println("O valor total da compra é = " + carrinho.calcularValorTotal());

    }
}
