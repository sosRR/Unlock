package n1;

public final class a implements l5.a, m1.a {
   private static final Object c = new Object();
   private volatile l5.a a;
   private volatile Object b;

   private a(l5.a var1) {
      this.b = c;
      this.a = var1;
   }

   public static m1.a a(l5.a var0) {
      return (m1.a)(var0 instanceof m1.a ? (m1.a)var0 : new a((l5.a)d.b(var0)));
   }

   public static l5.a b(l5.a var0) {
      d.b(var0);
      return (l5.a)(var0 instanceof a ? var0 : new a(var0));
   }

   public static Object c(Object var0, Object var1) {
      boolean var2;
      if (var0 != c) {
         var2 = true;
      } else {
         var2 = false;
      }

      if (var2 && var0 != var1) {
         StringBuilder var3 = new StringBuilder();
         var3.append("Scoped provider was invoked recursively returning different results: ");
         var3.append(var0);
         var3.append(" & ");
         var3.append(var1);
         var3.append(". This is likely due to a circular dependency.");
         throw new IllegalStateException(var3.toString());
      } else {
         return var1;
      }
   }

   public Object get() {
      Object var2 = this.b;
      Object var3 = c;
      Object var1 = var2;
      if (var2 == var3) {
         synchronized(this){}

         Throwable var10000;
         boolean var10001;
         label206: {
            try {
               var2 = this.b;
            } catch (Throwable var24) {
               var10000 = var24;
               var10001 = false;
               break label206;
            }

            var1 = var2;
            if (var2 == var3) {
               try {
                  var1 = this.a.get();
                  this.b = c(this.b, var1);
                  this.a = null;
               } catch (Throwable var23) {
                  var10000 = var23;
                  var10001 = false;
                  break label206;
               }
            }

            label193:
            try {
               return var1;
            } catch (Throwable var22) {
               var10000 = var22;
               var10001 = false;
               break label193;
            }
         }

         while(true) {
            Throwable var25 = var10000;

            try {
               throw var25;
            } catch (Throwable var21) {
               var10000 = var21;
               var10001 = false;
               continue;
            }
         }
      } else {
         return var1;
      }
   }
}
