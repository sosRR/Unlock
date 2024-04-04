package m5;

public final class c implements Comparable {
   public static final a q = new a((x5.e)null);
   public static final c r = d.a();
   private final int m;
   private final int n;
   private final int o;
   private final int p;

   public c(int var1, int var2, int var3) {
      this.m = var1;
      this.n = var2;
      this.o = var3;
      this.p = this.e(var1, var2, var3);
   }

   private final int e(int var1, int var2, int var3) {
      boolean var5 = false;
      boolean var4 = var5;
      if ((new a6.c(0, 255)).k(var1)) {
         var4 = var5;
         if ((new a6.c(0, 255)).k(var2)) {
            var4 = var5;
            if ((new a6.c(0, 255)).k(var3)) {
               var4 = true;
            }
         }
      }

      if (var4) {
         return (var1 << 16) + (var2 << 8) + var3;
      } else {
         StringBuilder var6 = new StringBuilder();
         var6.append("Version components are out of range: ");
         var6.append(var1);
         var6.append('.');
         var6.append(var2);
         var6.append('.');
         var6.append(var3);
         throw new IllegalArgumentException(var6.toString().toString());
      }
   }

   public int d(c var1) {
      x5.g.e(var1, "other");
      return this.p - var1.p;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this == var1) {
         return true;
      } else {
         c var3;
         if (var1 instanceof c) {
            var3 = (c)var1;
         } else {
            var3 = null;
         }

         if (var3 == null) {
            return false;
         } else {
            if (this.p != var3.p) {
               var2 = false;
            }

            return var2;
         }
      }
   }

   public int hashCode() {
      return this.p;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.m);
      var1.append('.');
      var1.append(this.n);
      var1.append('.');
      var1.append(this.o);
      return var1.toString();
   }

   public static final class a {
      private a() {
      }

      // $FF: synthetic method
      public a(x5.e var1) {
         this();
      }
   }
}
