package j4;

public class b implements d {
   private final int a;

   public b(int var1) {
      this.a = var1;
   }

   public StackTraceElement[] a(StackTraceElement[] var1) {
      int var3 = var1.length;
      int var2 = this.a;
      if (var3 <= var2) {
         return var1;
      } else {
         var3 = var2 / 2;
         int var4 = var2 - var3;
         StackTraceElement[] var5 = new StackTraceElement[var2];
         System.arraycopy(var1, 0, var5, 0, var4);
         System.arraycopy(var1, var1.length - var3, var5, var4, var3);
         return var5;
      }
   }
}
