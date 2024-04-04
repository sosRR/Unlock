package k1;

import android.content.Context;
import java.io.Closeable;

abstract class u implements Closeable {
   abstract t1.d a();

   public void close() {
      this.a().close();
   }

   abstract t f();

   interface a {
      a a(Context var1);

      u build();
   }
}
