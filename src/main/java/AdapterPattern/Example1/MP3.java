package AdapterPattern.Example1;

public class MP3 implements MediaPlayer{
    @Override
    public void play(String fileName) {
        System.out.println("Playing mp3 file " + fileName);
    }
}
