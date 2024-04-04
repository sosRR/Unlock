package u0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class r {
   public final Map a = new HashMap();
   public View b;
   final ArrayList c = new ArrayList();

   @Deprecated
   public r() {
   }

   public r(View var1) {
      this.b = var1;
   }

   public boolean equals(Object var1) {
      if (var1 instanceof r) {
         View var2 = this.b;
         r var3 = (r)var1;
         if (var2 == var3.b && this.a.equals(var3.a)) {
            return true;
         }
      }

      return false;
   }

   public int hashCode() {
      return this.b.hashCode() * 31 + this.a.hashCode();
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append("TransitionValues@");
      var1.append(Integer.toHexString(this.hashCode()));
      var1.append(":\n");
      String var5 = var1.toString();
      StringBuilder var2 = new StringBuilder();
      var2.append(var5);
      var2.append("    view = ");
      var2.append(this.b);
      var2.append("\n");
      var5 = var2.toString();
      var2 = new StringBuilder();
      var2.append(var5);
      var2.append("    values:");
      var5 = var2.toString();

      StringBuilder var4;
      for(Iterator var6 = this.a.keySet().iterator(); var6.hasNext(); var5 = var4.toString()) {
         String var3 = (String)var6.next();
         var4 = new StringBuilder();
         var4.append(var5);
         var4.append("    ");
         var4.append(var3);
         var4.append(": ");
         var4.append(this.a.get(var3));
         var4.append("\n");
      }

      return var5;
   }
}
