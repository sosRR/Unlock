package c4;

import b4.h;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;

public class g {
   private final d a;
   private final h b;
   private final String c;
   private final a d = new a(this, false);
   private final a e = new a(this, true);
   private final AtomicMarkableReference f = new AtomicMarkableReference((Object)null, false);

   public g(String var1, g4.f var2, h var3) {
      this.c = var1;
      this.a = new d(var2);
      this.b = var3;
   }

   public static g c(String var0, g4.f var1, h var2) {
      d var3 = new d(var1);
      g var4 = new g(var0, var1, var2);
      ((b)var4.d.a.getReference()).d(var3.f(var0, false));
      ((b)var4.e.a.getReference()).d(var3.f(var0, true));
      var4.f.set(var3.g(var0), false);
      return var4;
   }

   public static String d(String var0, g4.f var1) {
      return (new d(var1)).g(var0);
   }

   public Map a() {
      return this.d.a();
   }

   public Map b() {
      return this.e.a();
   }

   private class a {
      final AtomicMarkableReference a;
      private final AtomicReference b;
      private final boolean c;
      final g d;

      public a(g var1, boolean var2) {
         this.d = var1;
         this.b = new AtomicReference((Object)null);
         this.c = var2;
         short var3;
         if (var2) {
            var3 = 8192;
         } else {
            var3 = 1024;
         }

         this.a = new AtomicMarkableReference(new b(64, var3), false);
      }

      public Map a() {
         return ((b)this.a.getReference()).a();
      }
   }
}
