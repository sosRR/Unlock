package k;

import java.util.HashMap;
import java.util.Map;

public class a extends b {
   private HashMap q = new HashMap();

   public boolean contains(Object var1) {
      return this.q.containsKey(var1);
   }

   protected b.c g(Object var1) {
      return (b.c)this.q.get(var1);
   }

   public Object m(Object var1, Object var2) {
      b.c var3 = this.g(var1);
      if (var3 != null) {
         return var3.n;
      } else {
         this.q.put(var1, this.k(var1, var2));
         return null;
      }
   }

   public Object n(Object var1) {
      Object var2 = super.n(var1);
      this.q.remove(var1);
      return var2;
   }

   public Map.Entry p(Object var1) {
      return this.contains(var1) ? ((b.c)this.q.get(var1)).p : null;
   }
}
