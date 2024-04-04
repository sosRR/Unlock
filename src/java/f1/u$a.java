package f1;

class u$a extends m0.a {
   final u d;

   u$a(u var1, androidx.room.h var2) {
      super(var2);
      this.d = var1;
   }

   public String d() {
      return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
   }

   public void i(q0.f var1, s var2) {
      String var3 = var2.a;
      if (var3 == null) {
         var1.q(1);
      } else {
         var1.j(1, var3);
      }

      String var4 = var2.b;
      if (var4 == null) {
         var1.q(2);
      } else {
         var1.j(2, var4);
      }

   }
}
