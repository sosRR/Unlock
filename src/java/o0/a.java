package o0;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class a {
   private static final Map e = new HashMap();
   private final File a;
   private final Lock b;
   private final boolean c;
   private FileChannel d;

   public a(String var1, File var2, boolean var3) {
      StringBuilder var4 = new StringBuilder();
      var4.append(var1);
      var4.append(".lck");
      File var5 = new File(var2, var4.toString());
      this.a = var5;
      this.b = a(var5.getAbsolutePath());
      this.c = var3;
   }

   private static Lock a(String var0) {
      Map var3 = e;
      synchronized(var3){}

      Throwable var10000;
      boolean var10001;
      label176: {
         Lock var2;
         try {
            var2 = (Lock)var3.get(var0);
         } catch (Throwable var24) {
            var10000 = var24;
            var10001 = false;
            break label176;
         }

         Object var1 = var2;
         if (var2 == null) {
            try {
               var1 = new ReentrantLock();
               var3.put(var0, var1);
            } catch (Throwable var23) {
               var10000 = var23;
               var10001 = false;
               break label176;
            }
         }

         label165:
         try {
            return (Lock)var1;
         } catch (Throwable var22) {
            var10000 = var22;
            var10001 = false;
            break label165;
         }
      }

      while(true) {
         Throwable var25 = var10000;

         try {
            throw var25;
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            continue;
         }
      }
   }

   public void b() {
      this.b.lock();
      if (this.c) {
         try {
            FileOutputStream var1 = new FileOutputStream(this.a);
            FileChannel var3 = var1.getChannel();
            this.d = var3;
            var3.lock();
         } catch (IOException var2) {
            throw new IllegalStateException("Unable to grab copy lock.", var2);
         }
      }

   }

   public void c() {
      FileChannel var1 = this.d;
      if (var1 != null) {
         try {
            var1.close();
         } catch (IOException var2) {
         }
      }

      this.b.unlock();
   }
}
