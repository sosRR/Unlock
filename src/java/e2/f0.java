package e2;

import android.content.Context;
import android.util.SparseIntArray;

public final class f0 {
   private final SparseIntArray a = new SparseIntArray();
   private b2.f b;

   public f0(b2.f var1) {
      n.i(var1);
      this.b = var1;
   }

   public final int a(Context var1, int var2) {
      return this.a.get(var2, -1);
   }

   public final int b(Context var1, com.google.android.gms.common.api.a.f var2) {
      n.i(var1);
      n.i(var2);
      boolean var7 = var2.f();
      byte var4 = 0;
      if (!var7) {
         return 0;
      } else {
         int var5 = var2.g();
         int var3 = this.a(var1, var5);
         if (var3 == -1) {
            var3 = 0;

            while(true) {
               if (var3 >= this.a.size()) {
                  var3 = -1;
                  break;
               }

               int var6 = this.a.keyAt(var3);
               if (var6 > var5 && this.a.get(var6) == 0) {
                  var3 = var4;
                  break;
               }

               ++var3;
            }

            if (var3 == -1) {
               var3 = this.b.h(var1, var5);
            }

            this.a.put(var5, var3);
         }

         return var3;
      }
   }

   public final void c() {
      this.a.clear();
   }
}
