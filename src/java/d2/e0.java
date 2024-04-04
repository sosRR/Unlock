package d2;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public final class e0 extends Fragment implements e {
   private static final WeakHashMap p = new WeakHashMap();
   private final Map m = Collections.synchronizedMap(new n.a());
   private int n = 0;
   private Bundle o;

   public static e0 d(Activity var0) {
      WeakHashMap var3 = p;
      WeakReference var1 = (WeakReference)var3.get(var0);
      e0 var5;
      if (var1 != null) {
         var5 = (e0)var1.get();
         if (var5 != null) {
            return var5;
         }
      }

      e0 var2;
      try {
         var2 = (e0)var0.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
      } catch (ClassCastException var4) {
         throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", var4);
      }

      label21: {
         if (var2 != null) {
            var5 = var2;
            if (!var2.isRemoving()) {
               break label21;
            }
         }

         var5 = new e0();
         var0.getFragmentManager().beginTransaction().add(var5, "LifecycleFragmentImpl").commitAllowingStateLoss();
      }

      var3.put(var0, new WeakReference(var5));
      return var5;
   }

   public final void b(String var1, LifecycleCallback var2) {
      if (!this.m.containsKey(var1)) {
         this.m.put(var1, var2);
         if (this.n > 0) {
            (new q2.e(Looper.getMainLooper())).post(new d0(this, var2, var1));
         }

      } else {
         StringBuilder var3 = new StringBuilder(String.valueOf(var1).length() + 59);
         var3.append("LifecycleCallback with tag ");
         var3.append(var1);
         var3.append(" already added to this fragment.");
         throw new IllegalArgumentException(var3.toString());
      }
   }

   public final void dump(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      super.dump(var1, var2, var3, var4);
      Iterator var5 = this.m.values().iterator();

      while(var5.hasNext()) {
         ((LifecycleCallback)var5.next()).a(var1, var2, var3, var4);
      }

   }

   public final LifecycleCallback j(String var1, Class var2) {
      return (LifecycleCallback)var2.cast(this.m.get(var1));
   }

   public final Activity l() {
      return this.getActivity();
   }

   public final void onActivityResult(int var1, int var2, Intent var3) {
      super.onActivityResult(var1, var2, var3);
      Iterator var4 = this.m.values().iterator();

      while(var4.hasNext()) {
         ((LifecycleCallback)var4.next()).e(var1, var2, var3);
      }

   }

   public final void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.n = 1;
      this.o = var1;

      LifecycleCallback var4;
      Bundle var5;
      for(Iterator var3 = this.m.entrySet().iterator(); var3.hasNext(); var4.f(var5)) {
         Map.Entry var2 = (Map.Entry)var3.next();
         var4 = (LifecycleCallback)var2.getValue();
         if (var1 != null) {
            var5 = var1.getBundle((String)var2.getKey());
         } else {
            var5 = null;
         }
      }

   }

   public final void onDestroy() {
      super.onDestroy();
      this.n = 5;
      Iterator var1 = this.m.values().iterator();

      while(var1.hasNext()) {
         ((LifecycleCallback)var1.next()).g();
      }

   }

   public final void onResume() {
      super.onResume();
      this.n = 3;
      Iterator var1 = this.m.values().iterator();

      while(var1.hasNext()) {
         ((LifecycleCallback)var1.next()).h();
      }

   }

   public final void onSaveInstanceState(Bundle var1) {
      super.onSaveInstanceState(var1);
      if (var1 != null) {
         Iterator var4 = this.m.entrySet().iterator();

         while(var4.hasNext()) {
            Map.Entry var3 = (Map.Entry)var4.next();
            Bundle var2 = new Bundle();
            ((LifecycleCallback)var3.getValue()).i(var2);
            var1.putBundle((String)var3.getKey(), var2);
         }

      }
   }

   public final void onStart() {
      super.onStart();
      this.n = 2;
      Iterator var1 = this.m.values().iterator();

      while(var1.hasNext()) {
         ((LifecycleCallback)var1.next()).j();
      }

   }

   public final void onStop() {
      super.onStop();
      this.n = 4;
      Iterator var1 = this.m.values().iterator();

      while(var1.hasNext()) {
         ((LifecycleCallback)var1.next()).k();
      }

   }
}
