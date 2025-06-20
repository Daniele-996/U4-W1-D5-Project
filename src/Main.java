import playerMultimediale.RegistrazioneAudio;

public class Main {
    public static void main(String[] args) {
        RegistrazioneAudio audio = new RegistrazioneAudio("abcd", 2, 10);
        System.out.println(audio.abbassaVolume());
        audio.riproduci();
        audio.abbassaVolume();
        audio.abbassaVolume();
        audio.riproduci();

    }
}