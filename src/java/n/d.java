package n;

public class d implements Cloneable {
   private static final Object q = new Object();
   private boolean m;
   private long[] n;
   private Object[] o;
   private int p;

   public d() {
      this(10);
   }

   public d(int var1) {
      this.m = false;
      if (var1 == 0) {
         this.n = c.b;
         this.o = c.c;
      } else {
         var1 = c.f(var1);
         this.n = new long[var1];
         this.o = new Object[var1];
      }

   }

   private void e() {
      int var4 = this.p;
      long[] var6 = this.n;
      Object[] var5 = this.o;
      int var1 = 0;

      int var2;
      int var3;
      for(var2 = 0; var1 < var4; var2 = var3) {
         Object var7 = var5[var1];
         var3 = var2;
         if (var7 != q) {
            if (var1 != var2) {
               var6[var2] = var6[var1];
               var5[var2] = var7;
               var5[var1] = null;
            }

            var3 = var2 + 1;
         }

         ++var1;
      }

      this.m = false;
      this.p = var2;
   }

   public void a() {
      int var2 = this.p;
      Object[] var3 = this.o;

      for(int var1 = 0; var1 < var2; ++var1) {
         var3[var1] = null;
      }

      this.p = 0;
      this.m = false;
   }

   public d d() {
      try {
         d var1 = (d)super.clone();
         var1.n = (long[])this.n.clone();
         var1.o = (Object[])this.o.clone();
         return var1;
      } catch (CloneNotSupportedException var2) {
         throw new AssertionError(var2);
      }
   }

   public Object h(long var1) {
      return this.i(var1, (Object)null);
   }

   public Object i(long var1, Object var3) {
      int var4 = c.b(this.n, this.p, var1);
      if (var4 >= 0) {
         Object var5 = this.o[var4];
         if (var5 != q) {
            return var5;
         }
      }

      return var3;
   }

   public int j(long var1) {
      if (this.m) {
         this.e();
      }

      return c.b(this.n, this.p, var1);
   }

   public long k(int var1) {
      if (this.m) {
         this.e();
      }

      return this.n[var1];
   }

   public void l(long var1, Object var3) {
      int var4 = c.b(this.n, this.p, var1);
      if (var4 >= 0) {
         this.o[var4] = var3;
      } else {
         int var5 = ~var4;
         int var6 = this.p;
         Object[] var7;
         if (var5 < var6) {
            var7 = this.o;
            if (var7[var5] == q) {
               this.n[var5] = var1;
               var7[var5] = var3;
               return;
            }
         }

         var4 = var5;
         if (this.m) {
            var4 = var5;
            if (var6 >= this.n.length) {
               this.e();
               var4 = ~c.b(this.n, this.p, var1);
            }
         }

         var5 = this.p;
         long[] var10;
         if (var5 >= this.n.length) {
            var5 = c.f(var5 + 1);
            var10 = new long[var5];
            Object[] var8 = new Object[var5];
            long[] var9 = this.n;
            System.arraycopy(var9, 0, var10, 0, var9.length);
            Object[] var11 = this.o;
            System.arraycopy(var11, 0, var8, 0, var11.length);
            this.n = var10;
            this.o = var8;
         }

         var5 = this.p;
         if (var5 - var4 != 0) {
            var10 = this.n;
            var6 = var4 + 1;
            System.arraycopy(var10, var4, var10, var6, var5 - var4);
            var7 = this.o;
            System.arraycopy(var7, var4, var7, var6, this.p - var4);
         }

         this.n[var4] = var1;
         this.o[var4] = var3;
         ++this.p;
      }

   }

   public void m(long var1) {
      int var3 = c.b(this.n, this.p, var1);
      if (var3 >= 0) {
         Object[] var6 = this.o;
         Object var4 = var6[var3];
         Object var5 = q;
         if (var4 != var5) {
            var6[var3] = var5;
            this.m = true;
         }
      }

   }

   public void n(int var1) {
      Object[] var4 = this.o;
      Object var3 = var4[var1];
      Object var2 = q;
      if (var3 != var2) {
         var4[var1] = var2;
         this.m = true;
      }

   }

   public int o() {
      if (this.m) {
         this.e();
      }

      return this.p;
   }

   public Object p(int var1) {
      if (this.m) {
         this.e();
      }

      return this.o[var1];
   }

   public String toString() {
      if (this.o() <= 0) {
         return "{}";
      } else {
         StringBuilder var3 = new StringBuilder(this.p * 28);
         var3.append('{');

         for(int var1 = 0; var1 < this.p; ++var1) {
            if (var1 > 0) {
               var3.append(", ");
            }

            var3.append(this.k(var1));
            var3.append('=');
            Object var2 = this.p(var1);
            if (var2 != this) {
               var3.append(var2);
            } else {
               var3.append("(this Map)");
            }
         }

         var3.append('}');
         return var3.toString();
      }
   }
}
