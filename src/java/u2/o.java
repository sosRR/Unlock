package u2;

import android.os.Bundle;

public final class o {
   public static Object a(Bundle var0, String var1, Class var2, Object var3) {
      Object var4 = var0.get(var1);
      if (var4 == null) {
         return var3;
      } else if (var2.isAssignableFrom(var4.getClass())) {
         return var4;
      } else {
         throw new IllegalStateException(String.format("Invalid conditional user property field type. '%s' expected [%s] but was [%s]", new Object[]{var1, var2.getCanonicalName(), var4.getClass().getCanonicalName()}));
      }
   }

   public static void b(Bundle var0, Object var1) {
      if (var1 instanceof Double) {
         var0.putDouble("value", (Double)var1);
      } else if (var1 instanceof Long) {
         var0.putLong("value", (Long)var1);
      } else {
         var0.putString("value", var1.toString());
      }
   }
}
