package e0;

import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.text.Spanned;
import android.widget.TextView;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

final class d implements InputFilter {
   private final TextView a;
   private androidx.emoji2.text.e.e b;

   d(TextView var1) {
      this.a = var1;
   }

   private androidx.emoji2.text.e.e a() {
      if (this.b == null) {
         this.b = new androidx.emoji2.text.e.e(this.a, this) {
            private final Reference a;
            private final Reference b;

            {
               this.a = new WeakReference(var1);
               this.b = new WeakReference(var2);
            }

            private boolean c(TextView var1, InputFilter var2) {
               if (var2 != null && var1 != null) {
                  InputFilter[] var4 = var1.getFilters();
                  if (var4 == null) {
                     return false;
                  }

                  for(int var3 = 0; var3 < var4.length; ++var3) {
                     if (var4[var3] == var2) {
                        return true;
                     }
                  }
               }

               return false;
            }

            public void b() {
               super.b();
               TextView var3 = (TextView)this.a.get();
               if (this.c(var3, (InputFilter)this.b.get())) {
                  if (var3.isAttachedToWindow()) {
                     CharSequence var5 = var3.getText();
                     CharSequence var4 = androidx.emoji2.text.e.b().o(var5);
                     if (var5 == var4) {
                        return;
                     }

                     int var1 = Selection.getSelectionStart(var4);
                     int var2 = Selection.getSelectionEnd(var4);
                     var3.setText(var4);
                     if (var4 instanceof Spannable) {
                        d.b((Spannable)var4, var1, var2);
                     }
                  }

               }
            }
         };
      }

      return this.b;
   }

   static void b(Spannable var0, int var1, int var2) {
      if (var1 >= 0 && var2 >= 0) {
         Selection.setSelection(var0, var1, var2);
      } else if (var1 >= 0) {
         Selection.setSelection(var0, var1);
      } else if (var2 >= 0) {
         Selection.setSelection(var0, var2);
      }

   }

   public CharSequence filter(CharSequence var1, int var2, int var3, Spanned var4, int var5, int var6) {
      if (this.a.isInEditMode()) {
         return var1;
      } else {
         int var7 = androidx.emoji2.text.e.b().d();
         if (var7 != 0) {
            boolean var8 = true;
            if (var7 == 1) {
               boolean var10 = var8;
               if (var6 == 0) {
                  var10 = var8;
                  if (var5 == 0) {
                     var10 = var8;
                     if (var4.length() == 0) {
                        var10 = var8;
                        if (var1 == this.a.getText()) {
                           var10 = false;
                        }
                     }
                  }
               }

               CharSequence var9 = var1;
               if (var10) {
                  var9 = var1;
                  if (var1 != null) {
                     if (var2 != 0 || var3 != var1.length()) {
                        var1 = var1.subSequence(var2, var3);
                     }

                     var9 = androidx.emoji2.text.e.b().p(var1, 0, var1.length());
                  }
               }

               return var9;
            }

            if (var7 != 3) {
               return var1;
            }
         }

         androidx.emoji2.text.e.b().s(this.a());
         return var1;
      }
   }
}
