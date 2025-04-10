public class Piano implements Playable{

    @Override
    public void play(Data.Chords chords) {
        System.out.println("Играет музыка " + chords.getChordsCount() + "-струнного пианино!");
    }
}