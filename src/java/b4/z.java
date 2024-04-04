package b4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPOutputStream;

class z {
   private static void a(InputStream var0, File var1) {
      if (var0 != null) {
         byte[] var6 = new byte[8192];
         Object var3 = null;

         GZIPOutputStream var4;
         try {
            FileOutputStream var5 = new FileOutputStream(var1);
            var4 = new GZIPOutputStream(var5);
         } finally {
            ;
         }

         label211: {
            Throwable var10000;
            while(true) {
               int var2;
               boolean var10001;
               try {
                  var2 = var0.read(var6);
               } catch (Throwable var26) {
                  var10000 = var26;
                  var10001 = false;
                  break;
               }

               if (var2 > 0) {
                  try {
                     var4.write(var6, 0, var2);
                  } catch (Throwable var24) {
                     var10000 = var24;
                     var10001 = false;
                     break;
                  }
               } else {
                  try {
                     var4.finish();
                     break label211;
                  } catch (Throwable var25) {
                     var10000 = var25;
                     var10001 = false;
                     break;
                  }
               }
            }

            Throwable var27 = var10000;
            g.f(var4);
            throw var27;
         }

         g.f(var4);
      }
   }

   static void b(File param0, List param1) {
      // $FF: Couldn't be decompiled
   }
}
