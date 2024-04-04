package x0;

public enum l {
   m,
   n,
   o,
   p,
   q,
   r;

   private static final l[] s;

   static {
      l var3 = new l("NOT_REQUIRED", 0);
      m = var3;
      l var2 = new l("CONNECTED", 1);
      n = var2;
      l var1 = new l("UNMETERED", 2);
      o = var1;
      l var0 = new l("NOT_ROAMING", 3);
      p = var0;
      l var4 = new l("METERED", 4);
      q = var4;
      l var5 = new l("TEMPORARILY_UNMETERED", 5);
      r = var5;
      s = new l[]{var3, var2, var1, var0, var4, var5};
   }
}
