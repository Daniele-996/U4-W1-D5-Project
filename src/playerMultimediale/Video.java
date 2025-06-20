package playerMultimediale;

import interfaces.Abbassa;
import interfaces.Alza;
import interfaces.Riproduci;

public class Video extends ElementoMultimediale implements Abbassa, Alza, Riproduci {
    private int durata;
    private int volume = 5;

    public Video(String titolo, int durata, int volume) {
        super(titolo);
        this.durata = durata;
    }

    public int getDurata() {
        return durata;
    }

    public boolean setDurata(int durata) {
        if (durata > 0) {
            this.durata = durata;
        } else {
            System.out.println("Inserisci la durata del video!");
        }
        return false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public int abbassaVolume() {
        return --volume;
    }

    @Override
    public int alzaVolume() {
        return ++volume;
    }

    @Override
    public boolean riproduci() {

        return false;
    }
}
