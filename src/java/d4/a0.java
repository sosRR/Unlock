package d4;

import com.google.auto.value.AutoValue;
import com.google.auto.value.AutoValue.Builder;
import java.nio.charset.Charset;

@AutoValue
public abstract class a0 {
   private static final Charset a = Charset.forName("UTF-8");

   public static b b() {
      return new d4.b.b();
   }

   public abstract String c();

   public abstract String d();

   public abstract String e();

   public abstract String f();

   public abstract d g();

   public abstract int h();

   public abstract String i();

   public abstract e j();

   protected abstract b k();

   public a0 l(b0 var1) {
      if (this.j() != null) {
         return this.k().i(this.j().o(var1)).a();
      } else {
         throw new IllegalStateException("Reports without sessions cannot have events added to them.");
      }
   }

   public a0 m(d var1) {
      return this.k().i((e)null).f(var1).a();
   }

   public a0 n(long var1, boolean var3, String var4) {
      b var5 = this.k();
      if (this.j() != null) {
         var5.i(this.j().p(var1, var3, var4));
      }

      return var5.a();
   }

   @AutoValue
   public abstract static class a {
      public static a a() {
         return new d4.c.b();
      }

      public abstract int b();

      public abstract int c();

      public abstract String d();

      public abstract long e();

      public abstract int f();

      public abstract long g();

      public abstract long h();

      public abstract String i();

      @Builder
      public abstract static class a {
         public abstract a a();

         public abstract a b(int var1);

         public abstract a c(int var1);

         public abstract a d(String var1);

         public abstract a e(long var1);

         public abstract a f(int var1);

         public abstract a g(long var1);

         public abstract a h(long var1);

         public abstract a i(String var1);
      }
   }

   @Builder
   public abstract static class b {
      public abstract a0 a();

      public abstract b b(String var1);

      public abstract b c(String var1);

      public abstract b d(String var1);

      public abstract b e(String var1);

      public abstract b f(d var1);

      public abstract b g(int var1);

      public abstract b h(String var1);

      public abstract b i(e var1);
   }

   @AutoValue
   public abstract static class c {
      public static a a() {
         return new d4.d.b();
      }

      public abstract String b();

      public abstract String c();

      @Builder
      public abstract static class a {
         public abstract c a();

         public abstract a b(String var1);

         public abstract a c(String var1);
      }
   }

   @AutoValue
   public abstract static class d {
      public static a a() {
         return new d4.e.b();
      }

      public abstract b0 b();

      public abstract String c();

      @Builder
      public abstract static class a {
         public abstract d a();

         public abstract a b(b0 var1);

         public abstract a c(String var1);
      }

      @AutoValue
      public abstract static class b {
         public static a a() {
            return new d4.f.b();
         }

         public abstract byte[] b();

         public abstract String c();

         @Builder
         public abstract static class a {
            public abstract b a();

            public abstract a b(byte[] var1);

            public abstract a c(String var1);
         }
      }
   }

   @AutoValue
   public abstract static class e {
      public static b a() {
         return (new g.b()).c(false);
      }

      public abstract a b();

      public abstract c c();

      public abstract Long d();

      public abstract b0 e();

      public abstract String f();

      public abstract int g();

      public abstract String h();

      public byte[] i() {
         return this.h().getBytes(a0.a);
      }

      public abstract e j();

      public abstract long k();

      public abstract f l();

      public abstract boolean m();

      public abstract b n();

      e o(b0 var1) {
         return this.n().f(var1).a();
      }

      e p(long var1, boolean var3, String var4) {
         b var5 = this.n();
         var5.e(var1);
         var5.c(var3);
         if (var4 != null) {
            var5.m(a0.e.f.a().b(var4).a());
         }

         return var5.a();
      }

      @AutoValue
      public abstract static class a {
         public static a a() {
            return new h.b();
         }

         public abstract String b();

         public abstract String c();

         public abstract String d();

         public abstract String e();

         public abstract String f();

         public abstract b g();

         public abstract String h();

         @Builder
         public abstract static class a {
            public abstract a a();

            public abstract a b(String var1);

            public abstract a c(String var1);

            public abstract a d(String var1);

            public abstract a e(String var1);

            public abstract a f(String var1);

            public abstract a g(String var1);
         }

         @AutoValue
         public abstract static class b {
            public abstract String a();
         }
      }

      @Builder
      public abstract static class b {
         public abstract e a();

         public abstract b b(a var1);

         public abstract b c(boolean var1);

         public abstract b d(c var1);

         public abstract b e(Long var1);

         public abstract b f(b0 var1);

         public abstract b g(String var1);

         public abstract b h(int var1);

         public abstract b i(String var1);

         public b j(byte[] var1) {
            return this.i(new String(var1, a0.a));
         }

         public abstract b k(e var1);

         public abstract b l(long var1);

         public abstract b m(f var1);
      }

      @AutoValue
      public abstract static class c {
         public static a a() {
            return new j.b();
         }

         public abstract int b();

         public abstract int c();

         public abstract long d();

         public abstract String e();

         public abstract String f();

         public abstract String g();

         public abstract long h();

         public abstract int i();

         public abstract boolean j();

         @Builder
         public abstract static class a {
            public abstract c a();

            public abstract a b(int var1);

            public abstract a c(int var1);

            public abstract a d(long var1);

            public abstract a e(String var1);

            public abstract a f(String var1);

            public abstract a g(String var1);

            public abstract a h(long var1);

            public abstract a i(boolean var1);

            public abstract a j(int var1);
         }
      }

      @AutoValue
      public abstract static class d {
         public static b a() {
            return new k.b();
         }

         public abstract a b();

         public abstract c c();

         public abstract d d();

         public abstract long e();

         public abstract String f();

         public abstract b g();

         @AutoValue
         public abstract static class a {
            public static a a() {
               return new l.b();
            }

            public abstract Boolean b();

            public abstract b0 c();

            public abstract b d();

            public abstract b0 e();

            public abstract int f();

            public abstract a g();

            @Builder
            public abstract static class a {
               public abstract a a();

               public abstract a b(Boolean var1);

               public abstract a c(b0 var1);

               public abstract a d(b var1);

               public abstract a e(b0 var1);

               public abstract a f(int var1);
            }

            @AutoValue
            public abstract static class b {
               public static b a() {
                  return new m.b();
               }

               public abstract a b();

               public abstract b0 c();

               public abstract c d();

               public abstract d e();

               public abstract b0 f();

               @AutoValue
               public abstract static class a {
                  public static a a() {
                     return new n.b();
                  }

                  public abstract long b();

                  public abstract String c();

                  public abstract long d();

                  public abstract String e();

                  public byte[] f() {
                     String var1 = this.e();
                     byte[] var2;
                     if (var1 != null) {
                        var2 = var1.getBytes(a0.a);
                     } else {
                        var2 = null;
                     }

                     return var2;
                  }

                  @Builder
                  public abstract static class a {
                     public abstract a a();

                     public abstract a b(long var1);

                     public abstract a c(String var1);

                     public abstract a d(long var1);

                     public abstract a e(String var1);

                     public a f(byte[] var1) {
                        return this.e(new String(var1, a0.a));
                     }
                  }
               }

               @Builder
               public abstract static class b {
                  public abstract b a();

                  public abstract b b(a var1);

                  public abstract b c(b0 var1);

                  public abstract b d(c var1);

                  public abstract b e(d var1);

                  public abstract b f(b0 var1);
               }

               @AutoValue
               public abstract static class c {
                  public static a a() {
                     return new o.b();
                  }

                  public abstract c b();

                  public abstract b0 c();

                  public abstract int d();

                  public abstract String e();

                  public abstract String f();

                  @Builder
                  public abstract static class a {
                     public abstract c a();

                     public abstract a b(c var1);

                     public abstract a c(b0 var1);

                     public abstract a d(int var1);

                     public abstract a e(String var1);

                     public abstract a f(String var1);
                  }
               }

               @AutoValue
               public abstract static class d {
                  public static a a() {
                     return new p.b();
                  }

                  public abstract long b();

                  public abstract String c();

                  public abstract String d();

                  @Builder
                  public abstract static class a {
                     public abstract d a();

                     public abstract a b(long var1);

                     public abstract a c(String var1);

                     public abstract a d(String var1);
                  }
               }

               @AutoValue
               public abstract static class e {
                  public static a a() {
                     return new q.b();
                  }

                  public abstract b0 b();

                  public abstract int c();

                  public abstract String d();

                  @Builder
                  public abstract static class a {
                     public abstract e a();

                     public abstract a b(b0 var1);

                     public abstract a c(int var1);

                     public abstract a d(String var1);
                  }

                  @AutoValue
                  public abstract static class b {
                     public static a a() {
                        return new r.b();
                     }

                     public abstract String b();

                     public abstract int c();

                     public abstract long d();

                     public abstract long e();

                     public abstract String f();

                     @Builder
                     public abstract static class a {
                        public abstract b a();

                        public abstract a b(String var1);

                        public abstract a c(int var1);

                        public abstract a d(long var1);

                        public abstract a e(long var1);

                        public abstract a f(String var1);
                     }
                  }
               }
            }
         }

         @Builder
         public abstract static class b {
            public abstract d a();

            public abstract b b(a var1);

            public abstract b c(c var1);

            public abstract b d(d var1);

            public abstract b e(long var1);

            public abstract b f(String var1);
         }

         @AutoValue
         public abstract static class c {
            public static a a() {
               return new s.b();
            }

            public abstract Double b();

            public abstract int c();

            public abstract long d();

            public abstract int e();

            public abstract long f();

            public abstract boolean g();

            @Builder
            public abstract static class a {
               public abstract c a();

               public abstract a b(Double var1);

               public abstract a c(int var1);

               public abstract a d(long var1);

               public abstract a e(int var1);

               public abstract a f(boolean var1);

               public abstract a g(long var1);
            }
         }

         @AutoValue
         public abstract static class d {
            public static a a() {
               return new t.b();
            }

            public abstract String b();

            @Builder
            public abstract static class a {
               public abstract d a();

               public abstract a b(String var1);
            }
         }
      }

      @AutoValue
      public abstract static class e {
         public static a a() {
            return new u.b();
         }

         public abstract String b();

         public abstract int c();

         public abstract String d();

         public abstract boolean e();

         @Builder
         public abstract static class a {
            public abstract e a();

            public abstract a b(String var1);

            public abstract a c(boolean var1);

            public abstract a d(int var1);

            public abstract a e(String var1);
         }
      }

      @AutoValue
      public abstract static class f {
         public static a a() {
            return new v.b();
         }

         public abstract String b();

         @Builder
         public abstract static class a {
            public abstract f a();

            public abstract a b(String var1);
         }
      }
   }
}
