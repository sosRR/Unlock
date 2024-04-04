package m2;

public final class b {
   private static volatile ClassLoader a;
   private static volatile Thread b;

   public static ClassLoader a() {
      Class var1 = b.class;
      synchronized(b.class){}

      ClassLoader var0;
      try {
         if (a == null) {
            a = b();
         }

         var0 = a;
      } finally {
         ;
      }

      return var0;
   }

   private static ClassLoader b() {
      // $FF: Couldn't be decompiled
   }

   private static Thread c() {
      // $FF: Couldn't be decompiled
   }
}
