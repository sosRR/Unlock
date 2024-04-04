package x0;

public enum e {
   m,
   n,
   o,
   p;

   private static final e[] q;

   static {
      e var1 = new e("REPLACE", 0);
      m = var1;
      e var2 = new e("KEEP", 1);
      n = var2;
      e var0 = new e("APPEND", 2);
      o = var0;
      e var3 = new e("APPEND_OR_REPLACE", 3);
      p = var3;
      q = new e[]{var1, var2, var0, var3};
   }
}
