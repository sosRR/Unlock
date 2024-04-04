package w3;

class y implements t4.b, t4.a {
   private static final t4.a.a c = new v();
   private static final t4.b d = new w();
   private t4.a.a a;
   private volatile t4.b b;

   private y(t4.a.a var1, t4.b var2) {
      this.a = var1;
      this.b = var2;
   }

   // $FF: synthetic method
   public static Object b() {
      return g();
   }

   // $FF: synthetic method
   public static void c(t4.b var0) {
      f(var0);
   }

   // $FF: synthetic method
   public static void d(t4.a.a var0, t4.a.a var1, t4.b var2) {
      h(var0, var1, var2);
   }

   static y e() {
      return new y(c, d);
   }

   // $FF: synthetic method
   private static void f(t4.b var0) {
   }

   // $FF: synthetic method
   private static Object g() {
      return null;
   }

   // $FF: synthetic method
   private static void h(t4.a.a var0, t4.a.a var1, t4.b var2) {
      var0.a(var2);
      var1.a(var2);
   }

   static y i(t4.b var0) {
      return new y((t4.a.a)null, var0);
   }

   public void a(t4.a.a var1) {
      t4.b var3 = this.b;
      t4.b var2 = d;
      if (var3 != var2) {
         var1.a(var3);
      } else {
         synchronized(this){}

         label244: {
            Throwable var10000;
            boolean var10001;
            label245: {
               try {
                  var3 = this.b;
               } catch (Throwable var25) {
                  var10000 = var25;
                  var10001 = false;
                  break label245;
               }

               if (var3 != var2) {
                  var2 = var3;
               } else {
                  try {
                     t4.a.a var27 = this.a;
                     x var4 = new x(var27, var1);
                     this.a = var4;
                  } catch (Throwable var24) {
                     var10000 = var24;
                     var10001 = false;
                     break label245;
                  }

                  var2 = null;
               }

               label229:
               try {
                  break label244;
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label229;
               }
            }

            while(true) {
               Throwable var26 = var10000;

               try {
                  throw var26;
               } catch (Throwable var22) {
                  var10000 = var22;
                  var10001 = false;
                  continue;
               }
            }
         }

         if (var2 != null) {
            var1.a(var3);
         }

      }
   }

   public Object get() {
      return this.b.get();
   }

   void j(t4.b param1) {
      // $FF: Couldn't be decompiled
   }
}
