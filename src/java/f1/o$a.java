package f1;

class o$a extends m0.a {
   final o d;

   o$a(o var1, androidx.room.h var2) {
      super(var2);
      this.d = var1;
   }

   public String d() {
      return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
   }

   public void i(q0.f var1, m var2) {
      String var3 = var2.a;
      if (var3 == null) {
         var1.q(1);
      } else {
         var1.j(1, var3);
      }

      byte[] var4 = androidx.work.b.m(var2.b);
      if (var4 == null) {
         var1.q(2);
      } else {
         var1.F(2, var4);
      }

   }
}
