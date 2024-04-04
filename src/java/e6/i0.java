package e6;

public abstract class i0 extends s {
   private long n;
   private boolean o;
   private kotlinx.coroutines.internal.a p;

   private final long R(boolean var1) {
      long var2;
      if (var1) {
         var2 = 4294967296L;
      } else {
         var2 = 1L;
      }

      return var2;
   }

   // $FF: synthetic method
   public static void V(i0 var0, boolean var1, int var2, Object var3) {
      if (var3 == null) {
         if ((var2 & 1) != 0) {
            var1 = false;
         }

         var0.U(var1);
      } else {
         throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incrementUseCount");
      }
   }

   public final void Q(boolean var1) {
      long var2 = this.n - this.R(var1);
      this.n = var2;
      if (var2 <= 0L) {
         if (this.o) {
            this.shutdown();
         }

      }
   }

   public final void S(d0 var1) {
      kotlinx.coroutines.internal.a var3 = this.p;
      kotlinx.coroutines.internal.a var2 = var3;
      if (var3 == null) {
         var2 = new kotlinx.coroutines.internal.a();
         this.p = var2;
      }

      var2.a(var1);
   }

   protected long T() {
      kotlinx.coroutines.internal.a var3 = this.p;
      long var1 = Long.MAX_VALUE;
      if (var3 == null) {
         return Long.MAX_VALUE;
      } else {
         if (!var3.c()) {
            var1 = 0L;
         }

         return var1;
      }
   }

   public final void U(boolean var1) {
      this.n += this.R(var1);
      if (!var1) {
         this.o = true;
      }

   }

   public final boolean W() {
      long var2 = this.n;
      boolean var1 = true;
      if (var2 < this.R(true)) {
         var1 = false;
      }

      return var1;
   }

   public final boolean X() {
      kotlinx.coroutines.internal.a var2 = this.p;
      boolean var1;
      if (var2 == null) {
         var1 = true;
      } else {
         var1 = var2.c();
      }

      return var1;
   }

   public final boolean Y() {
      kotlinx.coroutines.internal.a var1 = this.p;
      if (var1 == null) {
         return false;
      } else {
         d0 var2 = (d0)var1.d();
         if (var2 == null) {
            return false;
         } else {
            var2.run();
            return true;
         }
      }
   }

   public void shutdown() {
   }
}
