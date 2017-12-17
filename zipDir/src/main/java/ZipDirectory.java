import java.io.IOException;
import java.util.Map;

/**
 * Created by avetall  16.12.17.
 */
public interface ZipDirectory {
    void zipDiretory(String zipName);
    boolean makeDirectory();
    void makeFile(Map<String,byte[]> data) throws IOException;
    boolean deleteDirectory();
}
