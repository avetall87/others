/**
 * Created by avetall  03.04.18.
 */
public class Application {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));
        editor.events.unsubscribe("save", new EmailNotificationListener("admin@example.com"));

        editor.openFile("test.txt");
        editor.saveFile();
    }
}
