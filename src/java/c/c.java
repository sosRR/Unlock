package c;

import android.content.Context;
import android.content.Intent;
import x5.e;
import x5.g;

public final class c extends a {
   public static final a a = new a((e)null);

   public Intent d(Context var1, Intent var2) {
      g.e(var1, "context");
      g.e(var2, "input");
      return var2;
   }

   public androidx.activity.result.a e(int var1, Intent var2) {
      return new androidx.activity.result.a(var1, var2);
   }

   public static final class a {
      private a() {
      }

      // $FF: synthetic method
      public a(e var1) {
         this();
      }
   }
}
