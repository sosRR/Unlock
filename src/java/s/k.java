package s;

import java.util.Iterator;

class k extends p {
   public k(r.e var1) {
      super(var1);
   }

   private void q(f var1) {
      super.h.k.add(var1);
      var1.l.add(super.h);
   }

   public void a(d var1) {
      r.a var7 = (r.a)super.b;
      int var6 = var7.s1();
      Iterator var8 = super.h.l.iterator();
      int var2 = 0;
      int var5 = -1;

      while(var8.hasNext()) {
         int var3;
         int var4;
         label27: {
            var4 = ((f)var8.next()).g;
            if (var5 != -1) {
               var3 = var5;
               if (var4 >= var5) {
                  break label27;
               }
            }

            var3 = var4;
         }

         var5 = var3;
         if (var2 < var4) {
            var2 = var4;
            var5 = var3;
         }
      }

      if (var6 != 0 && var6 != 2) {
         super.h.d(var2 + var7.t1());
      } else {
         super.h.d(var5 + var7.t1());
      }

   }

   void d() {
      r.e var7 = super.b;
      if (var7 instanceof r.a) {
         super.h.b = true;
         r.a var9 = (r.a)var7;
         int var5 = var9.s1();
         boolean var6 = var9.r1();
         int var1 = 0;
         byte var4 = 0;
         byte var2 = 0;
         byte var3 = 0;
         r.e var8;
         f var10;
         if (var5 != 0) {
            if (var5 != 1) {
               if (var5 != 2) {
                  if (var5 == 3) {
                     super.h.e = null.s;

                     for(var1 = var3; var1 < var9.M0; ++var1) {
                        var8 = var9.L0[var1];
                        if (var6 || var8.T() != 8) {
                           var10 = var8.f.i;
                           var10.k.add(super.h);
                           super.h.l.add(var10);
                        }
                     }

                     this.q(super.b.f.h);
                     this.q(super.b.f.i);
                  }
               } else {
                  for(super.h.e = null.r; var1 < var9.M0; ++var1) {
                     var8 = var9.L0[var1];
                     if (var6 || var8.T() != 8) {
                        var10 = var8.f.h;
                        var10.k.add(super.h);
                        super.h.l.add(var10);
                     }
                  }

                  this.q(super.b.f.h);
                  this.q(super.b.f.i);
               }
            } else {
               super.h.e = null.q;

               for(var1 = var4; var1 < var9.M0; ++var1) {
                  var8 = var9.L0[var1];
                  if (var6 || var8.T() != 8) {
                     var10 = var8.e.i;
                     var10.k.add(super.h);
                     super.h.l.add(var10);
                  }
               }

               this.q(super.b.e.h);
               this.q(super.b.e.i);
            }
         } else {
            super.h.e = null.p;

            for(var1 = var2; var1 < var9.M0; ++var1) {
               var8 = var9.L0[var1];
               if (var6 || var8.T() != 8) {
                  var10 = var8.e.h;
                  var10.k.add(super.h);
                  super.h.l.add(var10);
               }
            }

            this.q(super.b.e.h);
            this.q(super.b.e.i);
         }
      }

   }

   public void e() {
      r.e var2 = super.b;
      if (var2 instanceof r.a) {
         int var1 = ((r.a)var2).s1();
         if (var1 != 0 && var1 != 1) {
            super.b.k1(super.h.g);
         } else {
            super.b.j1(super.h.g);
         }
      }

   }

   void f() {
      super.c = null;
      super.h.c();
   }

   boolean m() {
      return false;
   }
}
