public abstract class Produto {
    private String nome;
    private String codigo;
    private double precoBase;

    public Produto(String nome, String codigo, double precoBase) {
        this.nome = nome;
        this.codigo = codigo;
        this.precoBase = precoBase;
    }

    public String getNome() { return nome; }
    public String getCodigo() { return codigo; }
    public double getPrecoBase() { return precoBase; }

    public void setNome(String nome) { this.nome = nome; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public void setPrecoBase(double precoBase) {
        if (precoBase < 0) {
            throw new IllegalArgumentException("O preço base não pode ser negativo.");
        }
        this.precoBase = precoBase;
    }

    public void exibirDados() {
        System.out.println("Produto: " + nome);
        System.out.println("Código: " + codigo);
        System.out.printf("Preço base: R$ %.2f%n", precoBase);
        System.out.printf("Preço final: R$ %.2f%n", calcularPrecoFinal());
    }

    public abstract double calcularPrecoFinal();
}
