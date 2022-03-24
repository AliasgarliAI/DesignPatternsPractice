package AdapterPattern.Example1;

import AdapterPattern.Example1.FormatAdapter;
import AdapterPattern.Example1.MP3;
import AdapterPattern.Example1.MP4;
import AdapterPattern.Example1.MediaPlayer;

public class Main {

    public static void main(String[] args) {
        MediaPlayer player = new MP3();
        player.play("Evgeniy Grinko - Valse");

        FormatAdapter adapter = new FormatAdapter(new MP4());
        adapter.play("");
    }
}
