import java.util.ArrayList;

public class Loja {
    public void processarProdutos(ArrayList<Produto> listaProdutos) {
        System.out.println("===== PRODUTOS =====");

        for (Produto produtoAtual : listaProdutos) {
            produtoAtual.exibirDados();
            System.out.println("----------------------");
        }
    }

    public void processarClientes(ArrayList<Cliente> listaClientes) {
        System.out.println("===== CLIENTES =====");

        for (Cliente clienteAtual : listaClientes) {
            clienteAtual.exibirCliente();
            System.out.println("----------------------");
        }
    }
}