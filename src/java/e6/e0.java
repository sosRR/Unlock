package e6;

public final class e0 {
   public static final void a(d0 var0, int var1) {
      o5.d var4 = var0.e();
      boolean var2;
      if (var1 == 4) {
         var2 = true;
      } else {
         var2 = false;
      }

      if (!var2 && var4 instanceof kotlinx.coroutines.internal.d && b(var1) == b(var0.o)) {
         s var3 = ((kotlinx.coroutines.internal.d)var4).p;
         o5.f var5 = var4.c();
         if (var3.O(var5)) {
            var3.N(var5, var0);
         } else {
            e(var0);
         }
      } else {
         d(var0, var4, var2);
      }

   }

   public static final boolean b(int var0) {
      boolean var2 = true;
      boolean var1 = var2;
      if (var0 != 1) {
         if (var0 == 2) {
            var1 = var2;
         } else {
            var1 = false;
         }
      }

      return var1;
   }

   public static final boolean c(int var0) {
      boolean var1;
      if (var0 == 2) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public static final void d(d0 var0, o5.d var1, boolean var2) {
      Object var3 = var0.i();
      Throwable var4 = var0.f(var3);
      Object var9;
      if (var4 != null) {
         m5.j.a var8 = m5.j.m;
         var9 = m5.k.a(var4);
      } else {
         m5.j.a var14 = m5.j.m;
         var9 = var0.g(var3);
      }

      var3 = m5.j.a(var9);
      if (var2) {
         kotlinx.coroutines.internal.d var5 = (kotlinx.coroutines.internal.d)var1;
         o5.d var11 = var5.q;
         Object var15 = var5.s;
         o5.f var10 = var11.c();
         var15 = kotlinx.coroutines.internal.a0.c(var10, var15);
         i1 var12;
         if (var15 != kotlinx.coroutines.internal.a0.a) {
            var12 = r.c(var11, var10, var15);
         } else {
            var12 = null;
         }

         try {
            var5.q.d(var3);
            m5.o var13 = m5.o.a;
         } finally {
            if (var12 == null || var12.m0()) {
               kotlinx.coroutines.internal.a0.a(var10, var15);
            }

         }
      } else {
         var1.d(var3);
      }

   }

   private static final void e(d0 var0) {
      i0 var2 = g1.a.a();
      if (var2.W()) {
         var2.S(var0);
      } else {
         var2.U(true);

         Throwable var10000;
         label127: {
            boolean var10001;
            try {
               d(var0, var0.e(), true);
            } catch (Throwable var15) {
               var10000 = var15;
               var10001 = false;
               break label127;
            }

            while(true) {
               boolean var1;
               try {
                  var1 = var2.Y();
               } catch (Throwable var14) {
                  var10000 = var14;
                  var10001 = false;
                  break;
               }

               if (!var1) {
                  return;
               }
            }
         }

         Throwable var3 = var10000;

         try {
            var0.h(var3, (Throwable)null);
         } finally {
            var2.Q(true);
         }
      }

   }
}
