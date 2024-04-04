package x0;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.lifecycle.LiveData;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@SuppressLint({"AddedAbstractMethod"})
public abstract class v {
   protected v() {
   }

   public static v f(Context var0) {
      return y0.i.o(var0);
   }

   public static void h(Context var0, androidx.work.a var1) {
      y0.i.h(var0, var1);
   }

   public abstract n a();

   public abstract n b(String var1);

   public abstract n c(List var1);

   public final n d(w var1) {
      return this.c(Collections.singletonList(var1));
   }

   public abstract n e(String var1, d var2, p var3);

   public abstract LiveData g(UUID var1);
}
