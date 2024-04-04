package j0;

import androidx.lifecycle.h0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import w5.l;
import x5.g;

public final class c {
   private final List a = new ArrayList();

   public final void a(b6.b var1, l var2) {
      g.e(var1, "clazz");
      g.e(var2, "initializer");
      this.a.add(new f(v5.a.a(var1), var2));
   }

   public final h0.b b() {
      Object[] var1 = this.a.toArray(new f[0]);
      if (var1 != null) {
         f[] var2 = (f[])var1;
         return new b((f[])Arrays.copyOf(var2, var2.length));
      } else {
         throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
      }
   }
}
