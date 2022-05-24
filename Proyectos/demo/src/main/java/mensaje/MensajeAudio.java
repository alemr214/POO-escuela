package mensaje;

public class MensajeAudio extends Mensaje {
    private String nombreAudio;
    private int tiempoAudio;

    public void setnombreAudio(String nombreAudio) {
        this.nombreAudio = nombreAudio;
    }

    public void settiempoAudio(int tiempoAudio) {
        this.tiempoAudio = tiempoAudio;
    }

    public String getnombreAudio() {
        return nombreAudio;
    }

    public int gettiempoAudio() {
        return tiempoAudio;
    }

    public MensajeAudio(String destinatario, String numeroTelefono, String nombreAudio, int tiempoAudio) {
        super(destinatario, numeroTelefono);
        this.nombreAudio = nombreAudio;
        this.tiempoAudio = tiempoAudio;
    }

    public void enviarAudio() {
        System.out.println("Enviando audio a " + getDestinatario() + " con numero " + getNumeroTelefono()
                + ": " + getnombreAudio() + " durante " + gettiempoAudio() + " segundos");
    }

    public void grabarAudio() {
        System.out.println("Grabando audio a " + getDestinatario() + " con numero " + getNumeroTelefono()
                + ": " + getnombreAudio() + " durante " + gettiempoAudio() + " segundos");
    }
}
