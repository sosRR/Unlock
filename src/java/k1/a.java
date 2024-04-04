package k1;

public final class a implements n4.a {
   public static final n4.a a = new k1.a();

   private a() {
   }

   public void a(n4.b var1) {
      var1.a(l.class, k1.a.e.a);
      var1.a(o1.a.class, k1.a.a.a);
      var1.a(o1.f.class, k1.a.g.a);
      var1.a(o1.d.class, k1.a.d.a);
      var1.a(o1.c.class, k1.a.c.a);
      var1.a(o1.b.class, k1.a.b.a);
      var1.a(o1.e.class, k1.a.f.a);
   }

   private static final class a implements m4.c {
      static final k1.a a = new k1.a();
      private static final m4.b b = m4.b.a("window").b(p4.a.b().c(1).a()).a();
      private static final m4.b c = m4.b.a("logSourceMetrics").b(p4.a.b().c(2).a()).a();
      private static final m4.b d = m4.b.a("globalMetrics").b(p4.a.b().c(3).a()).a();
      private static final m4.b e = m4.b.a("appNamespace").b(p4.a.b().c(4).a()).a();

      public void b(o1.a var1, m4.d var2) {
         var2.b(b, var1.d());
         var2.b(c, var1.c());
         var2.b(d, var1.b());
         var2.b(e, var1.a());
      }
   }

   private static final class b implements m4.c {
      static final k1.a.b a = new k1.a.b();
      private static final m4.b b = m4.b.a("storageMetrics").b(p4.a.b().c(1).a()).a();

      public void b(o1.b var1, m4.d var2) {
         var2.b(b, var1.a());
      }
   }

   private static final class c implements m4.c {
      static final k1.a.c a = new k1.a.c();
      private static final m4.b b = m4.b.a("eventsDroppedCount").b(p4.a.b().c(1).a()).a();
      private static final m4.b c = m4.b.a("reason").b(p4.a.b().c(3).a()).a();

      public void b(o1.c var1, m4.d var2) {
         var2.e(b, var1.a());
         var2.b(c, var1.b());
      }
   }

   private static final class d implements m4.c {
      static final k1.a.d a = new k1.a.d();
      private static final m4.b b = m4.b.a("logSource").b(p4.a.b().c(1).a()).a();
      private static final m4.b c = m4.b.a("logEventDropped").b(p4.a.b().c(2).a()).a();

      public void b(o1.d var1, m4.d var2) {
         var2.b(b, var1.b());
         var2.b(c, var1.a());
      }
   }

   private static final class e implements m4.c {
      static final k1.a.e a = new k1.a.e();
      private static final m4.b b = m4.b.d("clientMetrics");

      public void b(l var1, m4.d var2) {
         var2.b(b, var1.b());
      }
   }

   private static final class f implements m4.c {
      static final k1.a.f a = new k1.a.f();
      private static final m4.b b = m4.b.a("currentCacheSizeBytes").b(p4.a.b().c(1).a()).a();
      private static final m4.b c = m4.b.a("maxCacheSizeBytes").b(p4.a.b().c(2).a()).a();

      public void b(o1.e var1, m4.d var2) {
         var2.e(b, var1.a());
         var2.e(c, var1.b());
      }
   }

   private static final class g implements m4.c {
      static final k1.a.g a = new k1.a.g();
      private static final m4.b b = m4.b.a("startMs").b(p4.a.b().c(1).a()).a();
      private static final m4.b c = m4.b.a("endMs").b(p4.a.b().c(2).a()).a();

      public void b(o1.f var1, m4.d var2) {
         var2.e(b, var1.b());
         var2.e(c, var1.a());
      }
   }
}
