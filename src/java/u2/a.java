package u2;

public enum a {
   n,
   o;

   public static final a[] p;
   private static final a[] q;
   public final String m;

   static {
      a var0 = new a("AD_STORAGE", 0, "ad_storage");
      n = var0;
      a var1 = new a("ANALYTICS_STORAGE", 1, "analytics_storage");
      o = var1;
      q = new a[]{var0, var1};
      p = new a[]{var0, var1};
   }

   private a(String var3) {
      this.m = var3;
   }
}
