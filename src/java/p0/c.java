package p0;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.h;
import androidx.lifecycle.n;
import androidx.savedstate.Recreator;
import java.util.Iterator;
import java.util.Map;
import x5.g;

@SuppressLint({"RestrictedApi"})
public final class c {
   private static final p0.c.b g = new p0.c.b((x5.e)null);
   private final k.b a = new k.b();
   private boolean b;
   private Bundle c;
   private boolean d;
   private Recreator.b e;
   private boolean f = true;

   // $FF: synthetic method
   public static void a(p0.c var0, n var1, h.b var2) {
      d(var0, var1, var2);
   }

   private static final void d(p0.c var0, n var1, h.b var2) {
      x5.g.e(var0, "this$0");
      x5.g.e(var1, "<anonymous parameter 0>");
      x5.g.e(var2, "event");
      if (var2 == androidx.lifecycle.h.b.ON_START) {
         var0.f = true;
      } else if (var2 == androidx.lifecycle.h.b.ON_STOP) {
         var0.f = false;
      }

   }

   public final Bundle b(String var1) {
      x5.g.e(var1, "key");
      if (this.d) {
         Bundle var4 = this.c;
         if (var4 != null) {
            if (var4 != null) {
               var4 = var4.getBundle(var1);
            } else {
               var4 = null;
            }

            Bundle var5 = this.c;
            if (var5 != null) {
               var5.remove(var1);
            }

            Bundle var6 = this.c;
            boolean var3 = false;
            boolean var2 = var3;
            if (var6 != null) {
               var2 = var3;
               if (!var6.isEmpty()) {
                  var2 = true;
               }
            }

            if (!var2) {
               this.c = null;
            }

            return var4;
         } else {
            return null;
         }
      } else {
         throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
      }
   }

   public final p0.c.c c(String var1) {
      x5.g.e(var1, "key");
      Iterator var4 = this.a.iterator();

      p0.c.c var5;
      while(true) {
         if (var4.hasNext()) {
            Map.Entry var2 = (Map.Entry)var4.next();
            x5.g.d(var2, "components");
            String var3 = (String)var2.getKey();
            p0.c.c var6 = (p0.c.c)var2.getValue();
            if (!x5.g.a(var3, var1)) {
               continue;
            }

            var5 = var6;
            break;
         }

         var5 = null;
         break;
      }

      return var5;
   }

   public final void e(h var1) {
      x5.g.e(var1, "lifecycle");
      if (this.b ^ true) {
         var1.a(new p0.b(this));
         this.b = true;
      } else {
         throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
      }
   }

   public final void f(Bundle var1) {
      if (this.b) {
         if (this.d ^ true) {
            if (var1 != null) {
               var1 = var1.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            } else {
               var1 = null;
            }

            this.c = var1;
            this.d = true;
         } else {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
         }
      } else {
         throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
      }
   }

   public final void g(Bundle var1) {
      x5.g.e(var1, "outBundle");
      Bundle var2 = new Bundle();
      Bundle var3 = this.c;
      if (var3 != null) {
         var2.putAll(var3);
      }

      k.b.d var5 = this.a.h();
      x5.g.d(var5, "this.components.iteratorWithAdditions()");

      while(var5.hasNext()) {
         Map.Entry var4 = (Map.Entry)var5.next();
         var2.putBundle((String)var4.getKey(), ((p0.c.c)var4.getValue()).a());
      }

      if (!var2.isEmpty()) {
         var1.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", var2);
      }

   }

   public final void h(String var1, p0.c.c var2) {
      x5.g.e(var1, "key");
      x5.g.e(var2, "provider");
      boolean var3;
      if ((p0.c.c)this.a.m(var1, var2) == null) {
         var3 = true;
      } else {
         var3 = false;
      }

      if (!var3) {
         throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
      }
   }

   public final void i(Class var1) {
      x5.g.e(var1, "clazz");
      if (this.f) {
         Recreator.b var3 = this.e;
         Recreator.b var2 = var3;
         if (var3 == null) {
            var2 = new Recreator.b(this);
         }

         this.e = var2;

         try {
            var1.getDeclaredConstructor(new Class[0]);
         } catch (NoSuchMethodException var4) {
            StringBuilder var6 = new StringBuilder();
            var6.append("Class ");
            var6.append(var1.getSimpleName());
            var6.append(" must have default constructor in order to be automatically recreated");
            throw new IllegalArgumentException(var6.toString(), var4);
         }

         var2 = this.e;
         if (var2 != null) {
            String var5 = var1.getName();
            x5.g.d(var5, "clazz.name");
            var2.b(var5);
         }

      } else {
         throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
      }
   }

   public interface a {
      void a(e var1);
   }

   private static final class b {
      private b() {
      }

      // $FF: synthetic method
      public b(x5.e var1) {
         this();
      }
   }

   public interface c {
      Bundle a();
   }
}
