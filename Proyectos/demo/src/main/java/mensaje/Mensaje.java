package mensaje;

public class Mensaje {
    private String destinatario;
    private String numeroTelefono;
    public static final String ACCOUNT_SID = "ACf42d7ff198802f04bab03b8afb3d9d8c";
    public static final String AUTH_TOKEN = "675372896b29927a215976df0ca20aaa";

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
