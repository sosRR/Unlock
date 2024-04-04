package d4;

import com.google.auto.value.AutoValue;

@AutoValue
public abstract class c0 {
   public static c0 b(a var0, c var1, b var2) {
      return new w(var0, var1, var2);
   }

   public abstract a a();

   public abstract b c();

   public abstract c d();

   @AutoValue
   public abstract static class a {
      public static a b(String var0, String var1, String var2, String var3, int var4, y3.e var5) {
         return new x(var0, var1, var2, var3, var4, var5);
      }

      public abstract String a();

      public abstract int c();

      public abstract y3.e d();

      public abstract String e();

      public abstract String f();

      public abstract String g();
   }

   @AutoValue
   public abstract static class b {
      public static b c(int var0, String var1, int var2, long var3, long var5, boolean var7, int var8, String var9, String var10) {
         return new y(var0, var1, var2, var3, var5, var7, var8, var9, var10);
      }

      public abstract int a();

      public abstract int b();

      public abstract long d();

      public abstract boolean e();

      public abstract String f();

      public abstract String g();

      public abstract String h();

      public abstract int i();

      public abstract long j();
   }

   @AutoValue
   public abstract static class c {
      public static c a(String var0, String var1, boolean var2) {
         return new z(var0, var1, var2);
      }

      public abstract boolean b();

      public abstract String c();

      public abstract String d();
   }
}
