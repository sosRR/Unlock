package i4;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import b4.m0;
import b4.q;
import b4.r;
import b4.s;
import b4.v;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

public class f implements i {
   private final Context a;
   private final j b;
   private final g c;
   private final q d;
   private final a e;
   private final k f;
   private final r g;
   private final AtomicReference h;
   private final AtomicReference i;

   f(Context var1, j var2, q var3, g var4, a var5, k var6, r var7) {
      AtomicReference var8 = new AtomicReference();
      this.h = var8;
      this.i = new AtomicReference(new y2.h());
      this.a = var1;
      this.b = var2;
      this.d = var3;
      this.c = var4;
      this.e = var5;
      this.f = var6;
      this.g = var7;
      var8.set(i4.b.b(var3));
   }

   public static f l(Context var0, String var1, v var2, f4.b var3, String var4, String var5, g4.f var6, r var7) {
      String var8 = var2.g();
      m0 var10 = new m0();
      g var9 = new g(var10);
      a var12 = new a(var6);
      c var11 = new c(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", new Object[]{var1}), var3);
      return new f(var0, new j(var1, var2.h(), var2.i(), var2.j(), var2, b4.g.h(b4.g.n(var0), var1, var5, var4), var5, var4, s.d(var8).e()), var10, var9, var12, var11, var7);
   }

   private d m(e var1) {
      Object var6 = null;
      Object var5 = null;
      d var4 = (d)var6;

      Exception var15;
      label72: {
         Exception var10000;
         label89: {
            JSONObject var7;
            boolean var10001;
            try {
               if (i4.e.n.equals(var1)) {
                  return var4;
               }

               var7 = this.e.b();
            } catch (Exception var13) {
               var10000 = var13;
               var10001 = false;
               break label89;
            }

            if (var7 != null) {
               label96: {
                  try {
                     var4 = this.c.b(var7);
                  } catch (Exception var12) {
                     var10000 = var12;
                     var10001 = false;
                     break label96;
                  }

                  if (var4 == null) {
                     try {
                        y3.f.f().e("Failed to parse cached settings data.", (Throwable)null);
                     } catch (Exception var10) {
                        var10000 = var10;
                        var10001 = false;
                        break label96;
                     }

                     var4 = (d)var6;
                  } else {
                     label66: {
                        try {
                           this.q(var7, "Loaded cached settings: ");
                           long var2 = this.d.a();
                           if (!i4.e.o.equals(var1) && var4.a(var2)) {
                              break label66;
                           }
                        } catch (Exception var14) {
                           var10000 = var14;
                           var10001 = false;
                           break label96;
                        }

                        try {
                           y3.f.f().i("Returning cached settings.");
                           return var4;
                        } catch (Exception var9) {
                           var15 = var9;
                           break label72;
                        }
                     }

                     try {
                        y3.f.f().i("Cached settings have expired.");
                     } catch (Exception var8) {
                        var10000 = var8;
                        var10001 = false;
                        break label96;
                     }

                     var4 = (d)var6;
                  }

                  return var4;
               }
            } else {
               label91: {
                  try {
                     y3.f.f().b("No cached settings data found.");
                  } catch (Exception var11) {
                     var10000 = var11;
                     var10001 = false;
                     break label91;
                  }

                  var4 = (d)var6;
                  return var4;
               }
            }
         }

         var15 = var10000;
         var4 = (d)var5;
      }

      y3.f.f().e("Failed to get cached settings", var15);
      return var4;
   }

   private String n() {
      return b4.g.r(this.a).getString("existing_instance_identifier", "");
   }

   private void q(JSONObject var1, String var2) {
      y3.f var3 = y3.f.f();
      StringBuilder var4 = new StringBuilder();
      var4.append(var2);
      var4.append(var1.toString());
      var3.b(var4.toString());
   }

   @SuppressLint({"CommitPrefEdits"})
   private boolean r(String var1) {
      SharedPreferences.Editor var2 = b4.g.r(this.a).edit();
      var2.putString("existing_instance_identifier", var1);
      var2.apply();
      return true;
   }

   public y2.g a() {
      return ((y2.h)this.i.get()).a();
   }

   public d b() {
      return (d)this.h.get();
   }

   boolean k() {
      return this.n().equals(this.b.f) ^ true;
   }

   public y2.g o(e var1, Executor var2) {
      d var3;
      if (!this.k()) {
         var3 = this.m(var1);
         if (var3 != null) {
            this.h.set(var3);
            ((y2.h)this.i.get()).e(var3);
            return y2.j.e((Object)null);
         }
      }

      var3 = this.m(i4.e.o);
      if (var3 != null) {
         this.h.set(var3);
         ((y2.h)this.i.get()).e(var3);
      }

      return this.g.h(var2).p(var2, new y2.f(this) {
         final f a;

         {
            this.a = var1;
         }

         public y2.g b(Void var1) {
            JSONObject var2 = this.a.f.a(this.a.b, true);
            if (var2 != null) {
               d var3 = this.a.c.b(var2);
               this.a.e.c(var3.c, var2);
               this.a.q(var2, "Loaded settings: ");
               f var4 = this.a;
               var4.r(var4.b.f);
               this.a.h.set(var3);
               ((y2.h)this.a.i.get()).e(var3);
            }

            return y2.j.e((Object)null);
         }
      });
   }

   public y2.g p(Executor var1) {
      return this.o(i4.e.m, var1);
   }
}
