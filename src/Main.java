import playerMultimediale.ElementoMultimediale;
import playerMultimediale.Immagine;
import playerMultimediale.RegistrazioneAudio;
import playerMultimediale.Video;

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Video videoGattini = new Video("Gattini!", 6, 4, 5);
        Video videoPaperelle = new Video("Paperelle!", 12, 6, 2);
        RegistrazioneAudio audioPapa = new RegistrazioneAudio("Audio Papà!", 15, 4);
        RegistrazioneAudio audioMamma = new RegistrazioneAudio("Audio Mammma!", 6, 10);
        Immagine immagineNonna = new Immagine("Nonna con me da piccolo!!", 6);

        ElementoMultimediale[] variElementi = {videoPaperelle, videoGattini, audioPapa, audioMamma, immagineNonna};
    }
}