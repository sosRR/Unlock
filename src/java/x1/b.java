package x1;

import android.net.Uri;
import java.util.Iterator;
import java.util.Map;

final class b extends Thread {
   final Map m;

   b(a var1, Map var2) {
      this.m = var2;
   }

   public final void run() {
      Map var2 = this.m;
      Uri.Builder var4 = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
      Iterator var1 = var2.keySet().iterator();

      while(var1.hasNext()) {
         String var3 = (String)var1.next();
         var4.appendQueryParameter(var3, (String)var2.get(var3));
      }

      d.a(var4.build().toString());
   }
}
