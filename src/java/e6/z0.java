package e6;

public final class z0 {
   private static final kotlinx.coroutines.internal.w a = new kotlinx.coroutines.internal.w("COMPLETING_ALREADY");
   public static final kotlinx.coroutines.internal.w b = new kotlinx.coroutines.internal.w("COMPLETING_WAITING_CHILDREN");
   private static final kotlinx.coroutines.internal.w c = new kotlinx.coroutines.internal.w("COMPLETING_RETRY");
   private static final kotlinx.coroutines.internal.w d = new kotlinx.coroutines.internal.w("TOO_LATE_TO_CANCEL");
   private static final kotlinx.coroutines.internal.w e = new kotlinx.coroutines.internal.w("SEALED");
   private static final h0 f = new h0(false);
   private static final h0 g = new h0(true);

   // $FF: synthetic method
   public static final kotlinx.coroutines.internal.w a() {
      return a;
   }

   // $FF: synthetic method
   public static final kotlinx.coroutines.internal.w b() {
      return c;
   }

   // $FF: synthetic method
   public static final h0 c() {
      return g;
   }

   // $FF: synthetic method
   public static final kotlinx.coroutines.internal.w d() {
      return e;
   }

   // $FF: synthetic method
   public static final kotlinx.coroutines.internal.w e() {
      return d;
   }

   public static final Object f(Object var0) {
      Object var1 = var0;
      if (var0 instanceof p0) {
         var1 = new q0((p0)var0);
      }

      return var1;
   }
}
