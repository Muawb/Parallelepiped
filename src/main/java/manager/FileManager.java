package manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.io.File;

public class FileManager {

    private static final Logger log = LoggerFactory.getLogger(FileManager.class);

    private static File file = null;
    private static File wrk = null;
    private static File workDir = null;


    public static File getWorkDir(){
        if (workDir == null){
            workDir = getPath("Parallelepiped");
            log.info("Work directory created !");
        }
        return workDir;
    }

    private static File getPath(String workDir){
        String userHome = System.getProperty("user.home", ".");
        switch (getPlatform().ordinal()){
            case 0:
                String appData = System.getenv("APPDATA");
                if (appData != null) {
                    wrk = new File(appData, "." + workDir + "/");
                } else {
                    wrk = new File(userHome, "." + workDir + "/");
                }
                break;
        }
        if (!wrk.exists() && !wrk.mkdirs()){
            log.error("Not found work directory " + workDir);
            throw new RuntimeException();
        }
        return wrk;
    }

    private static OS getPlatform(){
        String name = System.getProperty("os.name").toLowerCase();
        if (name.contains("win")){
            return OS.WINDOWS;
        } else {
            return OS.UNKNOWN;
        }
    }

    private enum OS {
        WINDOWS,
        UNKNOWN
    }
}
