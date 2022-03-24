package ObserverPattern.Example2;

import java.io.File;

public class Editor {
    public EventManager manager;
    private File file;

    public Editor() {
        this.manager = new EventManager("open","save");
    }

    public void openFile(String filePath){
        this.file = new File(filePath);
        manager.myNotify("open",this.file);
    }
    public void saveFile() throws Exception{
        if (this.file != null){
            manager.myNotify("save",this.file);
        }
        else{
            throw new Exception("Please open file first");
        }
    }
}
