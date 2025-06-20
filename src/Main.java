import playerMultimediale.Video;

public class Main {
    public static void main(String[] args) {
        Video videoOne = new Video("Gattini", 6, 4, 5);
        videoOne.riproduci();
        videoOne.abbassaLuminosita();
        videoOne.abbassaLuminosita();
        videoOne.abbassaLuminosita();
        videoOne.riproduci();
        videoOne.abbassaVolume();
        videoOne.riproduci();
    }
}