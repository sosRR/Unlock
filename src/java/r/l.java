package r;

import java.util.ArrayList;

public class l extends e {
   public ArrayList L0 = new ArrayList();

   public void a(e var1) {
      this.L0.add(var1);
      if (var1.I() != null) {
         ((l)var1.I()).q1(var1);
      }

      var1.Z0(this);
   }

   public ArrayList o1() {
      return this.L0;
   }

   public void p1() {
      ArrayList var3 = this.L0;
      if (var3 != null) {
         int var2 = var3.size();

         for(int var1 = 0; var1 < var2; ++var1) {
            e var4 = (e)this.L0.get(var1);
            if (var4 instanceof l) {
               ((l)var4).p1();
            }
         }

      }
   }

   public void q1(e var1) {
      this.L0.remove(var1);
      var1.r0();
   }

   public void r0() {
      this.L0.clear();
      super.r0();
   }

   public void r1() {
      this.L0.clear();
   }

   public void t0(o.c var1) {
      super.t0(var1);
      int var3 = this.L0.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         ((e)this.L0.get(var2)).t0(var1);
      }

   }
}
