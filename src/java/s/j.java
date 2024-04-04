package s;

class j extends p {
   public j(r.e var1) {
      super(var1);
      var1.e.f();
      var1.f.f();
      super.f = ((r.g)var1).p1();
   }

   private void q(f var1) {
      super.h.k.add(var1);
      var1.l.add(super.h);
   }

   public void a(d var1) {
      f var4 = super.h;
      if (var4.c) {
         if (!var4.j) {
            var4 = (f)var4.l.get(0);
            r.g var3 = (r.g)super.b;
            int var2 = (int)((float)var4.g * var3.s1() + 0.5F);
            super.h.d(var2);
         }
      }
   }

   void d() {
      r.g var3 = (r.g)super.b;
      int var2 = var3.q1();
      int var1 = var3.r1();
      var3.s1();
      f var4;
      if (var3.p1() == 1) {
         if (var2 != -1) {
            super.h.l.add(super.b.a0.e.h);
            super.b.a0.e.h.k.add(super.h);
            super.h.f = var2;
         } else if (var1 != -1) {
            super.h.l.add(super.b.a0.e.i);
            super.b.a0.e.i.k.add(super.h);
            super.h.f = -var1;
         } else {
            var4 = super.h;
            var4.b = true;
            var4.l.add(super.b.a0.e.i);
            super.b.a0.e.i.k.add(super.h);
         }

         this.q(super.b.e.h);
         this.q(super.b.e.i);
      } else {
         if (var2 != -1) {
            super.h.l.add(super.b.a0.f.h);
            super.b.a0.f.h.k.add(super.h);
            super.h.f = var2;
         } else if (var1 != -1) {
            super.h.l.add(super.b.a0.f.i);
            super.b.a0.f.i.k.add(super.h);
            super.h.f = -var1;
         } else {
            var4 = super.h;
            var4.b = true;
            var4.l.add(super.b.a0.f.i);
            super.b.a0.f.i.k.add(super.h);
         }

         this.q(super.b.f.h);
         this.q(super.b.f.i);
      }

   }

   public void e() {
      if (((r.g)super.b).p1() == 1) {
         super.b.j1(super.h.g);
      } else {
         super.b.k1(super.h.g);
      }

   }

   void f() {
      super.h.c();
   }

   boolean m() {
      return false;
   }
}
