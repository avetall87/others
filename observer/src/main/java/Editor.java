import java.io.File;

/**
 * Created by avetall  03.04.18.
 */
public class Editor {
    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile() {
        if (this.file != null) {
            events.notify("save", file);
        } else {
            throw new RuntimeException("Please open a file first.");
        }
    }
}
