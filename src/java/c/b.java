package c;

import a6.d;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import m5.i;
import m5.m;
import n5.w;
import x5.e;
import x5.g;

public final class b extends c.a {
   public static final <undefinedtype> a = new Object((e)null) {
      public final Intent a(String[] var1) {
         g.e(var1, "input");
         Intent var2 = (new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS")).putExtra("androidx.activity.result.contract.extra.PERMISSIONS", var1);
         g.d(var2, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
         return var2;
      }
   };

   public Intent d(Context var1, String[] var2) {
      g.e(var1, "context");
      g.e(var2, "input");
      return a.a(var2);
   }

   public c.a.a e(Context var1, String[] var2) {
      g.e(var1, "context");
      g.e(var2, "input");
      int var3 = var2.length;
      boolean var6 = true;
      byte var5 = 0;
      boolean var11;
      if (var3 == 0) {
         var11 = true;
      } else {
         var11 = false;
      }

      if (var11) {
         return new c.a.a(w.d());
      } else {
         int var7 = var2.length;
         var3 = 0;

         boolean var4;
         while(true) {
            var4 = var6;
            if (var3 >= var7) {
               break;
            }

            if (androidx.core.content.a.a(var1, var2[var3]) == 0) {
               var4 = true;
            } else {
               var4 = false;
            }

            if (!var4) {
               var4 = false;
               break;
            }

            ++var3;
         }

         c.a.a var10;
         if (var4) {
            LinkedHashMap var9 = new LinkedHashMap(d.a(w.a(var2.length), 16));
            int var12 = var2.length;

            for(var3 = var5; var3 < var12; ++var3) {
               i var8 = m.a(var2[var3], Boolean.TRUE);
               var9.put(var8.c(), var8.d());
            }

            var10 = new c.a.a(var9);
         } else {
            var10 = null;
         }

         return var10;
      }
   }

   public Map f(int var1, Intent var2) {
      if (var1 != -1) {
         return w.d();
      } else if (var2 == null) {
         return w.d();
      } else {
         String[] var5 = var2.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
         int[] var6 = var2.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
         if (var6 != null && var5 != null) {
            ArrayList var7 = new ArrayList(var6.length);
            int var3 = var6.length;

            for(var1 = 0; var1 < var3; ++var1) {
               boolean var4;
               if (var6[var1] == 0) {
                  var4 = true;
               } else {
                  var4 = false;
               }

               var7.add(var4);
            }

            return w.g(n5.g.m(n5.a.d(var5), var7));
         } else {
            return w.d();
         }
      }
   }
}
