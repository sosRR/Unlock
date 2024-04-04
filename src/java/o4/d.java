package o4;

import com.google.firebase.encoders.EncodingException;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import m4.f;

public final class d implements n4.b {
   private static final m4.c e = new a();
   private static final m4.e f = new o4.b();
   private static final m4.e g = new c();
   private static final b h = new b();
   private final Map a = new HashMap();
   private final Map b = new HashMap();
   private m4.c c;
   private boolean d;

   public d() {
      this.c = e;
      this.d = false;
      this.p(String.class, f);
      this.p(Boolean.class, g);
      this.p(Date.class, h);
   }

   // $FF: synthetic method
   public static void b(Object var0, m4.d var1) {
      l(var0, var1);
   }

   // $FF: synthetic method
   public static void c(String var0, f var1) {
      m(var0, var1);
   }

   // $FF: synthetic method
   public static void d(Boolean var0, f var1) {
      n(var0, var1);
   }

   // $FF: synthetic method
   private static void l(Object var0, m4.d var1) {
      StringBuilder var2 = new StringBuilder();
      var2.append("Couldn't find encoder for type ");
      var2.append(var0.getClass().getCanonicalName());
      throw new EncodingException(var2.toString());
   }

   // $FF: synthetic method
   private static void m(String var0, f var1) {
      var1.c(var0);
   }

   // $FF: synthetic method
   private static void n(Boolean var0, f var1) {
      var1.d(var0);
   }

   public m4.a i() {
      return new m4.a(this) {
         final d a;

         {
            this.a = var1;
         }

         public String a(Object var1) {
            StringWriter var2 = new StringWriter();

            try {
               this.b(var1, var2);
            } catch (IOException var3) {
            }

            return var2.toString();
         }

         public void b(Object var1, Writer var2) {
            e var3 = new e(var2, this.a.a, this.a.b, this.a.c, this.a.d);
            var3.i(var1, false);
            var3.r();
         }
      };
   }

   public d j(n4.a var1) {
      var1.a(this);
      return this;
   }

   public d k(boolean var1) {
      this.d = var1;
      return this;
   }

   public d o(Class var1, m4.c var2) {
      this.a.put(var1, var2);
      this.b.remove(var1);
      return this;
   }

   public d p(Class var1, m4.e var2) {
      this.b.put(var1, var2);
      this.a.remove(var1);
      return this;
   }

   private static final class b implements m4.e {
      private static final DateFormat a;

      static {
         SimpleDateFormat var0 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
         a = var0;
         var0.setTimeZone(TimeZone.getTimeZone("UTC"));
      }

      private b() {
      }

      // $FF: synthetic method
      b(Object var1) {
         this();
      }

      public void b(Date var1, f var2) {
         var2.c(a.format(var1));
      }
   }
}
