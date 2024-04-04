package e2;

import android.content.Context;
import android.content.res.Resources;

public class q {
   private final Resources a;
   private final String b;

   public q(Context var1) {
      n.i(var1);
      Resources var2 = var1.getResources();
      this.a = var2;
      this.b = var2.getResourcePackageName(b2.j.a);
   }

   public String a(String var1) {
      int var2 = this.a.getIdentifier(var1, "string", this.b);
      return var2 == 0 ? null : this.a.getString(var2);
   }
}
