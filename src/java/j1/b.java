package j1;

public final class b implements n4.a {
   public static final n4.a a = new j1.b();

   private b() {
   }

   public void a(n4.b var1) {
      j1.b.b var2 = j1.b.b.a;
      var1.a(j.class, var2);
      var1.a(j1.d.class, var2);
      j1.b.e var3 = j1.b.e.a;
      var1.a(m.class, var3);
      var1.a(g.class, var3);
      j1.b.c var4 = j1.b.c.a;
      var1.a(k.class, var4);
      var1.a(j1.e.class, var4);
      j1.b.a var5 = j1.b.a.a;
      var1.a(j1.a.class, var5);
      var1.a(j1.c.class, var5);
      j1.b.d var6 = j1.b.d.a;
      var1.a(l.class, var6);
      var1.a(j1.f.class, var6);
      j1.b.f var7 = j1.b.f.a;
      var1.a(o.class, var7);
      var1.a(i.class, var7);
   }

   private static final class a implements m4.c {
      static final j1.b.a a = new j1.b.a();
      private static final m4.b b = m4.b.d("sdkVersion");
      private static final m4.b c = m4.b.d("model");
      private static final m4.b d = m4.b.d("hardware");
      private static final m4.b e = m4.b.d("device");
      private static final m4.b f = m4.b.d("product");
      private static final m4.b g = m4.b.d("osBuild");
      private static final m4.b h = m4.b.d("manufacturer");
      private static final m4.b i = m4.b.d("fingerprint");
      private static final m4.b j = m4.b.d("locale");
      private static final m4.b k = m4.b.d("country");
      private static final m4.b l = m4.b.d("mccMnc");
      private static final m4.b m = m4.b.d("applicationBuild");

      public void b(j1.a var1, m4.d var2) {
         var2.b(b, var1.m());
         var2.b(c, var1.j());
         var2.b(d, var1.f());
         var2.b(e, var1.d());
         var2.b(f, var1.l());
         var2.b(g, var1.k());
         var2.b(h, var1.h());
         var2.b(i, var1.e());
         var2.b(j, var1.g());
         var2.b(k, var1.c());
         var2.b(l, var1.i());
         var2.b(m, var1.b());
      }
   }

   private static final class b implements m4.c {
      static final j1.b a = new j1.b();
      private static final m4.b b = m4.b.d("logRequest");

      public void b(j var1, m4.d var2) {
         var2.b(b, var1.c());
      }
   }

   private static final class c implements m4.c {
      static final j1.b.c a = new j1.b.c();
      private static final m4.b b = m4.b.d("clientType");
      private static final m4.b c = m4.b.d("androidClientInfo");

      public void b(k var1, m4.d var2) {
         var2.b(b, var1.c());
         var2.b(c, var1.b());
      }
   }

   private static final class d implements m4.c {
      static final j1.b.d a = new j1.b.d();
      private static final m4.b b = m4.b.d("eventTimeMs");
      private static final m4.b c = m4.b.d("eventCode");
      private static final m4.b d = m4.b.d("eventUptimeMs");
      private static final m4.b e = m4.b.d("sourceExtension");
      private static final m4.b f = m4.b.d("sourceExtensionJsonProto3");
      private static final m4.b g = m4.b.d("timezoneOffsetSeconds");
      private static final m4.b h = m4.b.d("networkConnectionInfo");

      public void b(l var1, m4.d var2) {
         var2.e(b, var1.c());
         var2.b(c, var1.b());
         var2.e(d, var1.d());
         var2.b(e, var1.f());
         var2.b(f, var1.g());
         var2.e(g, var1.h());
         var2.b(h, var1.e());
      }
   }

   private static final class e implements m4.c {
      static final j1.b.e a = new j1.b.e();
      private static final m4.b b = m4.b.d("requestTimeMs");
      private static final m4.b c = m4.b.d("requestUptimeMs");
      private static final m4.b d = m4.b.d("clientInfo");
      private static final m4.b e = m4.b.d("logSource");
      private static final m4.b f = m4.b.d("logSourceName");
      private static final m4.b g = m4.b.d("logEvent");
      private static final m4.b h = m4.b.d("qosTier");

      public void b(m var1, m4.d var2) {
         var2.e(b, var1.g());
         var2.e(c, var1.h());
         var2.b(d, var1.b());
         var2.b(e, var1.d());
         var2.b(f, var1.e());
         var2.b(g, var1.c());
         var2.b(h, var1.f());
      }
   }

   private static final class f implements m4.c {
      static final j1.b.f a = new j1.b.f();
      private static final m4.b b = m4.b.d("networkType");
      private static final m4.b c = m4.b.d("mobileSubtype");

      public void b(o var1, m4.d var2) {
         var2.b(b, var1.c());
         var2.b(c, var1.b());
      }
   }
}
