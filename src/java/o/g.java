package o;

class g implements f {
   private final Object[] a;
   private int b;

   g(int var1) {
      if (var1 > 0) {
         this.a = new Object[var1];
      } else {
         throw new IllegalArgumentException("The max pool size must be > 0");
      }
   }

   public boolean a(Object var1) {
      int var2 = this.b;
      Object[] var3 = this.a;
      if (var2 < var3.length) {
         var3[var2] = var1;
         this.b = var2 + 1;
         return true;
      } else {
         return false;
      }
   }

   public Object b() {
      int var2 = this.b;
      if (var2 > 0) {
         int var1 = var2 - 1;
         Object[] var4 = this.a;
         Object var3 = var4[var1];
         var4[var1] = null;
         this.b = var2 - 1;
         return var3;
      } else {
         return null;
      }
   }

   public void c(Object[] var1, int var2) {
      int var3 = var2;
      if (var2 > var1.length) {
         var3 = var1.length;
      }

      for(var2 = 0; var2 < var3; ++var2) {
         Object var6 = var1[var2];
         int var4 = this.b;
         Object[] var5 = this.a;
         if (var4 < var5.length) {
            var5[var4] = var6;
            this.b = var4 + 1;
         }
      }

   }
}
