package e0;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

final class c extends InputConnectionWrapper {
   private final TextView a;
   private final a b;

   c(TextView var1, InputConnection var2, EditorInfo var3) {
      this(var1, var2, var3, new a());
   }

   c(TextView var1, InputConnection var2, EditorInfo var3, a var4) {
      super(var2, false);
      this.a = var1;
      this.b = var4;
      var4.b(var3);
   }

   private Editable a() {
      return this.a.getEditableText();
   }

   public boolean deleteSurroundingText(int var1, int var2) {
      boolean var3;
      if (!this.b.a(this, this.a(), var1, var2, false) && !super.deleteSurroundingText(var1, var2)) {
         var3 = false;
      } else {
         var3 = true;
      }

      return var3;
   }

   public boolean deleteSurroundingTextInCodePoints(int var1, int var2) {
      boolean var3;
      if (!this.b.a(this, this.a(), var1, var2, true) && !super.deleteSurroundingTextInCodePoints(var1, var2)) {
         var3 = false;
      } else {
         var3 = true;
      }

      return var3;
   }

   public static class a {
      public boolean a(InputConnection var1, Editable var2, int var3, int var4, boolean var5) {
         return androidx.emoji2.text.e.e(var1, var2, var3, var4, var5);
      }

      public void b(EditorInfo var1) {
         if (androidx.emoji2.text.e.h()) {
            androidx.emoji2.text.e.b().u(var1);
         }

      }
   }
}
