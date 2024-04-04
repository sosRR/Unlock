package f1;

class f$a extends m0.a {
   final f d;

   f$a(f var1, androidx.room.h var2) {
      super(var2);
      this.d = var1;
   }

   public String d() {
      return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
   }

   public void i(q0.f var1, d var2) {
      String var3 = var2.a;
      if (var3 == null) {
         var1.q(1);
      } else {
         var1.j(1, var3);
      }

      Long var4 = var2.b;
      if (var4 == null) {
         var1.q(2);
      } else {
         var1.B(2, var4);
      }

   }
}
