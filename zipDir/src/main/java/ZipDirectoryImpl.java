import lombok.Getter;
import org.apache.commons.io.FileUtils;
import org.zeroturnaround.zip.ZipUtil;

import java.io.File;
import java.io.IOException;
import java.util.Map;

/**
 * Created by avetall  16.12.17.
 */
public class ZipDirectoryImpl implements ZipDirectory {

    private String directoryPath;

    @Getter
    private File directory;

    public ZipDirectoryImpl(String directoryPath) {
        this.directoryPath = directoryPath;
        directory = new File(directoryPath);
    }

    public void zipDiretory(String zipName) {
        File zip = new File(directory.getAbsolutePath() + "/bundle_" + zipName + ".zip");
        ZipUtil.pack(directory, zip);
    }

    public boolean makeDirectory() {
        if(!directory.exists()) {
          return directory.mkdir();
        }else {
          throw new RuntimeException("Directory "+directory.getName()+" already exists !");
        }
    }

    public void makeFile(Map<String,byte[]> data) throws IOException {
        if(data!=null){
            for (Map.Entry<String,byte[]> map: data.entrySet()) {
                File file = new File(directoryPath+"/"+map.getKey());
                FileUtils.writeByteArrayToFile(file, map.getValue());
            }
        }
    }

    public boolean deleteDirectory() {
        try {
            FileUtils.deleteDirectory(directory);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }


}
