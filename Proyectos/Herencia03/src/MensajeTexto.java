public class MensajeTexto extends Mensaje {
    private String texto;

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    public MensajeTexto(String destinatario, String numeroTelefono, String texto) {
        super(destinatario, numeroTelefono);
        this.texto = texto;
    }

    public void enviarMensaje() {
        System.out.println("Enviando mensaje de texto a " + getDestinatario() + " con numero " + getNumeroTelefono()
                + ": " + getTexto());
    }
}
