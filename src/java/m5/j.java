package m5;

import java.io.Serializable;

public final class j implements Serializable {
   public static final a m = new a((x5.e)null);

   public static Object a(Object var0) {
      return var0;
   }

   public static final Throwable b(Object var0) {
      Throwable var1;
      if (var0 instanceof b) {
         var1 = ((b)var0).m;
      } else {
         var1 = null;
      }

      return var1;
   }

   public static final boolean c(Object var0) {
      return var0 instanceof b;
   }

   public static final boolean d(Object var0) {
      return var0 instanceof b ^ true;
   }

   public static final class a {
      private a() {
      }

      // $FF: synthetic method
      public a(x5.e var1) {
         this();
      }
   }

   public static final class b implements Serializable {
      public final Throwable m;

      public b(Throwable var1) {
         x5.g.e(var1, "exception");
         super();
         this.m = var1;
      }

      public boolean equals(Object var1) {
         boolean var2;
         if (var1 instanceof b && x5.g.a(this.m, ((b)var1).m)) {
            var2 = true;
         } else {
            var2 = false;
         }

         return var2;
      }

      public int hashCode() {
         return this.m.hashCode();
      }

      public String toString() {
         StringBuilder var1 = new StringBuilder();
         var1.append("Failure(");
         var1.append(this.m);
         var1.append(')');
         return var1.toString();
      }
   }
}
