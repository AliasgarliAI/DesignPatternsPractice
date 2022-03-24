package AdapterPattern.Example1;

public class FormatAdapter implements MediaPlayer {
    private MediaPackage media;

    public FormatAdapter(MediaPackage media){
        this.media = media;

    }

    @Override
    public void play(String fileName) {
        media.playFile(fileName);
    }
}
