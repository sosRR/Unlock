package x3;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class d {
   private final t4.a a;
   private volatile z3.a b;
   private volatile a4.b c;
   private final List d;

   public d(t4.a var1) {
      this(var1, new a4.c(), new z3.f());
   }

   public d(t4.a var1, a4.b var2, z3.a var3) {
      this.a = var1;
      this.c = var2;
      this.d = new ArrayList();
      this.b = var3;
      this.f();
   }

   // $FF: synthetic method
   public static void a(d var0, t4.b var1) {
      var0.i(var1);
   }

   // $FF: synthetic method
   public static void b(d var0, String var1, Bundle var2) {
      var0.g(var1, var2);
   }

   // $FF: synthetic method
   public static void c(d var0, a4.a var1) {
      var0.h(var1);
   }

   private void f() {
      this.a.a(new c(this));
   }

   // $FF: synthetic method
   private void g(String var1, Bundle var2) {
      this.b.a(var1, var2);
   }

   // $FF: synthetic method
   private void h(a4.a var1) {
      synchronized(this){}

      Throwable var10000;
      boolean var10001;
      label122: {
         try {
            if (this.c instanceof a4.c) {
               this.d.add(var1);
            }
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label122;
         }

         label119:
         try {
            this.c.a(var1);
            return;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            break label119;
         }
      }

      while(true) {
         Throwable var15 = var10000;

         try {
            throw var15;
         } catch (Throwable var12) {
            var10000 = var12;
            var10001 = false;
            continue;
         }
      }
   }

   // $FF: synthetic method
   private void i(t4.b var1) {
      y3.f.f().b("AnalyticsConnector now available.");
      v3.a var2 = (v3.a)var1.get();
      z3.e var3 = new z3.e(var2);
      e var26 = new e();
      if (j(var2, var26) != null) {
         y3.f.f().b("Registered Firebase Analytics listener.");
         z3.d var28 = new z3.d();
         z3.c var29 = new z3.c(var3, 500, TimeUnit.MILLISECONDS);
         synchronized(this){}

         Throwable var10000;
         boolean var10001;
         label230: {
            Iterator var4;
            try {
               var4 = this.d.iterator();
            } catch (Throwable var24) {
               var10000 = var24;
               var10001 = false;
               break label230;
            }

            while(true) {
               try {
                  if (var4.hasNext()) {
                     var28.a((a4.a)var4.next());
                     continue;
                  }
               } catch (Throwable var25) {
                  var10000 = var25;
                  var10001 = false;
                  break;
               }

               try {
                  var26.d(var28);
                  var26.e(var29);
                  this.c = var28;
                  this.b = var29;
                  return;
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break;
               }
            }
         }

         while(true) {
            Throwable var27 = var10000;

            try {
               throw var27;
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               continue;
            }
         }
      } else {
         y3.f.f().k("Could not register Firebase Analytics listener; a listener is already registered.");
      }
   }

   private static v3.a.a j(v3.a var0, e var1) {
      v3.a.a var3 = var0.a("clx", var1);
      v3.a.a var2 = var3;
      if (var3 == null) {
         y3.f.f().b("Could not register AnalyticsConnectorListener with Crashlytics origin.");
         v3.a.a var4 = var0.a("crash", var1);
         var2 = var4;
         if (var4 != null) {
            y3.f.f().k("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            var2 = var4;
         }
      }

      return var2;
   }

   public z3.a d() {
      return new b(this);
   }

   public a4.b e() {
      return new a(this);
   }
}
