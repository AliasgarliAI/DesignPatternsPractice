package AdapterPattern.Example1;

public class VLC implements MediaPackage{
    @Override
    public void playFile(String fileName) {
        System.out.println("Playing VLC file" + fileName);
    }
}
