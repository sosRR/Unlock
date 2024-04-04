package r4;

public interface k {
   a b(String var1);

   public static enum a {
      n,
      o,
      p,
      q;

      private static final a[] r;
      private final int m;

      static {
         a var0 = new a("NONE", 0, 0);
         n = var0;
         a var3 = new a("SDK", 1, 1);
         o = var3;
         a var1 = new a("GLOBAL", 2, 2);
         p = var1;
         a var2 = new a("COMBINED", 3, 3);
         q = var2;
         r = new a[]{var0, var3, var1, var2};
      }

      private a(int var3) {
         this.m = var3;
      }

      public int d() {
         return this.m;
      }
   }
}
