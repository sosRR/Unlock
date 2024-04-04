package r1;

import java.util.concurrent.Executor;
import java.util.logging.Logger;
import k1.o;
import k1.t;
import l1.m;
import s1.x;

public class c implements e {
   private static final Logger f = Logger.getLogger(t.class.getName());
   private final x a;
   private final Executor b;
   private final l1.e c;
   private final t1.d d;
   private final u1.a e;

   public c(Executor var1, l1.e var2, x var3, t1.d var4, u1.a var5) {
      this.b = var1;
      this.c = var2;
      this.a = var3;
      this.d = var4;
      this.e = var5;
   }

   // $FF: synthetic method
   public static void b(c var0, o var1, i1.h var2, k1.i var3) {
      var0.e(var1, var2, var3);
   }

   // $FF: synthetic method
   public static Object c(c var0, o var1, k1.i var2) {
      return var0.d(var1, var2);
   }

   // $FF: synthetic method
   private Object d(o var1, k1.i var2) {
      this.d.p(var1, var2);
      this.a.a(var1, 1);
      return null;
   }

   // $FF: synthetic method
   private void e(o var1, i1.h var2, k1.i var3) {
      Exception var10000;
      label27: {
         m var4;
         boolean var10001;
         try {
            var4 = this.c.a(var1.b());
         } catch (Exception var8) {
            var10000 = var8;
            var10001 = false;
            break label27;
         }

         if (var4 == null) {
            try {
               String var11 = String.format("Transport backend '%s' is not registered", new Object[]{var1.b()});
               f.warning(var11);
               IllegalArgumentException var9 = new IllegalArgumentException(var11);
               var2.a(var9);
               return;
            } catch (Exception var6) {
               var10000 = var6;
               var10001 = false;
            }
         } else {
            try {
               k1.i var15 = var4.b(var3);
               u1.a var5 = this.e;
               b var13 = new b(this, var1, var15);
               var5.k(var13);
               var2.a((Exception)null);
               return;
            } catch (Exception var7) {
               var10000 = var7;
               var10001 = false;
            }
         }
      }

      Exception var12 = var10000;
      Logger var10 = f;
      StringBuilder var14 = new StringBuilder();
      var14.append("Error scheduling event ");
      var14.append(var12.getMessage());
      var10.warning(var14.toString());
      var2.a(var12);
   }

   public void a(o var1, k1.i var2, i1.h var3) {
      this.b.execute(new a(this, var1, var3, var2));
   }
}
