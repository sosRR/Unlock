package u0;

import android.view.ViewGroup;

public class k {
   private ViewGroup a;
   private Runnable b;

   public static k b(ViewGroup var0) {
      return (k)var0.getTag(i.b);
   }

   static void c(ViewGroup var0, k var1) {
      var0.setTag(i.b, var1);
   }

   public void a() {
      if (b(this.a) == this) {
         Runnable var1 = this.b;
         if (var1 != null) {
            var1.run();
         }
      }

   }
}
