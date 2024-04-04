package i1;

public enum d {
   m,
   n,
   o;

   private static final d[] p;

   static {
      d var2 = new d("DEFAULT", 0);
      m = var2;
      d var0 = new d("VERY_LOW", 1);
      n = var0;
      d var1 = new d("HIGHEST", 2);
      o = var1;
      p = new d[]{var2, var0, var1};
   }
}
