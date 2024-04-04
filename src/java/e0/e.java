package e0;

import android.text.Editable;
import android.text.method.KeyListener;
import android.view.KeyEvent;
import android.view.View;

final class e implements KeyListener {
   private final KeyListener a;
   private final a b;

   e(KeyListener var1) {
      this(var1, new a());
   }

   e(KeyListener var1, a var2) {
      this.a = var1;
      this.b = var2;
   }

   public void clearMetaKeyState(View var1, Editable var2, int var3) {
      this.a.clearMetaKeyState(var1, var2, var3);
   }

   public int getInputType() {
      return this.a.getInputType();
   }

   public boolean onKeyDown(View var1, Editable var2, int var3, KeyEvent var4) {
      boolean var5;
      if (!this.b.a(var2, var3, var4) && !this.a.onKeyDown(var1, var2, var3, var4)) {
         var5 = false;
      } else {
         var5 = true;
      }

      return var5;
   }

   public boolean onKeyOther(View var1, Editable var2, KeyEvent var3) {
      return this.a.onKeyOther(var1, var2, var3);
   }

   public boolean onKeyUp(View var1, Editable var2, int var3, KeyEvent var4) {
      return this.a.onKeyUp(var1, var2, var3, var4);
   }

   public static class a {
      public boolean a(Editable var1, int var2, KeyEvent var3) {
         return androidx.emoji2.text.e.f(var1, var2, var3);
      }
   }
}
