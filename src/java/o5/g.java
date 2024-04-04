package o5;

import java.io.Serializable;
import w5.p;

public final class g implements f, Serializable {
   public static final g m = new g();

   private g() {
   }

   public Object fold(Object var1, p var2) {
      x5.g.e(var2, "operation");
      return var1;
   }

   public <undefinedtype> get(f.c var1) {
      x5.g.e(var1, "key");
      return null;
   }

   public int hashCode() {
      return 0;
   }

   public f minusKey(f.c var1) {
      x5.g.e(var1, "key");
      return this;
   }

   public String toString() {
      return "EmptyCoroutineContext";
   }
}
