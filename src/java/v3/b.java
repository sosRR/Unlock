package v3;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.v2;
import com.google.firebase.analytics.connector.internal.f;
import e2.n;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class b implements v3.a {
   private static volatile v3.a c;
   final t2.a a;
   final Map b;

   b(t2.a var1) {
      n.i(var1);
      this.a = var1;
      this.b = new ConcurrentHashMap();
   }

   public static v3.a d(com.google.firebase.d var0, Context var1, q4.d var2) {
      n.i(var0);
      n.i(var1);
      n.i(var2);
      n.i(var1.getApplicationContext());
      if (c == null) {
         Class var4 = v3.b.class;
         synchronized(v3.b.class){}

         Throwable var10000;
         boolean var10001;
         label225: {
            label224: {
               Bundle var3;
               try {
                  if (c != null) {
                     break label224;
                  }

                  var3 = new Bundle(1);
                  if (var0.t()) {
                     var2.b(com.google.firebase.a.class, v3.c.m, d.a);
                     var3.putBoolean("dataCollectionDefaultEnabled", var0.s());
                  }
               } catch (Throwable var24) {
                  var10000 = var24;
                  var10001 = false;
                  break label225;
               }

               try {
                  v3.b var25 = new v3.b(v2.s(var1, (String)null, (String)null, (String)null, var3).p());
                  c = var25;
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label225;
               }
            }

            label217:
            try {
               return c;
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label217;
            }
         }

         while(true) {
            Throwable var26 = var10000;

            try {
               throw var26;
            } catch (Throwable var21) {
               var10000 = var21;
               var10001 = false;
               continue;
            }
         }
      } else {
         return c;
      }
   }

   // $FF: synthetic method
   static void e(q4.a param0) {
      // $FF: Couldn't be decompiled
   }

   private final boolean f(String var1) {
      return !var1.isEmpty() && this.b.containsKey(var1) && this.b.get(var1) != null;
   }

   public v3.a.a a(String var1, v3.a.b var2) {
      n.i(var2);
      if (!com.google.firebase.analytics.connector.internal.b.f(var1)) {
         return null;
      } else if (this.f(var1)) {
         return null;
      } else {
         t2.a var3 = this.a;
         Object var4;
         if ("fiam".equals(var1)) {
            var4 = new com.google.firebase.analytics.connector.internal.d(var3, var2);
         } else if (!"crash".equals(var1) && !"clx".equals(var1)) {
            var4 = null;
         } else {
            var4 = new f(var3, var2);
         }

         if (var4 != null) {
            this.b.put(var1, var4);
            return new v3.a.a(this, var1) {
               final String a;
               final v3.b b;

               {
                  this.b = var1;
                  this.a = var2;
               }
            };
         } else {
            return null;
         }
      }
   }

   public void b(String var1, String var2, Object var3) {
      if (com.google.firebase.analytics.connector.internal.b.f(var1)) {
         if (com.google.firebase.analytics.connector.internal.b.g(var1, var2)) {
            this.a.c(var1, var2, var3);
         }
      }
   }

   public void c(String var1, String var2, Bundle var3) {
      Bundle var4 = var3;
      if (var3 == null) {
         var4 = new Bundle();
      }

      if (com.google.firebase.analytics.connector.internal.b.f(var1)) {
         if (com.google.firebase.analytics.connector.internal.b.d(var2, var4)) {
            if (com.google.firebase.analytics.connector.internal.b.c(var1, var2, var4)) {
               com.google.firebase.analytics.connector.internal.b.b(var1, var2, var4);
               this.a.a(var1, var2, var4);
            }
         }
      }
   }
}
