public class Vestuario extends Produto {
    public Vestuario(String nome, String codigo, double precoBase) {
        super(nome, codigo, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() * 1.08;
    }
}