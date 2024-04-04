package b5;

public enum c {
   m,
   n;

   private static final c[] o;

   static {
      c var1 = new c("LOW_POWER", 0);
      m = var1;
      c var0 = new c("HIGH_SPEED", 1);
      n = var0;
      o = new c[]{var1, var0};
   }
}
