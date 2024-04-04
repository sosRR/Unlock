package r;

public class j {
   static boolean[] a = new boolean[3];

   static void a(f var0, o.d var1, e var2) {
      var2.t = -1;
      var2.u = -1;
      e.b var6 = var0.Z[0];
      e.b var5 = e.b.n;
      int var3;
      int var4;
      if (var6 != var5 && var2.Z[0] == e.b.p) {
         var4 = var2.O.g;
         var3 = var0.U() - var2.Q.g;
         d var8 = var2.O;
         var8.i = var1.q(var8);
         var8 = var2.Q;
         var8.i = var1.q(var8);
         var1.f(var2.O.i, var4);
         var1.f(var2.Q.i, var3);
         var2.t = 2;
         var2.L0(var4, var3);
      }

      if (var0.Z[1] != var5 && var2.Z[1] == e.b.p) {
         var4 = var2.P.g;
         var3 = var0.v() - var2.R.g;
         d var7 = var2.P;
         var7.i = var1.q(var7);
         var7 = var2.R;
         var7.i = var1.q(var7);
         var1.f(var2.P.i, var4);
         var1.f(var2.R.i, var3);
         if (var2.l0 > 0 || var2.T() == 8) {
            var7 = var2.S;
            var7.i = var1.q(var7);
            var1.f(var2.S.i, var2.l0 + var4);
         }

         var2.u = 2;
         var2.c1(var4, var3);
      }

   }

   public static final boolean b(int var0, int var1) {
      boolean var2;
      if ((var0 & var1) == var1) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }
}
