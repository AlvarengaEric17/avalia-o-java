public abstract class Cliente {
    private String nome;
    private String email;
    private int pontosFidelidade;
    private String endereco;

    public Cliente(String nome, String email, int pontosFidelidade, String endereco) {
        this.nome = nome;
        this.email = email;
        this.pontosFidelidade = pontosFidelidade;
        this.endereco = endereco;
    }

    public String getNome() { return nome; }
    public String getEmail() { return email; }
    public int getPontosFidelidade() { return pontosFidelidade; }
    public String getEndereco() { return endereco; }

    public void setNome(String nome) { this.nome = nome; }
    public void setEmail(String email) { this.email = email; }
    public void setEndereco(String endereco) { this.endereco = endereco; }

    public void setPontosFidelidade(int pontosFidelidade) {
        if (pontosFidelidade < 0) {
            throw new IllegalArgumentException("Os pontos não podem ser negativos.");
        }
        this.pontosFidelidade = pontosFidelidade;
    }

    public void exibirCliente() {
        System.out.println("Cliente: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("Endereço: " + endereco);
        System.out.println("Pontos: " + pontosFidelidade);
        System.out.printf("Desconto: %.0f%%%n", calcularDesconto() * 100);
    }

    public abstract double calcularDesconto();
}
