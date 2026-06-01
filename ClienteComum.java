public class ClienteComum extends Cliente {
    public ClienteComum(String nome, String email, int pontosFidelidade, String endereco) {
        super(nome, email, pontosFidelidade, endereco);
    }

    @Override
    public double calcularDesconto() {
        if (getPontosFidelidade() >= 100) {
            return 0.05;
        }
        return 0.0;
    }
}