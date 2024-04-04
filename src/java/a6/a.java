package a6;

import n5.v;

public class a implements Iterable {
   public static final a6.a.a p = new a6.a.a((x5.e)null);
   private final int m;
   private final int n;
   private final int o;

   public a(int var1, int var2, int var3) {
      if (var3 != 0) {
         if (var3 != Integer.MIN_VALUE) {
            this.m = var1;
            this.n = r5.c.b(var1, var2, var3);
            this.o = var3;
         } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
         }
      } else {
         throw new IllegalArgumentException("Step must be non-zero.");
      }
   }

   public final int d() {
      return this.m;
   }

   public boolean equals(Object var1) {
      boolean var3;
      label29: {
         if (var1 instanceof a6.a) {
            if (this.isEmpty() && ((a6.a)var1).isEmpty()) {
               break label29;
            }

            int var2 = this.m;
            a6.a var4 = (a6.a)var1;
            if (var2 == var4.m && this.n == var4.n && this.o == var4.o) {
               break label29;
            }
         }

         var3 = false;
         return var3;
      }

      var3 = true;
      return var3;
   }

   public final int g() {
      return this.n;
   }

   public final int h() {
      return this.o;
   }

   public int hashCode() {
      int var1;
      if (this.isEmpty()) {
         var1 = -1;
      } else {
         var1 = (this.m * 31 + this.n) * 31 + this.o;
      }

      return var1;
   }

   public v i() {
      return new b(this.m, this.n, this.o);
   }

   public boolean isEmpty() {
      int var1 = this.o;
      boolean var2 = true;
      if (var1 > 0) {
         if (this.m > this.n) {
            return var2;
         }
      } else if (this.m < this.n) {
         return var2;
      }

      var2 = false;
      return var2;
   }

   public String toString() {
      int var1;
      StringBuilder var2;
      if (this.o > 0) {
         var2 = new StringBuilder();
         var2.append(this.m);
         var2.append("..");
         var2.append(this.n);
         var2.append(" step ");
         var1 = this.o;
      } else {
         var2 = new StringBuilder();
         var2.append(this.m);
         var2.append(" downTo ");
         var2.append(this.n);
         var2.append(" step ");
         var1 = -this.o;
      }

      var2.append(var1);
      return var2.toString();
   }

   public static final class a {
      private a() {
      }

      // $FF: synthetic method
      public a(x5.e var1) {
         this();
      }

      public final a6.a a(int var1, int var2, int var3) {
         return new a6.a(var1, var2, var3);
      }
   }
}
