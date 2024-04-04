package n;

public class h implements Cloneable {
   private static final Object q = new Object();
   private boolean m;
   private int[] n;
   private Object[] o;
   private int p;

   public h() {
      this(10);
   }

   public h(int var1) {
      this.m = false;
      if (var1 == 0) {
         this.n = c.a;
         this.o = c.c;
      } else {
         var1 = c.e(var1);
         this.n = new int[var1];
         this.o = new Object[var1];
      }

   }

   private void h() {
      int var4 = this.p;
      int[] var6 = this.n;
      Object[] var7 = this.o;
      int var2 = 0;

      int var1;
      int var3;
      for(var1 = 0; var2 < var4; var1 = var3) {
         Object var5 = var7[var2];
         var3 = var1;
         if (var5 != q) {
            if (var2 != var1) {
               var6[var1] = var6[var2];
               var7[var1] = var5;
               var7[var2] = null;
            }

            var3 = var1 + 1;
         }

         ++var2;
      }

      this.m = false;
      this.p = var1;
   }

   public void a(int var1, Object var2) {
      int var3 = this.p;
      if (var3 != 0 && var1 <= this.n[var3 - 1]) {
         this.m(var1, var2);
      } else {
         if (this.m && var3 >= this.n.length) {
            this.h();
         }

         var3 = this.p;
         if (var3 >= this.n.length) {
            int var4 = c.e(var3 + 1);
            int[] var6 = new int[var4];
            Object[] var5 = new Object[var4];
            int[] var7 = this.n;
            System.arraycopy(var7, 0, var6, 0, var7.length);
            Object[] var8 = this.o;
            System.arraycopy(var8, 0, var5, 0, var8.length);
            this.n = var6;
            this.o = var5;
         }

         this.n[var3] = var1;
         this.o[var3] = var2;
         this.p = var3 + 1;
      }
   }

   public void d() {
      int var2 = this.p;
      Object[] var3 = this.o;

      for(int var1 = 0; var1 < var2; ++var1) {
         var3[var1] = null;
      }

      this.p = 0;
      this.m = false;
   }

   public h e() {
      try {
         h var1 = (h)super.clone();
         var1.n = (int[])this.n.clone();
         var1.o = (Object[])this.o.clone();
         return var1;
      } catch (CloneNotSupportedException var2) {
         throw new AssertionError(var2);
      }
   }

   public Object i(int var1) {
      return this.j(var1, (Object)null);
   }

   public Object j(int var1, Object var2) {
      var1 = c.a(this.n, this.p, var1);
      if (var1 >= 0) {
         Object var3 = this.o[var1];
         if (var3 != q) {
            return var3;
         }
      }

      return var2;
   }

   public int k(Object var1) {
      if (this.m) {
         this.h();
      }

      for(int var2 = 0; var2 < this.p; ++var2) {
         if (this.o[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   public int l(int var1) {
      if (this.m) {
         this.h();
      }

      return this.n[var1];
   }

   public void m(int var1, Object var2) {
      int var3 = c.a(this.n, this.p, var1);
      if (var3 >= 0) {
         this.o[var3] = var2;
      } else {
         int var4 = ~var3;
         int var5 = this.p;
         Object[] var6;
         if (var4 < var5) {
            var6 = this.o;
            if (var6[var4] == q) {
               this.n[var4] = var1;
               var6[var4] = var2;
               return;
            }
         }

         var3 = var4;
         if (this.m) {
            var3 = var4;
            if (var5 >= this.n.length) {
               this.h();
               var3 = ~c.a(this.n, this.p, var1);
            }
         }

         var4 = this.p;
         int[] var9;
         if (var4 >= this.n.length) {
            var4 = c.e(var4 + 1);
            var9 = new int[var4];
            Object[] var7 = new Object[var4];
            int[] var8 = this.n;
            System.arraycopy(var8, 0, var9, 0, var8.length);
            Object[] var10 = this.o;
            System.arraycopy(var10, 0, var7, 0, var10.length);
            this.n = var9;
            this.o = var7;
         }

         var5 = this.p;
         if (var5 - var3 != 0) {
            var9 = this.n;
            var4 = var3 + 1;
            System.arraycopy(var9, var3, var9, var4, var5 - var3);
            var6 = this.o;
            System.arraycopy(var6, var3, var6, var4, this.p - var3);
         }

         this.n[var3] = var1;
         this.o[var3] = var2;
         ++this.p;
      }

   }

   public int n() {
      if (this.m) {
         this.h();
      }

      return this.p;
   }

   public Object o(int var1) {
      if (this.m) {
         this.h();
      }

      return this.o[var1];
   }

   public String toString() {
      if (this.n() <= 0) {
         return "{}";
      } else {
         StringBuilder var3 = new StringBuilder(this.p * 28);
         var3.append('{');

         for(int var1 = 0; var1 < this.p; ++var1) {
            if (var1 > 0) {
               var3.append(", ");
            }

            var3.append(this.l(var1));
            var3.append('=');
            Object var2 = this.o(var1);
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
