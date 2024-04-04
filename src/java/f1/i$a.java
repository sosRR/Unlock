package f1;

class i$a extends m0.a {
   final i d;

   i$a(i var1, androidx.room.h var2) {
      super(var2);
      this.d = var1;
   }

   public String d() {
      return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`system_id`) VALUES (?,?)";
   }

   public void i(q0.f var1, g var2) {
      String var3 = var2.a;
      if (var3 == null) {
         var1.q(1);
      } else {
         var1.j(1, var3);
      }

      var1.B(2, (long)var2.b);
   }
}
