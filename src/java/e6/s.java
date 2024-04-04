package e6;

public abstract class s extends o5.a implements o5.e {
   public static final a m = new a((x5.e)null);

   public s() {
      super(o5.e.l);
   }

   public abstract void N(o5.f var1, Runnable var2);

   public boolean O(o5.f var1) {
      return true;
   }

   public s P(int var1) {
      kotlinx.coroutines.internal.i.a(var1);
      return new kotlinx.coroutines.internal.h(this, var1);
   }

   public final void f(o5.d var1) {
      ((kotlinx.coroutines.internal.d)var1).m();
   }

   public <undefinedtype> get(o5.f.c var1) {
      return null.a(this, var1);
   }

   public final o5.d k(o5.d var1) {
      return new kotlinx.coroutines.internal.d(this, var1);
   }

   public o5.f minusKey(o5.f.c var1) {
      return null.b(this, var1);
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(x.a(this));
      var1.append('@');
      var1.append(x.b(this));
      return var1.toString();
   }

   public static final class a extends o5.b {
      private a() {
         super(o5.e.l, null.n);
      }

      // $FF: synthetic method
      public a(x5.e var1) {
         this();
      }
   }
}
