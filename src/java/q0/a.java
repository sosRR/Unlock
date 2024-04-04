package q0;

public final class a implements e {
   private final String m;
   private final Object[] n;

   public a(String var1) {
      this(var1, (Object[])null);
   }

   public a(String var1, Object[] var2) {
      this.m = var1;
      this.n = var2;
   }

   private static void b(d var0, int var1, Object var2) {
      if (var2 == null) {
         var0.q(var1);
      } else if (var2 instanceof byte[]) {
         var0.F(var1, (byte[])var2);
      } else if (var2 instanceof Float) {
         var0.s(var1, (double)(Float)var2);
      } else if (var2 instanceof Double) {
         var0.s(var1, (Double)var2);
      } else if (var2 instanceof Long) {
         var0.B(var1, (Long)var2);
      } else if (var2 instanceof Integer) {
         var0.B(var1, (long)(Integer)var2);
      } else if (var2 instanceof Short) {
         var0.B(var1, (long)(Short)var2);
      } else if (var2 instanceof Byte) {
         var0.B(var1, (long)(Byte)var2);
      } else if (var2 instanceof String) {
         var0.j(var1, (String)var2);
      } else {
         if (!(var2 instanceof Boolean)) {
            StringBuilder var5 = new StringBuilder();
            var5.append("Cannot bind ");
            var5.append(var2);
            var5.append(" at index ");
            var5.append(var1);
            var5.append(" Supported types: null, byte[], float, double, long, int, short, byte, string");
            throw new IllegalArgumentException(var5.toString());
         }

         long var3;
         if ((Boolean)var2) {
            var3 = 1L;
         } else {
            var3 = 0L;
         }

         var0.B(var1, var3);
      }

   }

   public static void c(d var0, Object[] var1) {
      if (var1 != null) {
         int var3 = var1.length;
         int var2 = 0;

         while(var2 < var3) {
            Object var4 = var1[var2];
            ++var2;
            b(var0, var2, var4);
         }

      }
   }

   public String a() {
      return this.m;
   }

   public void f(d var1) {
      c(var1, this.n);
   }
}
