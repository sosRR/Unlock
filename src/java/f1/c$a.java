package f1;

class c$a extends m0.a {
   final c d;

   c$a(c var1, androidx.room.h var2) {
      super(var2);
      this.d = var1;
   }

   public String d() {
      return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
   }

   public void i(q0.f var1, a var2) {
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
