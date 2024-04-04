package e0;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

final class g implements TextWatcher {
   private final EditText m;
   private final boolean n;
   private androidx.emoji2.text.e.e o;
   private int p = Integer.MAX_VALUE;
   private int q = 0;
   private boolean r;

   g(EditText var1, boolean var2) {
      this.m = var1;
      this.n = var2;
      this.r = true;
   }

   private androidx.emoji2.text.e.e a() {
      if (this.o == null) {
         this.o = new androidx.emoji2.text.e.e(this.m) {
            private final Reference a;

            {
               this.a = new WeakReference(var1);
            }

            public void b() {
               super.b();
               g.b((EditText)this.a.get(), 1);
            }
         };
      }

      return this.o;
   }

   static void b(EditText var0, int var1) {
      if (var1 == 1 && var0 != null && var0.isAttachedToWindow()) {
         Editable var3 = var0.getEditableText();
         int var2 = Selection.getSelectionStart(var3);
         var1 = Selection.getSelectionEnd(var3);
         androidx.emoji2.text.e.b().o(var3);
         d.b(var3, var2, var1);
      }

   }

   private boolean d() {
      boolean var1;
      if (!this.r || !this.n && !androidx.emoji2.text.e.h()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public void afterTextChanged(Editable var1) {
   }

   public void beforeTextChanged(CharSequence var1, int var2, int var3, int var4) {
   }

   public void c(boolean var1) {
      if (this.r != var1) {
         if (this.o != null) {
            androidx.emoji2.text.e.b().t(this.o);
         }

         this.r = var1;
         if (var1) {
            b(this.m, androidx.emoji2.text.e.b().d());
         }
      }

   }

   public void onTextChanged(CharSequence var1, int var2, int var3, int var4) {
      if (!this.m.isInEditMode() && !this.d() && var3 <= var4 && var1 instanceof Spannable) {
         var3 = androidx.emoji2.text.e.b().d();
         if (var3 != 0) {
            if (var3 == 1) {
               Spannable var5 = (Spannable)var1;
               androidx.emoji2.text.e.b().r(var5, var2, var2 + var4, this.p, this.q);
               return;
            }

            if (var3 != 3) {
               return;
            }
         }

         androidx.emoji2.text.e.b().s(this.a());
      }

   }
}
