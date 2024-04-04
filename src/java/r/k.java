package r;

import java.util.HashSet;

public class k extends i {
   private int N0 = 0;
   private int O0 = 0;
   private int P0 = 0;
   private int Q0 = 0;
   private int R0 = 0;
   private int S0 = 0;
   private int T0 = 0;
   private int U0 = 0;
   private boolean V0 = false;
   private int W0 = 0;
   private int X0 = 0;
   protected s.b.a Y0 = new s.b.a();
   s.b.b Z0 = null;

   public void b(f var1) {
      this.q1();
   }

   public void q1() {
      for(int var1 = 0; var1 < super.M0; ++var1) {
         e var2 = super.L0[var1];
         if (var2 != null) {
            var2.R0(true);
         }
      }

   }

   public boolean r1(HashSet var1) {
      for(int var2 = 0; var2 < super.M0; ++var2) {
         if (var1.contains(super.L0[var2])) {
            return true;
         }
      }

      return false;
   }

   public boolean s1() {
      return this.V0;
   }
}
