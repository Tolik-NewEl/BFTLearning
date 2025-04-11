public class Data {

    public enum Chords {
        GUITAR(6),
        PIANO(230);

        public final int chordsCount;

        Chords(int chordsCount) {
            this.chordsCount = chordsCount;
        }

        public int getChordsCount() {
            return chordsCount;
        }
    }
}
