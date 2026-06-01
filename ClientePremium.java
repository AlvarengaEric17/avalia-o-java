public class ClientePremium extends Cliente {
    public ClientePremium(String nome, String email, int pontosFidelidade, String endereco) {
        super(nome, email, pontosFidelidade, endereco);
    }

    @Override
    public double calcularDesconto() {
        return 0.15;
    }
}