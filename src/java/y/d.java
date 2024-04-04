package y;

import android.annotation.SuppressLint;
import android.content.ClipData;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import androidx.core.util.h;
import androidx.core.view.d0;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class d {
   // $FF: synthetic method
   public static boolean a(View var0, e var1, int var2, Bundle var3) {
      return e(var0, var1, var2, var3);
   }

   private static b b(View var0) {
      h.f(var0);
      return new c(var0);
   }

   public static InputConnection c(View var0, InputConnection var1, EditorInfo var2) {
      return d(var1, var2, b(var0));
   }

   @Deprecated
   public static InputConnection d(InputConnection var0, EditorInfo var1, b var2) {
      androidx.core.util.c.d(var0, "inputConnection must be non-null");
      androidx.core.util.c.d(var1, "editorInfo must be non-null");
      androidx.core.util.c.d(var2, "onCommitContentListener must be non-null");
      return new InputConnectionWrapper(var0, false, var2) {
         final b a;

         {
            this.a = var3;
         }

         public boolean commitContent(InputContentInfo var1, int var2, Bundle var3) {
            return this.a.a(e.f(var1), var2, var3) ? true : super.commitContent(var1, var2, var3);
         }
      };
   }

   // $FF: synthetic method
   private static boolean e(View var0, e var1, int var2, Bundle var3) {
      boolean var4 = true;
      Bundle var5 = var3;
      if ((var2 & 1) != 0) {
         try {
            var1.d();
         } catch (Exception var6) {
            Log.w("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", var6);
            return false;
         }

         InputContentInfo var7 = (InputContentInfo)var1.e();
         if (var3 == null) {
            var3 = new Bundle();
         } else {
            var3 = new Bundle(var3);
         }

         var3.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", var7);
         var5 = var3;
      }

      if (d0.e0(var0, (new androidx.core.view.c.a(new ClipData(var1.b(), new ClipData.Item(var1.a())), 2)).d(var1.c()).b(var5).a()) != null) {
         var4 = false;
      }

      return var4;
   }

   public interface b {
      boolean a(e var1, int var2, Bundle var3);
   }
}
