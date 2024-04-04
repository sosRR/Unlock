package y0;

import android.content.Context;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import x0.k;

public class h {
   private static final String a = k.f("WrkDbPathHelper");
   private static final String[] b = new String[]{"-journal", "-shm", "-wal"};

   public static File a(Context var0) {
      return c(var0, "androidx.work.workdb");
   }

   public static File b(Context var0) {
      return var0.getDatabasePath("androidx.work.workdb");
   }

   private static File c(Context var0, String var1) {
      return new File(var0.getNoBackupFilesDir(), var1);
   }

   public static String d() {
      return "androidx.work.workdb";
   }

   public static void e(Context var0) {
      if (b(var0).exists()) {
         k.c().a(a, "Migrating WorkDatabase to the no-backup directory");
         Map var1 = f(var0);
         Iterator var2 = var1.keySet().iterator();

         while(var2.hasNext()) {
            File var5 = (File)var2.next();
            File var3 = (File)var1.get(var5);
            if (var5.exists() && var3 != null) {
               if (var3.exists()) {
                  String var4 = String.format("Over-writing contents of %s", new Object[]{var3});
                  k.c().h(a, var4);
               }

               String var6;
               if (var5.renameTo(var3)) {
                  var6 = String.format("Migrated %s to %s", new Object[]{var5, var3});
               } else {
                  var6 = String.format("Renaming %s to %s failed", new Object[]{var5, var3});
               }

               k.c().a(a, var6);
            }
         }
      }

   }

   public static Map f(Context var0) {
      HashMap var4 = new HashMap();
      File var3 = b(var0);
      File var9 = a(var0);
      var4.put(var3, var9);
      String[] var6 = b;
      int var2 = var6.length;

      for(int var1 = 0; var1 < var2; ++var1) {
         String var5 = var6[var1];
         StringBuilder var7 = new StringBuilder();
         var7.append(var3.getPath());
         var7.append(var5);
         File var8 = new File(var7.toString());
         var7 = new StringBuilder();
         var7.append(var9.getPath());
         var7.append(var5);
         var4.put(var8, new File(var7.toString()));
      }

      return var4;
   }
}
