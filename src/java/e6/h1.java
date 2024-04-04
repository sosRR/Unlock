package e6;

public final class h1 extends s {
   public static final h1 n = new h1();

   private h1() {
   }

   public void N(o5.f var1, Runnable var2) {
      k1 var3 = (k1)var1.get(k1.n);
      if (var3 != null) {
         var3.m = true;
      } else {
         throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
      }
   }

   public boolean O(o5.f var1) {
      return false;
   }

   public String toString() {
      return "Dispatchers.Unconfined";
   }
}
