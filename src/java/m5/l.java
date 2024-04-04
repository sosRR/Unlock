package m5;

import java.io.Serializable;

final class l implements e, Serializable {
   private w5.a m;
   private volatile Object n;
   private final Object o;

   public l(w5.a var1, Object var2) {
      x5.g.e(var1, "initializer");
      super();
      this.m = var1;
      this.n = m5.n.a;
      Object var3 = var2;
      if (var2 == null) {
         var3 = this;
      }

      this.o = var3;
   }

   // $FF: synthetic method
   public l(w5.a var1, Object var2, int var3, x5.e var4) {
      if ((var3 & 2) != 0) {
         var2 = null;
      }

      this(var1, var2);
   }

   public boolean a() {
      boolean var1;
      if (this.n != m5.n.a) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public Object getValue() {
      Object var1 = this.n;
      n var3 = m5.n.a;
      if (var1 != var3) {
         return var1;
      } else {
         Object var2 = this.o;
         synchronized(var2){}

         Throwable var10000;
         label88: {
            boolean var10001;
            try {
               var1 = this.n;
            } catch (Throwable var10) {
               var10000 = var10;
               var10001 = false;
               break label88;
            }

            if (var1 != var3) {
               return var1;
            }

            label77:
            try {
               w5.a var12 = this.m;
               x5.g.b(var12);
               var1 = var12.a();
               this.n = var1;
               this.m = null;
               return var1;
            } catch (Throwable var9) {
               var10000 = var9;
               var10001 = false;
               break label77;
            }
         }

         Throwable var11 = var10000;
         throw var11;
      }
   }

   public String toString() {
      String var1;
      if (this.a()) {
         var1 = String.valueOf(this.getValue());
      } else {
         var1 = "Lazy value not initialized yet.";
      }

      return var1;
   }
}
