package o;

import java.util.Arrays;
import java.util.HashSet;

public class i implements Comparable {
   private static int D;
   int A = -1;
   float B = 0.0F;
   HashSet C = null;
   public boolean m;
   private String n;
   public int o = -1;
   int p = -1;
   public int q = 0;
   public float r;
   public boolean s = false;
   float[] t = new float[9];
   float[] u = new float[9];
   a v;
   b[] w = new b[16];
   int x = 0;
   public int y = 0;
   boolean z = false;

   public i(a var1, String var2) {
      this.v = var1;
   }

   static void f() {
      ++D;
   }

   public final void d(b var1) {
      int var2 = 0;

      while(true) {
         int var3 = this.x;
         if (var2 >= var3) {
            b[] var4 = this.w;
            if (var3 >= var4.length) {
               this.w = (b[])Arrays.copyOf(var4, var4.length * 2);
            }

            var4 = this.w;
            var2 = this.x;
            var4[var2] = var1;
            this.x = var2 + 1;
            return;
         }

         if (this.w[var2] == var1) {
            return;
         }

         ++var2;
      }
   }

   public int e(i var1) {
      return this.o - var1.o;
   }

   public final void g(b var1) {
      int var4 = this.x;

      for(int var2 = 0; var2 < var4; ++var2) {
         if (this.w[var2] == var1) {
            while(var2 < var4 - 1) {
               b[] var5 = this.w;
               int var3 = var2 + 1;
               var5[var2] = var5[var3];
               var2 = var3;
            }

            --this.x;
            return;
         }
      }

   }

   public void h() {
      this.n = null;
      this.v = i.a.q;
      this.q = 0;
      this.o = -1;
      this.p = -1;
      this.r = 0.0F;
      this.s = false;
      this.z = false;
      this.A = -1;
      this.B = 0.0F;
      int var2 = this.x;

      for(int var1 = 0; var1 < var2; ++var1) {
         this.w[var1] = null;
      }

      this.x = 0;
      this.y = 0;
      this.m = false;
      Arrays.fill(this.u, 0.0F);
   }

   public void i(d var1, float var2) {
      this.r = var2;
      this.s = true;
      this.z = false;
      this.A = -1;
      this.B = 0.0F;
      int var4 = this.x;
      this.p = -1;

      for(int var3 = 0; var3 < var4; ++var3) {
         this.w[var3].A(var1, this, false);
      }

      this.x = 0;
   }

   public void j(a var1, String var2) {
      this.v = var1;
   }

   public final void k(d var1, b var2) {
      int var4 = this.x;

      for(int var3 = 0; var3 < var4; ++var3) {
         this.w[var3].B(var1, var2, false);
      }

      this.x = 0;
   }

   public String toString() {
      StringBuilder var1;
      String var2;
      if (this.n != null) {
         var1 = new StringBuilder();
         var1.append("");
         var1.append(this.n);
         var2 = var1.toString();
      } else {
         var1 = new StringBuilder();
         var1.append("");
         var1.append(this.o);
         var2 = var1.toString();
      }

      return var2;
   }

   public static enum a {
      m,
      n,
      o,
      p,
      q;

      private static final a[] r;

      static {
         a var0 = new a("UNRESTRICTED", 0);
         m = var0;
         a var3 = new a("CONSTANT", 1);
         n = var3;
         a var1 = new a("SLACK", 2);
         o = var1;
         a var4 = new a("ERROR", 3);
         p = var4;
         a var2 = new a("UNKNOWN", 4);
         q = var2;
         r = new a[]{var0, var3, var1, var4, var2};
      }
   }
}
