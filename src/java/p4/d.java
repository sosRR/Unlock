package p4;

public @interface d {
   a intEncoding() default d.a.m;

   int tag();

   public static enum a {
      m,
      n,
      o;

      private static final a[] p;

      static {
         a var0 = new a("DEFAULT", 0);
         m = var0;
         a var2 = new a("SIGNED", 1);
         n = var2;
         a var1 = new a("FIXED", 2);
         o = var1;
         p = new a[]{var0, var2, var1};
      }
   }
}
