package j1;

import android.util.JsonReader;
import android.util.JsonToken;
import com.google.auto.value.AutoValue;
import java.io.IOException;
import java.io.Reader;

@AutoValue
public abstract class n {
   static n a(long var0) {
      return new h(var0);
   }

   public static n b(Reader var0) {
      JsonReader var32 = new JsonReader(var0);

      Throwable var10000;
      label337: {
         boolean var10001;
         try {
            var32.beginObject();
         } catch (Throwable var30) {
            var10000 = var30;
            var10001 = false;
            break label337;
         }

         n var1;
         label331: {
            label330: {
               while(true) {
                  try {
                     if (!var32.hasNext()) {
                        break label330;
                     }

                     if (var32.nextName().equals("nextRequestWaitMillis")) {
                        if (var32.peek() != JsonToken.STRING) {
                           break label331;
                        }

                        var1 = a(Long.parseLong(var32.nextString()));
                        break;
                     }
                  } catch (Throwable var31) {
                     var10000 = var31;
                     var10001 = false;
                     break label337;
                  }

                  try {
                     var32.skipValue();
                  } catch (Throwable var29) {
                     var10000 = var29;
                     var10001 = false;
                     break label337;
                  }
               }

               var32.close();
               return var1;
            }

            try {
               IOException var34 = new IOException("Response is missing nextRequestWaitMillis field.");
               throw var34;
            } catch (Throwable var28) {
               var10000 = var28;
               var10001 = false;
               break label337;
            }
         }

         try {
            var1 = a(var32.nextLong());
         } catch (Throwable var27) {
            var10000 = var27;
            var10001 = false;
            break label337;
         }

         var32.close();
         return var1;
      }

      Throwable var33 = var10000;
      var32.close();
      throw var33;
   }

   public abstract long c();
}
