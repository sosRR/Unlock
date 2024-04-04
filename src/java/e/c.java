package e;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.f;
import androidx.appcompat.app.d;
import androidx.core.view.m;

public class c extends f implements a {
   private d o;
   private final m.a p = new b(this);

   public c(Context var1, int var2) {
      super(var1, j(var1, var2));
      d var3 = this.i();
      var3.E(j(var1, var2));
      var3.q((Bundle)null);
   }

   private static int j(Context var0, int var1) {
      int var2 = var1;
      if (var1 == 0) {
         TypedValue var3 = new TypedValue();
         var0.getTheme().resolveAttribute(d.a.z, var3, true);
         var2 = var3.resourceId;
      }

      return var2;
   }

   public void addContentView(View var1, ViewGroup.LayoutParams var2) {
      this.i().d(var1, var2);
   }

   public void dismiss() {
      super.dismiss();
      this.i().r();
   }

   public boolean dispatchKeyEvent(KeyEvent var1) {
      View var2 = this.getWindow().getDecorView();
      return m.b(this.p, var2, this, var1);
   }

   public void f(androidx.appcompat.view.b var1) {
   }

   public View findViewById(int var1) {
      return this.i().i(var1);
   }

   public void g(androidx.appcompat.view.b var1) {
   }

   public d i() {
      if (this.o == null) {
         this.o = d.h(this, this);
      }

      return this.o;
   }

   public void invalidateOptionsMenu() {
      this.i().o();
   }

   boolean k(KeyEvent var1) {
      return super.dispatchKeyEvent(var1);
   }

   public androidx.appcompat.view.b l(androidx.appcompat.view.b.a var1) {
      return null;
   }

   public boolean m(int var1) {
      return this.i().z(var1);
   }

   protected void onCreate(Bundle var1) {
      this.i().n();
      super.onCreate(var1);
      this.i().q(var1);
   }

   protected void onStop() {
      super.onStop();
      this.i().w();
   }

   public void setContentView(int var1) {
      this.i().A(var1);
   }

   public void setContentView(View var1) {
      this.i().B(var1);
   }

   public void setContentView(View var1, ViewGroup.LayoutParams var2) {
      this.i().C(var1, var2);
   }

   public void setTitle(int var1) {
      super.setTitle(var1);
      this.i().F(this.getContext().getString(var1));
   }

   public void setTitle(CharSequence var1) {
      super.setTitle(var1);
      this.i().F(var1);
   }
}
