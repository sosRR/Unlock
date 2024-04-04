package k1;

import android.content.Context;
import java.util.Collections;
import java.util.Set;

public class t implements s {
   private static volatile u e;
   private final v1.a a;
   private final v1.a b;
   private final r1.e c;
   private final s1.r d;

   t(v1.a var1, v1.a var2, r1.e var3, s1.r var4, s1.v var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      var5.c();
   }

   private i b(n var1) {
      return i.a().i(this.a.a()).k(this.b.a()).j(var1.g()).h(new h(var1.b(), var1.d())).g(var1.c().a()).d();
   }

   public static t c() {
      u var0 = e;
      if (var0 != null) {
         return var0.f();
      } else {
         throw new IllegalStateException("Not initialized!");
      }
   }

   private static Set d(f var0) {
      return var0 instanceof g ? Collections.unmodifiableSet(((g)var0).a()) : Collections.singleton(i1.b.b("proto"));
   }

   public static void f(Context var0) {
      if (e == null) {
         Class var1 = t.class;
         synchronized(t.class){}

         Throwable var10000;
         boolean var10001;
         label144: {
            try {
               if (e == null) {
                  e = k1.e.g().a(var0).build();
               }
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label144;
            }

            label141:
            try {
               return;
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               break label141;
            }
         }

         while(true) {
            Throwable var14 = var10000;

            try {
               throw var14;
            } catch (Throwable var11) {
               var10000 = var11;
               var10001 = false;
               continue;
            }
         }
      }
   }

   public void a(n var1, i1.h var2) {
      this.c.a(var1.f().f(var1.c().c()), this.b(var1), var2);
   }

   public s1.r e() {
      return this.d;
   }

   public i1.g g(f var1) {
      return new p(d(var1), o.a().b(var1.getName()).c(var1.getExtras()).a(), this);
   }
}
