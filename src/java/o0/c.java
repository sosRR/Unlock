package o0;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;

public class c {
   public static void a(q0.b var0) {
      ArrayList var2 = new ArrayList();
      Cursor var1 = var0.K("SELECT name FROM sqlite_master WHERE type = 'trigger'");

      while(true) {
         boolean var5 = false;

         try {
            var5 = true;
            if (!var1.moveToNext()) {
               var5 = false;
               break;
            }

            var2.add(var1.getString(0));
            var5 = false;
         } finally {
            if (var5) {
               var1.close();
            }
         }
      }

      var1.close();
      Iterator var8 = var2.iterator();

      while(var8.hasNext()) {
         String var7 = (String)var8.next();
         if (var7.startsWith("room_fts_content_sync_")) {
            StringBuilder var3 = new StringBuilder();
            var3.append("DROP TRIGGER IF EXISTS ");
            var3.append(var7);
            var0.i(var3.toString());
         }
      }

   }

   public static Cursor b(h var0, q0.e var1, boolean var2, CancellationSignal var3) {
      Cursor var7 = var0.s(var1, var3);
      Cursor var6 = var7;
      if (var2) {
         var6 = var7;
         if (var7 instanceof AbstractWindowedCursor) {
            AbstractWindowedCursor var8 = (AbstractWindowedCursor)var7;
            int var5 = var8.getCount();
            int var4;
            if (var8.hasWindow()) {
               var4 = var8.getWindow().getNumRows();
            } else {
               var4 = var5;
            }

            var6 = var7;
            if (var4 < var5) {
               var6 = b.a(var8);
            }
         }
      }

      return var6;
   }

   public static int c(File var0) {
      IOException var3 = null;
      FileChannel var2 = var3;

      Throwable var10000;
      label1312: {
         ByteBuffer var4;
         boolean var10001;
         try {
            var4 = ByteBuffer.allocate(4);
         } catch (Throwable var161) {
            var10000 = var161;
            var10001 = false;
            break label1312;
         }

         var2 = var3;

         FileInputStream var5;
         try {
            var5 = new FileInputStream;
         } catch (Throwable var160) {
            var10000 = var160;
            var10001 = false;
            break label1312;
         }

         var2 = var3;

         try {
            var5.<init>(var0);
         } catch (Throwable var159) {
            var10000 = var159;
            var10001 = false;
            break label1312;
         }

         var2 = var3;

         FileChannel var162;
         try {
            var162 = var5.getChannel();
         } catch (Throwable var158) {
            var10000 = var158;
            var10001 = false;
            break label1312;
         }

         var2 = var162;

         try {
            var162.tryLock(60L, 4L, true);
         } catch (Throwable var157) {
            var10000 = var157;
            var10001 = false;
            break label1312;
         }

         var2 = var162;

         try {
            var162.position(60L);
         } catch (Throwable var156) {
            var10000 = var156;
            var10001 = false;
            break label1312;
         }

         var2 = var162;

         label1313: {
            try {
               if (var162.read(var4) == 4) {
                  break label1313;
               }
            } catch (Throwable var155) {
               var10000 = var155;
               var10001 = false;
               break label1312;
            }

            var2 = var162;

            try {
               var3 = new IOException;
            } catch (Throwable var154) {
               var10000 = var154;
               var10001 = false;
               break label1312;
            }

            var2 = var162;

            try {
               var3.<init>("Bad database header, unable to read 4 bytes at offset 60");
            } catch (Throwable var153) {
               var10000 = var153;
               var10001 = false;
               break label1312;
            }

            var2 = var162;

            try {
               throw var3;
            } catch (Throwable var152) {
               var10000 = var152;
               var10001 = false;
               break label1312;
            }
         }

         var2 = var162;

         try {
            var4.rewind();
         } catch (Throwable var151) {
            var10000 = var151;
            var10001 = false;
            break label1312;
         }

         var2 = var162;

         int var1;
         try {
            var1 = var4.getInt();
         } catch (Throwable var150) {
            var10000 = var150;
            var10001 = false;
            break label1312;
         }

         var162.close();
         return var1;
      }

      Throwable var163 = var10000;
      if (var2 != null) {
         var2.close();
      }

      throw var163;
   }
}
