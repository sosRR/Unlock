package e6;

public abstract class a1 extends s {
   public abstract a1 Q();

   protected final String R() {
      a1 var1 = f0.b();
      if (this == var1) {
         return "Dispatchers.Main";
      } else {
         try {
            var1 = var1.Q();
         } catch (UnsupportedOperationException var2) {
            var1 = null;
         }

         return this == var1 ? "Dispatchers.Main.immediate" : null;
      }
   }

   public String toString() {
      String var2 = this.R();
      String var1 = var2;
      if (var2 == null) {
         StringBuilder var3 = new StringBuilder();
         var3.append(x.a(this));
         var3.append('@');
         var3.append(x.b(this));
         var1 = var3.toString();
      }

      return var1;
   }
}
