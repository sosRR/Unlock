package w1;

import android.util.SparseArray;
import i1.d;
import java.util.HashMap;
import java.util.Iterator;

public final class a {
   private static SparseArray a = new SparseArray();
   private static HashMap b;

   static {
      HashMap var0 = new HashMap();
      b = var0;
      var0.put(d.m, 0);
      b.put(d.n, 1);
      b.put(d.o, 2);
      Iterator var1 = b.keySet().iterator();

      while(var1.hasNext()) {
         d var2 = (d)var1.next();
         a.append((Integer)b.get(var2), var2);
      }

   }

   public static int a(d var0) {
      Integer var1 = (Integer)b.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         StringBuilder var2 = new StringBuilder();
         var2.append("PriorityMapping is missing known Priority value ");
         var2.append(var0);
         throw new IllegalStateException(var2.toString());
      }
   }

   public static d b(int var0) {
      d var1 = (d)a.get(var0);
      if (var1 != null) {
         return var1;
      } else {
         StringBuilder var2 = new StringBuilder();
         var2.append("Unknown Priority for value ");
         var2.append(var0);
         throw new IllegalArgumentException(var2.toString());
      }
   }
}
