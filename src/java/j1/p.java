package j1;

import android.util.SparseArray;

public enum p {
   n,
   o,
   p,
   q,
   r,
   s;

   private static final SparseArray t;
   private static final p[] u;
   private final int m;

   static {
      p var0 = new p("DEFAULT", 0, 0);
      n = var0;
      p var1 = new p("UNMETERED_ONLY", 1, 1);
      o = var1;
      p var4 = new p("UNMETERED_OR_DAILY", 2, 2);
      p = var4;
      p var2 = new p("FAST_IF_RADIO_AWAKE", 3, 3);
      q = var2;
      p var5 = new p("NEVER", 4, 4);
      r = var5;
      p var6 = new p("UNRECOGNIZED", 5, -1);
      s = var6;
      u = new p[]{var0, var1, var4, var2, var5, var6};
      SparseArray var3 = new SparseArray();
      t = var3;
      var3.put(0, var0);
      var3.put(1, var1);
      var3.put(2, var4);
      var3.put(3, var2);
      var3.put(4, var5);
      var3.put(-1, var6);
   }

   private p(int var3) {
      this.m = var3;
   }
}
