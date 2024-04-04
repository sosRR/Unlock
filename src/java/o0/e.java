package o0;

public class e {
   public static final String[] a = new String[0];

   public static void a(StringBuilder var0, int var1) {
      for(int var2 = 0; var2 < var1; ++var2) {
         var0.append("?");
         if (var2 < var1 - 1) {
            var0.append(",");
         }
      }

   }

   public static StringBuilder b() {
      return new StringBuilder();
   }
}
