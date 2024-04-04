package b4;

public enum s {
   n,
   o,
   p,
   q;

   private static final s[] r;
   private final int m;

   static {
      s var2 = new s("DEVELOPER", 0, 1);
      n = var2;
      s var1 = new s("USER_SIDELOAD", 1, 2);
      o = var1;
      s var3 = new s("TEST_DISTRIBUTION", 2, 3);
      p = var3;
      s var0 = new s("APP_STORE", 3, 4);
      q = var0;
      r = new s[]{var2, var1, var3, var0};
   }

   private s(int var3) {
      this.m = var3;
   }

   public static s d(String var0) {
      s var1;
      if (var0 != null) {
         var1 = q;
      } else {
         var1 = n;
      }

      return var1;
   }

   public int e() {
      return this.m;
   }

   public String toString() {
      return Integer.toString(this.m);
   }
}
