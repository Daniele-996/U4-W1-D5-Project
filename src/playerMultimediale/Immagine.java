package playerMultimediale;

import interfaces.Abbassa;
import interfaces.Alza;

public class Immagine extends ElementoMultimediale implements Abbassa, Alza {
    public int luminosita = 5;

    public Immagine(String titolo) {
        super(titolo);
    }

    public Immagine(String titolo, int luminosita) {
        super(titolo);
        this.luminosita = luminosita;
    }

    public int getLuminosita() {
        return luminosita;
    }

    public void setLuminosita(int luminosita) {
        this.luminosita = luminosita;
    }

    public void mostra() {
        System.out.println("Il titolo è: " + titolo + " con una luminosità di :" + " *".repeat(luminosita));

    }

    @Override
    public int alzaVolume() {
        return 0;
    }

    @Override
    public int alzaLuminosita() {
        return ++luminosita;
    }

    @Override
    public int abbassaVolume() {
        return 0;
    }

    @Override
    public int abbassaLuminosita() {
        return --luminosita;
    }

    @Override
    public String toString() {
        return "Immagine{" +
                "luminosita=" + luminosita +
                '}';
    }
}
