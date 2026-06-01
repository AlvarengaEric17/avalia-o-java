public class Eletronico extends Produto {
    public Eletronico(String nome, String codigo, double precoBase) {
        super(nome, codigo, precoBase);
    }

    @Override
    public double calcularPrecoFinal() {
        return getPrecoBase() * 1.15;
    }
}
