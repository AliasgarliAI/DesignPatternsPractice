package AdapterPattern.Example1;

public class MP4 implements MediaPackage{
    @Override
    public void playFile(String fileName) {
        System.out.println("Playing mp3 file " + fileName);
    }
}
