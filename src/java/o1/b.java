package o1;

public final class b {
   private static final b b = (new a()).a();
   private final e a;

   b(e var1) {
      this.a = var1;
   }

   public static a b() {
      return new a();
   }

   @p4.d(
      tag = 1
   )
   public e a() {
      return this.a;
   }

   public static final class a {
      private e a = null;

      a() {
      }

      public b a() {
         return new b(this.a);
      }

      public a b(e var1) {
         this.a = var1;
         return this;
      }
   }
}
