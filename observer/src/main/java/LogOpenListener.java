import java.io.File;
import java.util.Objects;

/**
 * Created by avetall  03.04.18.
 */
public class LogOpenListener implements EventListener{
    private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Save to log " + log + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LogOpenListener)) return false;
        LogOpenListener that = (LogOpenListener) o;
        return Objects.equals(log, that.log);
    }

    @Override
    public int hashCode() {

        return Objects.hash(log);
    }
}
