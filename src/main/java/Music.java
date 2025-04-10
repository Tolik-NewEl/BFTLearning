public class Music {
    public static void main(String[] args) {
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        guitar.play(Data.Chords.GUITAR);
        piano.play(Data.Chords.PIANO);
    }
}
