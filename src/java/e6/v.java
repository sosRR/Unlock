package e6;

public final class v {
   public static final void a(o5.f param0, Throwable param1) {
      // $FF: Couldn't be decompiled
   }

   public static final Throwable b(Throwable var0, Throwable var1) {
      if (var0 == var1) {
         return var0;
      } else {
         RuntimeException var2 = new RuntimeException("Exception while trying to handle coroutine exception", var1);
         m5.a.a(var2, var0);
         return var2;
      }
   }
}
