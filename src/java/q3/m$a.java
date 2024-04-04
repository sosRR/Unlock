package q3;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.Iterator;
import java.util.List;

class m$a extends m.g {
   final List b;
   final Matrix c;
   final m d;

   m$a(m var1, List var2, Matrix var3) {
      this.d = var1;
      this.b = var2;
      this.c = var3;
   }

   public void a(Matrix var1, p3.a var2, int var3, Canvas var4) {
      Iterator var5 = this.b.iterator();

      while(var5.hasNext()) {
         ((m.g)var5.next()).a(this.c, var2, var3, var4);
      }

   }
}
