package h4;

import android.content.Context;
import b4.o;
import d4.a0;
import e4.g;
import i1.e;
import i4.i;
import java.nio.charset.Charset;
import k1.t;

public class b {
   private static final g c = new g();
   private static final String d = e("hts/cahyiseot-agolai.o/1frlglgc/aclg", "tp:/rsltcrprsp.ogepscmv/ieo/eaybtho");
   private static final String e = e("AzSBpY4F0rHiHFdinTvM", "IayrSTFL9eJ69YeSUO2");
   private static final e f = new a();
   private final d a;
   private final e b;

   b(d var1, e var2) {
      this.a = var1;
      this.b = var2;
   }

   // $FF: synthetic method
   public static byte[] a(a0 var0) {
      return d(var0);
   }

   public static b b(Context var0, i var1, b4.a0 var2) {
      t.f(var0);
      i1.g var5 = t.c().g(new com.google.android.datatransport.cct.a(d, e));
      i1.b var4 = i1.b.b("json");
      e var3 = f;
      return new b(new d(var5.a("FIREBASE_CRASHLYTICS_REPORT", a0.class, var4, var3), var1.b(), var2), var3);
   }

   // $FF: synthetic method
   private static byte[] d(a0 var0) {
      return c.E(var0).getBytes(Charset.forName("UTF-8"));
   }

   private static String e(String var0, String var1) {
      int var2 = var0.length() - var1.length();
      if (var2 >= 0 && var2 <= 1) {
         StringBuilder var3 = new StringBuilder(var0.length() + var1.length());

         for(var2 = 0; var2 < var0.length(); ++var2) {
            var3.append(var0.charAt(var2));
            if (var1.length() > var2) {
               var3.append(var1.charAt(var2));
            }
         }

         return var3.toString();
      } else {
         throw new IllegalArgumentException("Invalid input received");
      }
   }

   public y2.g c(o var1, boolean var2) {
      return this.a.h(var1, var2).a();
   }
}
