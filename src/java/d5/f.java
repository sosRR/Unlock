package d5;

import android.app.Application;

public class f extends Application {
   private static final String m = "f";

   public void onCreate() {
      super.onCreate();
      boolean var1 = h5.a.a;
      j5.c.a(var1);
      if (var1) {
         h6.a.b var2 = h6.a.b(m);
         StringBuilder var3 = new StringBuilder();
         var3.append("getAppVersionName: ");
         var3.append(j5.a.a(this.getApplicationContext()));
         var2.a(var3.toString());
      }

   }
}
