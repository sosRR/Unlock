package d1;

import android.content.Context;

public class g {
   private static g e;
   private a a;
   private b b;
   private e c;
   private f d;

   private g(Context var1, h1.a var2) {
      var1 = var1.getApplicationContext();
      this.a = new a(var1, var2);
      this.b = new b(var1, var2);
      this.c = new e(var1, var2);
      this.d = new f(var1, var2);
   }

   public static g c(Context var0, h1.a var1) {
      Class var3 = g.class;
      synchronized(g.class){}

      g var6;
      try {
         if (e == null) {
            g var2 = new g(var0, var1);
            e = var2;
         }

         var6 = e;
      } finally {
         ;
      }

      return var6;
   }

   public a a() {
      return this.a;
   }

   public b b() {
      return this.b;
   }

   public e d() {
      return this.c;
   }

   public f e() {
      return this.d;
   }
}
