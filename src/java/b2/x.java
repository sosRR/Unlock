package b2;

import android.content.Context;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import e2.p0;
import e2.q0;
import java.security.MessageDigest;

final class x {
   static final v a = new p(t.m("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"));
   static final v b = new q(t.m("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"));
   static final v c = new r(t.m("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"));
   static final v d = new s(t.m("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"));
   private static volatile q0 e;
   private static final Object f = new Object();
   private static Context g;

   static h0 a(String var0, t var1, boolean var2, boolean var3) {
      StrictMode.ThreadPolicy var4 = StrictMode.allowThreadDiskReads();

      h0 var7;
      try {
         var7 = f(var0, var1, var2, var3);
      } finally {
         StrictMode.setThreadPolicy(var4);
      }

      return var7;
   }

   static h0 b(String param0, boolean param1, boolean param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   // $FF: synthetic method
   static String c(boolean var0, String var1, t var2) {
      boolean var3;
      if (!var0 && f(var1, var2, true, false).a) {
         var3 = true;
      } else {
         var3 = false;
      }

      String var4;
      if (!var3) {
         var4 = "not allowed";
      } else {
         var4 = "debug cert rejected";
      }

      MessageDigest var5 = i2.a.b("SHA-1");
      e2.n.i(var5);
      return String.format("%s: pkg=%s, sha1=%s, atk=%s, ver=%s", new Object[]{var4, var1, i2.i.a(var5.digest(var2.l0())), var0, "12451000.false"});
   }

   static void d(Context var0) {
      Class var1 = x.class;
      synchronized(x.class){}

      Throwable var10000;
      label143: {
         boolean var10001;
         label144: {
            try {
               if (g == null) {
                  break label144;
               }
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label143;
            }

            try {
               Log.w("GoogleCertificates", "GoogleCertificates has been initialized already");
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               break label143;
            }

            return;
         }

         if (var0 == null) {
            return;
         }

         try {
            g = var0.getApplicationContext();
         } catch (Throwable var11) {
            var10000 = var11;
            var10001 = false;
            break label143;
         }

         return;
      }

      Throwable var14 = var10000;
      throw var14;
   }

   static boolean e() {
      StrictMode.ThreadPolicy var2 = StrictMode.allowThreadDiskReads();

      try {
         Object var1;
         try {
            g();
            boolean var0 = e.g();
            return var0;
         } catch (DynamiteModule.LoadingException var6) {
            var1 = var6;
         } catch (RemoteException var7) {
            var1 = var7;
         }

         Log.e("GoogleCertificates", "Failed to get Google certificates from remote", (Throwable)var1);
      } finally {
         StrictMode.setThreadPolicy(var2);
      }

      return false;
   }

   private static h0 f(String var0, t var1, boolean var2, boolean var3) {
      try {
         g();
      } catch (DynamiteModule.LoadingException var6) {
         Log.e("GoogleCertificates", "Failed to get Google certificates from remote", var6);
         var0 = String.valueOf(var6.getMessage());
         if (var0.length() != 0) {
            var0 = "module init: ".concat(var0);
         } else {
            var0 = new String("module init: ");
         }

         return h0.d(var0, var6);
      }

      e2.n.i(g);
      d0 var4 = new d0(var0, var1, var2, var3);

      try {
         var3 = e.y(var4, l2.b.l0(g.getPackageManager()));
      } catch (RemoteException var5) {
         Log.e("GoogleCertificates", "Failed to get Google certificates from remote", var5);
         return h0.d("module call", var5);
      }

      return (h0)(var3 ? h0.b() : new g0(new o(var2, var0, var1), (f0)null));
   }

   private static void g() {
      if (e == null) {
         e2.n.i(g);
         Object var0 = f;
         synchronized(var0){}

         Throwable var10000;
         boolean var10001;
         label136: {
            try {
               if (e == null) {
                  e = p0.h(DynamiteModule.d(g, DynamiteModule.f, "com.google.android.gms.googlecertificates").c("com.google.android.gms.common.GoogleCertificatesImpl"));
               }
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               break label136;
            }

            label133:
            try {
               return;
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label133;
            }
         }

         while(true) {
            Throwable var1 = var10000;

            try {
               throw var1;
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               continue;
            }
         }
      }
   }
}
