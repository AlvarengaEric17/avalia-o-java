import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        listaProdutos.add(new Eletronico("Notebook Dell Vostro", "E001", 3500.00));
        listaProdutos.add(new Vestuario("Jaqueta Jeans", "V001", 120.00));
        listaProdutos.add(new Livro("O Hobbit", "L001", 180.00));

        ArrayList<Cliente> listaClientes = new ArrayList<>();

        listaClientes.add(new ClientePremium(
                "Eric Alvarenga",
                "eric@email.com",
                285,
                "Rua dos Coqueiros, 1240 - Centro"
        ));

        listaClientes.add(new ClienteComum(
                "João Silva",
                "joao@email.com",
                80,
                "Av. Tomas, 5024 - Jardim América"
        ));

        Loja lojaVirtual = new Loja();

        lojaVirtual.processarProdutos(listaProdutos);
        lojaVirtual.processarClientes(listaClientes);

        System.out.println("===== COMPRA COM DESCONTO =====");

        Produto produtoSelecionado = listaProdutos.get(0);
        Cliente clienteSelecionado = listaClientes.get(0);

        double precoFinalProduto = produtoSelecionado.calcularPrecoFinal();
        double percentualDesconto = clienteSelecionado.calcularDesconto();
        double valorFinalComDesconto = precoFinalProduto - (precoFinalProduto * percentualDesconto);

        System.out.println("Cliente: " + clienteSelecionado.getNome());
        System.out.println("Produto: " + produtoSelecionado.getNome());
        System.out.printf("Preço final: R$ %.2f%n", precoFinalProduto);
        System.out.printf("Valor com desconto: R$ %.2f%n", valorFinalComDesconto);

        System.out.println("===== PADRÃO ADAPTER =====");

        SistemaTransportadoraExterno sistemaTransportadoraExterna =
                new SistemaTransportadoraExterno();

        Entrega servicoEntrega = new TransportadoraAdapter(sistemaTransportadoraExterna);

        servicoEntrega.realizarEntrega(clienteSelecionado);
    }
}