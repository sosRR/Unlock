package o5;

import java.io.Serializable;
import w5.p;

public final class c implements f, Serializable {
   private final f m;
   private final <undefinedtype> n;

   public c(f var1, Object var2) {
      x5.g.e(var1, "left");
      x5.g.e(var2, "element");
      super();
      this.m = var1;
      this.n = var2;
   }

   private final boolean b(Object var1) {
      return x5.g.a(this.get(var1.getKey()), var1);
   }

   private final boolean c(o5.c var1) {
      while(this.b(var1.n)) {
         f var2 = var1.m;
         if (!(var2 instanceof o5.c)) {
            x5.g.c(var2, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
            return this.b((<undefinedtype>)var2);
         }

         var1 = (o5.c)var2;
      }

      return false;
   }

   private final int d() {
      int var1 = 2;
      o5.c var2 = this;

      while(true) {
         f var3 = var2.m;
         if (var3 instanceof o5.c) {
            var2 = (o5.c)var3;
         } else {
            var2 = null;
         }

         if (var2 == null) {
            return var1;
         }

         ++var1;
      }
   }

   public boolean equals(Object var1) {
      boolean var2;
      label28: {
         if (this != var1) {
            if (!(var1 instanceof o5.c)) {
               break label28;
            }

            o5.c var3 = (o5.c)var1;
            if (var3.d() != this.d() || !var3.c(this)) {
               break label28;
            }
         }

         var2 = true;
         return var2;
      }

      var2 = false;
      return var2;
   }

   public Object fold(Object var1, p var2) {
      x5.g.e(var2, "operation");
      return var2.b(this.m.fold(var1, var2), this.n);
   }

   public <undefinedtype> get(f.c var1) {
      x5.g.e(var1, "key");
      o5.c var2 = this;

      while(true) {
         <undefinedtype> var3 = var2.n.get(var1);
         if (var3 != null) {
            return var3;
         }

         f var4 = var2.m;
         if (!(var4 instanceof o5.c)) {
            return var4.get(var1);
         }

         var2 = (o5.c)var4;
      }
   }

   public int hashCode() {
      return this.m.hashCode() + this.n.hashCode();
   }

   public f minusKey(f.c var1) {
      x5.g.e(var1, "key");
      if (this.n.get(var1) != null) {
         return this.m;
      } else {
         f var2 = this.m.minusKey(var1);
         Object var3;
         if (var2 == this.m) {
            var3 = this;
         } else if (var2 == g.m) {
            var3 = this.n;
         } else {
            var3 = new o5.c(var2, this.n);
         }

         return (f)var3;
      }
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append('[');
      var1.append((String)this.fold("", null.n));
      var1.append(']');
      return var1.toString();
   }
}
