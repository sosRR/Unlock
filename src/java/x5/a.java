package x5;

import java.io.Serializable;

public abstract class a implements b6.a, Serializable {
   public static final Object s;
   private transient b6.a m;
   protected final Object n;
   private final Class o;
   private final String p;
   private final String q;
   private final boolean r;

   static {
      s = a.a.m;
   }

   public a() {
      this(s);
   }

   protected a(Object var1) {
      this(var1, (Class)null, (String)null, (String)null, false);
   }

   protected a(Object var1, Class var2, String var3, String var4, boolean var5) {
      this.n = var1;
      this.o = var2;
      this.p = var3;
      this.q = var4;
      this.r = var5;
   }

   public b6.a b() {
      b6.a var2 = this.m;
      b6.a var1 = var2;
      if (var2 == null) {
         var1 = this.c();
         this.m = var1;
      }

      return var1;
   }

   protected abstract b6.a c();

   public Object d() {
      return this.n;
   }

   public String e() {
      return this.p;
   }

   public b6.c f() {
      Class var1 = this.o;
      Object var2;
      if (var1 == null) {
         var2 = null;
      } else if (this.r) {
         var2 = x5.m.b(var1);
      } else {
         var2 = x5.m.a(var1);
      }

      return (b6.c)var2;
   }

   public String g() {
      return this.q;
   }

   private static class a implements Serializable {
      private static final a m = new a();
   }
}
