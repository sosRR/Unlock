package w3;

import java.util.Set;

abstract class a implements e {
   public Object a(Class var1) {
      t4.b var2 = this.c(var1);
      return var2 == null ? null : var2.get();
   }

   public Set b(Class var1) {
      return (Set)this.d(var1).get();
   }
}
