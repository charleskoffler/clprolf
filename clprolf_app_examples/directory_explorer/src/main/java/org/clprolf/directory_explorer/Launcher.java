package org.clprolf.directory_explorer;

import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.clprolf.directory_explorer.interfaces.DirectoryExplorer;
import org.clprolf.framework.java.With_compat;
import org.clprolf.framework.java.Worker_agent;

/* 20251019 v1.0.0 */
@Worker_agent
public class Launcher {

	public static void main(String[] args) {
        @With_compat Path path = Paths.get(args.length>0? args[0] : System.getProperty("user.home"));
        
     // Optional: resolve symlinks & get absolute path (nice for logs)
        try { path = path.toRealPath(LinkOption.NOFOLLOW_LINKS); } catch (Exception ignored) {}

        if (!Files.isDirectory(path)) {
            System.err.println("Not a directory: " + path);
            System.err.println("Usage: java ... Launcher [rootDirectory]");
            System.exit(1);
        }
        
        @With_compat DirectoryExplorer explorer = new DirectoryExplorerImpl();
        explorer.breadthFirstFolders(path);

    }


}
