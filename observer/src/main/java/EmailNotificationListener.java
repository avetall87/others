import java.io.File;
import java.util.Objects;

/**
 * Created by avetall  03.04.18.
 */
public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file: " + file.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmailNotificationListener)) return false;
        EmailNotificationListener that = (EmailNotificationListener) o;
        return Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {

        return Objects.hash(email);
    }
}
