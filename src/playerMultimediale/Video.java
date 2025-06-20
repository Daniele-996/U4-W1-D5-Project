package playerMultimediale;

import interfaces.Abbassa;
import interfaces.Alza;
import interfaces.Riproduci;

public class Video extends ElementoMultimediale implements Abbassa, Alza, Riproduci {
    private int durata;
    private int volume = 5;
    private int luminosita = 3;

    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo);
        this.durata = durata;
        this.volume = volume;
        this.luminosita = luminosita;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
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
    public int abbassaLuminosita() {
        return --luminosita;

    }

    @Override
    public int alzaLuminosita() {
        return ++luminosita;
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
    public void riproduci() {
        for (int i = 0; i < durata; i++) {
            System.out.println("Il titolo è: " + titolo + " con un volume di :" + " !".repeat(volume) + " mentre la luminosità è :" + " *".repeat(luminosita));
        }

    }
}
