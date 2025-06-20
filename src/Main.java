import playerMultimediale.ElementoMultimediale;
import playerMultimediale.Immagine;
import playerMultimediale.RegistrazioneAudio;
import playerMultimediale.Video;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ElementoMultimediale[] elementi = new ElementoMultimediale[5];

        System.out.println("Benvenuto! Crea 5 elementi multimediali.");
        System.out.println("Digita 0 per RegistrazioneAudio, 1 per Video, 2 per Immagine.");

        for (int i = 0; i < 5; i++) {
            System.out.println("Elemento #" + (i + 1) + " - scegli il tipo: 0 Audio , 1 Video , 2 Immagine?");

            int valore = Integer.parseInt(scanner.nextLine());

            switch (valore) {
                case 0:
                    System.out.println("Titolo:");
                    String titoloA = scanner.nextLine();
                    System.out.println("Durata:");
                    int durataA = Integer.parseInt(scanner.nextLine());
                    System.out.println("Volume:");
                    int volumeA = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new RegistrazioneAudio(titoloA, durataA, volumeA);
                    break;

                case 1:
                    System.out.println("Titolo:");
                    String titoloV = scanner.nextLine();
                    System.out.println("Durata:");
                    int durataV = Integer.parseInt(scanner.nextLine());
                    System.out.println("Volume:");
                    int volumeV = Integer.parseInt(scanner.nextLine());
                    System.out.println("Luminosità:");
                    int luminositaV = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Video(titoloV, durataV, volumeV, luminositaV);
                    break;

                case 2:
                    System.out.println("Titolo:");
                    String titoloI = scanner.nextLine();
                    System.out.println("Luminosità:");
                    int luminositaI = Integer.parseInt(scanner.nextLine());
                    elementi[i] = new Immagine(titoloI, luminositaI);
                    break;

                default:
                    System.out.println("Valore non valido, salto l'elemento.");
                    i--;
                    break;
            }
        }
        System.out.println("Hai creato gli elementi!!");
        while (true) {
            System.out.println("Quale elemento vuoi eseguire? (da 0 a 4), oppure scrivi 'stop' per uscire:");
            String input = scanner.nextLine();

            if (input.equals("stop")) {
                break;
            }

            int scelta = Integer.parseInt(input);

            ElementoMultimediale elem = elementi[scelta];

            if (elem instanceof Immagine) {
                ((Immagine) elem).mostra();
            } else if (elem instanceof RegistrazioneAudio) {
                ((RegistrazioneAudio) elem).riproduci();
            } else if (elem instanceof Video) {
                ((Video) elem).riproduci();
            }
        }
        scanner.close();
    }
}
