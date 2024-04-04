package x0;

public enum a {
   m,
   n;

   private static final a[] o;

   static {
      a var0 = new a("EXPONENTIAL", 0);
      m = var0;
      a var1 = new a("LINEAR", 1);
      n = var1;
      o = new a[]{var0, var1};
   }
}
