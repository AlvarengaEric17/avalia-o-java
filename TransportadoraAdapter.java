public class TransportadoraAdapter implements Entrega {
    private SistemaTransportadoraExterno sistemaTransportadoraExterna;

    public TransportadoraAdapter(SistemaTransportadoraExterno sistemaTransportadoraExterna) {
        this.sistemaTransportadoraExterna = sistemaTransportadoraExterna;
    }

    @Override
    public void realizarEntrega(Cliente cliente) {
        sistemaTransportadoraExterna.enviarPacote(
                cliente.getNome(),
                cliente.getEndereco()
        );
    }
}
