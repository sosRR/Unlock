package o1;

public final class e {
   private static final e c = (new a()).a();
   private final long a;
   private final long b;

   e(long var1, long var3) {
      this.a = var1;
      this.b = var3;
   }

   public static a c() {
      return new a();
   }

   @p4.d(
      tag = 1
   )
   public long a() {
      return this.a;
   }

   @p4.d(
      tag = 2
   )
   public long b() {
      return this.b;
   }

   public static final class a {
      private long a = 0L;
      private long b = 0L;

      a() {
      }

      public e a() {
         return new e(this.a, this.b);
      }

      public a b(long var1) {
         this.a = var1;
         return this;
      }

      public a c(long var1) {
         this.b = var1;
         return this;
      }
   }
}
