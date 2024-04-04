package q5;

public abstract class c extends a {
   private final o5.f n;
   private transient o5.d o;

   public o5.f c() {
      o5.f var1 = this.n;
      x5.g.b(var1);
      return var1;
   }

   protected void f() {
      o5.d var2 = this.o;
      if (var2 != null && var2 != this) {
         <undefinedtype> var1 = this.c().get(o5.e.l);
         x5.g.b(var1);
         ((o5.e)var1).f(var2);
      }

      this.o = b.m;
   }

   public final o5.d g() {
      o5.d var2 = this.o;
      Object var1 = var2;
      if (var2 == null) {
         label13: {
            o5.e var3 = (o5.e)this.c().get(o5.e.l);
            if (var3 != null) {
               var2 = var3.k(this);
               var1 = var2;
               if (var2 != null) {
                  break label13;
               }
            }

            var1 = this;
         }

         this.o = (o5.d)var1;
      }

      return (o5.d)var1;
   }
}
