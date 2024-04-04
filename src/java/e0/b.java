package e0;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.n;

final class b extends Editable.Factory {
   private static final Object a = new Object();
   private static volatile Editable.Factory b;
   private static Class c;

   @SuppressLint({"PrivateApi"})
   private b() {
      try {
         c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, b.class.getClassLoader());
      } finally {
         return;
      }

   }

   public static Editable.Factory getInstance() {
      if (b == null) {
         Object var0 = a;
         synchronized(var0){}

         Throwable var10000;
         boolean var10001;
         label144: {
            try {
               if (b == null) {
                  b var1 = new b();
                  b = var1;
               }
            } catch (Throwable var14) {
               var10000 = var14;
               var10001 = false;
               break label144;
            }

            label141:
            try {
               return b;
            } catch (Throwable var13) {
               var10000 = var13;
               var10001 = false;
               break label141;
            }
         }

         while(true) {
            Throwable var15 = var10000;

            try {
               throw var15;
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               continue;
            }
         }
      } else {
         return b;
      }
   }

   public Editable newEditable(CharSequence var1) {
      Class var2 = c;
      return (Editable)(var2 != null ? n.c(var2, var1) : super.newEditable(var1));
   }
}
