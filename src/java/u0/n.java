package u0;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

public class n {
   private static l a = new b();
   private static ThreadLocal b = new ThreadLocal();
   static ArrayList c = new ArrayList();

   public static void a(ViewGroup var0, l var1) {
      if (!c.contains(var0) && androidx.core.view.d0.S(var0)) {
         c.add(var0);
         l var2 = var1;
         if (var1 == null) {
            var2 = a;
         }

         var1 = var2.q();
         d(var0, var1);
         k.c(var0, (k)null);
         c(var0, var1);
      }

   }

   static a b() {
      WeakReference var0 = (WeakReference)b.get();
      a var2;
      if (var0 != null) {
         var2 = (a)var0.get();
         if (var2 != null) {
            return var2;
         }
      }

      var2 = new a();
      WeakReference var1 = new WeakReference(var2);
      b.set(var1);
      return var2;
   }

   private static void c(ViewGroup var0, l var1) {
      if (var1 != null && var0 != null) {
         a var2 = new a(var1, var0);
         var0.addOnAttachStateChangeListener(var2);
         var0.getViewTreeObserver().addOnPreDrawListener(var2);
      }

   }

   private static void d(ViewGroup var0, l var1) {
      ArrayList var2 = (ArrayList)b().get(var0);
      if (var2 != null && var2.size() > 0) {
         Iterator var4 = var2.iterator();

         while(var4.hasNext()) {
            ((l)var4.next()).R(var0);
         }
      }

      if (var1 != null) {
         var1.o(var0, true);
      }

      k var3 = k.b(var0);
      if (var3 != null) {
         var3.a();
      }

   }

   private static class a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
      l m;
      ViewGroup n;

      a(l var1, ViewGroup var2) {
         this.m = var1;
         this.n = var2;
      }

      private void a() {
         this.n.getViewTreeObserver().removeOnPreDrawListener(this);
         this.n.removeOnAttachStateChangeListener(this);
      }

      public boolean onPreDraw() {
         this.a();
         if (!n.c.remove(this.n)) {
            return true;
         } else {
            a var4 = n.b();
            ArrayList var3 = (ArrayList)var4.get(this.n);
            ArrayList var2 = null;
            ArrayList var1;
            if (var3 == null) {
               var1 = new ArrayList();
               var4.put(this.n, var1);
            } else {
               var1 = var3;
               if (var3.size() > 0) {
                  var2 = new ArrayList(var3);
                  var1 = var3;
               }
            }

            var1.add(this.m);
            this.m.a(new n$a$a(this, var4));
            this.m.o(this.n, false);
            if (var2 != null) {
               Iterator var5 = var2.iterator();

               while(var5.hasNext()) {
                  ((l)var5.next()).V(this.n);
               }
            }

            this.m.S(this.n);
            return true;
         }
      }

      public void onViewAttachedToWindow(View var1) {
      }

      public void onViewDetachedFromWindow(View var1) {
         this.a();
         n.c.remove(this.n);
         ArrayList var2 = (ArrayList)n.b().get(this.n);
         if (var2 != null && var2.size() > 0) {
            Iterator var3 = var2.iterator();

            while(var3.hasNext()) {
               ((l)var3.next()).V(this.n);
            }
         }

         this.m.p(true);
      }
   }
}
