package e0;

import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

public final class a {
   private final b a;
   private int b = Integer.MAX_VALUE;
   private int c = 0;

   public a(EditText var1, boolean var2) {
      androidx.core.util.h.g(var1, "editText cannot be null");
      this.a = new a(var1, var2);
   }

   public KeyListener a(KeyListener var1) {
      return this.a.a(var1);
   }

   public InputConnection b(InputConnection var1, EditorInfo var2) {
      return var1 == null ? null : this.a.b(var1, var2);
   }

   public void c(boolean var1) {
      this.a.c(var1);
   }

   private static class a extends b {
      private final EditText a;
      private final g b;

      a(EditText var1, boolean var2) {
         this.a = var1;
         g var3 = new g(var1, var2);
         this.b = var3;
         var1.addTextChangedListener(var3);
         var1.setEditableFactory(e0.b.getInstance());
      }

      KeyListener a(KeyListener var1) {
         if (var1 instanceof e) {
            return var1;
         } else if (var1 == null) {
            return null;
         } else {
            return (KeyListener)(var1 instanceof NumberKeyListener ? var1 : new e(var1));
         }
      }

      InputConnection b(InputConnection var1, EditorInfo var2) {
         return (InputConnection)(var1 instanceof c ? var1 : new c(this.a, var1, var2));
      }

      void c(boolean var1) {
         this.b.c(var1);
      }
   }

   static class b {
      KeyListener a(KeyListener var1) {
         throw null;
      }

      InputConnection b(InputConnection var1, EditorInfo var2) {
         throw null;
      }

      void c(boolean var1) {
         throw null;
      }
   }
}
