package playerMultimediale;

public class Video extends ElementoMultimediale {
    private int durata;

    public Video(String titolo, int durata) {
        super(titolo);
        this.durata = durata;
    }
}
