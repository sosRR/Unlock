package j4;

public class a implements d {
   private final int a;
   private final d[] b;
   private final b c;

   public a(int var1, d... var2) {
      this.a = var1;
      this.b = var2;
      this.c = new b(var1);
   }

   public StackTraceElement[] a(StackTraceElement[] var1) {
      if (var1.length <= this.a) {
         return var1;
      } else {
         d[] var5 = this.b;
         int var3 = var5.length;
         int var2 = 0;

         StackTraceElement[] var4;
         for(var4 = var1; var2 < var3; ++var2) {
            d var6 = var5[var2];
            if (var4.length <= this.a) {
               break;
            }

            var4 = var6.a(var1);
         }

         var1 = var4;
         if (var4.length > this.a) {
            var1 = this.c.a(var4);
         }

         return var1;
      }
   }
}
