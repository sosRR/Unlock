package o1;

public final class c {
   private static final c c = (new a()).a();
   private final long a;
   private final b b;

   c(long var1, b var3) {
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
      tag = 3
   )
   public b b() {
      return this.b;
   }

   public static final class a {
      private long a = 0L;
      private b b;

      a() {
         this.b = c.b.n;
      }

      public c a() {
         return new c(this.a, this.b);
      }

      public a b(long var1) {
         this.a = var1;
         return this;
      }

      public a c(b var1) {
         this.b = var1;
         return this;
      }
   }

   public static enum b implements p4.c {
      n,
      o,
      p,
      q,
      r,
      s,
      t;

      private static final b[] u;
      private final int m;

      static {
         b var1 = new b("REASON_UNKNOWN", 0, 0);
         n = var1;
         b var4 = new b("MESSAGE_TOO_OLD", 1, 1);
         o = var4;
         b var6 = new b("CACHE_FULL", 2, 2);
         p = var6;
         b var2 = new b("PAYLOAD_TOO_BIG", 3, 3);
         q = var2;
         b var3 = new b("MAX_RETRIES_REACHED", 4, 4);
         r = var3;
         b var5 = new b("INVALID_PAYLOD", 5, 5);
         s = var5;
         b var0 = new b("SERVER_ERROR", 6, 6);
         t = var0;
         u = new b[]{var1, var4, var6, var2, var3, var5, var0};
      }

      private b(int var3) {
         this.m = var3;
      }

      public int d() {
         return this.m;
      }
   }
}
