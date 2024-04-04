package y;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Build.VERSION;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import androidx.core.util.h;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class b {
   private static final String[] a = new String[0];

   private static boolean a(CharSequence var0, int var1, int var2) {
      if (var2 != 0) {
         return var2 != 1 ? false : Character.isHighSurrogate(var0.charAt(var1));
      } else {
         return Character.isLowSurrogate(var0.charAt(var1));
      }
   }

   private static boolean b(int var0) {
      var0 &= 4095;
      boolean var1;
      if (var0 != 129 && var0 != 225 && var0 != 18) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public static void c(EditorInfo var0, String[] var1) {
      var0.contentMimeTypes = var1;
   }

   public static void d(EditorInfo var0, CharSequence var1, int var2) {
      h.f(var1);
      if (VERSION.SDK_INT >= 30) {
         b.a.a(var0, var1, var2);
      } else {
         int var4 = var0.initialSelStart;
         int var5 = var0.initialSelEnd;
         int var3;
         if (var4 > var5) {
            var3 = var5 - var2;
         } else {
            var3 = var4 - var2;
         }

         if (var4 > var5) {
            var4 -= var2;
         } else {
            var4 = var5 - var2;
         }

         var5 = var1.length();
         if (var2 >= 0 && var3 >= 0 && var4 <= var5) {
            if (b(var0.inputType)) {
               f(var0, (CharSequence)null, 0, 0);
            } else if (var5 <= 2048) {
               f(var0, var1, var3, var4);
            } else {
               g(var0, var1, var3, var4);
            }
         } else {
            f(var0, (CharSequence)null, 0, 0);
         }
      }
   }

   public static void e(EditorInfo var0, CharSequence var1) {
      if (VERSION.SDK_INT >= 30) {
         b.a.a(var0, var1, 0);
      } else {
         d(var0, var1, 0);
      }

   }

   private static void f(EditorInfo var0, CharSequence var1, int var2, int var3) {
      if (var0.extras == null) {
         var0.extras = new Bundle();
      }

      SpannableStringBuilder var4;
      if (var1 != null) {
         var4 = new SpannableStringBuilder(var1);
      } else {
         var4 = null;
      }

      var0.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", var4);
      var0.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", var2);
      var0.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", var3);
   }

   private static void g(EditorInfo var0, CharSequence var1, int var2, int var3) {
      int var7 = var3 - var2;
      int var4;
      if (var7 > 1024) {
         var4 = 0;
      } else {
         var4 = var7;
      }

      int var6 = var1.length();
      int var5 = 2048 - var4;
      int var8 = Math.min(var6 - var3, var5 - Math.min(var2, (int)((double)var5 * 0.8)));
      var6 = Math.min(var2, var5 - var8);
      int var9 = var2 - var6;
      var5 = var6;
      var2 = var9;
      if (a(var1, var9, 0)) {
         var2 = var9 + 1;
         var5 = var6 - 1;
      }

      var6 = var8;
      if (a(var1, var3 + var8 - 1, 1)) {
         var6 = var8 - 1;
      }

      if (var4 != var7) {
         var1 = TextUtils.concat(new CharSequence[]{var1.subSequence(var2, var2 + var5), var1.subSequence(var3, var6 + var3)});
      } else {
         var1 = var1.subSequence(var2, var5 + var4 + var6 + var2);
      }

      var2 = var5 + 0;
      f(var0, var1, var2, var4 + var2);
   }

   private static class a {
      static void a(EditorInfo var0, CharSequence var1, int var2) {
         y.a.a(var0, var1, var2);
      }
   }
}
