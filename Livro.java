public class Livro extends Produto {
    public Livro(String nome, String codigo, double precoBase) {
        super(nome, codigo, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase();
    }
}
