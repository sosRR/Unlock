package x0;

public final class b {
   public static final b i = (new a()).a();
   private l a;
   private boolean b;
   private boolean c;
   private boolean d;
   private boolean e;
   private long f;
   private long g;
   private c h;

   public b() {
      this.a = l.m;
      this.f = -1L;
      this.g = -1L;
      this.h = new c();
   }

   b(a var1) {
      this.a = l.m;
      this.f = -1L;
      this.g = -1L;
      this.h = new c();
      this.b = var1.a;
      boolean var2;
      if (var1.b) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.c = var2;
      this.a = var1.c;
      this.d = var1.d;
      this.e = var1.e;
      this.h = var1.h;
      this.f = var1.f;
      this.g = var1.g;
   }

   public b(b var1) {
      this.a = l.m;
      this.f = -1L;
      this.g = -1L;
      this.h = new c();
      this.b = var1.b;
      this.c = var1.c;
      this.a = var1.a;
      this.d = var1.d;
      this.e = var1.e;
      this.h = var1.h;
   }

   public c a() {
      return this.h;
   }

   public l b() {
      return this.a;
   }

   public long c() {
      return this.f;
   }

   public long d() {
      return this.g;
   }

   public boolean e() {
      boolean var1;
      if (this.h.c() > 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && b.class == var1.getClass()) {
         b var2 = (b)var1;
         if (this.b != var2.b) {
            return false;
         } else if (this.c != var2.c) {
            return false;
         } else if (this.d != var2.d) {
            return false;
         } else if (this.e != var2.e) {
            return false;
         } else if (this.f != var2.f) {
            return false;
         } else if (this.g != var2.g) {
            return false;
         } else {
            return this.a != var2.a ? false : this.h.equals(var2.h);
         }
      } else {
         return false;
      }
   }

   public boolean f() {
      return this.d;
   }

   public boolean g() {
      return this.b;
   }

   public boolean h() {
      return this.c;
   }

   public int hashCode() {
      int var5 = this.a.hashCode();
      byte var1 = this.b;
      byte var6 = this.c;
      byte var3 = this.d;
      byte var2 = this.e;
      long var7 = this.f;
      int var4 = (int)(var7 ^ var7 >>> 32);
      var7 = this.g;
      return ((((((var5 * 31 + var1) * 31 + var6) * 31 + var3) * 31 + var2) * 31 + var4) * 31 + (int)(var7 ^ var7 >>> 32)) * 31 + this.h.hashCode();
   }

   public boolean i() {
      return this.e;
   }

   public void j(c var1) {
      this.h = var1;
   }

   public void k(l var1) {
      this.a = var1;
   }

   public void l(boolean var1) {
      this.d = var1;
   }

   public void m(boolean var1) {
      this.b = var1;
   }

   public void n(boolean var1) {
      this.c = var1;
   }

   public void o(boolean var1) {
      this.e = var1;
   }

   public void p(long var1) {
      this.f = var1;
   }

   public void q(long var1) {
      this.g = var1;
   }

   public static final class a {
      boolean a = false;
      boolean b = false;
      l c;
      boolean d;
      boolean e;
      long f;
      long g;
      c h;

      public a() {
         this.c = l.m;
         this.d = false;
         this.e = false;
         this.f = -1L;
         this.g = -1L;
         this.h = new c();
      }

      public b a() {
         return new b(this);
      }

      public a b(l var1) {
         this.c = var1;
         return this;
      }
   }
}
