package t1;

import android.content.Context;

public final class h implements n1.b {
   private final l5.a a;

   public h(l5.a var1) {
      this.a = var1;
   }

   public static h a(l5.a var0) {
      return new h(var0);
   }

   public static String c(Context var0) {
      return (String)n1.d.c(f.b(var0), "Cannot return null from a non-@Nullable @Provides method");
   }

   public String b() {
      return c((Context)this.a.get());
   }
}
