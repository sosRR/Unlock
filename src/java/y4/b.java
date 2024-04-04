package y4;

public class b implements a {
   private static b a;

   private b() {
   }

   public static b b() {
      if (a == null) {
         a = new b();
      }

      return a;
   }

   public long a() {
      return System.currentTimeMillis();
   }
}
