package d2;

import android.app.Activity;

public class d {
   private final Object a;

   public d(Activity var1) {
      e2.n.j(var1, "Activity must not be null");
      this.a = var1;
   }

   public final Activity a() {
      return (Activity)this.a;
   }

   public final androidx.fragment.app.e b() {
      return (androidx.fragment.app.e)this.a;
   }

   public final boolean c() {
      return this.a instanceof Activity;
   }

   public final boolean d() {
      return this.a instanceof androidx.fragment.app.e;
   }
}
