package c4;

import java.io.File;

public class c {
   private static final <undefinedtype> c = new a(null) {
      public void a() {
      }

      public String b() {
         return null;
      }

      public byte[] c() {
         return null;
      }

      public void d() {
      }

      public void e(long var1, String var3) {
      }
   };
   private final g4.f a;
   private a b;

   public c(g4.f var1) {
      this.a = var1;
      this.b = c;
   }

   public c(g4.f var1, String var2) {
      this(var1);
      this.e(var2);
   }

   private File d(String var1) {
      return this.a.o(var1, "userlog");
   }

   public void a() {
      this.b.d();
   }

   public byte[] b() {
      return this.b.c();
   }

   public String c() {
      return this.b.b();
   }

   public final void e(String var1) {
      this.b.a();
      this.b = c;
      if (var1 != null) {
         this.f(this.d(var1), 65536);
      }
   }

   void f(File var1, int var2) {
      this.b = new f(var1, var2);
   }

   public void g(long var1, String var3) {
      this.b.e(var1, var3);
   }
}
