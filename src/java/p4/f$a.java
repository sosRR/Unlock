package p4;

// $FF: synthetic class
class f$a {
   static final int[] a;

   static {
      int[] var0 = new int[d.a.values().length];
      a = var0;

      try {
         var0[d.a.m.ordinal()] = 1;
      } catch (NoSuchFieldError var3) {
      }

      try {
         a[d.a.n.ordinal()] = 2;
      } catch (NoSuchFieldError var2) {
      }

      try {
         a[d.a.o.ordinal()] = 3;
      } catch (NoSuchFieldError var1) {
      }

   }
}
