package r;

import java.util.ArrayList;
import java.util.Arrays;
import s.o;

public class i extends e implements h {
   public e[] L0 = new e[4];
   public int M0 = 0;

   public void a(e var1) {
      if (var1 != this && var1 != null) {
         int var2 = this.M0;
         e[] var3 = this.L0;
         if (var2 + 1 > var3.length) {
            this.L0 = (e[])Arrays.copyOf(var3, var3.length * 2);
         }

         var3 = this.L0;
         var2 = this.M0;
         var3[var2] = var1;
         this.M0 = var2 + 1;
      }

   }

   public void b(f var1) {
   }

   public void c() {
      this.M0 = 0;
      Arrays.fill(this.L0, (Object)null);
   }

   public void o1(ArrayList var1, int var2, o var3) {
      byte var6 = 0;
      int var5 = 0;

      while(true) {
         int var4 = var6;
         if (var5 >= this.M0) {
            while(var4 < this.M0) {
               s.i.a(this.L0[var4], var2, var1, var3);
               ++var4;
            }

            return;
         }

         var3.a(this.L0[var5]);
         ++var5;
      }
   }

   public int p1(int var1) {
      for(int var2 = 0; var2 < this.M0; ++var2) {
         e var4 = this.L0[var2];
         int var3;
         if (var1 == 0) {
            var3 = var4.I0;
            if (var3 != -1) {
               return var3;
            }
         }

         if (var1 == 1) {
            var3 = var4.J0;
            if (var3 != -1) {
               return var3;
            }
         }
      }

      return -1;
   }
}
