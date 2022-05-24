public class Mensaje {
    private String destinatario;
    private String numeroTelefono;

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    public void setNumeroTelefono(String numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public String getDestinatario() {
        return destinatario;
    }

    public String getNumeroTelefono() {
        return numeroTelefono;
    }

    public Mensaje(String destinatario, String numeroTelefono) {
        this.destinatario = destinatario;
        this.numeroTelefono = numeroTelefono;
    }
}
