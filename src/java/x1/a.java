package x1;

import android.content.Context;
import android.os.SystemClock;
import e2.n;
import java.util.HashMap;
import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.concurrent.GuardedBy;
import n2.f;

@ParametersAreNonnullByDefault
public class a {
   @GuardedBy("this")
   b2.a a;
   @GuardedBy("this")
   f b;
   @GuardedBy("this")
   boolean c;
   final Object d = new Object();
   @GuardedBy("mAutoDisconnectTaskLock")
   c e;
   @GuardedBy("this")
   private final Context f;
   final long g;

   public a(Context var1, long var2, boolean var4, boolean var5) {
      n.i(var1);
      Context var6 = var1;
      if (var4) {
         Context var7 = var1.getApplicationContext();
         var6 = var1;
         if (var7 != null) {
            var6 = var7;
         }
      }

      this.f = var6;
      this.c = false;
      this.g = var2;
   }

   public static x1.a.a a(Context var0) {
      x1.a var10 = new x1.a(var0, -1L, true, false);

      x1.a.a var11;
      try {
         long var1 = SystemClock.elapsedRealtime();
         var10.d(false);
         var11 = var10.f(-1);
         var10.e(var11, true, 0.0F, SystemClock.elapsedRealtime() - var1, "", (Throwable)null);
      } catch (Throwable var9) {
         Throwable var3 = var9;

         try {
            var10.e((x1.a.a)null, true, 0.0F, -1L, "", var3);
            throw var3;
         } finally {
            var10.c();
         }
      }

      var10.c();
      return var11;
   }

   public static void b(boolean var0) {
   }

   private final x1.a.a f(int param1) {
      // $FF: Couldn't be decompiled
   }

   private final void g() {
      // $FF: Couldn't be decompiled
   }

   public final void c() {
      n.h("Calling this from your main thread can lead to deadlock");
      synchronized(this){}

      Throwable var10000;
      boolean var10001;
      label270: {
         label269: {
            b2.a var1;
            try {
               if (this.f == null) {
                  break label269;
               }

               var1 = this.a;
            } catch (Throwable var32) {
               var10000 = var32;
               var10001 = false;
               break label270;
            }

            if (var1 != null) {
               label256:
               try {
                  if (this.c) {
                     h2.b.b().c(this.f, this.a);
                  }
               } finally {
                  break label256;
               }

               try {
                  this.c = false;
                  this.b = null;
                  this.a = null;
                  return;
               } catch (Throwable var30) {
                  var10000 = var30;
                  var10001 = false;
                  break label270;
               }
            }
         }

         label262:
         try {
            return;
         } catch (Throwable var31) {
            var10000 = var31;
            var10001 = false;
            break label262;
         }
      }

      while(true) {
         Throwable var33 = var10000;

         try {
            throw var33;
         } catch (Throwable var28) {
            var10000 = var28;
            var10001 = false;
            continue;
         }
      }
   }

   protected final void d(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   final boolean e(x1.a.a var1, boolean var2, float var3, long var4, String var6, Throwable var7) {
      if (!(Math.random() > 0.0)) {
         HashMap var8 = new HashMap();
         var6 = "1";
         var8.put("app_context", "1");
         if (var1 != null) {
            if (!var1.b()) {
               var6 = "0";
            }

            var8.put("limit_ad_tracking", var6);
            String var9 = var1.a();
            if (var9 != null) {
               var8.put("ad_id_size", Integer.toString(var9.length()));
            }
         }

         if (var7 != null) {
            var8.put("error", var7.getClass().getName());
         }

         var8.put("tag", "AdvertisingIdClient");
         var8.put("time_spent", Long.toString(var4));
         (new b(this, var8)).start();
         return true;
      } else {
         return false;
      }
   }

   protected final void finalize() {
      this.c();
      super.finalize();
   }

   public static final class a {
      private final String a;
      private final boolean b;

      @Deprecated
      public a(String var1, boolean var2) {
         this.a = var1;
         this.b = var2;
      }

      public String a() {
         return this.a;
      }

      public boolean b() {
         return this.b;
      }

      public String toString() {
         String var2 = this.a;
         boolean var1 = this.b;
         StringBuilder var3 = new StringBuilder(String.valueOf(var2).length() + 7);
         var3.append("{");
         var3.append(var2);
         var3.append("}");
         var3.append(var1);
         return var3.toString();
      }
   }
}
