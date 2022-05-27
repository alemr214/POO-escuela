package mensaje;

//join vast-for
public class App {
    public static void main(String[] args) {
        MensajeAudio alejandro = new MensajeAudio("Alejandro", "+5212299079167",
                "https://s19.aconvert.com/convert/p3r68-cdx67/h96x2-rpzus.mp3",
                10);
        alejandro.enviarAudio();
    }
}