package m0;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import q0.e;

public class c implements e, q0.d {
   static final TreeMap u = new TreeMap();
   private volatile String m;
   final long[] n;
   final double[] o;
   final String[] p;
   final byte[][] q;
   private final int[] r;
   final int s;
   int t;

   private c(int var1) {
      this.s = var1++;
      this.r = new int[var1];
      this.n = new long[var1];
      this.o = new double[var1];
      this.p = new String[var1];
      this.q = new byte[var1][];
   }

   public static c g(String var0, int var1) {
      TreeMap var2 = u;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label173: {
         Map.Entry var3;
         try {
            var3 = var2.ceilingEntry(var1);
         } catch (Throwable var24) {
            var10000 = var24;
            var10001 = false;
            break label173;
         }

         if (var3 != null) {
            label166:
            try {
               var2.remove(var3.getKey());
               c var27 = (c)var3.getValue();
               var27.k(var0, var1);
               return var27;
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label166;
            }
         } else {
            label169: {
               try {
                  ;
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label169;
               }

               c var26 = new c(var1);
               var26.k(var0, var1);
               return var26;
            }
         }
      }

      while(true) {
         Throwable var25 = var10000;

         try {
            throw var25;
         } catch (Throwable var21) {
            var10000 = var21;
            var10001 = false;
            continue;
         }
      }
   }

   private static void l() {
      TreeMap var1 = u;
      if (var1.size() > 15) {
         int var0 = var1.size() - 10;

         for(Iterator var2 = var1.descendingKeySet().iterator(); var0 > 0; --var0) {
            var2.next();
            var2.remove();
         }
      }

   }

   public void B(int var1, long var2) {
      this.r[var1] = 2;
      this.n[var1] = var2;
   }

   public void F(int var1, byte[] var2) {
      this.r[var1] = 5;
      this.q[var1] = var2;
   }

   public String a() {
      return this.m;
   }

   public void close() {
   }

   public void f(q0.d var1) {
      for(int var2 = 1; var2 <= this.t; ++var2) {
         int var3 = this.r[var2];
         if (var3 != 1) {
            if (var3 != 2) {
               if (var3 != 3) {
                  if (var3 != 4) {
                     if (var3 == 5) {
                        var1.F(var2, this.q[var2]);
                     }
                  } else {
                     var1.j(var2, this.p[var2]);
                  }
               } else {
                  var1.s(var2, this.o[var2]);
               }
            } else {
               var1.B(var2, this.n[var2]);
            }
         } else {
            var1.q(var2);
         }
      }

   }

   public void j(int var1, String var2) {
      this.r[var1] = 4;
      this.p[var1] = var2;
   }

   void k(String var1, int var2) {
      this.m = var1;
      this.t = var2;
   }

   public void q(int var1) {
      this.r[var1] = 1;
   }

   public void s(int var1, double var2) {
      this.r[var1] = 3;
      this.o[var1] = var2;
   }

   public void x() {
      // $FF: Couldn't be decompiled
   }
}
