package i4;

enum e {
   m,
   n,
   o;

   private static final e[] p;

   static {
      e var1 = new e("USE_CACHE", 0);
      m = var1;
      e var0 = new e("SKIP_CACHE_LOOKUP", 1);
      n = var0;
      e var2 = new e("IGNORE_CACHE_EXPIRATION", 2);
      o = var2;
      p = new e[]{var1, var0, var2};
   }
}
