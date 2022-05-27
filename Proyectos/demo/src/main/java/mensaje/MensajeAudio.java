package mensaje;

import com.twilio.Twilio;
import com.twilio.converter.Promoter;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import java.net.URI;
import java.util.Arrays;

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
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("whatsapp:" + getNumeroTelefono()),
                new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                "Audio").setMediaUrl(Arrays.asList(URI.create(getnombreAudio()))).create();

        System.out.println(message.getSid());
    }

    public void grabarAudio() {
        System.out.println("Grabando audio a " + getDestinatario() + " con numero " + getNumeroTelefono()
                + ": " + getnombreAudio() + " durante " + gettiempoAudio() + " segundos");
    }
}
