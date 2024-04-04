package a6;

public final class c extends a6.a {
   public static final a q = new a((x5.e)null);
   private static final c r = new c(1, 0);

   public c(int var1, int var2) {
      super(var1, var2, 1);
   }

   public boolean equals(Object var1) {
      boolean var3;
      label27: {
         if (var1 instanceof c) {
            if (this.isEmpty() && ((c)var1).isEmpty()) {
               break label27;
            }

            int var2 = this.d();
            c var4 = (c)var1;
            if (var2 == var4.d() && this.g() == var4.g()) {
               break label27;
            }
         }

         var3 = false;
         return var3;
      }

      var3 = true;
      return var3;
   }

   public int hashCode() {
      int var1;
      if (this.isEmpty()) {
         var1 = -1;
      } else {
         var1 = this.d() * 31 + this.g();
      }

      return var1;
   }

   public boolean isEmpty() {
      boolean var1;
      if (this.d() > this.g()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean k(int var1) {
      boolean var2;
      if (this.d() <= var1 && var1 <= this.g()) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.d());
      var1.append("..");
      var1.append(this.g());
      return var1.toString();
   }

   public static final class a {
      private a() {
      }

      // $FF: synthetic method
      public a(x5.e var1) {
         this();
      }
   }
}
