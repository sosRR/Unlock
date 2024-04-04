package f1;

class l$a extends m0.a {
   final l d;

   l$a(l var1, androidx.room.h var2) {
      super(var2);
      this.d = var1;
   }

   public String d() {
      return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
   }

   public void i(q0.f var1, j var2) {
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
