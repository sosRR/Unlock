package o0;

import android.annotation.SuppressLint;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

public class d {
   @SuppressLint({"LambdaLast"})
   public static void a(ReadableByteChannel var0, FileChannel var1) {
      try {
         var1.transferFrom(var0, 0L, Long.MAX_VALUE);
         var1.force(false);
      } finally {
         var0.close();
         var1.close();
      }

   }
}
