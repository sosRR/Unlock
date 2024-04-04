package g5;

import java.io.File;
import java.io.FilenameFilter;

class c$a implements FilenameFilter {
   public boolean accept(File var1, String var2) {
      return var2.endsWith("-log.txt");
   }
}
