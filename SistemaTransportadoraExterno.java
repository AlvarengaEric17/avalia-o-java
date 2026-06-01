public class SistemaTransportadoraExterno {
    public void enviarPacote(String destinatario, String endereco) {
        System.out.println("Transportadora externa acionada.");
        System.out.println("Destinatário: " + destinatario);
        System.out.println("Endereço: " + endereco);
        System.out.println("Status: pacote enviado com sucesso.");
    }
}