package a3;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import java.util.List;

public class h {
   private final n.g a = new n.g();
   private final n.g b = new n.g();

   private static void a(h var0, Animator var1) {
      if (var1 instanceof ObjectAnimator) {
         ObjectAnimator var3 = (ObjectAnimator)var1;
         var0.h(var3.getPropertyName(), var3.getValues());
         var0.i(var3.getPropertyName(), i.b(var3));
      } else {
         StringBuilder var2 = new StringBuilder();
         var2.append("Animator must be an ObjectAnimator: ");
         var2.append(var1);
         throw new IllegalArgumentException(var2.toString());
      }
   }

   public static h b(Context var0, TypedArray var1, int var2) {
      if (var1.hasValue(var2)) {
         var2 = var1.getResourceId(var2, 0);
         if (var2 != 0) {
            return c(var0, var2);
         }
      }

      return null;
   }

   public static h c(Context param0, int param1) {
      // $FF: Couldn't be decompiled
   }

   private static h d(List var0) {
      h var3 = new h();
      int var2 = var0.size();

      for(int var1 = 0; var1 < var2; ++var1) {
         a(var3, (Animator)var0.get(var1));
      }

      return var3;
   }

   public i e(String var1) {
      if (this.g(var1)) {
         return (i)this.a.get(var1);
      } else {
         throw new IllegalArgumentException();
      }
   }

   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof h)) {
         return false;
      } else {
         h var2 = (h)var1;
         return this.a.equals(var2.a);
      }
   }

   public long f() {
      int var2 = this.a.size();
      long var3 = 0L;

      for(int var1 = 0; var1 < var2; ++var1) {
         i var5 = (i)this.a.m(var1);
         var3 = Math.max(var3, var5.c() + var5.d());
      }

      return var3;
   }

   public boolean g(String var1) {
      boolean var2;
      if (this.a.get(var1) != null) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public void h(String var1, PropertyValuesHolder[] var2) {
      this.b.put(var1, var2);
   }

   public int hashCode() {
      return this.a.hashCode();
   }

   public void i(String var1, i var2) {
      this.a.put(var1, var2);
   }

   public String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append('\n');
      var1.append(this.getClass().getName());
      var1.append('{');
      var1.append(Integer.toHexString(System.identityHashCode(this)));
      var1.append(" timings: ");
      var1.append(this.a);
      var1.append("}\n");
      return var1.toString();
   }
}
