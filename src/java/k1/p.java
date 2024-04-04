package k1;

import java.util.Set;

final class p implements i1.g {
   private final Set a;
   private final o b;
   private final s c;

   p(Set var1, o var2, s var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public i1.f a(String var1, Class var2, i1.b var3, i1.e var4) {
      if (this.a.contains(var3)) {
         return new r(this.b, var1, var3, var4, this.c);
      } else {
         throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", new Object[]{var3, this.a}));
      }
   }
}
