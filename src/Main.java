import playerMultimediale.RegistrazioneAudio;

public class Main {
    public static void main(String[] args) {
        RegistrazioneAudio audio = new RegistrazioneAudio("abcd", 2, 10);
        System.out.println(audio.abbassaVolume());
        System.out.println(audio.riproduci());
        System.out.println(audio.abbassaVolume());
        System.out.println(audio.riproduci());
        System.out.println(audio.abbassaVolume());
        System.out.println(audio.riproduci());
        System.out.println(audio.abbassaVolume());
        System.out.println(audio.riproduci());
        System.out.println(audio.alzaVolume());
        System.out.println(audio.riproduci());
        System.out.println(audio.alzaVolume());
        System.out.println(audio.riproduci());
        System.out.println(audio.alzaVolume());
        System.out.println(audio.riproduci());

    }
}