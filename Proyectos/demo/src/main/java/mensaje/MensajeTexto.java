package mensaje;

import com.twilio.Twilio;
import com.twilio.converter.Promoter;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;

import java.net.URI;
import java.math.BigDecimal;

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
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message message = Message.creator(
                new com.twilio.type.PhoneNumber("whatsapp:" + getNumeroTelefono()),
                new com.twilio.type.PhoneNumber("whatsapp:+14155238886"),
                getTexto()).create();

        System.out.println(message.getSid());
    }
}
