package f1;

public final class o implements n {
   private final androidx.room.h a;
   private final m0.a b;
   private final m0.d c;
   private final m0.d d;

   public o(androidx.room.h var1) {
      this.a = var1;
      this.b = new o$a(this, var1);
      this.c = new m0.d(this, var1) {
         final o d;

         {
            this.d = var1;
         }

         public String d() {
            return "DELETE from WorkProgress where work_spec_id=?";
         }
      };
      this.d = new m0.d(this, var1) {
         final o d;

         {
            this.d = var1;
         }

         public String d() {
            return "DELETE FROM WorkProgress";
         }
      };
   }

   public void a(String var1) {
      this.a.b();
      q0.f var2 = this.c.a();
      if (var1 == null) {
         var2.q(1);
      } else {
         var2.j(1, var1);
      }

      this.a.c();

      try {
         var2.n();
         this.a.t();
      } finally {
         this.a.g();
         this.c.f(var2);
      }

   }

   public void b() {
      this.a.b();
      q0.f var1 = this.d.a();
      this.a.c();

      try {
         var1.n();
         this.a.t();
      } finally {
         this.a.g();
         this.d.f(var1);
      }

   }
}
