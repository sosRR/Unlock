package e2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class m {
   public static boolean a(Object var0, Object var1) {
      boolean var3 = true;
      boolean var2 = var3;
      if (var0 != var1) {
         if (var0 != null) {
            if (!var0.equals(var1)) {
               return false;
            }

            var2 = var3;
         } else {
            var2 = false;
         }
      }

      return var2;
   }

   public static int b(Object... var0) {
      return Arrays.hashCode(var0);
   }

   public static a c(Object var0) {
      return new a(var0, (s0)null);
   }

   public static final class a {
      private final List a;
      private final Object b;

      // $FF: synthetic method
      a(Object var1, s0 var2) {
         n.i(var1);
         this.b = var1;
         this.a = new ArrayList();
      }

      public a a(String var1, Object var2) {
         List var4 = this.a;
         n.i(var1);
         String var5 = String.valueOf(var2);
         int var3 = var5.length();
         StringBuilder var6 = new StringBuilder(var1.length() + 1 + var3);
         var6.append(var1);
         var6.append("=");
         var6.append(var5);
         var4.add(var6.toString());
         return this;
      }

      public String toString() {
         StringBuilder var3 = new StringBuilder(100);
         var3.append(this.b.getClass().getSimpleName());
         var3.append('{');
         int var2 = this.a.size();

         for(int var1 = 0; var1 < var2; ++var1) {
            var3.append((String)this.a.get(var1));
            if (var1 < var2 - 1) {
               var3.append(", ");
            }
         }

         var3.append('}');
         return var3.toString();
      }
   }
}
