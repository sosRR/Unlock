package x5;

public class n {
   public b6.b a(Class var1) {
      return new c(var1);
   }

   public b6.c b(Class var1, String var2) {
      return new i(var1, var2);
   }

   public b6.d c(j var1) {
      return var1;
   }

   public String d(f var1) {
      String var2 = var1.getClass().getGenericInterfaces()[0].toString();
      String var3 = var2;
      if (var2.startsWith("kotlin.jvm.functions.")) {
         var3 = var2.substring(21);
      }

      return var3;
   }

   public String e(h var1) {
      return this.d(var1);
   }
}
