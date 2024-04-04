package d0;

public abstract class d {
   private static d a;

   public static d a() {
      if (a == null) {
         a = new e();
      }

      return a;
   }
}
