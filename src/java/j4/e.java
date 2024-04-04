package j4;

public class e {
   public final String a;
   public final String b;
   public final StackTraceElement[] c;
   public final e d;

   public e(Throwable var1, d var2) {
      this.a = var1.getLocalizedMessage();
      this.b = var1.getClass().getName();
      this.c = var2.a(var1.getStackTrace());
      var1 = var1.getCause();
      e var3;
      if (var1 != null) {
         var3 = new e(var1, var2);
      } else {
         var3 = null;
      }

      this.d = var3;
   }
}
