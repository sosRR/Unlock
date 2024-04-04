package d2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public final class g0 extends Fragment implements e {
   private static final WeakHashMap q0 = new WeakHashMap();
   private final Map n0 = Collections.synchronizedMap(new n.a());
   private int o0 = 0;
   private Bundle p0;

   public static g0 R1(androidx.fragment.app.e var0) {
      WeakHashMap var3 = q0;
      WeakReference var1 = (WeakReference)var3.get(var0);
      g0 var5;
      if (var1 != null) {
         var5 = (g0)var1.get();
         if (var5 != null) {
            return var5;
         }
      }

      g0 var2;
      try {
         var2 = (g0)var0.x().g0("SupportLifecycleFragmentImpl");
      } catch (ClassCastException var4) {
         throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", var4);
      }

      label21: {
         if (var2 != null) {
            var5 = var2;
            if (!var2.l0()) {
               break label21;
            }
         }

         var5 = new g0();
         var0.x().l().d(var5, "SupportLifecycleFragmentImpl").h();
      }

      var3.put(var0, new WeakReference(var5));
      return var5;
   }

   public final void A0() {
      super.A0();
      this.o0 = 5;
      Iterator var1 = this.n0.values().iterator();

      while(var1.hasNext()) {
         ((LifecycleCallback)var1.next()).g();
      }

   }

   public final void Q0() {
      super.Q0();
      this.o0 = 3;
      Iterator var1 = this.n0.values().iterator();

      while(var1.hasNext()) {
         ((LifecycleCallback)var1.next()).h();
      }

   }

   public final void R0(Bundle var1) {
      super.R0(var1);
      if (var1 != null) {
         Iterator var3 = this.n0.entrySet().iterator();

         while(var3.hasNext()) {
            Map.Entry var2 = (Map.Entry)var3.next();
            Bundle var4 = new Bundle();
            ((LifecycleCallback)var2.getValue()).i(var4);
            var1.putBundle((String)var2.getKey(), var4);
         }

      }
   }

   public final void S0() {
      super.S0();
      this.o0 = 2;
      Iterator var1 = this.n0.values().iterator();

      while(var1.hasNext()) {
         ((LifecycleCallback)var1.next()).j();
      }

   }

   public final void T0() {
      super.T0();
      this.o0 = 4;
      Iterator var1 = this.n0.values().iterator();

      while(var1.hasNext()) {
         ((LifecycleCallback)var1.next()).k();
      }

   }

   public final void b(String var1, LifecycleCallback var2) {
      if (!this.n0.containsKey(var1)) {
         this.n0.put(var1, var2);
         if (this.o0 > 0) {
            (new q2.e(Looper.getMainLooper())).post(new f0(this, var2, var1));
         }

      } else {
         StringBuilder var3 = new StringBuilder(String.valueOf(var1).length() + 59);
         var3.append("LifecycleCallback with tag ");
         var3.append(var1);
         var3.append(" already added to this fragment.");
         throw new IllegalArgumentException(var3.toString());
      }
   }

   public final LifecycleCallback j(String var1, Class var2) {
      return (LifecycleCallback)var2.cast(this.n0.get(var1));
   }

   // $FF: synthetic method
   public final Activity l() {
      return this.r();
   }

   public final void o(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      super.o(var1, var2, var3, var4);
      Iterator var5 = this.n0.values().iterator();

      while(var5.hasNext()) {
         ((LifecycleCallback)var5.next()).a(var1, var2, var3, var4);
      }

   }

   public final void q0(int var1, int var2, Intent var3) {
      super.q0(var1, var2, var3);
      Iterator var4 = this.n0.values().iterator();

      while(var4.hasNext()) {
         ((LifecycleCallback)var4.next()).e(var1, var2, var3);
      }

   }

   public final void v0(Bundle var1) {
      super.v0(var1);
      this.o0 = 1;
      this.p0 = var1;

      LifecycleCallback var4;
      Bundle var5;
      for(Iterator var3 = this.n0.entrySet().iterator(); var3.hasNext(); var4.f(var5)) {
         Map.Entry var2 = (Map.Entry)var3.next();
         var4 = (LifecycleCallback)var2.getValue();
         if (var1 != null) {
            var5 = var1.getBundle((String)var2.getKey());
         } else {
            var5 = null;
         }
      }

   }
}
