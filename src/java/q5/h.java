package q5;

import java.lang.reflect.Method;

final class h {
   public static final h a = new h();
   private static final a b = new a((Method)null, (Method)null, (Method)null);
   private static a c;

   private h() {
   }

   private final a a(q5.a var1) {
      a var6;
      try {
         Method var3 = Class.class.getDeclaredMethod("getModule", new Class[0]);
         Method var2 = var1.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]);
         Method var4 = var1.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]);
         var6 = new a(var3, var2, var4);
         c = var6;
         return var6;
      } catch (Exception var5) {
         var6 = b;
         c = var6;
         return var6;
      }
   }

   public final String b(q5.a var1) {
      x5.g.e(var1, "continuation");
      a var3 = c;
      a var2 = var3;
      if (var3 == null) {
         var2 = this.a(var1);
      }

      a var4 = b;
      var3 = null;
      if (var2 == var4) {
         return null;
      } else {
         Method var8 = var2.a;
         Object var5;
         if (var8 != null) {
            var5 = var8.invoke(var1.getClass(), new Object[0]);
         } else {
            var5 = null;
         }

         if (var5 == null) {
            return null;
         } else {
            var8 = var2.b;
            if (var8 != null) {
               var5 = var8.invoke(var5, new Object[0]);
            } else {
               var5 = null;
            }

            if (var5 == null) {
               return null;
            } else {
               Method var6 = var2.c;
               if (var6 != null) {
                  var5 = var6.invoke(var5, new Object[0]);
               } else {
                  var5 = null;
               }

               String var7 = var3;
               if (var5 instanceof String) {
                  var7 = (String)var5;
               }

               return var7;
            }
         }
      }
   }

   private static final class a {
      public final Method a;
      public final Method b;
      public final Method c;

      public a(Method var1, Method var2, Method var3) {
         this.a = var1;
         this.b = var2;
         this.c = var3;
      }
   }
}
